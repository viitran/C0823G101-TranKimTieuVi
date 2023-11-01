package ss18_regex_java.exc.bai_tap_validate_name_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static final String NAME_CLASS_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public boolean checkValidateNameClass(String regex) {
        Pattern pattern = Pattern.compile(NAME_CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
