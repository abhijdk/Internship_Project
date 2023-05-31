package employee_management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private List<Employee> employees;
    private int nextId;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
        nextId = 1;
    }

    public void addEmployee(Employee employee) {
        employee.setId(nextId++);
        employees.add(employee);
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\n\nEmployee List:");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Designation: " + employee.getDesignation());
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-");
        }
    }

    public void modifyEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter modified name: ");
                String name = scanner.nextLine();
                System.out.print("Enter modified age: ");
                int age = scanner.nextInt();
                System.out.print("Enter modified designation: ");
                scanner.nextLine();  // Clear the newline character
                String designation = scanner.nextLine();

                employee.setName(name);
                employee.setAge(age);
                employee.setDesignation(designation);

                System.out.println("Employee details modified successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void deleteEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void showEmployeeDetails(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("Employee Details:");
                System.out.println("ID: " + employee.getId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Age: " + employee.getAge());
                System.out.println("Designation: " + employee.getDesignation());
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem managementSystem = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("EmployeeManagementSystem");

        while (true) {
            System.out.println("\n\n1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Modify Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Show Employee Details by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Enter employee age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  // Clear the newline character
                    System.out.print("Enter employee designation: ");
                    String designation = scanner.nextLine();

                    Employee employee = new Employee(0, name, age, designation);
                    managementSystem.addEmployee(employee);
                    System.out.println("Employee added successfully!");
                    break;
                case 2:
                    managementSystem.displayEmployees();
                    break;
                case 3:
                    System.out.print("Enter employee ID to modify: ");
                    int modifyId = scanner.nextInt();
                    managementSystem.modifyEmployee(modifyId);
                    break;
                case 4:
                    System.out.print("Enter employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    managementSystem.deleteEmployee(deleteId);
                    break;
                case 5:
                    System.out.print("Enter employee ID to show details: ");
                    int detailsId = scanner.nextInt();
                    managementSystem.showEmployeeDetails(detailsId);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

