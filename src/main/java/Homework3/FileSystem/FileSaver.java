package Homework3.FileSystem;

import Homework3.Data.Person;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
    public static void save(Person person) {
        File file = new File(String.format("D:\\Education_GB\\Java\\Java_Exceptions\\src\\main\\java\\Homework3\\DB\\%s.txt", person.getLastName()));
        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file, true);
            writer.write(person + "\n");
            writer.flush();
            writer.close();
            System.out.println("Запись успешно добавлена!\n");
        } catch (IOException e) {
            System.out.println("Stack trace:");
            for (StackTraceElement trace : e.getStackTrace()) {
                System.out.println(trace);
            }
            System.out.println();
        }
    }
}
