import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
   private static Pattern pattern;
   private Matcher matcher;

   private static final String NAME_CLASS = "^[ACP]\\d{4}[GHIKLM]$";

    public NameClass() {
        pattern = Pattern.compile(NAME_CLASS);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
