package com.testinium.base;

import com.testinium.util.ConstantsValues;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

    @Before
    public void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        //chromeOptions.addArguments("kiosk");
        //chromeOptions.setExperimentalOption("useAutomationExtension", false);
        //chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        chromeOptions.addArguments("disable-translate");
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.addArguments("test-type");
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("disable-popup-blocking");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        driver=new ChromeDriver(chromeOptions);
        driver.get(ConstantsValues.homePage);
        this.wait=new WebDriverWait(driver, 10);
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        getDriver().quit();
    }


    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
