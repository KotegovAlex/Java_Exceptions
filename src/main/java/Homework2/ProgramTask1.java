package Homework2;

import java.util.Scanner;

public class ProgramTask1 {
    public static void main(String[] args) {
        System.out.println(GiveMeFloat());
    }

    public static float GiveMeFloat() {
        Scanner in = new Scanner(System.in);
        float number;

        System.out.println("Введите число: ");
        while (true) {
            try {
                number = Float.valueOf(in.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите число типа float!");
            }
        }
        return number;
    }
}