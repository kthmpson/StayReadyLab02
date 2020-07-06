package com.codedifferently;

//all functioning code calls goe inside the {}
//accepted arguments go inside of the ()

public class Display {
   private double currentValue; 

   
    //+ getDisplayValue(): Double
    public Double getDisplayValue(){
        return currentValue;
    }
    

    //+ clearDisplayValue(): void
    public void clearDisplayValue(){
        currentValue = 0;
    }
    
    //+ setDisplayValue(): void
    // ex setDisplay(5)
    public void setDisplayValue(double num){
        currentValue = num;
    }
    
}