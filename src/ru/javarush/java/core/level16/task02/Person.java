package ru.javarush.java.core.level16.task02;

public class Person {
    private String userName;

    public Person(String userName) {
        this.userName = userName;
    }

    class Greeting{


        void sayHello(){
            System.out.println("Hello, " + userName);

        }
    }
}
