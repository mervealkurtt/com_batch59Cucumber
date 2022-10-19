package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports/cucumber-reports2.html",
                "json:target/cucumber-reports/cucumber-reports2.json",
                "junit:target/cucumber-reports/cucumber-reports2.xml"
        },
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@herokuapp",
        dryRun = false
)

public class TestRunner2 {
}
