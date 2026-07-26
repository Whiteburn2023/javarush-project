package ru.javarush.java.core.level25.task08;

public class Solution {
    public static void main(String[] args) {
        // Простейшая реализация Renderable через анонимный класс
        Renderable renderable = new Renderable(){
            @Override
            public void paint() {
                System.out.println("!");
            }

            @Override
            public void adjustScale() {
                Renderable.super.adjustScale();
            }
        };

        renderable.paint();
        renderable.adjustScale();

        Renderable.validateColorPalette();

        // Вызываем обязательный метод отрисовки
        // Демонстрация default-метода интерфейса
        // Вызов статического метода напрямую через интерфейс

    }
}