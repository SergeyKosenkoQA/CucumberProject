import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("User navigates to facebook website")
    public void userNavigatesToFacebookWebsite() {
    }

    @When("User validates the homepage title")
    public void userValidatesTheHomepageTitle() {
    }

    @Then("User entered {string} username")
    public void userEnteredTheUsername(String username) {
    }

    @And("User entered {string} password")
    public void userEnteredThePassword(String password) {
    }

    @Then("User {string} successfully logged in")
    public void userShouldBeSuccessfullyLoggedIn(String loginStatus) {
    }


}
