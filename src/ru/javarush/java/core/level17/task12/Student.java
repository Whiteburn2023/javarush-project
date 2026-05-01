package ru.javarush.java.core.level17.task12;

public class Student extends Person{
    int studentGrade;

    public Student(String studentName, int studentGrade) {
        super(studentName);
        System.out.println("Создан студент: " + studentName + ", класс: " + studentGrade);
    }
}
