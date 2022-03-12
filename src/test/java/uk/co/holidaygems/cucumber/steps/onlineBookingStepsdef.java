package uk.co.holidaygems.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.holidaygems.pages.Address;
import uk.co.holidaygems.pages.HomePage;
import uk.co.holidaygems.pages.LeadPassenger;
import uk.co.holidaygems.pages.SearchForm;

public class onlineBookingStepsdef {
    static String email1 = "abcde@gmail.com";
    static String PrimaryNo = "07447588091";
    static String EmailAddress = "xyz@gmail.com";
    static String ConfirmEmail = "xyz@gmail.com";
    static String houseNo = "154A Kenton Road";
    static String city = "Harrow";
    static String county = "Middlesex";
    static String Postcode = "HA3 8AZ";

    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }


    @When("^I send email on email textBox$")
    public void iSendEmailOnEmailTextBox() {
        new HomePage().sendEmailOnTextbox(email1);
    }

    @And("^I click on signup button$")
    public void iClickOnSignupButton() {
        new HomePage().clickOnSignInButton();
    }

    @Then("^I should verify the massage for successful signup$")
    public void iShouldVerifyTheMassageForSuccessfulSignup(String Text) {
        new HomePage().verifyThankMsg(Text);
        new HomePage().clickOnAcceptcookies();
    }

    @When("^I select destination \"([^\"]*)\"$")
    public void iSelectDestination(String destination) {
        new SearchForm().selectDestinationFromList(destination);
    }

    @When("^I click on departing from$")
    public void iClickOnDepartingFrom() {
        new SearchForm().clickOnDepartingForm();
    }

    @When("^I select airport \"([^\"]*)\"$")
    public void iSelectAirport(String airport) {
        new SearchForm().selectAirport(airport);
    }

    @And("^I click on start date$")
    public void iClickOnStartDate() {
        new SearchForm().clickOnStartDate();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @And("^I select the month \"([^\"]*)\" and date \"([^\"]*)\"$")
    public void iSelectTheMonthAndDate(String month, String date) {
        new SearchForm().selectMonth(month);
        new SearchForm().selectDate(date);
    }

    @And("^I can view offer$")
    public void iCanViewOffer() {
        new SearchForm().clickOnViewOffer();
    }

    @And("^I can check Availability$")
    public void iCanCheckAvailability() {
        new SearchForm().clickOnAvailability();
    }


    @And("^I can select Rooms$")
    public void iCanSelectRooms() {
        new SearchForm().clickOnRooms();
    }

    @And("^I can click on Search Button$")
    public void iCanClickOnSearchButton() {
        new SearchForm().clickOnSearchbtn();
    }


    @And("^I can click on continue$")
    public void iCanClickOnContinue() {
        new SearchForm().clickOnContinue();

    }

    @Then("^I can click On checkout Button$")
    public void iCanClickOnCheckoutButton() {
        new SearchForm().clickOncheckout();
    }

    @When("^I click on destination list$")
    public void iClickOnDestinationList() {
        new SearchForm().clickOnDestinationList();
    }

    @And("^I select the \"([^\"]*)\"$")
    public void iSelectThe(String nights) {
        new SearchForm().clickOnNights();
        new SearchForm().selectNights(nights);
    }


    @And("^I can select BoardBasis \"([^\"]*)\"$")
    public void iCanSelectBoardBasis(String text) {
        new SearchForm().selectBoardBasis(text);

    }

    @And("^I can add adults \"([^\"]*)\"$")
    public void iCanAddAdults(String value) {
        new SearchForm().selectAdult(value);
    }

    @And("^I can click on Apply button$")
    public void iCanClickOnApplyButton() {
        new SearchForm().clickOnApply();
    }

    @And("^I enter FirstName \"([^\"]*)\"$")
    public void iEnterFirstName(String name) {
        new LeadPassenger().enterfirstName(name);
    }

    @And("^I enter MiddleName \"([^\"]*)\"$")
    public void iEnterMiddleName(String text) {
        new LeadPassenger().enterMiddleName(text);
    }

    @And("^I enter LastName \"([^\"]*)\"$")
    public void iEnterLastName(String text) {
        new LeadPassenger().enterLastName(text);

    }


    @And("^I enter Title \"([^\"]*)\"$")
    public void iEnterTitle(String text) {
        new LeadPassenger().selectTitle(text);

    }

    @And("^I enter Primary Number$")
    public void iEnterPrimaryNumber() {
        new LeadPassenger().enterPrimaryNumber(PrimaryNo);
    }

    @And("^I enter Email Address$")
    public void iEnterEmailAddress() {
        new LeadPassenger().enterEmail(EmailAddress);
    }

    @And("^I enter confirm Email Address$")
    public void iEnterConfirmEmailAddress() {
        new LeadPassenger().enterConfirmEmail(ConfirmEmail);
    }

    @And("^I click on Continue Button$")
    public void iClickOnContinueButton() {
        new LeadPassenger().clickOnContinueBtn();
    }

    @And("^I enter House Number$")
    public void iEnterHouseNumber() {
        new Address().enterHouseNo(houseNo);
    }


    @And("^I enter City$")
    public void iEnterCity()
    {
        new Address().enterCityName(city);
    }

    @And("^I enter County$")
    public void iEnterCounty()
    {
        new Address().enterCountyName(county);
    }


    @And("^I enter PostCode$")
    public void iEnterPostCode()
    {
        new Address().enterPostCode(Postcode);
    }

    @Then("^I click on Continue Btn$")
    public void iClickOnContinueBtn() {
        new Address().clickOnContinueButton();
    }


    @And("^I enter day \"([^\"]*)\"$")
    public void iEnterDay(String value) {
        new LeadPassenger().selectDay(value);
    }

    @And("^I enter month \"([^\"]*)\"$")
    public void iEnterMonth(String value) {
        new LeadPassenger().selectMonth(value);
    }

    @And("^I enter year \"([^\"]*)\"$")
    public void iEnterYear(String value) {
        new LeadPassenger().selectYear(value);
    }

    @And("^I can select Roomfinal$")
    public void iCanSelectRoomfinal() {
        new SearchForm().selectRoomAndclick();
    }

    @And("^I enter Country \"([^\"]*)\"$")
    public void iEnterCountry(String value) {
        new Address().selectCountryFromDropDown(value);
    }
}
