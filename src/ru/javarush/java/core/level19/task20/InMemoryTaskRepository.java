package ru.javarush.java.core.level19.task20;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskRepository implements TaskRepository{

    List<Task> tasks = new ArrayList<>();

    @Override
    public void add(Task task) {
        tasks.add(task);
    }

    @Override
    public List<String> getAll() {
        List<String> list = new ArrayList<>();
        for (Task task : tasks) {
            list.add(task.getTitle());
        }
        return list;
    }

    @Override
    public List<Task> getTasks() {
        return tasks;
    }
}
