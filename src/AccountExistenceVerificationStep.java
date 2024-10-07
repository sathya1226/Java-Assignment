public class AccountExistenceVerificationStep implements ProcessStep {

    @Override
    public void execute(Context context) {
        System.out.println("Account Existence Verification Step Executed:");
        context.set("accountExists", true);
    }

    @Override
    public String getName() {
        return "Account Existence Verification";
    }

}
