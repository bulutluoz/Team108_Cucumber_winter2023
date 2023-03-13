package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QdPage;
import utilities.ConfigReader;

public class QdStepdefinitions {
    QdPage qdPage = new QdPage();
    @Then("ilk login linkine tiklar")
    public void ilk_login_linkine_tiklar() {
        qdPage.ilkLoginLinki.click();
    }
    @Then("username olarak {string} girer")
    public void username_olarak_girer(String username) {
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty(username));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qdPage.loginButonu.click();
    }
    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(qdPage.emailKutusu.isEnabled());
    }

    @Then("basarili olarak giris yapildigini test eder")
    public void basariliOlarakGirisYapildiginiTestEder() {

        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());
    }

    @And("username olarak examples dan {string} girer")
    public void usernameOlarakExamplesDanGirer(String username) {
        qdPage.emailKutusu.sendKeys(username);
    }

    @And("password olarak examples dan {string} girer")
    public void passwordOlarakExamplesDanGirer(String password) {
        qdPage.passwordKutusu.sendKeys(password);
    }
}
