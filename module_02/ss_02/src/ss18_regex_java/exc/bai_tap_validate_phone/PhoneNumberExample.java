package ss18_regex_java.exc.bai_tap_validate_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String PHONE_NUMBER_REGEX = "^[(]\\d{2}[)]-[(]0\\d{9}[)]$";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
