package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {
    private String testName;
    private int testAge;
    private Cat testCat;
    @Before
    public void setUp() throws Exception {
        testName = "Willy";
        testAge = 1;
        testCat = new Cat(testName, testAge);

    }
    @Test
    public void setTestNameTest(){
        testCat.setName("Frisky");
        String expected = "Frisky";
        String actual = testCat.getName();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setTestAgeTest(){
        testCat.setAge(1);
        int expected = 1;
        int actual = testCat.getAge();
        assertEquals(expected, actual);
    }
    @Test
    public void speak() {
        String expected = "Meyow";
        String actual = testCat.speak();
        Assert.assertEquals(expected, actual);
    }
}