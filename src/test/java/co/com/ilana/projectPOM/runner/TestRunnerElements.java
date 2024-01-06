package co.com.ilana.projectPOM.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/linkElements.feature"}
        , glue = {"co.com.ilana.projectPOM.stepDefinition"}
        , snippets =  CucumberOptions.SnippetType.CAMELCASE)
public class TestRunnerElements {
}
