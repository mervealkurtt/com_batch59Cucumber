package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationPage {

    public AutomationPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='login']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//div[@class='radio-inline']")
    public WebElement gender;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement firtName;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement ddmDay;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement ddmMonth;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement ddmYear;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement firstName2;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement lastName2;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement company;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement address1;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement address2;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement ddmState;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement zip;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement ddmCountry;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement info;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement homePhone;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement mobilePhone;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement myAddress;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement registerButton;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement positiveResultText;

    @FindBy(xpath = "//input[@id='email_create']")
    public WebElement negativeResultText;
}
