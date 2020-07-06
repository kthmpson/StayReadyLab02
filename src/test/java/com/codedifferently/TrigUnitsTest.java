package com.codedifferently;
import org.junit.Test;
import org.junit.Assert;

public class TrigUnitsTest {
    
    @Test
    public void getModeTest() {
        // Given
        //we're changing this here to open TrigUnits instead of displayMode
        TrigUnits tu = new TrigUnits();
        String actual = tu.getMode();
        // When
        String expected = "degrees";
        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    /* the essence of a the switchUnitsMode() is when we call it we should 
    automatically switch from degrees to radians, so to test if that works your
    expected should match the degree we're switching to
    
    common trip ups, in other test cases we seem to be calling the function we're
    testing in the "actual" variable. Since switchUnitsMode is a void we can't do
    that here, and it is the same for any other set function, you're going to call it within the test
    and then for your actual you should use the function that returns the mode*/

    public void switchUnitsModeTest() {
        //Given
        
        //When

        //Then
        //Assert will always be the last call 
    }
    
    @Test
    /* the essence of this switchUnitsMode() is when we call it we should 
    enter a mode and switch directly to that mode 
    
    ex: switcUnitsMode("Radians")
    
    getMode() > Radians
    
    So to test if that works your
    expected should match the degree we're switching to
    
    common trip ups, in other test cases we seem to be calling the function we're
    testing in the "actual" variable. Since switchUnitsMode is a void we can't do
    that here, and it is the same for any other set function, you're going to call it within the test
    and then for your actual you should use the function that returns the mode*/
    public void switcUnitsModeTest() {
        //Given

        //When

        //Then
    }
    
}