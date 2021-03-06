package io.zipcoder;


import io.zipcoder.pets.Capybara;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ApplicationTest {
    ArrayList<Pet> pets;

    Capybara vince;
    Capybara jaxson;
    Capybara addison;
    Capybara amy;
    Cat frederick;
    Cat george;
    Cat biscuit;
    Dog cassie;
    Dog henry;

    @Before
    public void setup () {
        pets = new ArrayList<Pet>();

        vince = new Capybara("Vince", 2);
        jaxson = new Capybara("Jaxon", 2);
        addison = new Capybara("Addison", 2);
        amy = new Capybara("Amy", 14);
        frederick = new Cat("Frederick", 3);
        george = new Cat("George", 3);
        biscuit = new Cat("Biscuit", 3);
        cassie = new Dog("Cassie", 12);
        henry = new Dog("Henry", 12);

        pets.add(vince);
        pets.add(jaxson);
        pets.add(addison);
        pets.add(amy);
        pets.add(frederick);
        pets.add(biscuit);
        pets.add(cassie);
        pets.add(henry);
    }

    @Test

    public void sortByNameTest(){

        String expected = "[Capybara: Addison\n, Capybara: Amy\n, Cat: Biscuit\n, Dog: Cassie\n, Cat: Frederick\n, Dog:" +
                " Henry\n, Capybara: Jaxon\n, Capybara: Vince\n]";

        //String expected = "Addison\nAmy\nBiscuit\nCassie\nFrederick\nHenry\nJaxon\nVince";
        //ArrayList<Pet> expected = new ArrayList<Pet>();

//        pets.add(addison);
//        pets.add(amy);
//        pets.add(biscuit);
//        pets.add(cassie);
//        pets.add(frederick);
//        pets.add(henry);
//        pets.add(jaxson);
//        pets.add(vince);

        Collections.sort(pets);
        String actual = pets.toString();

        //ArrayList<Pet> actual = pets;

        Assert.assertEquals(expected, actual);

    }




    //I can have the test return an array, and check to see if that array matches the test array.



//    public void sortTest() {
//
//        for (Pet pet : pets) {
//            System.out.println(pet.getName());
//        }
//
//        Collections.sort(pets);
//
//        for (Pet pet : pets) {
//            System.out.println(pet.getName());
//        }
//
//
//            Collections.sort(pets);
//        //System.out.println(pets);
    }



