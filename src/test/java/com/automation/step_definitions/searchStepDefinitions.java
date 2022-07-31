package com.automation.step_definitions;

import com.automation.pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class searchStepDefinitions {

SearchPage searchPage=Hooks.homepage.searchPage();

//11111111111111111111111111111111111111111111111111111111111111111111111111111111111
    @Given("i stand on search page")
    public void i_stand_on_search_page() {
        Assert.assertTrue(searchPage.loginButtonappear().isDisplayed());
    }
    public String searchword="cat";
    @When("I add cats to the search box and click the Search Button")
    public void i_add_cats_to_the_search_box_and_click_the_search_button() {
        searchPage.searchonGoogel(searchword);
    }
    @Then("cats should be mentioned in the results")
    public void cats_should_be_mentioned_in_the_results() {
        Assert.assertTrue(searchPage.resault().contains(searchword),"Search not correctly");
    }
//2222222222222222222222222222222222222222222222222222222222222222222222222
    @Given("i stand on search page to test special character")
    public void i_stand_on_search_page_to_test_special_character() {
        searchPage.returntoGoogelSrearch();
    }
    public String special="@#$";
    @When("I add special character to the search box click the Search Button")
    public void i_add_special_character_to_the_search_box() {
        searchPage.searchonGoogel(special);
    }
    @Then("check result successfully")
    public void click_the_search_button() {
        Assert.assertTrue(searchPage.resault().contains(special),"Search not correctly");
    }
//33333333333333333333333333333333333333333333333333333333333333333333333333
    @Given("i stand on search page to test  auto-suggestion")
    public void i_stand_on_search_page_to_test_auto_suggestion() {
        searchPage.returntoGoogelSrearch();
    }
    public String faceword="face";
    @When("I add fac to the search box")
    public void i_add_to_the_search_box_To() {
        searchPage.searchonGoogel(faceword);
    }
    @When("click the Search Button and check facebook appear")
    public void click_the_search_button_and_check_facebook_appear() {
        Assert.assertTrue(searchPage.resault().contains("فيسبوك"),"Search not correctly");

    }

    //44444444444444444444444444444444444444444444444444444444444444444444444444444444
    @Given("i stand on search page click on image")
    public void i_stand_on_search_page_click_on_image() {
        searchPage.returntoGoogelSrearch();
    }
    public String Adminword="Admin";
    @When("I add  Admin to the search box")
    public void i_add_to_the_search_box() {
        searchPage.searchonGoogel(Adminword);
    }
    @When("click the Search Button and check Admin image appears successfully")
    public void click_the_search_button_and_check_admin_image_appears_successfully() {
        searchPage.image();
        searchPage.returntoGoogelSrearch();
        searchPage.returntoGoogelSrearch();
    }

}
