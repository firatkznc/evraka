package evraka.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.Pretty.Reports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue = "evraka/step_definitions",
        dryRun = false,
        tags = ""



)









public class CukesRunner {

}
