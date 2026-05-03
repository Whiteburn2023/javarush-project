package ru.javarush.java.core.level17.task16;

public class Cat extends Mammal{
    @Override
    void eat() {
        System.out.println(animalName + " ест рыбу.");
    }

    void purr(){
        System.out.println(animalName + " мурлычет.");
    }
}
