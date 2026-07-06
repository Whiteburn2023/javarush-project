package ru.javarush.java.core.level21.task20;

public class Solution {
    public static void main(String[] args) {
        // Используем try-with-resources: ресурс будет закрыт автоматически
        try (DemoResource demoResource = new DemoResource()){
            System.out.println("Работа с ресурсом");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}