package ru.javarush.java.core.level21.task17;

public class NumberBox implements Comparable<NumberBox>{

    private int number;

    public NumberBox(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(NumberBox other) {
        if (this.number > other.number){
            return 1;
        } else if (this.number < other.number) {
            return -1;
        } else {
            return 0;
        }
    }
}
