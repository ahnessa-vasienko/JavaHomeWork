package com.pb.vasilenko.hw2;

import java.util.Scanner;

import static java.lang.System.in;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        char op;
        x = scan.nextInt();
        y = scan.nextInt();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = scan.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(+(x + y));
                break;
            case '-':
                System.out.println(+(x - y));
                break;
            case '*':
                System.out.println(+(x * y));
                break;
            case '/':
                if (y == 0)
                    System.out.println("На 0 делить нельзя");
                if (y != 0)
                    System.out.println(+(x / y));
                break;

            default: {
                System.out.println("Неверная операция");
            }
        }
    }
}