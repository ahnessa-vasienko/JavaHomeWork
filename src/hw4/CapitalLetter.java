package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class CapitalLetter {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();


            //напишите тут ваш код
            String[] words = s.split("\\s+");
            String snew = "";
            for (int i = 0; i < words.length; i++) {
                snew = snew + words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
            }
            System.out.println(snew.trim());

        }
}
