package tw.b2e.workshop0620.domain

import org.slf4j.LoggerFactory

class GuessNumberGame {

    private val log = LoggerFactory.getLogger(this::class.java)

    var password = initPassword()

    fun check(input: String) =
        run {
            var a = 0
            var b = 0
            password.forEachIndexed { index1, c1 ->
                input.forEachIndexed { index2, c2 ->
                    if (index1 == index2 && c1 == c2) a++
                    if (index1 != index2 && c1 == c2) b++
                }
            }

            "${a}A${b}B"
        }

    fun again() =
        run {
            password = initPassword()
            "new game"
        }

    private fun initPassword() =
        (0..9).toList()
            .shuffled()
            .take(4)
            .joinToString("")
            .also {
                log.info(it)
            }
}