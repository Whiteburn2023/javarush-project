package ru.javarush.java.core.level25.task09;

public class SystemCore {

    static {
        System.out.println("Система: глобальная инициализация завершена.");
    }

    {
        System.out.println("Компонент: индивидуальная настройка завершена.");
    }
}
