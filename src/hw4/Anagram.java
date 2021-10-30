package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word1, word2;
        word1 = in.nextLine();
        word2 = in.nextLine();
        if (sort(word1).equals(sort(word2))) {
            System.out.print("Да");
        }
        else System.out.print("Нет");
    }
    static String sort(String word1) {
        char[] content = word1.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}