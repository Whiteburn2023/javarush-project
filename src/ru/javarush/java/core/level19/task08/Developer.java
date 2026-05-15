package ru.javarush.java.core.level19.task08;

public class Developer extends Employee{

    double hourlyRate;
    int hoursWorked;

    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double getSalary() {
        return hourlyRate * hoursWorked;
    }
}
