package ru.javarush.java.core.level37.task04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Заданная фраза с разноязычными символами и эмодзи
        String multilingualPhrase = "AБВΓéü😀";

        // Имена файлов под разные кодировки
        String utf8FileName = "test_utf8.txt";
        String utf16FileName = "test_utf16.txt";
        String latin1FileName = "test_latin1.txt";

        // 1) Записываем строку в UTF-8 и измеряем размер файла
        try (OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream(utf8FileName), StandardCharsets.UTF_8)){
            osw.write(multilingualPhrase);
        }
        long sizeUtf8 = Files.size(Path.of(utf8FileName));

        // 2) Записываем строку в UTF-16 (c BOM) и измеряем размер файла
        try (OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream(utf16FileName), StandardCharsets.UTF_16)){
            osw.write(multilingualPhrase);
        }
        long sizeUtf16 = Files.size(Path.of(utf16FileName));

        // 3) Пытаемся записать строку в ISO-8859-1
        // По умолчанию Java заменяет неподдерживаемые символы на '?',
        // поэтому явно настраиваем энкодер на REPORT, чтобы получить ошибку кодирования.
        CharsetEncoder encoder = StandardCharsets.ISO_8859_1.newEncoder()
                .onMalformedInput(CodingErrorAction.REPORT)
                .onUnmappableCharacter(CodingErrorAction.REPORT);

        try (OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream(latin1FileName), encoder)) {
            osw.write(multilingualPhrase);
            osw.flush();
            System.out.println("ISO-8859-1: " + Files.size(Path.of(latin1FileName)) + " байт");
        } catch (CharacterCodingException e) {
            System.out.println("ISO-8859-1: невозможно сохранить строку — ошибка кодировки");
        }

        // Вывод результатов измерений

        System.out.println("UTF-8: " + sizeUtf8 + " байт");
        System.out.println("UTF-16: " + sizeUtf16 + " байт");

    }
}