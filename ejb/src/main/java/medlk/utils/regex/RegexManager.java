package medlk.utils.regex;

import java.util.regex.Pattern;

public abstract class RegexManager {

    public static boolean matches(String string, PatternList pattern){
        return Pattern.compile(pattern.regex).matcher(string).matches();
    }

}
