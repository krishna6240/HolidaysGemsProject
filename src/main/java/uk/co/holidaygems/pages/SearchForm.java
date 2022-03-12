package uk.co.holidaygems.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.holidaygems.utility.Utility;

import java.util.List;

public class SearchForm extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public SearchForm() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "search_form_to")
    WebElement destination;
    @CacheLookup
    @FindBy(id = "destinationList")
    WebElement destinationList;
    @FindBy(xpath = "//div[@id='destinationListContainer']//li[@class='destination-item']//span")
    List<WebElement> destinationItemList;
    @CacheLookup
    @FindBy(id = "DepartureControl")
    WebElement departFrom;
    @FindBy(xpath = "//div[@id='Departure-Destinations']//label")
    List<WebElement> airportList;
    @CacheLookup
    @FindBy(xpath = "//label[@for='London']//span")
    WebElement city;
    @CacheLookup
    @FindBy(id = "DateControl")
    WebElement startDate;
    @FindBy(xpath = "//div[@id='new-dates-picker']//a[@class='calWorkingsMonth']")
    List<WebElement> monthList;
    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']//tr//td//a")
    List<WebElement> dateList;
    @CacheLookup
    @FindBy(id = "NightsControl")
    WebElement nights;
    @CacheLookup
    @FindBy(xpath = "//div[@id='myDropdown']//div[@class='nts-item']")
    List<WebElement> searchNights;
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'View Offer')])[1]")
    WebElement viewOffer;
    @CacheLookup
    @FindBy(id = "CheckAvailability")
    WebElement checkavailable;
    @CacheLookup
    @FindBy(xpath = "//div[@id='myBoardDropdown']//div[@class='brd-item']")
    List<WebElement> boardBasisList;
    @CacheLookup
    @FindBy(id = "RoomsControl")
    WebElement roomControl;
    @CacheLookup
    @FindBy(linkText = "Apply")
    WebElement apply;
    @CacheLookup
    @FindBy(css = "label[id='lblPrice-429899-0-0'] i[class='fa fa-chevron-right']")
    WebElement selectroom;
    @CacheLookup
    @FindBy(id = "search_button")
    WebElement searchbtn;
    @CacheLookup
    @FindBy(css = "#lblPrice-10591-0-0")
    WebElement selectroom1;
    @CacheLookup
    @FindBy(css = "#search_pax_adults_input_room_1")
    WebElement selectadult;
    @CacheLookup
    @FindBy(xpath = "//div[@class='button-continue continueflightsummary']")
    WebElement continueflight;
    @CacheLookup
    @FindBy(xpath = "//div[@class='proceedBooking']")
    WebElement checkout;

    public void inputYourDestination(String text) {
        pmSendTextToElement(destination, text);

    }

    public void clickOnDestinationList() {
        pmMouseHoverAndClick(destinationList);
    }

    public void clickOnDepartingForm() {
        pmMouseHoverAndClick(departFrom);
    }

    public void selectDestinationFromList(String destination) {
        for (WebElement destinationItem : destinationItemList) {
            if (destinationItem.getText().equals(destination)) {
                log.info("Click on Destination '" + destination + "' : " + destinationItem.getText());
                clickOnElement(destinationItem);
                break;
            }
        }

    }

    public void selectAirport(String airport) {
        for (WebElement airportName : airportList) {
            if (airportName.getText().equals(airport)) {
                log.info("Click on Airport '" + airport + "' : " + airportName.getText());
                clickOnElement(airportName);
                break;
            }
        }
    }

    public void selectCity() {
        pmClickOnElement(city);
    }

    public void clickOnStartDate() {
        pmClickOnElement(startDate);
    }

    public void clickOnNights() {
        pmClickOnElement(nights);
    }

    public void selectMonth(String month) {
        // Date Selection
        for (WebElement mt : monthList) {
            if (mt.getText().equalsIgnoreCase(month)) {
                mt.click();
                break;
            }
        }
    }

    public void selectDate(String date) {
        // Date Selection
        for (WebElement dt : dateList) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;
            }

        }
    }

    public void clickOnViewOffer() {
        pmClickOnElement(viewOffer);
    }

    public void clickOnAvailability() {
        pmClickOnElement(checkavailable);
    }

    public void selectNights(String nights) {
        for (WebElement night : searchNights) {
            if (night.getText().equals(nights)) {
                log.info("Select nights '" + nights + "' : " + night.getText());
                clickOnElement(night);
                break;
            }
        }
    }

    public void selectBoardBasis(String boardBasic) {
        for (WebElement board : boardBasisList) {
            if (board.getText().equals(boardBasic)) {
                log.info("Selecting broad basic '" + boardBasic + "' : " + board.getText());
                clickOnElement(board);
                break;
            }
        }
    }

    public void clickOnRooms() {
        pmMouseHoverAndClick(roomControl);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void selectAdult(String value) {
        pmSelectByValueFromDropDown(selectadult, value);
    }

    public void clickOnApply() {
        pmClickOnElement(apply);
    }

    public void clickOnSearchbtn() {
        pmClickOnElement(searchbtn);
    }

    public void selectRoomAndclick() {
        pmClickOnElement(selectroom);
/*        for (WebElement dt : selectroom) {
            if (dt.getText().equalsIgnoreCase(select)) {
                dt.click();
                break;
            }

        }*/
    }


    public void clickOnContinue() {
        pmClickOnElement(continueflight);
    }

    public void clickOncheckout() {
        pmClickOnElement(checkout);
    }

}
