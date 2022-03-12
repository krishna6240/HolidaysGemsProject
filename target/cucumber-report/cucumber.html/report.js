$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineBooking.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp, Sign In and Purchase Product",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9308239900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "TC-002 Input all information on Search Form",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-002-input-all-information-on-search-form",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on destination list",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I select destination \"Costa Almeria - Spain\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on departing from",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select airport \"London (All Airports)\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on start date",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select the month \"Apr 2022\" and date \"16\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select the \"3 Nights\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I can select BoardBasis \"All Inclusive\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I can select Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I can add adults \"1\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I can click on Search Button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I can select Roomfinal",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I can click on continue",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I can click On checkout Button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter Title \"Mr\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I enter FirstName \"Anand\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I enter MiddleName \"M\"",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I enter LastName \"Tripathi\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I enter day \"12\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I enter month \"3\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I enter year \"1978\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I enter Primary Number",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I enter Email Address",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I enter confirm Email Address",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "I enter House Number",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "I enter City",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "I enter County",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "I enter Country \"United Kingdom\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "I enter PostCode",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click on Continue Btn",
  "keyword": "Then "
});
formatter.match({
  "location": "onlineBookingStepsdef.iAmOnHomePage()"
});
formatter.result({
  "duration": 211683500,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iClickOnDestinationList()"
});
formatter.result({
  "duration": 400989500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Costa Almeria - Spain",
      "offset": 22
    }
  ],
  "location": "onlineBookingStepsdef.iSelectDestination(String)"
});
formatter.result({
  "duration": 4091516800,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iClickOnDepartingFrom()"
});
formatter.result({
  "duration": 173830200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London (All Airports)",
      "offset": 18
    }
  ],
  "location": "onlineBookingStepsdef.iSelectAirport(String)"
});
formatter.result({
  "duration": 800340200,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iClickOnStartDate()"
});
formatter.result({
  "duration": 1123736900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apr 2022",
      "offset": 20
    },
    {
      "val": "16",
      "offset": 40
    }
  ],
  "location": "onlineBookingStepsdef.iSelectTheMonthAndDate(String,String)"
});
formatter.result({
  "duration": 537057100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3 Nights",
      "offset": 14
    }
  ],
  "location": "onlineBookingStepsdef.iSelectThe(String)"
});
formatter.result({
  "duration": 475976000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Inclusive",
      "offset": 25
    }
  ],
  "location": "onlineBookingStepsdef.iCanSelectBoardBasis(String)"
});
formatter.result({
  "duration": 165534700,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanSelectRooms()"
});
formatter.result({
  "duration": 5196046600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 18
    }
  ],
  "location": "onlineBookingStepsdef.iCanAddAdults(String)"
});
formatter.result({
  "duration": 134616200,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanClickOnSearchButton()"
});
formatter.result({
  "duration": 1942402700,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanSelectRoomfinal()"
});
formatter.result({
  "duration": 29390745000,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanClickOnContinue()"
});
formatter.result({
  "duration": 8472661100,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iCanClickOnCheckoutButton()"
});
formatter.result({
  "duration": 4208659500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mr",
      "offset": 15
    }
  ],
  "location": "onlineBookingStepsdef.iEnterTitle(String)"
});
formatter.result({
  "duration": 242442700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Anand",
      "offset": 19
    }
  ],
  "location": "onlineBookingStepsdef.iEnterFirstName(String)"
});
formatter.result({
  "duration": 155566700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "M",
      "offset": 20
    }
  ],
  "location": "onlineBookingStepsdef.iEnterMiddleName(String)"
});
formatter.result({
  "duration": 128591000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tripathi",
      "offset": 18
    }
  ],
  "location": "onlineBookingStepsdef.iEnterLastName(String)"
});
formatter.result({
  "duration": 140716200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 13
    }
  ],
  "location": "onlineBookingStepsdef.iEnterDay(String)"
});
formatter.result({
  "duration": 120027300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 15
    }
  ],
  "location": "onlineBookingStepsdef.iEnterMonth(String)"
});
formatter.result({
  "duration": 130877800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1978",
      "offset": 14
    }
  ],
  "location": "onlineBookingStepsdef.iEnterYear(String)"
});
formatter.result({
  "duration": 114727000,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iEnterPrimaryNumber()"
});
formatter.result({
  "duration": 134238300,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iEnterEmailAddress()"
});
formatter.result({
  "duration": 197983100,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iEnterConfirmEmailAddress()"
});
formatter.result({
  "duration": 160068100,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iClickOnContinueButton()"
});
formatter.result({
  "duration": 204495700,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iEnterHouseNumber()"
});
formatter.result({
  "duration": 235178400,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iEnterCity()"
});
formatter.result({
  "duration": 190269700,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iEnterCounty()"
});
formatter.result({
  "duration": 218186900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United Kingdom",
      "offset": 17
    }
  ],
  "location": "onlineBookingStepsdef.iEnterCountry(String)"
});
formatter.result({
  "duration": 131031000,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iEnterPostCode()"
});
formatter.result({
  "duration": 185487700,
  "status": "passed"
});
formatter.match({
  "location": "onlineBookingStepsdef.iClickOnContinueBtn()"
});
formatter.result({
  "duration": 124369900,
  "status": "passed"
});
formatter.after({
  "duration": 142300,
  "status": "passed"
});
});