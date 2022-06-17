package com.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestLionDoesHaveMane {

    private final String sex;
    private final Boolean haveMane;

    public TestLionDoesHaveMane(String sex, Boolean haveMane){
        this.haveMane = haveMane;
        this.sex = sex;
    }
    @Parameterized.Parameters
    public static Object[][] testData(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void checkDoesHaveMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, sex);
        Boolean actual = lion.doesHaveMane();
        Assert.assertEquals(haveMane,actual);
    }


}
