package Homework3;

import Homework3.Data.DataHandler;

import java.util.Scanner;


public class MyApp {

    public static void start() {
        while (true) {
            String s = init();
            if (s.equals("new")) {
                    DataHandler.newData();
            } else if (s.equals("exit")) {
                return;
            } else {
                System.out.println("Введите корректную команду\n");
            }
        }
    }

    static String init() {
        Scanner myAppSc = new Scanner(System.in);
        System.out.println("""
                Команды приложения:
                - новая запись: new
                - выход: exit""");
        return myAppSc.nextLine();
    }
}
