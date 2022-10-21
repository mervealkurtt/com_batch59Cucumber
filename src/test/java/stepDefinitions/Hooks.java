package stepDefinitions;

import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.util.Scanner;

public class Hooks {

    /*
        Cucumber'da step definitions package'i icerisinde @Before, @After
        gibi bir notasyon varsa extends 'Test Base' dememize gerek kalmadan
        her Scenario'dan once ve/veya sonra bu method'lar calisacaktir.

        Bu da bizim isteyecegimiz bir durum degildir.

        Cucumber'da @Before, @After kullanma ihtiyacimiz olursa bunu step definitions
        package'i altinda olusturacagimiz 'Hooks' class'ina koyariz.

        Biz her Scenario'dan sonra test sonucunu kontrol edip, failed olan Scenario'lar
        icin screenshoot almasi amaciyla @After method'unu kullanacagiz.
     */

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshoot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        if (scenario.isFailed()){
            scenario.attach(screenshoot, "image/png", "screenshoots");
        }
        //Driver.closeDriver();
    }
}
