package ru.javarush.java.core.level14.task16;

public class Student {
    String studentName;
    String studentGroup;
    int studentScore;

    public Student(String studentName, String studentGroup, int studentScore) {
        this.studentName = studentName;
        this.studentGroup = studentGroup;
        this.studentScore = studentScore;
    }

    public Student(String studentName, String studentGroup) {
        this.studentName = studentName;
        this.studentGroup = studentGroup;
        this.studentScore = 0;
    }

    public Student(String studentName) {
        this.studentName = studentName;
        this.studentGroup = "Unknown";
        this.studentScore = 0;
    }

    public Student() {
        this.studentName = "Unknown";
        this.studentGroup = "Unknown";
        this.studentScore = 0;
    }
}
