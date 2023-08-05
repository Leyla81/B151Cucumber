package techproed.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalCarPage;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

import java.util.Map;

public class BlueRentalStepDefinition {
    BlueRentalCarPage blueRentalPage = new BlueRentalCarPage();

    @Then("kullanici login buttonuna tiklar")
    public void kullaniciLoginButtonunaTiklar() {
        blueRentalPage.loginButtonu.click();
    }

    @And("kullanici tabloda verilen bilgiler ile login olur")
    public void kullaniciTablodaVerilenBilgilerIleLoginOlur(DataTable data) {
        blueRentalPage.emailBox.sendKeys(data.row(1).get(0), Keys.TAB,data.row(1).get(1),Keys.ENTER);
        ReusableMethods.bekle(3);   //satir 1 de 0.sutunu getir  1.satirda 1.sutunu getir
        Driver.getDriver().navigate().back();
        blueRentalPage.emailBox.sendKeys(data.row(2).get(0),Keys.TAB,data.row(2).get(1),Keys.ENTER);
        ReusableMethods.bekle(3);
    }

    @And("kullanici tabloda ki verilen bilgileri kullanarak map ile login olur")
    public void kullaniciTablodaKiVerilenBilgileriKullanarakMapIleLoginOlur(DataTable data) {
        for (Map<String,String> w:data.asMaps()) {
            blueRentalPage.emailBox.sendKeys(w.get("email"),Keys.TAB,w.get("password"),Keys.ENTER);
            ReusableMethods.bekle(3);
            Driver.getDriver().navigate().back();
            ReusableMethods.bekle(3);
        }
    }


    @And("exceldeki {string} sayfasindaki bilgiler ile giris yapildigini test eder")
    public void exceldekiSayfasindakiBilgilerIleGirisYapildiginiTestEder(String sayfaismi) {
        String dosyaYolu ="src/test/resources/mysmoketestdata.xlsx";
        ExcelReader excelReader =new ExcelReader(dosyaYolu,sayfaismi);
        for (int i = 1; i <excelReader.rowCount() ; i++) { //rowCount() methodu satir sayisini verir
            String email = excelReader.getCellData(i,0);
            String password =excelReader.getCellData(i,1);
            blueRentalPage.emailBox.sendKeys(email,Keys.TAB,password,Keys.ENTER);
            ReusableMethods.bekle(2);
            blueRentalPage.activeLogin.click();
            ReusableMethods.bekle(2);
            blueRentalPage.profileButton.click();
            ReusableMethods.bekle(2);
            Assert.assertEquals(blueRentalPage.currentEmail.getText(),email);
            blueRentalPage.activeLogin.click();
            ReusableMethods.bekle(2);
            blueRentalPage.loginButtonu.click();
            ReusableMethods.bekle(2);
            blueRentalPage.logoutButton.click();
            ReusableMethods.bekle(2);
            blueRentalPage.OKButton.click();
            
        }


    }
}