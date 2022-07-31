package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.LinkOption;
import java.nio.file.Watchable;

public class SearchPage {

    public WebDriver driver;
    //11111111111111111111
    private By loginbuton = By.xpath("//a[@class=\"gb_1 gb_2 gb_8d gb_8c\"]");
    private By inputsearch=By.name("q");
    private By searchButton =By.xpath("//input[@class=\"gNO89b\"]");
    private By resaultfromSearch =By.xpath("//div[@class=\"yuRUbf\"]");
    private By imagelink=By.cssSelector("#hdtb-msb > div:nth-child(1) > div > div:nth-child(2) > a");
    public SearchPage(WebDriver driver) {
        this.driver =driver;
    }

    public WebElement loginButtonappear(){
        return driver.findElement(loginbuton);
    }
    public void searchonGoogel(String searchword){
        driver.findElement(inputsearch).sendKeys(searchword);
        driver.findElements(searchButton).get(0).click();
    }
    public String resault(){

        return driver.findElements(resaultfromSearch).get(0).getText();
    }
///111111111111111111111111
    public void returntoGoogelSrearch(){
        driver.navigate().back();
    }
    public void image(){
        driver.findElement(imagelink).click();
    }

}
