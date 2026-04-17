package ru.javarush.java.core.level14.task11;

// Класс-шаблон для автомобиля: хранит марку и год выпуска
class Car{
    String carBrand;
    int carYear;

    public Car(String carBrand, int carYear) {
        this.carBrand = carBrand;
        this.carYear = carYear;
    }

    @Override
    public String toString() {
        return "Марка: " + carBrand + ", год выпуска: " + carYear;
    }
}

public class Solution {
    public static void main(String[] args) {
        // Создаем два независимых объекта класса Car с помощью new
        // Инициализируем поля первого автомобиля
        // Инициализируем поля второго автомобиля
        // Выводим информацию о каждом автомобиле в требуемом формате
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Lada", 2010);

        System.out.println(car1);
        System.out.println(car2);

    }
}