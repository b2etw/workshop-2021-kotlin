package tw.b2e.workshop0620.schedule

import com.fasterxml.jackson.databind.JsonNode
import kotlinx.coroutines.runBlocking
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody
import tw.b2e.workshop0620.domain.GuessNumberGame

@Component
class PullMsgSchedule {

    // hide it
    private val token = ""

    private val webClient = WebClient.create("https://api.telegram.org/bot$token")

    private val guessNumberGame = GuessNumberGame()

    private var offset = 0L

    @Scheduled(cron = "*/5 * * * * *")
    fun invoke() = runBlocking {
        val messages = fetchMessages()

        val result = messages.get("result").toList()
        if (result.isNotEmpty()) {
            offset = result.last().get("update_id").longValue() + 1

            result.map {
                val input = it.get("message").get("text").asText()
                val chatId = it.get("message").get("from").get("id").longValue()
                when {
                    "again" == input -> Pair(chatId, guessNumberGame.again())
                    4 != input.toHashSet().size -> Pair(chatId, "wrong input format")
                    "\\d{4}".toRegex().matches(input) -> Pair(chatId, guessNumberGame.check(input))
                    else -> Pair(chatId, "unsupported command")
                }
            }.forEach {
                sendMessage(it.first, it.second)
            }
        }
    }

    private suspend fun fetchMessages() =
        webClient.get()
            .uri { builder ->
                builder.path("/getUpdates")
                    .queryParam("offset", offset)
                builder.build()
            }
            .retrieve()
            .awaitBody<JsonNode>()

    private suspend fun sendMessage(chatId: Long, text: String) =
        webClient.post()
            .uri("/sendMessage")
            .header("Content-Type", "application/json")
            .body(
                BodyInserters.fromValue(
                    mapOf("chat_id" to chatId, "text" to text)
                )
            )
            .retrieve()
            .awaitBody<JsonNode>()
}