package ru.javarush.java.core.level21.task13;

public interface StringChecker {

    static boolean isEmpty(String string){
        if (string == null || string.length() == 0){
            return true;
        }
        return false;
    }
}
