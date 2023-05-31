package task_management_system;

public class Task {
    private String taskName;
    private String deadline;

    public Task(String taskName, String deadline) {
        this.taskName = taskName;
        this.deadline = deadline;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}