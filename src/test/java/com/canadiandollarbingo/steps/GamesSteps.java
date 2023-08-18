package com.canadiandollarbingo.steps;

import com.canadiandollarbingo.pages.GamesPage;
import com.canadiandollarbingo.pages.SlotsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class GamesSteps {

    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I mouse Hover on Games  Menu")
    public void iMouseHoverOnGamesMenu() {

        new GamesPage().mouseHoverOnGames();
    }

    @And("I click on bingo")
    public void iClickOnBingo() {
        new GamesPage().clickOnBingo();
    }

    @Then("^I verify that \"([^\"]*)\" message on bingo page$")
    public void iVerifyThatMessageOnBingoPage(String message)  {
        Assert.assertEquals( new GamesPage().getBingoMessage(),message,"Bingo");


    }
    @And("I click on Parlay Slots")
    public void iClickOnParlaySlots() {
        new SlotsPage().clickOnParlaySlots();
    }

    @And("I get the all games name")
    public void iGetTheAllGamesName() {
        new SlotsPage().getGamesName();
    }

    @And("I click on Fruity Frenzy game")
    public void iClickOnFruityFrenzyGame() {
        new SlotsPage().clickOnFruityFrenzy();
    }


    @Then("^I verify that \"([^\"]*)\" message will display$")
    public void iVerifyThatMessageWillDisplay(String message1)  {
        Assert.assertEquals(new SlotsPage().getMessage(),message1,"Log in to Start Playing!");
    }
}
