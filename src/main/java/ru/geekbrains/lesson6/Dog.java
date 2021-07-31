package ru.geekbrains.lesson6;

public class Dog extends Animal{
    public Dog (String name, int distance){
        super(name, distance);
    }

    @Override
    protected void swim(){
        if (getDistance() <= 10) {
            System.out.println(
                    String.format("%s проплыл(a) %s метров", getName(), getDistance()));
        }
        else System.out.println
                (String.format("Собака %s столько не проплывет!", getName()));
    }


    @Override
    protected void run () {
        if (getDistance() > 500) {
            System.out.printf("Собака %s так далеко не убежит!%n", getName());
        } else System.out.printf(" %s пробежал(а) %s метров%n", getName(), getDistance());

    }
}
