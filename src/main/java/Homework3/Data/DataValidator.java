package Homework3.Data;

public class DataValidator {
    public static final int neededDataLength = 6;

    public static int dataIsValid(String inputData) {

        String[] data = inputData.split(" ");
        if (data.length != neededDataLength) {
            return -1;
        }
        return -100;
    }
}
