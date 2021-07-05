import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import org.assertj.core.api.Assertions

class CheckTests {

    var guessNumber: GuessNumber? = null
    var result: String = ""

    @Given("GuessNumber and init answer with {int}")
    fun guessnumberAndInitAnswerWith(arg0: Int) {
        guessNumber = GuessNumber(arg0)
    }

    @When("Check {int}")
    fun check(arg0: Int) {
        result = guessNumber!!.check(arg0)
    }

    @Then("Result should be {string}")
    fun resultShouldBe(arg0: String?) {
        Assertions.assertThat(result).isEqualTo(arg0)
    }
}