package lesso.num1;


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

        System.out.println(method2(6,3));

        System.out.println();

        System.out.println(method2(4,6));


        System.out.println(method3());

        System.out.println("Перегрузка:");

        int a = multy(4,5);

        double b = multy(5.5);
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

    // Перегрузка методов
    static int multy (int x, int y) {
        return x * y;
    }

    static double multy (double x) {
        return x * x;
    }

}
