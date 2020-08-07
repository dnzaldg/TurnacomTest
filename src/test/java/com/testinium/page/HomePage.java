package com.testinium.page;

import com.testinium.base.BasePage;
import com.testinium.util.ConstantsValues;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.testinium.util.ConstantsPage.*;
import static com.testinium.util.ConstantsValues.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver,WebDriverWait wait) {
        super(driver,wait);
    }

    public TicketPage ticketSearch() {
        //clickBy(roundTrip);
        setBy(ticket1, search_From);
        waitSeconds(3);
        tabClick(ticket1);
        setBy(ticket2,search_TO);
        waitSeconds(2);
        tabClick(ticket2);
        clickBy(goingCalender);
        waitSeconds(2);
        clickBy(selectGoingDate);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        waitSeconds(2);
        clickBy(By.className("popup-close"));
        clickBy(searchBtn);
        return new TicketPage(driver, wait);
         }

}
