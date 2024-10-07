public class CredentialVerificationStep implements ProcessStep {
    private String credentialType;

    public CredentialVerificationStep(String credentialType) {
        this.credentialType = credentialType;
    }

    @Override
    public void execute(Context context) {
        System.out.println("Credential Verification Step Executed for:" + credentialType);
        context.set("credentailVerified", true);
    }

    @Override
    public String getName() {
        return "Credential Verification";
    }

}
