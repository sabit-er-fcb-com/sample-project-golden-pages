package com.sample.library.pages;

import com.sample.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstCitizensHomePage {

    public FirstCitizensHomePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"fcbMainContent\"]/article/section/article/div[2]/div[3]/div[2]/div/a[1]")
    public WebElement openAnAccountElement;

    @FindBy(xpath = "//*[@id=\"fcbMainContent\"]/article/div[2]/section/article/section[1]/article/div[1]/div/div[1]/div[1]/p[2]/a/span")
    public WebElement freeChecking;

    @FindBy(xpath = "//*[@id=\"fcbMainContent\"]/article/section/article/section/article/section[1]/article/div[2]/a")
    public WebElement openFreeChecking;







}
