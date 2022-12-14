package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

public class AutomationStepDefinitions {

    AutomationPage automationPage = new AutomationPage();
    Faker faker = new Faker();

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        automationPage.signInButton.click();
    }

    @Given("user Create an account bolumune email adresi girer")
    public void user_create_an_account_bolumune_email_adresi_girer() {
        automationPage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automationPage.createAccountButton.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(automationPage.gender)
                .sendKeys(Keys.TAB)
                .sendKeys(automationPage.firstName,"Ahsen")
                .sendKeys(Keys.TAB)
                .sendKeys(automationPage.lastName, "Kaya")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(automationPage.password,"123456Aa")
                .sendKeys(Keys.TAB)
                .sendKeys(automationPage.ddmDay,"10")
                .sendKeys(Keys.TAB)
                .sendKeys(automationPage.ddmMonth,"January")
                .sendKeys(Keys.TAB)
                .sendKeys(automationPage.ddmYear,"2000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(automationPage.city,"New Jersey")
                .sendKeys(Keys.TAB)
                .sendKeys(automationPage.ddmState,"Alaska")
                .sendKeys(Keys.TAB)
                .sendKeys("270000")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("This is USA address.")
                .sendKeys(Keys.TAB)
                .sendKeys(automationPage.homePhone,"123456789")
                .sendKeys(Keys.TAB)
                .sendKeys(automationPage.mobilePhone,"123456789")
                .sendKeys(Keys.TAB)
                .perform();
    }

    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
        automationPage.registerButton.click();
    }

    @And("hesap olustugunu dogrular")
    public void hesapOlustugunuDogrular() {
        Assert.assertTrue(automationPage.positiveResultText.isDisplayed());
    }
}