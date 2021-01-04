import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String NAME_PHONE = "\\\\(\\\\d{2}\\\\)-\\\\(0\\\\d{9}\\\\)$";

    public ValidatePhone() {
        pattern = Pattern.compile(NAME_PHONE);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
