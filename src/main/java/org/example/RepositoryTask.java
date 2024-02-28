package org.example;

import java.io.IOException;

public interface RepositoryTask {
    void addTask();
    void deleteTask();
    void info();
    void writeToFile() throws IOException;
}
