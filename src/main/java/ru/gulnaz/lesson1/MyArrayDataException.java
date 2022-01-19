package ru.gulnaz.lesson1;

public class MyArrayDataException  extends RuntimeException {
    MyArrayDataException(String message) {
        super("Ошибка преобразования элемента массива в целое число.\n" + " " + message);
    }

}
