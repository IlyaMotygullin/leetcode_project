package org.example;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class ServiceTask implements RepositoryTask {
    private Map<Integer, String> map = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);


    @Override
    public void addTask() {
        System.out.println("Введите задачу: ");
        map.put(scanner.nextInt(), scanner.nextLine());
    }

    @Override
    public void deleteTask() {
        System.out.println("Введите номер задачи, которую вы хотите удалить: ");
        int id = scanner.nextInt();
        if (map.containsKey(id)) {
            map.remove(id);
            System.out.println("Задача удалена");
        } else {
            System.out.println("Такой задачи нет");
        }
    }

    @Override
    public void info() {
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println("Задача: " + integerStringEntry.getKey() + "\n" +
                    "Содержание: " + integerStringEntry.getValue());
        }
    }

    @Override
    public void writeToFile() throws IOException {
        File file = new File("C:\\Users\\admin\\Desktop\\Java\\Задачи.txt");
        BufferedWriter bufferedWriter =
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
        bufferedWriter.write(String.valueOf("Дата: " +LocalDate.now() + "\n"));
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            String[] strings = integerStringEntry.getValue().split("\\.");
            for (int i = 0; i < strings.length; i++) {
                bufferedWriter.write(strings[i] + "\n");
            }
        }
        bufferedWriter.write("\n");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
