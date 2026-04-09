package ru.javarush.java.core.level10.task14;

// Перечисление с четырьмя временами года
enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN
}

public class Solution {
    public static void main(String[] args) {
        // Создаем переменную типа Season и присваиваем ей значение SUMMER
        // Для каждого сезона выводим свое жизнерадостное сообщение

        Season season = Season.SUMMER;

        switch (season){
            case SUMMER -> System.out.println("Лето — время отпусков!");
            case WINTER -> System.out.println("Пора кататься на лыжах!");
            case AUTUMN -> System.out.println("Осень - грязь и Марафон");
            case SPRING -> System.out.println("Весна - Хакатон и грязь");
        }


    }
}