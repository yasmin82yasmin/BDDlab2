package renastech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import renastech.pages.GuruDemoPages;
import renastech.pages.Guruhome;

import java.util.Map;

public class Gurusteph {
    Guruhome guruhome=new Guruhome();
    GuruDemoPages guruDemoPages=new GuruDemoPages();
    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        System.out.println("Browser is launched");
    }
    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
        guruDemoPages.setTariffPlan();
    }
    @Then("The user wants to verify {string} headerr")
    public void the_user_wants_to_verify_header(String expectedHeader) {
        guruDemoPages.setProfileHeader(expectedHeader);
    }
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String,String> dataTable) {
        guruDemoPages.setMonthlyRental(dataTable.get("Monthly Rental"));
        guruDemoPages.setLocalMin(dataTable.get("Local Min"));
        guruDemoPages.setInternationalMin(dataTable.get("International Min"));
        guruDemoPages.setSmsPack(dataTable.get("Sms Pack"));
        guruDemoPages.setLocalPerMinChar(dataTable.get("Local Per Min Char"));
        guruDemoPages.setInternationalPerMinChar(dataTable.get("International Per Min Char"));
        guruDemoPages.setSmsPerChar(dataTable.get("Sms Per Char"));
    }
    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        guruDemoPages.setSubmitButton();
    }
    @Then("The user wants to verifyy message as {string}")
    public void the_user_wants_to_verifyy_message_as(String expected) {
        guruDemoPages.setVerification( expected);
    }
    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
        guruhome.setAddCostumer();
    }
    @Then("The users wants to verify {string} header")
    public void the_users_wants_to_verify_header(String expectedheader2) {
        guruhome.setHeader2(expectedheader2);

    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String Background)  {
        guruhome.setBackgroundCheck(Background);
    }
    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String fname,String lname, String email,String address,String number) {
        guruhome.setFName(fname);
        guruhome.setLName(lname);
        guruhome.setEmailID(email);
        guruhome.setAddressBox(address);
        guruhome.setPNumber(number);

    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {

    }
}



