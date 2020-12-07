package medlk.exceptions;

public enum ExceptionList {

    //Authentification
    E101 (101, "Email or Password fields are empty."),
    E102 (102, "Credentials was not found."),
    E103 (103, "Password did not matches stored hash."),
    E104 (104, "User was not found by this credentials."),
    //Registration
    E150 (150, "Email or Password fields are empty."),
    E151 (151, "User with this Email already exists."),
    E152 (152, "Email seems to be incorrect."),
    E153 (153, "Password field value not matches password requirements."),
    E154 (154, "Unknown registration error."),

    E110 (110, ""),
    E111 (111, ""),
    E112 (112, ""),
    E113 (113, ""),
    E114 (114, "");

    public Integer code;
    public String description;

    ExceptionList(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
