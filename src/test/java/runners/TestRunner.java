package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"pretty", "html:target/cucumber-reports", "json:target/Cucumber.json"},
            features = "classpath:features",
            glue = {"stepDefinitions"},
            tags = {"@RegisterWithIncorrectCredentials"})
    public class TestRunner {
    }

