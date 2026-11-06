package ru.javarush.java.core.level34.task07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // 1) Изменяемый инвентарь питомцев
        List<String> petInventory = new ArrayList<>();
        petInventory.add("кошка");
        petInventory.add("собака");

        // 2) "Живое" представление: отражает изменения исходного списка,
        //    но напрямую изменить его нельзя (попытка = UnsupportedOperationException)
        List<String> livePetView = Collections.unmodifiableList(petInventory);

        // 3) "Снимок" текущего состояния: независимая неизменяемая копия на момент создания
        List<String> snapshotPetList = List.copyOf(petInventory);

        // 4) В исходный инвентарь добавляется новый житель
        petInventory.add("мышь");

        // 5) Выводим содержимое представлений
        //    livePetView покажет изменения, snapshotPetList останется прежним
        System.out.println(livePetView);
        System.out.println(snapshotPetList);

        // 6) Демонстрация запрета изменений через представления:
        //    обе попытки приведут к UnsupportedOperationException
        try {
            livePetView.add("крысь");
            snapshotPetList.add("крысь");
        }catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }


    }
}