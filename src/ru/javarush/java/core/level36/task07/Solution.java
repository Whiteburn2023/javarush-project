package ru.javarush.java.core.level36.task07;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = "секретное_послание.bin";

        // Данные, которые будем "кодировать" (записывать в бинарный файл)
        int code = 100;
        double decimalId = 3.14;
        boolean confirmation = true;

        // Запись в бинарный файл с помощью DataOutputStream
        // ВАЖНО: сохраняем точный порядок записи: int -> double -> boolean
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))){
            dos.writeInt(code);
            dos.writeDouble(decimalId);
            dos.writeBoolean(confirmation);
        }


        // Чтение из бинарного файла с помощью DataInputStream
        // ВАЖНО: читаем в том же порядке, что записывали, иначе данные будут интерпретированы неверно
        int readCode;
        double readDecimalId;
        boolean readConfirmation;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))){
            readCode = dis.readInt();
            readDecimalId = dis.readDouble();
            readConfirmation = dis.readBoolean();
        }


        // Выводим прочитанные значения для подтверждения успешной "декодировки"
        System.out.println("Сообщение успешно прочитано:");
        System.out.println("Кодовое число: " + readCode);
        System.out.println("Десятичный идентификатор: " + readDecimalId);
        System.out.println("Булево подтверждение: " + readConfirmation);
    }
}