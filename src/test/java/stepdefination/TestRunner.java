package stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
features="src\\test\\java\\feature\\pizzahut.feature",
  glue= {"stepdefination"},
  
  plugin= {"pretty",
		  "html:target/HtmlReport/index.html",
          "json:target/JSONReports/cucumber.json",
		  }
  
   )


public class TestRunner {

}
