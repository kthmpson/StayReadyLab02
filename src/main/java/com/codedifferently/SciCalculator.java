package com.codedifferently;

/**
 * Hello world!
 *
 */



public class SciCalculator 
{
    
    private double currentValue = 0;

    // This line in our UML reads that we have a private object named displayMode,
    // which returns the value Type DisplayMode
    // we can use classes as value types.

    // - displayMode: DisplayMode
    private DisplayMode displayMode;

    private TrigFunctions trigFunctions;

    private Memory memory;

    private CoreFeatures coreFeatures;

    //private TrigUnits trigunits;

    public static void main( String[] args )
    {
        
    }

    //First steps for making a method is starting with the header. 
    //The UML for the header is as follows:
    // + getCurrentValue(): Double

    public Double getCurrentValue(){
        return currentValue;
    }
    // + setCurrentValue(Double): void

    public void setCurrentValue(double num){
        currentValue = num;
    }



}
