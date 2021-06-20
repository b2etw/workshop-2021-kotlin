package tw.b2e.workshop0620

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import tw.b2e.workshop0620.domain.GuessNumberGame

class GuessNumberGameTests {

    @Test
    internal fun test_0Right_4PositionWrong_0NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("5678")

        // assert
        Assertions.assertThat(result).isEqualTo("0A0B")
    }

    @Test
    internal fun test_0Right_4PositionWrong_1NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("2567")

        // assert
        Assertions.assertThat(result).isEqualTo("0A1B")
    }

    @Test
    internal fun test_0Right_4PositionWrong_2NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("2167")

        // assert
        Assertions.assertThat(result).isEqualTo("0A2B")
    }

    @Test
    internal fun test_0Right_4PositionWrong_3NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("3127")

        // assert
        Assertions.assertThat(result).isEqualTo("0A3B")
    }

    @Test
    internal fun test_0Right_4PositionWrong_4NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("4321")

        // assert
        Assertions.assertThat(result).isEqualTo("0A4B")
    }

    @Test
    internal fun test_1Right_3PositionWrong_0NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("1567")

        // assert
        Assertions.assertThat(result).isEqualTo("1A0B")
    }

    @Test
    internal fun test_1Right_3PositionWrong_1NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("1456")

        // assert
        Assertions.assertThat(result).isEqualTo("1A1B")
    }

    @Test
    internal fun test_1Right_3PositionWrong_2NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("1463")

        // assert
        Assertions.assertThat(result).isEqualTo("1A2B")
    }

    @Test
    internal fun test_1Right_3PositionWrong_3NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("1423")

        // assert
        Assertions.assertThat(result).isEqualTo("1A3B")
    }

    @Test
    internal fun test_2Right_2PositionWrong_0NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("1267")

        // assert
        Assertions.assertThat(result).isEqualTo("2A0B")
    }

    @Test
    internal fun test_2Right_2PositionWrong_1NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("1247")

        // assert
        Assertions.assertThat(result).isEqualTo("2A1B")
    }

    @Test
    internal fun test_2Right_2PositionWrong_2NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("1243")

        // assert
        Assertions.assertThat(result).isEqualTo("2A2B")
    }

    @Test
    internal fun test_3Right_1PositionWrong_0NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("1237")

        // assert
        Assertions.assertThat(result).isEqualTo("3A0B")
    }

    @Test
    internal fun test_4Right_0PositionWrong_0NumberRight() {
        // arrange
        val guessNumberGame = GuessNumberGame()
        guessNumberGame.password = "1234"

        // act
        val result = guessNumberGame.check("1234")

        // assert
        Assertions.assertThat(result).isEqualTo("4A0B")
    }
}