package ru.javarush.java.core.level26.task03;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Используем интерфейс List для хранения названий предметов
        List<String> pars = new ArrayList<>();
        pars.add("Математика");
        pars.add("Физика");
        pars.add("Информатика");

        pars.add(0,"Английский");
        pars.remove("Физика");
        for (String par : pars){
            System.out.println(par);
        }

        // Добавляем три основных предмета
        // Вставляем "Английский" на первую позицию списка
        // Удаляем предмет "Физика" из расписания
        // Выводим итоговое расписание: каждый предмет с новой строки

    }
}