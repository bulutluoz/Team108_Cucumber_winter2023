package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage {
    public WebUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement loginPortalElement;

    @FindBy (xpath = "//*[@id='text']")
    public WebElement usernameBox;

    @FindBy (xpath = "//*[@id='password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//*[@id='login-button']")
    public WebElement loginButton;
}
