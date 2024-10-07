import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        ProcessStep mobileOnboarding = new MobileOnboardingStep();
        ProcessStep emailOnboarding = new EmailOnboardingStep();
        ProcessStep credentialVerification = new CredentialVerificationStep("Aadhaar");
        ProcessStep accountExistenceVerification = new AccountExistenceVerificationStep();

        UserOnboardingProcess onboardingProcess = new UserOnboardingProcess(Arrays.asList(mobileOnboarding,
                credentialVerification, accountExistenceVerification));
        onboardingProcess.execute(context);

        System.out.println("Onboarded By:" + context.get("onboardedBy"));
        System.out.println("Credential Verified:" + context.get("credentialVerified"));
        System.out.println("Account Exists:" + context.get("accountExists"));
    }
}
