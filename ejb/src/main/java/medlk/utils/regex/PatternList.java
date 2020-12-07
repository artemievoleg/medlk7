package medlk.utils.regex;

public enum PatternList {

    PASS ("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[A-Z]).{8,}$"), //8+ символов, хотябы: 1 символ "a-z", 1 символ "A-Z", 1 символ "0-9".
    EMAIL ("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$"), //патерн для почты
    NEW ("");

    public String regex;

    PatternList(String regex) {
        this.regex = regex;
    }
}
