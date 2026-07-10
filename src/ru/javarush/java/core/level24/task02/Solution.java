package ru.javarush.java.core.level24.task02;

public class Solution {
    public static void main(String[] args) {
        // Общее исключение, которое можно обработать
        // Фатальная ошибка, указывающая на проблему уровня JVM
        // Проверяем на уровне классов: является ли класс переменной наследником Throwable
        // Выводим результат проверки для каждой переменной

        Exception generalSystemIssue = new Exception();
        Error catastrophicFailure = new Error();

        if (generalSystemIssue instanceof Throwable){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        if (catastrophicFailure instanceof Throwable){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}