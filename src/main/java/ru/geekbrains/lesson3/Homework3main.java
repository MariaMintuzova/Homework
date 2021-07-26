package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3main {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5a();
    }

    static void task1() {
        System.out.println("Задание 1.");

        int [] firstArray = {0, 1, 0, 0, 1};

        for (int value : firstArray){
            if (value == 0){
                value = 1;
            } else value = 0;
            System.out.println(value);
        }
    }

    static void task2(){
        System.out.println("Задание 2.");

        int[] secondArray = new int [100];

        for(int i = 0; i < secondArray.length; i++){
            secondArray [i] = i+1;
            System.out.println(secondArray[i]);
        }
    }

    static void task3(){
        System.out.println("Задание 3.");

        int [] thirdArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        for (int value: thirdArray) {
            if (value < 6){
                value = value * 2;
            }
            System.out.println(value);
        }

    }

    static void task4() {
        System.out.println("Задание 4.");
        /** решение для массива 5*5. как сделать универсальный ответ, я не додумалась.
         * предполагаю, что для "четных" и "нечетных" массивов разные алгоритмы*/

        int [][] fourthArray = new int[5][5];

        for(int i = 0; i < fourthArray.length; i += fourthArray.length - 1){
            for(int j = 0; j < fourthArray[i].length; j += fourthArray[i].length - 1){
                fourthArray[i][j] = 1;
            }
        }

        for (int i = 1; i < fourthArray.length; i += 2 ){
            for(int j = 1; j < fourthArray[i].length; j += 2){
                fourthArray[i][j] = 1;
            }
        }

        fourthArray[2][2] = 1;

        for(int i = 0; i < fourthArray.length; i++){
            for(int j = 0; j < fourthArray[i].length; j++){

                System.out.print(fourthArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static int[] task5() {
        System.out.println("Задание 5.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int len = sc.nextInt();
        System.out.println("Введите значение");
        int initialValue = sc.nextInt();

        int[] fifthArray = new int[len];
        for (int i = 0; i < fifthArray.length; i++){
            fifthArray[i] = initialValue;
        } return fifthArray;
    }
    static void task5a(){
        int [] fifthArray = task5();
        System.out.println(Arrays.toString(fifthArray));
        /** я таки дошла до доп.материалов в методичке */
    }


}

