package com.pb.vasilenko.hw3;


import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        System.out.println("Введите целые числа размерностью 10 элементов");
        Scanner input = new Scanner(System.in);

        {
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++)
                array[i] = input.nextInt();

            System.out.println("Вывести на экран введеный массив:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(" " + array[i]);
            }


            int sum = 0;
            for (int i = 0; i < array.length; i++)
                sum += array[i];

            System.out.println("Сумма элементов массива равна: " + sum);
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0)
                    counter += 1;
                System.out.println("колличество положительных" + counter);
                break;
            }

            boolean isSorted = false;
            int buf;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;

                        buf = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = buf;
                    }
                }

            }
        }

    }
}
