package ru.javarush.java.core.level10.task18;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную droneCommand и присваиваем ей значение "pause"
        String droneCommand = "pause";
        // Используем современное switch-выражение для определения статуса дрона
        // Выводим сообщение о статусе дрона на экран

        String droneStatusMessage = switch (droneCommand){
            case "start" -> "Запуск!";
            case "stop" -> "Остановка!";
            case "pause" -> "Пауза...";
            default -> "Неизвестная команда";
        };
        System.out.println(droneStatusMessage);

    }
}