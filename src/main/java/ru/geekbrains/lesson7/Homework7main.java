package ru.geekbrains.lesson7;

public class Homework7main {
    public static void main(String[] args) {

        Plate plate = new Plate(100);
        Cat[] cats = new Cat[]{
                new Cat("Barsic", 20),
                new Cat("Tom", 15),
                new Cat("Murka", 20),
                new Cat("Pushok", 25),
                new Cat("Lapka", 20),
                new Cat("Bob", 10)
        };


        for(int i = 0; i < cats.length; i++){
            cats[i].eat(plate);

        }
        for(int i = 0; i < cats.length; i++) {

            cats[i].catInfo();
        }

        plate.info();
        plate.addFood(20);





    }
}
