package gldt;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue= {"gldt"},
monochrome=true,
//plugin= {"pretty", "html:target/Cucumber-Reports/report.html"}
plugin = {"pretty", "json:target/Cucumber-Reports/report2.json"}
)
public class TestRunner {

}




