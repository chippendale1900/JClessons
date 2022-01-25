package ru.gulnaz.lesson3;
import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> boxes;

    public Box() {
        boxes = new ArrayList<>();
    }

    public  void giveAllFruitsToAnotherBox(Box<T> box) {
        box.boxes.addAll(boxes);
        boxes.clear();

    }

    public double getWeightOfContainer() {
        if (boxes.isEmpty())
            return 0;
        else
            return boxes.get(0).getWeight() * boxes.size();
    }

    public boolean compare(Box<?> container) {
        if (this.getWeightOfContainer() > container.getWeightOfContainer()) {
            return true;
        } else {
            return false;
        }
    }

    public void add(T t) {
        boxes.add(t);
    }

}
