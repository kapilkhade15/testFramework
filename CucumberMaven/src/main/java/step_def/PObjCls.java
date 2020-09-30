package step_def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

 

public class PObjCls {
    
    public WebDriver ldriver;
    
    public PObjCls(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(ldriver, this);    
    }
        
    @FindBy(how=How.NAME, using="q")
    @CacheLookup
    WebElement txtGoogleSearch;
    public void setgooglesearch(String searchtxt)
    {
        txtGoogleSearch.clear();
        txtGoogleSearch.sendKeys(searchtxt);
    }
    @FindBy(how=How.NAME, using="btnk")
    @CacheLookup
    WebElement btnGoogleSearch;
    public void ClickSearch()
    {
        btnGoogleSearch.click();    
    }
}
/*
//method1
//action methods
 *     //Capture elements
    By txtGoogleSearch=By.name("q");
    By btnGoogleSearch=By.name("btnk");
public void SetSearchText(String strSearch)
{
    
    ldriver.findElement(txtGoogleSearch).sendKeys(strSearch);
}
public void ClickGoogleSearch()
{
    ldriver.findElement(btnGoogleSearch).click();
}
*/

 

/*    
    //method 2
    @FindBy(how=How.ID, using="Searchtextbox")
    @CacheLookup
    WebElement txtGoogleSearch1;
    public void setgooglesearch(String searchtxt)
    {
        waithelper.WaitForElement(txtGoogleSearch1, 10);
        txtGoogleSearch1.clear();
        txtGoogleSearch1.sendKeys(searchtxt);
    }
    
    
    //method 3
/*     public static WebElement txtbx_UserName() throws Exception{
         try{
                element = ldriver.findElement(By.id("log"));
                Log.info("Username text box is found on the Login Page");
         }catch (Exception e){
                Log.error("UserName text box is not found on the Login Page");
                throw(e);
                }
            return element;
         } */