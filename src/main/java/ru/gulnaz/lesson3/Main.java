package ru.gulnaz.lesson3;

public class Main {
    public static void main(String[] args) {
        Box<Apple> boxApple1 = new Box<>();
        Box<Apple> boxApple2 = new Box<>();
        Box<Orange> boxOrange1 = new Box<>();
        Box<Orange> boxOrange2 = new Box<>();

        boxApple1.add(new Apple());
        boxApple1.add(new Apple());
        boxApple1.add(new Apple());
        boxApple1.add(new Apple());


        boxApple2.add(new Apple());
        boxApple2.add(new Apple());
        boxApple2.add(new Apple());

        boxOrange1.add(new Orange());
        boxOrange1.add(new Orange());
        boxOrange1.add(new Orange());

        boxOrange2.add(new Orange());
        boxOrange2.add(new Orange());


        System.out.println(boxApple1.getWeightOfContainer());
        System.out.println(boxApple2.getWeightOfContainer());
        System.out.println(boxOrange1.getWeightOfContainer());
        System.out.println(boxOrange2.getWeightOfContainer());


        System.out.println(boxOrange1.compare(boxApple1));
        System.out.println(boxOrange1.compare(boxApple2));
        System.out.println(boxOrange2.compare(boxApple2));

        boxApple1.giveAllFruitsToAnotherBox(boxApple2);
        System.out.println(boxApple1.getWeightOfContainer());
        System.out.println(boxApple2.getWeightOfContainer());









    }
}
