package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AnimaiGetFamilyTest {


    @Test
    public void checkGetFamily() {
        String expectedText = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();
        String actual = animal.getFamily();
        Assert.assertEquals(actual, expectedText);
    }
}
