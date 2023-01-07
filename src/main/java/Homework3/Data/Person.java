package Homework3.Data;


import java.util.HashMap;


public class Person {

    String lastName;
    String firstName;
    String patronymic;
    String birthDate;
    int phoneNumber;
    String gender;

    public Person(HashMap<String, String> data) {
        this.lastName = data.get("lastName");
        this.firstName = data.get("firstName");
        this.patronymic = data.get("patronymic");
        this.phoneNumber = Integer.parseInt(data.get("phoneNumber"));
        this.gender = data.get("gender");
        this.birthDate = data.get("birthDate");
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%d><%s>", lastName, firstName, patronymic, birthDate, phoneNumber, gender);
    }
}
