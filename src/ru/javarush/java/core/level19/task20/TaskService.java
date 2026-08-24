package ru.javarush.java.core.level19.task20;

import java.util.List;

public class TaskService{

    TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    void completeAllTask(){
        List<Task> tasks = repository.getTasks();
        for (Task task : tasks) {
            task.complete();
        }
    }

    void printAllTasksInfo(){
        List<String> all = repository.getAll();
        for (String string : all) {
            System.out.println(string);
        }
    }
}
