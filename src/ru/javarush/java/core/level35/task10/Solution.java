package ru.javarush.java.core.level35.task10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Путь к директории "game_assets" в текущем рабочем каталоге
        Path assetsDir = Paths.get("game_assets");

        // Создаём директорию, если её ещё нет
        Files.createDirectories(assetsDir);

        // Пути к файлам-заглушкам внутри директории
        Path characterModel = assetsDir.resolve("character_model.obj");
        Path environmentTexture = assetsDir.resolve("environment_texture.png");

        // Создаём пустые файлы, если они ещё не существуют
        if (Files.notExists(characterModel)) {
            Files.createFile(characterModel);
        }
        if (Files.notExists(environmentTexture)) {
            Files.createFile(environmentTexture);
        }

        // Перечисляем содержимое директории: имена файлов/папок построчно
        // Используем DirectoryStream, чтобы пройтись по элементам папки без лишних зависимостей
        if (Files.exists(assetsDir) && Files.isDirectory(assetsDir)) {
            try (Stream<Path> stream = Files.list(assetsDir)) {
                stream.forEach(path -> System.out.println(path.getFileName()));
            }
        }
    }
}