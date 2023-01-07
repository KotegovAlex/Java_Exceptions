package Homework3.Data;

import Homework3.MyExceptions.InputDataSizeException;

import java.text.ParseException;
import java.util.HashMap;

public class DataHandler {

    public static String[] attributes = new String[]{"lastName",
            "firstName",
            "patronymic",
            "birthDate",
            "phoneNumber",
            "gender"};

    public static void newData() {

        String inputData = DataReciever.newData();

        try {

            if (DataValidator.dataIsValid(inputData) == -1) {
                throw new InputDataSizeException();
            }

            HashMap<String, String> personData = new HashMap<>();
            for (int i = 0; i < attributes.length; i++) {
                personData.putIfAbsent(attributes[i], inputData.split(" ")[i]);
            }

            DateValidator.dateIsValid(personData.get("birthDate"));

            Person p = new Person(personData);



            System.out.println("Запись создана успешно!");
        } catch (InputDataSizeException e) {
            System.out.println(e.getMessage());

        } catch (ParseException e) {
            System.out.println("Введите дату корректно в формате dd.mm.yyyy");
        }
    }
}
