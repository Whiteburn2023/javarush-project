package ru.javarush.java.core.level33.task09;

import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayStringSpliterator implements Spliterator<String> {

    String[] array;
    int current;
    int end;

    public ArrayStringSpliterator(String[] languages, int i, int length) throws IllegalArgumentException{
        this.array = languages;
        if (i > length){
            throw new RuntimeException();
        }
        this.current = i;
        this.end = length;
    }

    @Override
    public boolean tryAdvance(Consumer<? super String> action) {
        if (current >= end){
            return false;
        }
        action.accept(array[current]);
        current += 1;
        return true;
    }

    @Override
    public Spliterator<String> trySplit() {
        int mid = (current + end) / 2;
        if (mid <= current) {
            return null;
        }
        ArrayStringSpliterator arrayStringSpliterator = new ArrayStringSpliterator(array, current, mid);
        current = mid;
        return arrayStringSpliterator;
    }

    @Override
    public long estimateSize() {
        return end - current;
    }

    @Override
    public int characteristics() {
        return ORDERED | SIZED | SUBSIZED | NONNULL;
    }
}
