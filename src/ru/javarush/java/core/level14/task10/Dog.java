package ru.javarush.java.core.level14.task10;

public class Dog {
    // Поля с основной информацией о собаке
    // Конструктор "регистрации": сразу присваиваем имя и возраст
    String dogName;
    int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return "Собаку зовут " + dogName + ", ей " + dogAge +  " лет";
    }

    public static void main(String[] args) {
        // "Поступление" новой собаки в приют: задаём имя и возраст через конструктор
        // Торжественное объявление о прибытии
        Dog dog1 = new Dog("Шарик", 5);
        System.out.println(dog1.toString());

    }
}