package Homework1;

import java.sql.Array;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        System.out.println("1.1. Первый метод: ");
        ExceptionStringIndex();
        System.out.println("\n1.2. Второй метод: ");
        ExceptionNumberFormatException();
        System.out.println("\n1.3. Третий метод: ");
        ExceptionNegativeArraySizeException();

        System.out.println("\n2. Разность элементов массивов:");
        System.out.println(Arrays.toString(ArrayDifference(new int[]{1, 12, 2, 3}, new int[]{3, 7, 6})));

        System.out.println("\n3. Массив, каждый элемент которого равен частному элементов двух входящих массивов");
        System.out.println(Arrays.toString(QuotientElementArray(new int[]{10, 12, 3}, new int[]{2, 4, 12, 0})));
    }

    public static void ExceptionStringIndex() {
        String str = "alhabet";
        try {
            System.out.println(str.charAt(-1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }

    public static void ExceptionNumberFormatException() {
        String str = "12312asa1";
        try {
            System.out.println((Integer.parseInt(str)));
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e);
        }
    }

    public static void ExceptionNegativeArraySizeException() {
        try {
            int[] array = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println("Exception: " + e);
        }
    }

    public static int[] ArrayDifference(int[] a, int[] b) {
        try {
            if (a.length > b.length) {
                int test1 = a[a.length - 1];
                int test2 = b[a.length - 1];
            } else if (a.length < b.length) {
                int test1 = a[b.length - 1];
                int test2 = b[b.length - 1];
            } else {
                int[] c = new int[a.length];
                for (int i = 0; i < a.length; i++) {
                    c[i] = a[i] - b[i];
                }
                return c;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массивы разной длины!!!");
        }
        return null;
    }

    public static float[] QuotientElementArray(int[] a, int[] b) {
        try{
            if (a.length > b.length) {
                int test1 = a[a.length - 1];
                int test2 = b[a.length - 1];
            } else if (a.length < b.length) {
                int test1 = a[b.length - 1];
                int test2 = b[b.length - 1];
            } else {
                float[] c = new float[a.length];
                for (int i = 0; i < a.length; i++) {
                    c[i] = (float)a[i] / (float)b[i];
                }
                return c;
            }
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("RuntimeException");
        }
        return new float[1];
    }
}
