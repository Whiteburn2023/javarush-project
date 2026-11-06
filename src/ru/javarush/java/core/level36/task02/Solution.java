package ru.javarush.java.core.level36.task02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Имя файла из условия. При необходимости можно заменить на "output.txt".
        Path file = Path.of("анналы_истины.txt");

        // Записываем ровно одну строку без перевода строки в конце
        String line = "Java is awesome!";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file.toFile(), StandardCharsets.UTF_8))){
            writer.write(line);
        }
    }
}