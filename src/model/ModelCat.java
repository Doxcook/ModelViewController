package model;

// класс над которым происходят действия с помощью Controller

import java.util.Observable;
import java.util.Observer;

public class ModelCat extends Observable {
    String name;
    int age;

    public ModelCat() {
        name = "None";
        age = 0;
    }

    public ModelCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.setChanged();
        this.notifyObservers();
    }
}
