package ss18_regex_java.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public ValidateAccount() {
        pattern = Pattern.compile(ACCOUNT_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    private static ValidateAccount validateAccount;
    public static final String[] validAccount = new String[]{"_12312312ababab", "1231233", "_______"};
    public static final String[] invalidAccount = new String[]{"ANMN", "123.", "!@#!@"};

    public static void main(String args[]) {
        validateAccount = new ValidateAccount();
        for (String email : validAccount) {
            boolean isvalid = validateAccount.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
        for (String email : invalidAccount) {
            boolean isvalid = validateAccount.validate(email);
            System.out.println("Email is " + email + " is valid: " + isvalid);
        }
    }
}
