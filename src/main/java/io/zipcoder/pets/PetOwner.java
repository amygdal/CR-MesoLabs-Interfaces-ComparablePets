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

    public void addPet(Pet thePet) {
        pets.add(thePet);

    }

    public void removePet(Pet thePet) {

        pets.remove(thePet);
    }


}
