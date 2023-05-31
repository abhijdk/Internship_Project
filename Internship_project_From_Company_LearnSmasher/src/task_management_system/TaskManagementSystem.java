package task_management_system;

import java.util.ArrayList;
import java.util.List;

public class TaskManagementSystem {
    private List<Task> tasks;

    public TaskManagementSystem() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String taskName, String deadline) {
        Task task = new Task(taskName, deadline);
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public void updateTask(int index, String taskName, String deadline) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setTaskName(taskName);
            task.setDeadline(deadline);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Task List:");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println("Task Index: " + i);
                System.out.println("Task Name: " + task.getTaskName());
                System.out.println("Deadline: " + task.getDeadline());
                System.out.println();
            }
        }
    }
}