package ru.javarush.java.core.level16.task16;

import java.util.Scanner;

public class TextAnalyzer {

    // Метод-обработчик имени: внутри объявляем локальный класс и используем его
    public void generateNameReport(String customerName) {
        // Локальный класс доступен только внутри этого метода
        class NameStatistics {
            private String originalCustomerName;

            public NameStatistics(String customerName) {
                originalCustomerName = customerName;
            }

            void printUpperCaseName(){
                System.out.println(originalCustomerName.toUpperCase());
            }
            void printNameLength(){
                System.out.println(originalCustomerName.length());
            }
        }
        NameStatistics nameStatistics = new NameStatistics(customerName);
        nameStatistics.printUpperCaseName();
        nameStatistics.printNameLength();


        // Создаем объект локального класса и последовательно вызываем методы отчета

    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();          // читаем имя с консоли
        new TextAnalyzer().generateNameReport(name);
    }
}