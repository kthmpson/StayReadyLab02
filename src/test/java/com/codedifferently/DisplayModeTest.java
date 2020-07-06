package com.codedifferently;

import org.junit.Assert;
import org.junit.Test; 

public class DisplayModeTest {

    @Test
    public void getModeTest() {
        // Given
        DisplayMode dm = new DisplayMode();
        String actual = dm.getMode();
        // When
        String expected = "";
        // Then
        Assert.assertEquals(expected, actual);
    }
    
}