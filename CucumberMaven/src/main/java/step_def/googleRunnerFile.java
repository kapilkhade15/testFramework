package step_def;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

import cucumber.api.java.en.*;
import step_def.PObjCls;

 


public class googleRunnerFile {
    
    public WebDriver driver;
    public PObjCls gs;
    
    @Given("^User launch chrome browser$")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "D://Java Selenium//chromedriver_win32//chromedriver.exe");
        driver=new ChromeDriver();
        gs=new PObjCls(driver);
    }

 

    @When("^User open url \\\"([^\\\"]*)\\\"$")
    public void user_open_url(String url) {
         driver.get(url);
    }

 

    @When("^User enter search value \\\"([^\\\"]*)\\\"$")
    public void user_enter_search_value(String searchString) {
        gs.setgooglesearch(searchString);    
    }

 

    @When("^Click on \\\"([^\\\"]*)\\\"$")
    public void click_on_search() {
        gs.ClickSearch();
    }

 

    @Then("^Page title should be \\\"([^\\\"]*)\\\"$")
    public void page_title_should_be(String title) {
          Assert.assertEquals(title,driver.getTitle());
    }

 

    @Then("^Close browser$")
    public void close_browser() {
        driver.quit();
    }

 

}

 

