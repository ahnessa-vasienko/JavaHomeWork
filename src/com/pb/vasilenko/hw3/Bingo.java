package com.pb.vasilenko.hw3;

import java.util.Random;
import java.util.Scanner;



public class Bingo {

    private static Scanner in;

    public static void main(String[] args) {
        final int min = 0; // Минимальное число для диапазона
        final int max = 100; // Максимальное число для диапазона
        final int rnd = rnd(min, max);

        System.out.println("Рандомное число:" + rnd);

        System.out.println("Для выхода из програмы нажмите - 666");
        System.out.println("Назови число от 0 до 100: ");


        int attempt = 0;
        final int noattempt = 0;
        final int exit = 666;

        Scanner in = new Scanner(System.in);

        while (true)
        {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            int i = in.nextInt();

            if (i == exit) {
                System.out.println("Конец");
                break;
            }

            else if (rnd > i) {
                System.out.println("Загаданное число больше");
                continue;
            }

            else if (rnd < i) {
                System.out.println("Загаданное число меньше");
                continue;
            }
            else if (rnd == i) {
                System.out.println("Бинго");
                System.out.println("Поздравляем! Вы угадали за " + attempt + " попыток. ");
                break;
            }

        }



    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}

