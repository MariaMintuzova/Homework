package ru.geekbrains.lesson1;

public class Homework1main {
    public static void main(String[] args) {

        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {

        int a;
        int b;
        a = 15;
        b = 25;

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");

    }

    public static void printColor() {
        int value = -3;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else System.out.println("Красный");

    }

    public static void compareNumbers() {
        int a = 2;
        int b = 8;

        if (a >= b) {
            System.out.println("a >= b");
        }
        System.out.println("a < b");



    }
}
