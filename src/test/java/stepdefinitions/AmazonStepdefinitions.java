package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AmazonStepdefinitions {
    AmazonPage amazonPage= new AmazonPage();

    @Given("kullanici Amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("arama kutusuna Nutella yazar ve enter tusuna basar")
    public void arama_kutusuna_nutella_yazar_ve_enter_tusuna_basar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String expectedIcerik="Nutella";
        String actualAramaSonucYazisi= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }

    @When("arama kutusuna Java yazar ve enter tusuna basar")
    public void aramaKutusunaJavaYazarVeEnterTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @Then("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String expectedIcerik="Java";
        String actualAramaSonucYazisi= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));
    }

    @When("arama kutusuna Apple yazar ve enter tusuna basar")
    public void aramaKutusunaAppleYazarVeEnterTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Apple" + Keys.ENTER);
    }


    @Then("arama sonuclarinin Apple icerdigini test eder")
    public void aramaSonuclarininAppleIcerdiginiTestEder() {
        String expectedIcerik="Apple";
        String actualAramaSonucYazisi= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(expectedIcerik));
    }


    @Then("amazonda {string} icin arama yapar")
    public void amazondaIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime + Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonucYazisi= amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucYazisi.contains(arananKelime));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int istenenSaniye) {
        ReusableMethods.bekle(istenenSaniye);
    }
    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @Then("{string} sayfasina gittigini test eder")
    public void sayfasina_gittigini_test_eder(String istenenUrl) {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        String expectedUrl= ConfigReader.getProperty(istenenUrl) + "/";
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @When("{int}.urune gider")
    public void urune_gider(Integer istenenIndex) {
        amazonPage.istenenUrunElementi(istenenIndex).click();
    }
    @Then("urun isminin {string} icerdigini test eder")
    public void urun_isminin_icerdigini_test_eder(String arananKelime) {

        String actualUrunIsmi= amazonPage.ilkUrunIsimElementi.getText();
        Assert.assertTrue(actualUrunIsmi.contains(arananKelime));

    }

}
