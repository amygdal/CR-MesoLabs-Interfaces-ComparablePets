package io.zipcoder.pets;

import java.util.List;

public class PetOwner {
    private String name;
    private int numberPets;
    List<Pet> pets;

    public PetOwner(String name, int numberPets, List<Pet> pets) {
        this.name = name;
        this.numberPets = numberPets;
        this.pets = pets;

    }

    public boolean addPet(Pet thePet) {
    return true;
    }

    public boolean removePet(Pet thePet) {

        return true;
    }

    public List<Pet> getAPets() {
        return null;
    }

}
