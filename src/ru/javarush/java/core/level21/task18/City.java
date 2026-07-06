package ru.javarush.java.core.level21.task18;

public class City implements Comparable<City>{

    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public int compareTo(City other) {
        return Integer.compare(this.population, other.population);
    }

    @Override
    public String toString() {
        return name + "\t" + population;
    }
}
