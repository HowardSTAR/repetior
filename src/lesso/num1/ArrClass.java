package lesso.num1;

import java.util.Arrays;

public class ArrClass {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4}; // заранее задные значения в массиве

        int[] arr1 = new int[5]; // сколько памяти выделяем под массив

        int a = 0;
        arr1[a] = a++;
        arr1[a] = a++;
        arr1[a] = a++;
        arr1[a] = a++;
        arr1[a] = a++;

        System.out.println("Вывод всего массива: " + Arrays.toString(arr1)); //перевод массива в строку

        System.out.println("----------------------");

        int[][] nums = new  int[2][2];
        nums[0][0] = 1;
        nums[0][1] = 6;
        nums[1][0] = 4;
        nums[1][1] = 2;

//TODO заполнить двумерный массив автоматически

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        int[] test = new int[4];
        int x = 0;
        for (int i = 0; i < test.length; i++) {
            test[x] = x++;
            System.out.print(test[i] + " "); //то как должно быть в конечном варианте
//            System.out.print(Arrays.toString(test)); // по этапно
        }

    }
}
