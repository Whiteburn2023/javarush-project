package ru.javarush.java.core.level21.task20;

public class DemoResource implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Ресурс закрыт");
    }
}
