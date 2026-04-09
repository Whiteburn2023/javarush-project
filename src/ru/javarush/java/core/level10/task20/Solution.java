package ru.javarush.java.core.level10.task20;

public class Solution {
    public static void main(String[] args) {
        // Объявляем балл студента
        int studentScore = 9;
        // Новое switch-выражение: возвращает значение, а не просто выполняет блок кода.
        // Выводим итоговую оценку на экран

        String finalGrade = switch (studentScore){
            case 5,6,7 -> "Хорошо";
            case 8,9,10 -> "Отлично";
            default -> "Нужно постараться";
        };
        System.out.println(finalGrade);

    }
}