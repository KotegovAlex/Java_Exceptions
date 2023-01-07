package Homework3.Data;

import java.util.Scanner;

public class DataReciever {

    public static String newData() {
        System.out.println("Введите данные в формате: " +
                "Фамилия имя Отчество датарождения номертелефона пол");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine().trim();
    }
}
