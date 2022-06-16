package com.example;

import org.junit.Assert;
import org.junit.Test;


public class AnimalGetFoodExceptionTest {

    @Test
    public void checkGetFoodException()  {
        String incorrectAnimalKind = "NoSuchKind";
        String expException = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Animal animal = new Animal();
        try {
            animal.getFood(incorrectAnimalKind);
            Assert.fail("Expected Exception");
        } catch (Exception e) {
            Assert.assertEquals(expException, e.getMessage());
        }

    }
}
