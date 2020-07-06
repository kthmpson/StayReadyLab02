package com.codedifferently;

/*The essence of the memory. Your private double "memoryValue" will be updated when the 
current Value is changed 

it will need to extend/ or inherit the Scientific Calculator Class to utilize the double 
"currentVal"*/

public class Memory {

    private double memoryValue;

    /* Inside this method: Assign ("=") "memoryValue" to the output of method 
    from SciCalculator called "getCurrentValue()", you're able to use it because it's already
    been extended */
    public void addToMemory(){

    }
    
    /* Inside this method: Assign ("=") "memoryValue" to 0 */
    public void resetMemory(){
        
    }
    /* Inside this method: Works as a get****() method just with a different name
    Return "memoryVal". The Zero is only there to be a placeholder */
    public double recallMemory(){
        return 0;
    }

}