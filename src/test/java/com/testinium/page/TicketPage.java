package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.testinium.util.ConstantsPage.*;

public class TicketPage extends BasePage {

    public TicketPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public FormPage selectTicket(){
        clickBy(ticketSelect);
        waitSeconds(2);
        return new FormPage(driver,wait);
    }
}
