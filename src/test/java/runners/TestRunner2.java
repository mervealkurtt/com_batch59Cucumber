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
        tags = "@java",
        dryRun = false
)

public class TestRunner2 {
}
