package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/casestudy4.feature", 
glue="cucu" ,
plugin={"json:c:\target.json"})
              

public class runner {

}
