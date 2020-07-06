package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {

    @Test

    public void addTest(){
        // Given
        CoreFeatures cf = new CoreFeatures();
        double expected = 5;
        // When
        double actual = cf.add(5);

        // Then
        Assert.assertEquals(expected, actual,0);
    }

    

    @Test

    public void subtractTest(){
        // Given
        CoreFeatures cf = new CoreFeatures();
        double expected = 3;
        // When
        double actual = cf.subtract(5);

        // Then
        Assert.assertEquals(expected, actual,0);
    }

    @Test

    public void divideTest(){
        // Given
        CoreFeatures cf = new CoreFeatures();
        double expected = 8;
        // When
        double actual = cf.divide(2);

        // Then
        Assert.assertEquals(expected, actual,0);
    }

    @Test

    public void multiplyTest(){
        // Given
        CoreFeatures cf = new CoreFeatures();
        double expected = 10;
        // When
        double actual = cf.multiply(2);

        // Then
        Assert.assertEquals(expected, actual,0);
    }

    @Test

    public void ExpTest(){
        // Given
        CoreFeatures cf = new CoreFeatures();
        double expected = 16;
        // When
        double actual = cf.Exp(2);

        // Then
        Assert.assertEquals(expected, actual,0);
    }
    @Test

    public void squarerootTest(){
        // Given
        CoreFeatures cf = new CoreFeatures();
        double expected = 5;
        // When
        double actual = cf.squareroot(25);

        // Then
        Assert.assertEquals(expected, actual,0);
    }

    @Test

    public void clearTest(){
        // Given
        CoreFeatures cf = new CoreFeatures();
        double expected = 0;
        // When
        double actual = cf.clear(20);

        // Then
        Assert.assertEquals(expected, actual,0);
    }


    

    
    
}


