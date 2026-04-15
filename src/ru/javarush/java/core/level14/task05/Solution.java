package ru.javarush.java.core.level14.task05;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Car с произвольными значениями марки и года выпуска
        // Просим автомобиль "представиться"
        Car car = new Car("LADA", 2025);
        car.displayDetails();


    }




// Класс Car хранит марку и год выпуска и умеет выводить информацию о себе
public static class Car{
    String carBrand;
    int productionYear;

    public Car(String carBrand, int productionYear) {
        this.carBrand = carBrand;
        this.productionYear = productionYear;
    }

    public void displayDetails(){
        System.out.println("Марка: " + carBrand +  ", год выпуска: " + productionYear);
    }

    public String getCarBrand() {
        return carBrand;
    }

    public int getProductionYear() {
        return productionYear;
    }
}}