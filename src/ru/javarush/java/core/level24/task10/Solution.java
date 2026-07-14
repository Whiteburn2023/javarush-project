package ru.javarush.java.core.level24.task10;

import java.io.IOException;

public class Solution {

    // Этап 1: имитация сбоя при подготовке исходных данных
    public static void prepareSourceData() throws IOException {
        // Специально "падаем" с IOException с нужным сообщением
        throw new IOException("Исходный файл не найден");

    }

    // Этап 2: загрузка/обработка сырых данных
    public static void processRawData() throws DataLoadingError, IOException {
        try {
            prepareSourceData();
        } catch (IOException ioException) {
            throw new DataLoadingError("Ошибка загрузки данных", ioException);
        }
    }

    // Этап 3: генерация итогового отчёта
    public static void generateFinalReport() throws DataLoadingError, IOException {

            processRawData();


    }

    public static void main(String[] args) {
//        try {
//            generateFinalReport();
//        } catch (DataLoadingError e) {
//            // Выводим сообщение нашего исключения
//            System.out.println(e.getMessage());
//
//            // И сообщение первопричины (IOException)
//            Throwable cause = e.getCause();
//            if (cause != null) {
//                System.out.println(cause.getMessage());
//            }
//        }
    }
}

// Пользовательское исключение для обобщённой ошибки загрузки данных
class DataLoadingError extends Exception {
    public DataLoadingError(String message) {
        super(message);
    }

    public DataLoadingError(String message, Throwable cause) {
        super(message, cause);
    }
}