package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HMCPage;

public class HMCStepDefinitons {

    HMCPage hmcPage = new HMCPage();

    @Then("Login yazisina tiklar")
    public void login_yazisina_tiklar() {
    }

    @Then("gecerli username girer")
    public void gecerli_username_girer() {
    }

    @Then("gecerli password girer")
    public void gecerli_password_girer() {
    }

    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {

    }

    @And("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {

    }

    @And("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
    }
}
