package com.pb.vasilenko.hw2;

import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;


import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        char op;
        x = scan.nextInt();
        y = scan.nextInt();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = scan.next() .charAt(0);
        switch(op) {
        case '+':
            System.out.println(+(x+y));
        break;
        case '-':
            System.out.println(+(x-y));
        break;
        case '*':
            System.out.println(+(x*y));
        break;
        case '/':
            System.out.println(+(x/y));
        if (y == 0)
        {System.out.println("на ноль не делить");

        break;}
   }
 }
}
