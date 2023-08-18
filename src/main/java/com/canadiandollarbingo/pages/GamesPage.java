package com.canadiandollarbingo.pages;

import com.canadiandollarbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamesPage extends Utility {

    private static final Logger log = LogManager.getLogger(GamesPage.class.getName());

    public GamesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@id='games']")
    WebElement games;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/nav[1]/div[1]/div[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    WebElement bingo;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Bingo')]")
    WebElement bingoMessage;

    public void mouseHoverOnGames()
    {
        mouseHoverToElement(games);
        log.info("mouse hover : " + games.toString());
    }
    public void clickOnBingo()
    {
        clickOnElement(bingo);
        log.info("click on element : " + bingo.toString());
    }
    public String getBingoMessage()
    {
        log.info("Message : " + bingoMessage.toString());
        return   getTextFromElement(bingoMessage);

    }

}
