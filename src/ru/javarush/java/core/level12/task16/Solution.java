package ru.javarush.java.core.level12.task16;

import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HttpClient из стандартной библиотеки Java
        // Готовим GET-запрос на указанный URL
        // Отправляем запрос и сразу получаем тело как массив байт
        // Извлекаем тип содержимого из заголовка Content-Type
        // Определяем размер файла по длине массива байт ответа
        // Сначала выводим информацию о типе и размере
        // Только после вывода сохраняем изображение на диск

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/image/png"))
                .GET()
                .build();
        HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());
        String contentType = response.headers()
                .firstValue("Content-Type")
                .orElse("application/octet-stream");
        long fileSize = response.body().length;
        System.out.println("Content-Type: " + contentType);
        System.out.println("File size: " + fileSize);


    }
}
