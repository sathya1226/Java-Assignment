public class MobileOnboardingStep implements ProcessStep {
    @Override
    public void execute(Context context) {
        System.out.println("Mobile Onboarding Step Executed:");
        context.set("onboardedBy", "mobile");
    }

    @Override
    public String getName() {
        return "Mobile Onboarding";
    }

}
