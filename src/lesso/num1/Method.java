package lesso.num1;

import java.util.Scanner;
//        Scanner scanner = new Scanner("");
//        String s = scanner.nextLine();
//        System.out.println(s);


public class Method {
    public static void main(String[] args) {
        System.out.println("метод");

        System.out.println();

        method1("Метод");

        System.out.println();

        System.out.println();

        int sum = method2(2, 3);
        System.out.println(sum);
        int sum2 = method2(5, 2);
        System.out.println(sum2);

        System.out.println();

        System.out.println(method3());
    }

    static String method1(String s){
        System.out.println(s);
        return s;
    }

    static int method2(int a, int b){
        return a + b;
    }

    static int method3(){
        int a = 3;
        int b = 4;
        int y = a + b;
        return y;
    }

}
