package com.purple.requiredTest;

public class quarterCalculator {
    public static int quarterCalculator(int month){

        // Exclude
        if(month < 1 || month > 12){
            return -1;
        }
        // run
        else{
            return (int)(Math.ceil((month-1)/3))+1;
        }
    }

}
