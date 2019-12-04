package com.company;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        int a = 0;
        int b = 3;
        int number1 = a + (int) (Math.random() * b);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа через пробел:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        switch (number1) {
            case (1):
                System.out.println("Результат:");
                System.out.println(num1 + num2);
                break;
            case (2):
                System.out.println("Результат:");
                System.out.println(num1 - num2);
                break;
            case (3):
                System.out.println("Результат:");
                System.out.println(num1 * num2);
                break;
        
    }
}
