package com.codedifferently;



public class CoreFeatures extends SciCalculator {

    public double add(double num){
        num += getCurrentValue();
        return num;
    }

    public double subtract(double num){
        num -= getCurrentValue();
        return num;
    }
    
    public double divide(double num){
        num /= getCurrentValue();
        return num;


    }

    public double multiply(double num){
        num *= getCurrentValue();
        return num;
    }

    // two things should go into exponents, the number we want
    // to raise and the degree we're raising it to. 

    // ex: Exp(3, 5);
    public double Exp(double num, int deg){
        num = Math.pow(getCurrentValue(), deg);
        return num;
    }

    public double squarenumbers(double num){
        num = Math.pow(getCurrentValue(), 2);
        return num;
    }

    public double squareroot(double num){
        num = Math.sqrt(getCurrentValue());
        return num;
    }

    public double clear(double num){
        num *= getCurrentValue()*0;
        return num;
    }
}