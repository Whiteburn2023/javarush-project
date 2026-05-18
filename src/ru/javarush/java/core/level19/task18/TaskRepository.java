package ru.javarush.java.core.level19.task18;

public interface TaskRepository {
    void save(Task task);
    Task findByTitle(String title);
}
