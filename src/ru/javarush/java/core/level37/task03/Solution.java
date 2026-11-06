package ru.javarush.java.core.level37.task03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Сообщение на кириллице и имя файла из условия
        String secretCyrillicMessage = "Привет, мир!";
        String failFileName = "latin1fail.txt";

        // Готовим энкодер ISO-8859-1 и настраиваем, чтобы при несопоставимых символах бросалось исключение
        CharsetEncoder encoder = StandardCharsets.ISO_8859_1.newEncoder()
                .onMalformedInput(CodingErrorAction.REPORT)
                .onUnmappableCharacter(CodingErrorAction.REPORT);

        try (OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream(failFileName), encoder)){

            osw.write(secretCyrillicMessage);
            osw.flush();
            // 1) Сначала пробуем закодировать строку целиком.
            // Если символы нельзя представить в ISO-8859-1, будет выброшено CharacterCodingException.



            // 2) Если кодирование удалось, записываем байты в файл.
            // Такой порядок гарантирует, что при ошибке кодирования мы вообще ничего не запишем на диск.


        } catch (CharacterCodingException e) {
            // Если кириллица не может быть сохранена в ISO-8859-1 — выводим требуемое сообщение
            System.out.println("Ошибка записи: невозможно сохранить кириллицу в ISO-8859-1");
        }
    }
}