package ru.javarush.java.core.level21.task12;

public class C implements A, B{

    @Override
    public void show() {
        A.super.show();
        B.super.show();
    }
}
