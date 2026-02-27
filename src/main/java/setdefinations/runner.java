package setdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="cucumber_features/demoblaze.feature",glue="setdefinations")
public class runner {

}
