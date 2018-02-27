package io.zipcoder;


import io.zipcoder.pets.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Application {

    private ArrayList<Pet> pets = new ArrayList<Pet>();

    public static void main(String[] args) {
        Application application = new Application();
        Integer numberOfPets = Console.getInt("How many pets do yu own?");
        for(int i=0;i<numberOfPets;i++) {
            Pet pet = application.getPetFromUser();
            application.addPet(pet);
        }
        application.printPets();
    }


    public void printPets() {
        for(Pet pet : pets) {
            System.out.println(pet.toString());
        }
    }

    public Pet getPetFromUser() {
        String petType = Console.getString("What kind of pet do you own?");
        String petName = Console.getString("What is your pet name?");
        Integer petAge = Console.getInt("What is your pet age?");
        return createPet(petType, petName, petAge);
    }

    public Pet createPet(String userInput, String expectedName, Integer expectedAge) {
        PetTypes type = PetTypes.valueOf(userInput);
        Pet pet = null;

        switch (type) {
            case Cat:
                pet = new Cat(expectedName, expectedAge);
                break;

            case Dog:
                pet = new Dog(expectedName, expectedAge);
                break;

            case Capybara:
                pet = new Capybara(expectedName, expectedAge);
                break;

        }
        return pet;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public Pet[] getPets() {
        Pet[] petArray = new Pet[pets.size()];
        for (int i = 0; i < petArray.length; i++) {
            Pet currentPet = pets.get(i);
            petArray[i] = currentPet;
        }
        return petArray;
    }
}
