package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinitions {

    Workbook workbook;

    @Given("kullanici excel bilgilerini kullanabilir")
    public void kullanici_excel_bilgilerini_kullanabilir() throws IOException {
        String dosyaYolu = "src/test/resources/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        workbook = WorkbookFactory.create(fis);
    }

    @Then("{int}.satirdaki {int}.hucreyi yazdirir")
    public void satirdaki_hucreyi_yazdirir(Integer satir, Integer sutun) {
        String istenenHucreSyisi = workbook
                                        .getSheet("Sayfa1")
                                        .getRow(satir - 1)
                                        .getCell(sutun - 1)
                                        .toString();

        System.out.println(satir + ".satir " + sutun + ".sutundaki deger : " + istenenHucreSyisi);
    }

    @Then("baskenti Jakarta olan ulke ismini yazdirir")
    public void baskenti_jakarta_olan_ulke_ismini_yazdirir() {
        // for loop ile tum satirlar kontrol edilmelidir
        // bunun icin de satir sayisina ihtiyac vardir

        int satirSayisi = workbook.getSheet("Sayfa1").getLastRowNum();

        for (int i = 0; i <= satirSayisi; i++) {
            if (workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals("Jakarta")){
                System.out.println("Baskenti Jakarta olan ulke : "
                        + workbook.getSheet("Sayfa1").getRow(i).getCell(0));
            }
        }
    }

    @Then("ulke sayisinin {int} oldugunu test eder")
    public void ulke_sayisinin_oldugunu_test_eder(Integer ulkeSayisi) {
        int actualUlkeSayisi = workbook.getSheet("Sayfa1").getLastRowNum();
        Assert.assertTrue(ulkeSayisi == actualUlkeSayisi);

    }

    @Then("fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(Integer fizikiKullanilanSatir) {
        int actualFizikiKullanilanSatir = workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertTrue(fizikiKullanilanSatir == actualFizikiKullanilanSatir);
    }
}
