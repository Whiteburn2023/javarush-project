package ru.javarush.java.core.level36.task09;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws IOException {
        // try-with-resources автоматически закроет BufferedWriter после завершения блока

        String line = "Hello, Java!";
        Path path = Path.of("магический_камень.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()))){
            writer.write(line);
        }
    }
}