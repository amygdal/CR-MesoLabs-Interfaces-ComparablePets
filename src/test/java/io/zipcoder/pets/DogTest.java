package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {
    private String testName;
    private int testAge;
    private Dog testDog;

    @Before
    public void setUp() throws Exception {
        testName = "Ralfie";
        testAge = 99;
        testDog = new Dog(testName, testAge);
    }

    @Test
   public void setTestNameTest(){
        testDog.setName("Lady");
        String  expected = "Lady";
        String  actual = testDog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setTestAgeTest(){
        testDog.setAge(57);
        int expected = 57;
        int actual = testDog.getAge();
        assertEquals(expected, actual);
    }

    @Test
    public void speak() {
        String expected = "Woof";
        String actual = testDog.speak();
        Assert.assertEquals(expected, actual);
    }
}