package ru.geekbrains.lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean fullness = false;

    public boolean isFullness() {
        return fullness;
    }

    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Plate p) {
        if (isFullness() == false) {
            if (appetite <= p.getFood()) {
                p.decreaseFood(appetite);
                setFullness(true);
                System.out.println(name + " поел из тарелки.");

            } else System.out.println("В тарелке мало еды!");
        }
    }

    public void catInfo () {
        if ( isFullness() == true){
        System.out.println("Кот " + name + " сыт." );
        } else System.out.println("Кот " + name + " голоден.");
    }

}
