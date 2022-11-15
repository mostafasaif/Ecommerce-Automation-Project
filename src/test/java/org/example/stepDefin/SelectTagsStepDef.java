package org.example.stepDefin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P03_HomePage;
import org.example.pages.P05_SearchPage;
import org.example.pages.P10_TagsPage;
import org.testng.Assert;

public class SelectTagsStepDef {
    P03_HomePage p02HomePage;
    P10_TagsPage p10TagsPage;
    P05_SearchPage p05SearchPage;

    @And("user open search page")
    public void userOpenSearchPage() {
        p02HomePage = new P03_HomePage(Hooks.driver);
        p02HomePage.openSearchPage();
    }

    @And("user choose awesome tag")
    public void userChooseAwesomeTag() {
        p05SearchPage = new P05_SearchPage(Hooks.driver);
        p05SearchPage.selectAwesomeTag();

    }

    @Then("awesome products page should appear to the user")
    public void awesomeProductAppear() {
        p10TagsPage = new P10_TagsPage(Hooks.driver);
        String awesomeUrl = "https://demo.nopcommerce.com/awesome";
        Assert.assertEquals(p10TagsPage.getTagsUrl(), awesomeUrl);
    }
}
