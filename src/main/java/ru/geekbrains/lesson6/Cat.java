package ru.geekbrains.lesson6;

public class Cat extends Animal{

    public Cat(String name, int distance){
        super(name, distance);
    }

    @Override
    protected void swim(){
        System.out.println("Кошки не умеют плавать!");
    }


    @Override
    protected void run () {
        if (getDistance() > 200) {
            System.out.println(
                    String.format("Кошка %s так далеко не убежит!", getName()));
        } else System.out.println(
               String.format("Кошка %s пробежала %s метров", getName(), getDistance()));

    }

}
