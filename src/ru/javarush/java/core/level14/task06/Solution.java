package ru.javarush.java.core.level14.task06;

public class Solution {
    public static void main(String[] args) {
        // "Зачисляем" нового студента, сразу задавая имя и оценку в конструкторе
        // Торжественно объявляем о его появлении

        Student student1 = new Student("Ann", 5);
        System.out.println("Имя: " + student1.studentName + ", оценка: " + student1.studentGrade);

    }
}

// Отдельный класс Student с полями и конструктором
class Student{
    String studentName;
    int studentGrade;

    public Student(String studentName, int studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }
}