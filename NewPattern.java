import java.util.regex.Pattern;

/**
 * Created by intelliswift on 4/25/18.
 */
public class NewPattern {
    public static void main(String [] args) {
        String s = "thisismatchthisacan";
        String pattern = "^[a-z]+";
        boolean isMatch = Pattern.matches(pattern,s);
        System.out.println(isMatch);
    }
}
