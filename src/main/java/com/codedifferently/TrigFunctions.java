package com.codedifferently;

public class TrigFunctions extends SciCalculator{
    public double sine(double num){
        num = Math.sin(num); 
        return num;
    }

    public double cosine(double num){
        num = Math.cos(num); 
        return num;
    }
    public double tangent(double num){
    num = Math.tan(num); 
        return num;
    }
    
    public double inverseSine(double num){
        num = Math.asin(num); 
        return num;
    }

    public double inverseCosine(double num){
        num = Math.acos(num); 
        return num;
        
    }

    public double inverseTan(double num){
        num = Math.atan(num); 
        return num;
      
    }

}