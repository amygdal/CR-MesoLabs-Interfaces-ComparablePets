package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MonkeyTest {
    private String testName;
    private int testAge;
    private Monkey testMonkey;

    @Before
    public void setUp() throws Exception {
        testName = "Ruby";
        testAge = 7;
        testMonkey = new Monkey(testName, testAge);
    }

    @Test
    public void setTestNameTest() {
        testMonkey.setName("Joshua");
        String expected = "Joshua";
        String actual = testMonkey.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setName1Test() {
        testMonkey.setName("Silly");
        String expected = "Silly";
        String actual = testMonkey.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void speakTest() {
        String expected = "eehehehhehehe";
        String actual = testMonkey.speak();
        Assert.assertEquals(expected, actual);
    }

}