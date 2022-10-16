package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports/cucumber-reports.html",
                  "json:target/cucumber-reports/cucumber-reports.json",
                  "junit:target/cucumber-reports/cucumber-reports.xml"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@nutella",
        dryRun = false
)

public class TestRunner {
    /*
        Bir framework'te bir tek Runner class'i yeterli olabilir.
        Runner class'inda class body'sinde hicbir sey olmaz
        Runner class'imizi onemli yapan 2 adet annotation vardir:
        - @RunWith(Cucumber.class), notasyonu Runner Class'ina calisma ozelligi katar.
          Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz.
        - @CucumberOptions()
            features : Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder.
            glue : step definitions dosyalarini nerede bulacagimizi gosterir.
            tags : o an hangi tag'i calistimak istiyorsak onu belli eder.
            dryRun : iki secenek var
                dryRun = true : testimizi calistirmadan sadece eksik adimlari bize verir
                dryRun = false : testlerimizi normal calistirir
    */

}
