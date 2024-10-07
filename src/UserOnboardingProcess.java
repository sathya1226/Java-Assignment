import java.util.List;

public class UserOnboardingProcess implements Process {
    private List<ProcessStep> steps;

    public UserOnboardingProcess(List<ProcessStep> steps) {
        this.steps = steps;
    }

    @Override
    public void execute(Context context) {
        for (ProcessStep step : steps) {
            System.out.println("Executing:" + step.getName());
            step.execute(context);
        }
    }
}
