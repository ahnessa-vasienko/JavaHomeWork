package hw8;

import java.util.regex.Pattern;

public class Auth {

    private String Login;
    private String password;


    public Auth (String Login, String password) {
        this.Login=Login;
        this.password=password;
    }
    public static void signUp(String Login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException, WrongConfirmPassword {
        if (!Pattern.matches("[a-zA-Z_0-9] {5,20}", Login )) {
        }
            else {
            throw new WrongLoginException();
        }

        if (!Pattern.matches("[a-zA-Z_0-9] {5,}]",password)) {
        }
          else  {
              throw new WrongPasswordException();

        }
          if (!password.equals(confirmPassword)) {
          }
          else {
              throw new WrongConfirmPassword ();
          }
          System.out.println( "Поздравляем регистрация прошла успешно");
    }

}
