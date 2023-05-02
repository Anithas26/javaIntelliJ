import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef {
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("User is on login page");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("user enters username and password");
    }
    @And("clicks on the submit button")
    public void clicks_on_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("clicks on the submit button");
    }
    @Then("Login should be successful")
    public void login_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Login should be successful");
    }
}
