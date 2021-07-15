package ru.geekbrains.lesson2;

public class Homework2main {

    public static void main(String[] args) {

        System.out.println(chekSum(7, 15));
        numberSign(8);
        System.out.println(negativeOrPositive(9));
        repeatMessage("Лето", 5);

    }


    public static boolean chekSum(int a, int b) {
        int i = a + b;

//        if (i >= 10 && i <= 20) {
//            return true;
//        } else return false;
        return (i >= 10 && i <= 20);

    }

    public static void numberSign(int a) {

        if (a >= 0) {
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");
    }

    public static boolean negativeOrPositive(int a) {

        return (a >= 0);
    }

    public static void repeatMessage(String whatToRepeat, int howManyTimes) {
        for (int c = 1; c <= howManyTimes; c++) {
            System.out.println(whatToRepeat);
        }
    }


}
