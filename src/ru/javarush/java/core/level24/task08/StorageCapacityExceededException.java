package ru.javarush.java.core.level24.task08;

public class StorageCapacityExceededException extends Exception{

    private int currentItemCount;
    private int maximumCapacity;

    public StorageCapacityExceededException(String message, int currentItemCount, int maximumCapacity) {
        super(message);
        this.currentItemCount = currentItemCount;
        this.maximumCapacity = maximumCapacity;
    }

    public int getCurrentItemCount() {
        return currentItemCount;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }
}
