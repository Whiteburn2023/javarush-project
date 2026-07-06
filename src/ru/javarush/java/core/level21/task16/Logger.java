package ru.javarush.java.core.level21.task16;

public interface Logger {

    static void info(String message){
        System.out.println(format("INFO", message));
    }

    static void error(String message){
        System.out.println(format("ERROR",message));
    }

    private static String format(String level, String message){
//        return "\"[" + level + "] " + message + "\"";
        return "[" + level + "] " + message;
    }
}
