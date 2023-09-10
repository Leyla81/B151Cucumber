package techproed.stepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.TechProPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TechproStepDefinition {
    TechProPage techProPage =new TechProPage();
    @Given("kullanici techproEducation sayfasina gider")
    public void kullaniciTechproEducationSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("techproUrl"));
    }

    @Then("arama kutusunda qa aratir")
    public void aramaKutusundaQaAratir() {
        techProPage.aramaKutusu.sendKeys("qa", Keys.ENTER);
    }

    @Then("arama kutusunda mobile aratir")
    public void aramaKutusundaMobileAratir() {
        techProPage.aramaKutusu.sendKeys("mobile");
        ReusableMethods.bekle(2);
    }

    @But("cikan dropdown menuden mobile developer secenegini tiklar")
    public void cikanDropdownMenudenMobileDeveloperSeceneginiTiklar() {
        techProPage.mobilDevLink.click();
        ReusableMethods.bekle(2);
    }

    @And("basligin Mobile icerdigini test eder")
    public void basliginMobileIcerdiginiTestEder() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Mobile"));
    }

    @Then("arama kutusunda java aratir")
    public void aramaKutusundaJavaAratir() {
        techProPage.aramaKutusu.sendKeys("java");
        ReusableMethods.bekle(2);
    }

    @But("cikan dropdown menuden free java secenegini tiklar")
    public void cikanDropdownMenudenFreeJavaSeceneginiTiklar() {
        techProPage.FreeJavaLink.click();
        ReusableMethods.bekle(2);
    }

    @And("basligin Free icerdigini test eder")
    public void basliginFreeIcerdiginiTestEder() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Free"));
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @Then("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        techProPage.aramaKutusu.sendKeys(str);
    }

    @And("basligin {string} icerdigini test eder")
    public void basliginIcerdiginiTestEder(String baslik) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(baslik));
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int sayi) {
        try {
            Thread.sleep(sayi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}