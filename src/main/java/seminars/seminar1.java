package seminars;

import java.util.ArrayList;

public class seminar1 {
    public static void main(String[] args) {
        Application.run();
    }
}

class ErrorCodeOrResult {
    boolean flag;
    int code;
    String text;

    public ErrorCodeOrResult(boolean flag, int code, String text) {
        this.flag = flag;
        this.code = code;
        this.text = text;
    }
}

class Errors {
    static int NoErrors = -100;
    static int OutOfArrayLength = -1;
    static int ElementNotFound = -2;
    static int ArrayIsNull = -3;
    static int ArrayHasNullElement = -4;

}

class MyArray {
    ArrayList<Integer> nullIndexList = new ArrayList<>();

    public ErrorCodeOrResult checkArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nullIndexList.add(i);
            }
        }

        if (!nullIndexList.isEmpty()) {
            return new ErrorCodeOrResult(true,
                    Errors.ArrayHasNullElement,
                    "Содержит null на позициях: " + nullIndexList);
        } else {
            return new ErrorCodeOrResult(false, Errors.NoErrors, "");
        }

    }

    public static ErrorCodeOrResult indexOfElement(int[] arr, int element) {
        int minLength = 5;
        if (arr == null) {
            return new ErrorCodeOrResult(true, Errors.ArrayIsNull, "Массив равен null");
        } else if (arr.length < minLength) {
            return new ErrorCodeOrResult(true, Errors.OutOfArrayLength, "Ошибка длины массива");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == element) {
                    return new ErrorCodeOrResult(false, i, "");
                }
            }
            return new ErrorCodeOrResult(true, Errors.ElementNotFound, "Элемент не найден");
        }
    }
}

class MyArrayApi {
    MyArray myArray;
    Integer[] initArray;

    public void build() {
        initArray = new Integer[]{1, 321, 32, 3, null, null};
        this.myArray = new MyArray();
    }
}

class Application {
    static void run() {
        MyArrayApi mapi = new MyArrayApi();
        mapi.build();
        ErrorCodeOrResult res1 = mapi.myArray.checkArray(mapi.initArray);
        if (!res1.flag) {
            System.out.println(res1.code);
        } else {
            System.out.println("ERROR: " + res1.code + " " + res1.text);
        }
    }
}