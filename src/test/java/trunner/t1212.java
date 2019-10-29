package trunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features="C:\\Users\\training_h2a.06.17\\Desktop\\Eclipse\\eclipse\\Eclipse Documents\\CDem\\target\\Cdemft.feature",
		glue= {"test11"},
		//tags={"@Register"},
		plugin= {"pretty","html:target/Report12"}
		
)
public class t1212 

{

}
