package ru.geekbrains.lesson5;

public class Homework5main {
    public static void main(String[] args) {


        Worker[] departmentOperators = new Worker[5];
        departmentOperators[0] = new Worker("Петр Иванов", "operator", "123@gm.com",
            "+79991232323", 48000,29);
        departmentOperators[1] = new Worker("Иван Петров", "operator assistant", "124@gm.com",
                "+79991242424", 35000,22);
        departmentOperators[2] = new Worker("Иван Семенов", "operator", "125@gm.com",
                "+79991253354", 50000,45);
        departmentOperators[3] = new Worker("Татьяна Иванова", "operator", "126@gm.com",
                "+7999126783", 50000,41);
        departmentOperators[4] = new Worker("Ирина Петрова", "head operator", "127@gm.com",
                "+7999187663", 60000,39);

        for (int i = 0; i < departmentOperators.length; i++){
            if (departmentOperators[i].getAge() > 40 ){
               departmentOperators[i].information();
            }

        }




    }

}
