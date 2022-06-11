package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void checkConstructorException() {
        Lion lion = null;
        Exception testException = null;
        try {
            lion = new Lion(feline, "IncorrectSex");
        } catch (Exception e) {
            testException = e;
        }
        Assert.assertNotNull(testException);
        Assert.assertNull(lion);
    }


    @Test
    public void checkGetKittens() {
        Lion lion;
        try {
            lion = new Lion(feline, "Самец");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Mockito.when(feline.getKittens()).thenReturn(10);
        Assert.assertEquals(10, lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        Lion lion;
        try {
            lion = new Lion(feline, "Самец");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            lion.getFood();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");

    }
}

