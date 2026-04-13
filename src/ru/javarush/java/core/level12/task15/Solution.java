package ru.javarush.java.core.level12.task15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        // Создаем объект URL для указания адреса изображения
        URL url = new URL("https://httpbin.org/image/webp");
        // Открываем InputStream из URL (открытие соединения и получение данных)
        // Создаем OutputStream для записи данных в файл image02.jpg
        // Метод transferTo напрямую передаст все байты из input в output

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(url.toURI()).build();

        HttpResponse<byte[]> response = client.send(request,HttpResponse.BodyHandlers.ofByteArray());

        if (response.statusCode() == 200){
            Files.write(Path.of("image03.webp"), response.body());
        }  else {
            System.out.println("Ошибка загрузки: код ответа " + response.statusCode());
        }


    }
}