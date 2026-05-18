package ru.javarush.java.core.level19.task19;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskRepository implements TaskRepository{

    private List<Task> tasks = new ArrayList<>();

    @Override
    public void save(Task task) {
        tasks.add(task);
        System.out.println("Сохранена задача: " + task.getTitle());
    }

    @Override
    public Task findByTitle(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                return task;
            }
        }
        return null;
    }
}
