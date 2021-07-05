import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.assertj.core.api.Assertions

class CheckTests {
    private lateinit var result: String
    private lateinit var guessNumber: GuessNumber
    @Given("GuessNumber and init answer with {string}")
    fun guessnumberAndInitAnswerWith(arg0: String?) {
        guessNumber = GuessNumber(arg0!!)
    }

    @When("Check {string}")
    fun check(arg0: String?) {
        result = guessNumber.check(arg0!!)
    }

    @Then("Result should be {string}")
    fun resultShouldBe(arg0: String?) {
        Assertions.assertThat(result).isEqualTo(arg0!!)
    }
}