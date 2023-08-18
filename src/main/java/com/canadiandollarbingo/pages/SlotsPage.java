package com.canadiandollarbingo.pages;

import com.canadiandollarbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SlotsPage extends Utility {

    private static final Logger log = LogManager.getLogger(SlotsPage.class.getName());

    public SlotsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath ="//body/div[@id='wrapper']/div[@id='wide-column-lobby']/div[2]/div[1]/div[1]/div[2]/button[1]/span[1]" )
    WebElement parlaySlots;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[4]/a[1]/h5[1]")
    WebElement fruityFrenzy;

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[1]/center[1]/img[1]")
    WebElement message;

    public void clickOnParlaySlots()
    {
        clickOnElement(parlaySlots);
        log.info("click on element : " + parlaySlots.toString());
    }

    public void getGamesName()
    {

        ArrayList<String> gamesName = new ArrayList<>();
        List<WebElement> gamesNameList = driver.findElements(By.xpath("//body/div[@id='wrapper']/div[@id='full-column']/div[3]"));
        System.out.println("Total Games = "+gamesNameList.size());
        for (WebElement games : gamesNameList)
        {
            gamesName.add(games.getText());
        }
        System.out.println("Total Games Name = "+gamesName);

    }

    public void clickOnFruityFrenzy()
    {
        clickOnElement(fruityFrenzy);
        log.info("click on element : " + fruityFrenzy.toString());
    }

    public String getMessage()
    {
        log.info("Message : " + message.toString());
       return getTextFromElement(message);
    }


}
