public class EmailOnboardingStep implements ProcessStep {

    @Override
    public void execute(Context context) {
        System.out.println("Email Onboarding Step Executed:");
        context.set("onboardedBy", "email");
    }

    @Override
    public String getName() {
        return "Email Onboarding";
    }

}
