package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;


@RunWith(Parameterized.class)
public class AnimalGetFoodTest {

    private final String animalKind;
    private final List<String> expFood;

    public AnimalGetFoodTest(String animalKind, List<String> expFood) {
        this.animalKind = animalKind;
        this.expFood = expFood;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void checkGetFood() throws Exception {
        Animal animal = new Animal();
        List <String> actual = animal.getFood(animalKind);
        Assert.assertEquals(actual, expFood);
    }


}