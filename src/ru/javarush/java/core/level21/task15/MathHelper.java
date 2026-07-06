package ru.javarush.java.core.level21.task15;

public interface MathHelper {

    default void printSquare(int n){
        System.out.println(n * n);
    }

    static void printCube( int n){
        System.out.println(n * n * n);
    }
}
