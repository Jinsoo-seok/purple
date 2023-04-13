package com.purple;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Random;

@SpringBootApplication
public class PurpleApplication {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        SpringApplication.run(PurpleApplication.class, args);

        // 1.
//        for(int i = 0; i<20; i++){
//            int result = quarterCalculator.quarterCalculator(i);
//
//            if (result == -1) {
//                System.out.println("result = " + result);
//            } else {
//                System.out.println("result = " + result + " 분기");
//            }
//        }

        // 2. 미완
//        int[] nums = { 0, 1, 2, 6, 9, 11, 15 }; // 3
//        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14 }; // 10
//        int[] nums = { 0, 1, 2, 3, 4, 5, 6 }; // 7
//        int[] nums = { 0, 1, 2, 3, 4, 4, 4, 4, 4, 4, 6 }; // 5
        int[] nums = { 3, 1, 5, 2, 3, 9, 8, 6 }; // 4

        System.out.println("findSmallestMissing: " +findSmallestMissing.findSmallestMissing(nums));
//        System.out.println("Before sorting: " + Arrays.toString(nums));
//        quickSort(nums, 0, nums.length - 1);
//        System.out.println("After sorting: " + Arrays.toString(nums));



        long endTime = System.currentTimeMillis();
        System.out.println("start Time = " + startTime);
        System.out.println("end Time = " + endTime);
        long procTime = endTime-startTime;
        System.out.println("proc Time = " + (endTime - startTime));
    }

}
