package com.codedifferently;
import org.junit.Test;
import org.junit.Assert;

public class TrigFunctionsTest {
    
    @Test
    public void sineTest(){
        // Given
        TrigFunctions tf = new TrigFunctions();
        double expected = 0.8509035245341184;
        // When
        double actual = tf.sine(45.0);
        // Then
        Assert.assertEquals(expected, actual,0);
    }
    
    @Test
    public void cosineTest(){
        // Given
        TrigFunctions tf = new TrigFunctions();
        double expected = 0.5253219888177297;
        // When
        double actual = tf.cosine(45.0);
        // Then
        Assert.assertEquals(expected, actual,0);
    }
    
    @Test
    public void tangentTest(){
        // Given
        TrigFunctions tf = new TrigFunctions();
        double expected = 1.6197751905438615;
        // When
        double actual = tf.tangent(45.0);
        // Then
        Assert.assertEquals(expected, actual,0);
    }
    @Test
    public void inverseSineTest(){
        // Given
        TrigFunctions tf = new TrigFunctions();
        double expected = 1.5707963267948966;
        // When
        double actual = tf.inverseSine(1.0);
        // Then
        Assert.assertEquals(expected, actual,0);
    }
    @Test
    public void inverseCosineTest(){
        // Given
        TrigFunctions tf = new TrigFunctions();
        double expected = 0.0;
        // When
        double actual = tf.inverseCosine(1.0);
        // Then
        Assert.assertEquals(expected, actual,0);
    }

    @Test
    public void inverseTanTest(){
        // Given
        TrigFunctions tf = new TrigFunctions();
        double expected = 0.7853981633974483;
        
        // When
        double actual = tf.inverseTan(1.0);
        // Then
        Assert.assertEquals(expected, actual,0);
    }
}