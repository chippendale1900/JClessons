package ru.gulnaz.lesson5;
import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new file (pathname: "src/lesson5/document.csv");
        File file2 = new file (pathname: "src/lesson5/document2.csv");
        AppData appData = new AppData();
        appData.read(file);

        System.out.println(Arrays.toString(appData.getHeaders()));
        System.out.println(Arrays.toString(appData.getData()[0]));

        appData.write(file2);
    }
}
