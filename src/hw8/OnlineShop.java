package hw8;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;
public class OnlineShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.println(" Введите логин");
    String Log = scan.nextLine();
    System.out.println("Введите пароль");
    String pasw = scan.nextLine();
    System.out.println("Повторите пароль");
    String confPasw = scan.nextLine();

            try {
                Auth.signUp(Log, pasw, confPasw);

            } catch (WrongLoginException e) {
                e.printStackTrace();
                System.out.println(" Логин не подходит" + e.getMessage());
            } catch (WrongConfirmPassword wrongConfirmPassword) {
                wrongConfirmPassword.printStackTrace();
            } catch (WrongPasswordException e) {
                e.printStackTrace();
                System.out.println("Пароль не подходит" + e.getMessage());
            }


        }
    }

