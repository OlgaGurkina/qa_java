package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class FelineTest {

    @Test
    public void checkEatMeat() throws Exception {
        List <String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List <String> actual;
        Feline feline = new Feline();
        actual = feline.eatMeat();
        Assert.assertEquals(actual, expectedFoodList);
    }

    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void checkGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void checkIntGetKittens() {
        Feline feline = new Feline();
        int expected = 5;
        int actual = feline.getKittens(expected);
        Assert.assertEquals(actual, expected);

    }
}