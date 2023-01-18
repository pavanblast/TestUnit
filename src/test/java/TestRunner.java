
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings({"unused"})
@RunWith(Cucumber.class)
@CucumberOptions(
        //path of feature file
        features = "src\\main\\resources\\Features\\EditProfile.feature"
)
public class TestRunner {
}