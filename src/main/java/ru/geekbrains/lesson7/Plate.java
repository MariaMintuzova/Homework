package ru.geekbrains.lesson7;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if ((food - n) >= 0) {
            food -= n;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addFood (int moreFood){
        food = food + moreFood;
        System.out.println(
                String.format("Вы добавили в тарелку %s еды", moreFood));
        info();
    }

}
