import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.reporters.*;
import org.jbehave.core.steps.*;
import java.util.Arrays;
import java.util.List;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.SurefireReporter;
import org.junit.runner.RunWith;
import com.github.valfirst.jbehave.junit.monitoring.JUnitReportingRunner;
import Steps.EditProfileSteps;
import Steps.LoginFailureSteps;
import Steps.LoginSuccessSteps;
import Steps.ProfileSteps;
import Steps.RequestQuotationSteps;
import Steps.RetrieveQuotationSteps;

@RunWith(JUnitReportingRunner.class)
public class RunStories extends JUnitStories {

    protected List<String> storyPaths() {
        return Arrays.asList(
                "Stories/EditProfile.story",
                "Stories/LoginFailure.story",
                "Stories/LoginSuccess.story",
                "Stories/Profile.story",
                "Stories/RequestQuotation.story",
                "Stories/RetrieveQuotation.story"
        );
    }

    @Override
    public Configuration configuration() {
        SurefireReporter surefireReporter = new SurefireReporter(getClass());
        return new MostUsefulConfiguration()
                .useStoryReporterBuilder(new StoryReporterBuilder()
                      .withSurefireReporter(surefireReporter));
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(),
                // Create an instance of the class with step definitions
                new EditProfileSteps(),
                new LoginFailureSteps(),
                new LoginSuccessSteps(),
                new ProfileSteps(),
                new RequestQuotationSteps(),
                new RetrieveQuotationSteps()
        );
    }
}