package testRunners;
/*///*
// * package hlgamemav;
// * 
// * import org.junit.platform.suite.api.ConfigurationParameter; import
// * org.junit.platform.suite.api.IncludeEngines; import
// * org.junit.platform.suite.api.SelectClasspathResource; import
// * org.junit.platform.suite.api.Suite;
// * 
// * import static
// * io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
// * 
// * @Suite
// * 
// * @IncludeEngines("cucumber")
// * 
// * @SelectClasspathResource("hlgamemav")
// * 
// * @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty") public
// * class RunCucumberTest { }
// */

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/java/features" }, glue = { "stepsdefinitions" }, monochrome = true)
public class RunCucumberTest {
	
}