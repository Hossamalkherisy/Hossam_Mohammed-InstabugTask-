package com.automation.pages;

import org.openqa.selenium.WebDriver;

public class Base_Page {
    private WebDriver driver;

    public Base_Page(WebDriver driver) {
        this.driver = driver;
    }

    public SearchPage searchPage(){
        return new SearchPage(driver);
    }
}