package com.testinium.util;

import org.openqa.selenium.By;

public class ConstantsPage {
    public static final By roundTrip = By.id("lb-one-way");
    public static final By ticket1 = By.id("flight-from");
    public static final By ticket2 = By.id("flight-to");
    public static final By goingCalender = By.xpath("//div[contains(@class,'dtp-wrap-from')]");
    public static final By selectGoingDate = By.xpath("(//a[@class=\"ui-state-default\"])[10]");
    public static final By returnCalender = By.xpath("//div[contains(@class,'dtp-wrap-to')]");
    public static final By selectReturnDate = By.xpath("(//a[@class=\"ui-state-default\"])[5]");
    public static final By searchBtn = By.id("btnSearch");
    public static final By ticketSelect = By.className("bt-choose");

    public static final By gander = By.id("lb-female");
    public static final By firstNameText = By.xpath("//input[contains(@class,'firstname')]");
    public static final By lastNameText = By.xpath("//input[contains(@class,'lastname')]");
    public static final By birthDay = By.xpath("//select[contains(@class,'day-of-birth')]");
    public static final By birthMonth = By.xpath("//select[contains(@class,'month-of-birth')]");
    public static final By birthYear= By.xpath("//select[contains(@class,'year-of-birth')]");
    public static final By tc = By.id("passenger-nationality");
    public static final By tcNumberText= By.xpath("//input[contains(@class,'citizenno')]");
    public static final By passportNumberText= By.xpath("//input[contains(@class,'passportNumber')]");
    public static final By time= By.xpath("//input[contains(@class,'is-passport-indefinite')]");
    public static final By phoneText = By.id("txtPhone");
    public static final By emailText = By.id("txtEmail");
    public static final By insurance = By.xpath("//label[contains(@class,'lb-do-not-want-insurance')]");
    public static final By payBtn = By.className("to-booking");




}
