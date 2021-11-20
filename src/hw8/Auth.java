package hw8;

import java.util.regex.Pattern;

public class Auth {

    private String Login;
    private String password;


    public Auth (String Login, String password) {
        this.Login=Login;
        this.password=password;
    }
    public void signUp(String Login, String password,String confirmPassword)
        throws WrongLoginException, WrongPasswordException {
        if (!Pattern.matches("[a-zA-Z_0-9] {5,20}", Login )) {
            throw new WrongLoginException();
        }
    }
}
