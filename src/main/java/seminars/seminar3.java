package seminars;

import java.util.Arrays;

public class seminar3 {
    public static void main(String[] args) {
        String[][] array = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "4", "1", "2"},
                {"1", "2", "3", "4"}
        };

        System.out.println(Arrays.deepToString(array));
        try {
            System.out.println(ElementArraySum(array, 4));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int ElementArraySum(String[][] inputArray, int neededLength) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (inputArray.length == neededLength) {
            for (String[] el : inputArray) {
                if (el.length != inputArray.length) {
                    throw new MyArraySizeException();
                }
            }
        }

        int length = inputArray.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                try {
                    sum += Integer.parseInt(inputArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}

class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Неверный размер массива!");
    }
}

class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int col) {
        super("Невозможно преобразовать в число ячейку (" + row + ", " + col + ")!");
    }
}
