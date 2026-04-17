package ru.javarush.java.core.level14.task20;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект класса Student
        Student newStudent = new Student();
    }
}
class Student{
    int studentGrade = 1;

    {
        System.out.println("Блок 1: grade = " + studentGrade);
        studentGrade = 5;
    }

    {
        System.out.println("Блок 2: grade = " + studentGrade);
    }

}