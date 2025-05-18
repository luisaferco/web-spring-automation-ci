package com.automation.example.spring;


import com.automation.example.spring.config.Config;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "json:build/reports/cucumber.json"},
        features = "src/test/resources/features/",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"com.automation.example.spring.steps"},
        tags = "not @manual"
)
@SpringBootTest(classes = Config.class)
public class RunnerTest {
}
