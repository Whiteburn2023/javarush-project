package ru.javarush.java.core.level19.task20;

public class Application {
    public static void main(String[] args) {

        WorkTask workTask = new WorkTask("work", "today");
        HomeTask homeTask = new HomeTask("home", "garage");

        TaskRepository repository = new InMemoryTaskRepository();

        TaskService taskService = new TaskService(repository);

        repository.add(workTask);
        repository.add(homeTask);

        taskService.printAllTasksInfo();
        taskService.completeAllTask();
    }
}
