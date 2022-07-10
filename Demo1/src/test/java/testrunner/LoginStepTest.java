package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Java\\Demo1\\src\\test\\resources\\Feature\\Demo2.feature", glue = {"stepdefination"},
monochrome=true,
plugin= {"pretty","html:target/HtmlFile/index.html"})

//plugin= {"pretty","junit:target/XMLFile/test.xml"})
public class LoginStepTest {

}
