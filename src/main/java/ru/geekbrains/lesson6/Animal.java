package ru.geekbrains.lesson6;

public abstract class Animal {

    private String name;
    private int distance;
//    private int number;


    public Animal(String name, int distance){
        this.distance = distance;
        this.name = name;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


    public int getDistance() {
        return distance;
    }

//    public int getNumber() {
//        return number;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void swim();

   protected abstract void run();

   /** надо додумать */
//    final void sum(){
//        int getNumber = 0;
//        getNumber += 1;
//        System.out.println("Всего животных: " + getNumber);
//    }

}
