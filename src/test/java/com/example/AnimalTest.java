package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;


@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalKind;
    private final List<String> expFood;

    public AnimalTest(String animalKind, List<String> expFood) {
        this.animalKind = animalKind;
        this.expFood = expFood;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"ErrorAnimalKind", null},
        };
    }

    @Test
    public void checkGetFood()  {
        Animal animal = new Animal();
        List <String> actual = null;
        try {
            actual = animal.getFood(animalKind);
        } catch (Exception e) {}
        Assert.assertEquals(actual, expFood);
    }




    @Test
    public void checkGetFamily() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        Assert.assertNotNull(actual);
    }

}