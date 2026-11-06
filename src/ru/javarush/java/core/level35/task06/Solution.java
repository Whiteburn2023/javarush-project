package ru.javarush.java.core.level35.task06;

import java.io.*;
import java.nio.file.Path;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        Path logFile = Path.of("system_log.txt");

        // Подготавливаем список выдуманных событий для записи в файл
        List<String> events = List.of(
                "Сервер запущен",
                "Пользователь вошел: admin",
                "Ошибка базы данных",
                "Резервное копирование завершено",
                "Служба остановлена"
        );

        // Записываем события в файл построчно.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile.toFile()))) {
            for (String event : events) {
                writer.write(event);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Читаем файл построчно и выводим каждую строку на экран.
        try (BufferedReader reader = new BufferedReader(new FileReader(logFile.toFile()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}