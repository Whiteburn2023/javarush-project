package ru.javarush.java.core.level19.task19;

public class UserInterface {

    private final TaskService taskService;

    // Внедрение зависимости через конструктор
    public UserInterface(TaskService taskService) {
        this.taskService = taskService;
    }

    public void addAndCompleteTask(String title) {
        // 1. Создаем задачу
        Task task = new Task(title);

        // 2. Добавляем задачу через сервис
        taskService.addTask(task);

        // 3. Отмечаем задачу как выполненную через сервис
        taskService.completeTask(title);
    }
}
