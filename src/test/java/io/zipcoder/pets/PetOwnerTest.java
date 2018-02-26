package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetOwnerTest {
  private String testName;
  private int    numberOfPetsTest;

  private Pet typeOfPetTest;
  private Pet typeOfPetTest1;
  private Pet typeOfPetTest2;
  private List<Pet> listOfPetsTest;
  private PetOwner owner;
    @Before
    public void setUp() throws Exception {
        testName = "Susan";
        numberOfPetsTest = 2;
        typeOfPetTest = new Cat("Sam", 2);
        typeOfPetTest1 = new Dog("Roo", 3);
        typeOfPetTest2 = new Monkey("Sunny", 4);
        listOfPetsTest = new ArrayList<Pet>();
        listOfPetsTest.add(typeOfPetTest1);
        listOfPetsTest.add(typeOfPetTest);

        owner = new PetOwner(testName, numberOfPetsTest, listOfPetsTest);
    }

    @Test
    public void addPetTest() {

        boolean expected = listOfPetsTest.contains(typeOfPetTest2);
        boolean actual = owner.addPet(typeOfPetTest2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removePetTest() {

        boolean expected = false;
        boolean actual = owner.removePet(typeOfPetTest);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAPetsTest() {
        List<Pet> expected = listOfPetsTest;
        List<Pet> actual = owner.getAPets();
        Assert.assertEquals(expected, actual);
    }
}