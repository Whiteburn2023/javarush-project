package ru.javarush.java.core.level24.task15;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {


        try (BufferedReader reader = new BufferedReader(new FileReader("try"))){
            String str = "";
            if ((str = reader.readLine()) != null){
                System.out.println(str);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Секретный документ не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка доступа к архиву!");
        }

        // Пытаемся открыть файл — здесь может возникнуть FileNotFoundException


            // Лёгкая проверка доступа: читаем первый байт (может вернуть -1, если файл пуст)

            // Намеренно провоцируем более общую ошибку ввода-вывода



            // Важно: этот catch идёт ПЕРЕД IOException, иначе код не скомпилируется

            // Обработка всех прочих ошибок ввода-вывода


    }
}