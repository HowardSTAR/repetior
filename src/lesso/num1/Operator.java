package lesso.num1;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        double a = readArgument("Введите а: ");
        double b = readArgument("Введите b: ");

        if (a > b) {
            System.out.println("a > b");
        }
        else {
            System.out.println("a < b");
        }

    }

    public static double readArgument(String userText){
        Scanner userInput = new Scanner(System.in);
        System.out.println(userText);
        double arg =  userInput.nextDouble();
        return arg;
    }

}
