package Homework3.Data;

public class DataValidator {
    public static final int SPACENUMBER = 5;

    public static int dataIsValid(String inputData) {

        int spaceCounter = 0;

        for (int i = 0; i < inputData.length(); i++) {
            if (inputData.charAt(i) == ' ') {
                spaceCounter++;
            }
        }

        if (spaceCounter != SPACENUMBER) {
            return -1;
        }
        return -100;
    }
}
