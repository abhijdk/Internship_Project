package task_management_system;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TaskManagementSystem taskManagementSystem = new TaskManagementSystem();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Clear the newline character from the buffer
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter deadline: ");
                    String deadline = scanner.nextLine();
                    taskManagementSystem.addTask(taskName, deadline);
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Clear the newline character from the buffer
                    System.out.print("Enter task name: ");
                    String updatedTaskName = scanner.nextLine();
                    System.out.print("Enter deadline: ");
                    String updatedDeadline = scanner.nextLine();
                    taskManagementSystem.updateTask(updateIndex, updatedTaskName, updatedDeadline);
                    break;
                case 3:
                    System.out.print("Enter task index to delete: ");
                    int deleteIndex = scanner.nextInt();
                    taskManagementSystem.deleteTask(deleteIndex);
                    break;
                case 4:
                    taskManagementSystem.viewTasks();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
