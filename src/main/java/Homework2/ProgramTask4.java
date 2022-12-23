package Homework2;

import java.util.Scanner;

public class ProgramTask4 {
    public static void main(String[] args) {
        Input();
    }

    public static void Input() {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Введите строку: ");
        while (true) {
            try {
                str = in.nextLine();
                if (str.length() == 0) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Пустую строку вводить нельзя!");
            }
        }
    }
}
