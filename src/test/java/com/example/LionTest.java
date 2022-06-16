package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void checkConstructorException() {
        String expException = "Используйте допустимые значения пола животного - самей или самка";
        String incorrectSex = "IncorrectSex";
        Lion lion;
        try {
            lion = new Lion(feline, incorrectSex);
            Assert.fail("Expected Exception");
        } catch (Exception e) {
            Assert.assertEquals(expException, e.getMessage());
        }
    }

    @Test
    public void checkGetKittens() throws Exception {
        Lion lion;
        lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(10);
        Assert.assertEquals(10, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        Lion lion;
        lion = new Lion(feline, "Самец");
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");

    }
}

