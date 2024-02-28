package org.example;
public class Task {
    private int idTask;
    private String content;

    public Task(int idTask, String content) {
        this.idTask = idTask;
        this.content = content;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
