package ru.javarush.java.core.level20.task16;

@FunctionalInterface
public interface StringTransformer {

    public abstract String transform(String s);

    default void printTransformed(String s) {
        System.out.println(transform(s));
    }
}
