package runner;

import io.cucumber.testng.CucumberOptions;
import steps.ParentClass;

//src/test/java/features/Login.feature
@CucumberOptions(features="src/test/java/features",
                     glue="steps",
                     monochrome=true,
                     publish=true
                     )
public class CucumberRunner extends ParentClass {

}
