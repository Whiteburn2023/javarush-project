package ru.javarush.java.core.level25.task08;

public interface Renderable {

    public abstract void paint();

    default void adjustScale(){
        System.out.println("Размер объекта скорректирован по умолчанию.");
    }

    static void validateColorPalette(){
        System.out.println("Цветовая палитра проверена, всё в порядке!");
    }
}
