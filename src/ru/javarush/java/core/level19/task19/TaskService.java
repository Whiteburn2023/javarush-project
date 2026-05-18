package ru.javarush.java.core.level19.task19;

public class TaskService {

    private final TaskRepository repository;

    // Внедрение зависимости через конструктор
    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void addTask(Task task) {
        repository.save(task);
    }

    public void completeTask(String title) {
        Task task = repository.findByTitle(title);
        if (task != null) {
            task.complete();
            System.out.println("Задача выполнена: " + title);
        } else {
            System.out.println("Задача не найдена: " + title);
        }
    }


}
