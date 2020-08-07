package com.testinium.base;

import com.testinium.page.FormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public  Actions builder;
    public  WebDriverWait wait;

    public BasePage(WebDriver driver,WebDriverWait wait){
        this.driver = driver;
        this.wait =wait;
        this.builder = new Actions(driver);
    }
    public void waitSeconds(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void setBy(By by, String text){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated((by)));
        element.clear();
        element.sendKeys(text);
    }
    public void clickBy(By by){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable((by)));
        element.click();
    }
    public void selectOption(By by,String value){
        Select select=new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public void tabClick(By by){
        driver.findElement(by).sendKeys(Keys.TAB);
    }

}
