package lesso.num1;

import java.util.Scanner;


public class ScannerTest {
    public static void main(String[] args) {
        double arg = readArgument("Введите первый аргумент а: ");
        double babrg = readArgument("Введите второй аргумент b: ");

        if (calculator(arg, babrg)){
        }
    }

    static double readArgument(String userText) {
        Scanner userInput = new Scanner(System.in);
        System.out.println(userText);
        double argument = userInput.nextDouble();
        return argument;
    }

    static boolean calculator(double a, double b) {
        System.out.println(a * b + (b / a));
        return false;
    }

}
