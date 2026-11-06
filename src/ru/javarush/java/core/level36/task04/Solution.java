package ru.javarush.java.core.level36.task04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Имена входных файлов с зашифрованными сообщениями
        String file1 = "досье_А.txt";
        String file2 = "досье_Б.txt";

        // Множество для хранения уникальных строк из первого файла (для быстрого поиска)
        Set<String> secrets1 = new LinkedHashSet<>();
        // Множество для хранения найденных общих секретов (сохранит порядок первого вхождения)
        Set<String> commonSecrets = new LinkedHashSet<>();

        // Читаем первое досье построчно и сохраняем каждую строку в secrets1
        try (BufferedReader reader = new BufferedReader(new FileReader(file1, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null){
                secrets1.add(line);
            }
        }

        // Читаем второе досье построчно и проверяем, встречалась ли строка в первом досье
        try (BufferedReader reader = new BufferedReader(new FileReader(file2, StandardCharsets.UTF_8))){
            String line;
            while ((line = reader.readLine()) != null){
                if (secrets1.contains(line)){
                    commonSecrets.add(line);
                }
            }
        }

        // Выводим только те строки, которые присутствуют в обоих досье
        for (String secret : commonSecrets) {
            System.out.println(secret);
        }
    }
}