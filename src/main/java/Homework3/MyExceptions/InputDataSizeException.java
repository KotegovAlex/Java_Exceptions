package Homework3.MyExceptions;


public class InputDataSizeException extends Exception {
    public InputDataSizeException() {
        super("Количество полей неверно! " +
                "Введите данные в формате: " +
                "Фамилия имя Отчество датарождения номертелефона пол");
    }
}
