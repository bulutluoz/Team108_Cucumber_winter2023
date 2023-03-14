package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/paralelReport2.html",
                "json:target/json-reports/paralelReport2.json",
                "junit:target/xml-report/paralelReport2.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@ss" ,
        dryRun = false
)

public class ParalelRunner2 {
}
