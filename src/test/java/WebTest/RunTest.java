package WebTest;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features", tags = {"@hover"},
        monochrome = true,
        plugin = {"pretty","html:target/Destination/cucumber-html-report", "json:target/cucumber-json-report.json" }

        )
public class RunTest
{


}
