package lesso.num1;

/*
Переменные которые зарезервированные Java:
abstract, assert, boolean, break, byte, case, catch,
char, class, const, continue, default, do, double, else,
enum, extends, final, finally, float, for, goto, if,
implements, import, instanceof, int, interface, long,
native, new, package, private, protected, public, return,
short, static, strictfp, super, switch, synchronized,
this, throw, throws, transient, try, void, volatile, while.
 */

public class Primetive {

     public static void main(String[] args) {

            final byte b = 127; // 8-битное final(константа) - не дает менять значение переменной при выполнение прогрммы
            short s = 32767; //16
            int i = 2147483647; //32
            long l = 934959349L; //64

            float f = 120434.0f; // 32, плавущая строчка
            double d =  1534.72775; // 64

            boolean bool = true; // логическое true / false
            char c = 'f'; //16, для unic®ode

            int volume = 7;
            volume = 3;
            volume = 5;
            System.out.println(volume);

            float r = 23f, t = 24f;
            float e, w;

            System.out.println(r + " " + t);

            volume = 1 + 2 - 3 * 4 / 5 % 6;

            volume = 3 % 2;
            System.out.println("% " + volume);

            int increment = 3;
            increment++;
            System.out.println("Инкримент после: " + increment);
            ++increment;
            System.out.println("Инкримент до: " + increment);

            int decrement = 3;
            --decrement;
            System.out.println("Декремент до : " + decrement);
            decrement--;
            System.out.println("Декремент после: " + decrement);

            double k = 5;
            double lp = 2;
            double hy = 8;
            k += k; // -=, *=, /=, %=
            System.out.println("k += k : " + k);
            lp = lp + lp;
            System.out.println("lp = lp + lp: " + lp);
            k += lp / hy;
            System.out.println("k += lp / hy: " + k);


            System.out.println("Объем: " + volume);


            System.out.println(b);
            System.out.println(s);
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            System.out.println(bool);
            System.out.println(c);

        }
    }

