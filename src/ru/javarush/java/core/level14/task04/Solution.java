package ru.javarush.java.core.level14.task04;

public class Solution {
    public static void main(String[] args) {
        // Создаем два объекта Student и сразу инициализируем их поля через конструктор
        // Выводим информацию о каждом студенте в заданном формате

        Student abiturient1 = new Student("Анна", 2022);
        Student abiturient2 = new Student("Иван", 2023);

        System.out.println("Имя: "+ abiturient1.studentName + ", год поступления: " + abiturient1.enrollmentYear);
        System.out.println("Имя: "+ abiturient2.studentName + ", год поступления: " + abiturient2.enrollmentYear);

    }
}

// Класс-форма для студента: хранит имя и год поступления
class Student{
    String studentName;
    int enrollmentYear;

    public Student(String studentName, int enrollmentYear){
        this.studentName = studentName;
        this.enrollmentYear = enrollmentYear;
    }
}