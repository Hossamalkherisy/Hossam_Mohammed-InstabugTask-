package com.automation.step_definitions;


import com.automation.pages.Base_Page;
import io.cucumber.java.After;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    static   WebDriver driver;
    protected static Base_Page homepage;

    @BeforeAll
    public static void user_open_chrome_browser()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        homepage=new Base_Page(driver);
    }

    @AfterAll
    public static void quitdriver() throws InterruptedException {
     // driver.quit();
    }
}
