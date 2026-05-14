package ru.javarush.java.core.level18.task07;

public class Greetings {
    private String name;
    private String surname;

    public void sayHello(String name){
        System.out.println("Hello, " + name + "!");
    }

    public void sayHello(String name, String surname){
        System.out.println("Hello, " + name  + " " + surname + "!");
    }
}
