package io.zipcoder.pets;

import java.util.ArrayList;

public abstract class Pet {
    protected String name;
    protected int age;
    protected ArrayList<Pet> pets;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return null;
    }

    public int getAge() {
        return 0;
    }

    public void setName(String name) {
        //this.name = name;
    }

    public void setAge(int age) {
        //this.name = name;
    }
    public void addPet(Pet thePet) {

    }

    public void removePet(Pet thePet) {

    }

    public String speak() {
        return null;
    }
}
