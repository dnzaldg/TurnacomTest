package com.testinium.page;

import com.testinium.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.testinium.util.ConstantsPage.*;
import static com.testinium.util.ConstantsValues.*;

public class FormPage extends BasePage {
    public FormPage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
    }

    public void fillForm()
    {
        clickBy(gander);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        setBy(firstNameText, firstName);
        waitSeconds(2);
        setBy(lastNameText, lastName);
        birthday();
        selectOption(tc, "TR");
        setBy(tcNumberText, tcNumber);
        setBy(passportNumberText,passportNumber);
        clickBy(time);
        selectOption(By.id("phoneprefix"),"+90");
        setBy(phoneText,phone);
        setBy(emailText,email);
        clickBy(insurance);
        clickBy(payBtn);
    }

    public void birthday()
    {
        selectOption(birthDay, "02");
        selectOption(birthMonth, "08");
        selectOption(birthYear, "1997");
    }
}
