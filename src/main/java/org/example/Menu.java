package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private ServiceTask serviceTask = new ServiceTask();
    private Scanner scanner = new Scanner(System.in);
    public void menu() throws IOException {
        loop: while (true) {
            System.out.println("1. Добавить задачу");
            System.out.println("2. Посмотреть список задач");
            System.out.println("3. Удалить задачу");
            System.out.println("4. Записать задачу в файл");
            System.out.println("5. Выйти");

            String change = scanner.nextLine();
            switch (change) {
                case "1" -> {
                    serviceTask.addTask();
                }
                case "2" -> {
                    serviceTask.info();
                }
                case "3" -> {
                    serviceTask.deleteTask();
                }
                case "4" -> {
                    serviceTask.writeToFile();
                }
                case "5" -> {
                    break loop;
                }
            }
        }
    }
}
