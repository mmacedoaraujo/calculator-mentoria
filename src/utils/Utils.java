package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public Boolean regexMatcher(String pattern, String matcher) {
        Matcher m = Pattern.compile(pattern).matcher(matcher);
        return m.find();
    }
}
