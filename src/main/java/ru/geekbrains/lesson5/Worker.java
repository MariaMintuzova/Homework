package ru.geekbrains.lesson5;

public class Worker {
    private String name;
    private String position;
    private String email;
    private String telNumber;
    private int salary;
    private int age;

    public Worker() {
    }

    public Worker (String name, String position, String email, String telNumber, int salary,
                   int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.telNumber = telNumber;
        this.salary = salary;
        this.age = age;

    }

    void information (){
        System.out.println(
                String.format("ФИО: %s. Должность: %s. Эл.почта: %s. Телефон: %s. Зарплата: %s руб. Возраст: %s",
                        name, position, email, telNumber, salary,
                        age)
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
