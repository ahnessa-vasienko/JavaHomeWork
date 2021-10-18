package com.pb.vasilenko.hw2;

import java.util.Scanner;

public class Interval {

    private static Scanner in;

    public static void main(String[] args) {

        byte a = 0, b = 20, d = 21, e = 40, f = 41, g = 60, h = 61, j = 80, k = 81, n = 100;

        System.out.print("Проверка попадания числа в интервал от 0 до 100" + "\n" + "Введите число: ");

        in = new Scanner(System.in);
        byte i = in.nextByte();

        if (i >= a && i <= b) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + a + " до " + b + "\n");
        } else if (i >= d && i <= e) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + d + " до " + e + "\n");
        } else if (i >= f && i <= g) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + f + " до " + g + "\n");
        } else if (i >= h && i <= j) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + h + " до " + j + "\n");
        } else if (i >= k && i <= n) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + k + " до " + n + "\n");
        } else if (i > n) {
            System.out.print("Ваше число " + i + " не попадает ни в один интервал");
        } else if (i < a) {
            System.out.print("Ваше число " + i + " является отрицательным");
        }
    }
}