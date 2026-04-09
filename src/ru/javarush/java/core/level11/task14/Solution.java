package ru.javarush.java.core.level11.task14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {

    // Метод для анализа системного лог-файла
    public static void analyzeSystemLog(String logFileName) throws IOException{
        // Попытка создать BufferedReader для чтения файла
        BufferedReader reader = new BufferedReader(new FileReader(logFileName));
        // Закрытие ресурса (try-with-resources не используется, так как метод только пробрасывает исключение)
        reader.close();
    }

    public static void main(String[] args) {
            // Вызов метода analyzeSystemLog с несуществующим файлом
            // Обработка исключения и вывод дружелюбного сообщения
        try {
            analyzeSystemLog("non_existent_log.txt");
        } catch (IOException e){
            System.out.println( "Произошла ошибка при попытке прочитать файл системных логов. Ошибка чтения файла.");
        }


    }
}