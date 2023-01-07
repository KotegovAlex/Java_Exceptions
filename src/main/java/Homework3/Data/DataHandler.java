package Homework3.Data;

import Homework3.MyExceptions.InputDataSizeException;

public class DataHandler {

    public static String newData() throws InputDataSizeException{

        String inputData = DataReciever.newData();

        if (DataValidator.dataIsValid(inputData) == -1) {
            throw new InputDataSizeException();
        }
        System.out.println("Данные приняты!");

        return inputData;
    }


}
