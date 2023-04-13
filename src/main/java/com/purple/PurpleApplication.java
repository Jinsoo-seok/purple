package com.purple;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Random;

@SpringBootApplication
public class PurpleApplication {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        // main
//        SpringApplication.run(PurpleApplication.class, args);

        // 1.
//        for(int i = 0; i<20; i++){
//            int result = quarterCalculator(i);
//
//            if (result == -1) {
//                System.out.println("result = " + result);
//            } else {
//                System.out.println("result = " + result + " 분기");
//            }
//        }

        // 2. Quick Selection 사용해야할듯
//        int[] nums = { 0, 1, 2, 6, 9, 11, 15 }; // 3
//        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14 }; // 10
//        int[] nums = { 0, 1, 2, 3, 4, 5, 6 }; // 7
//        int[] nums = { 0, 1, 2, 3, 4, 4, 4, 4, 4, 4, 6 }; // 5
        int[] nums = { 3, 1, 5, 2, 3, 9, 8, 6 }; // 4

        int left = 0, right = nums.length - 1;
//        System.out.println("The smallest missing element is "
//                + smallestUnusedNumber(nums, left, right));

        System.out.println("Before sorting: " + Arrays.toString(nums));
        quickSort(nums, 0, nums.length - 1);
        System.out.println("After sorting: " + Arrays.toString(nums));


        long endTime = System.currentTimeMillis();
        System.out.println("start Time = " + startTime);
        System.out.println("end Time = " + endTime);
        long procTime = endTime-startTime;
        System.out.println("proc Time = " + (endTime - startTime));
    }


    // 1. 분기 숫자 구하기
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



    // 2. 사용 하지 않는 가장 작은 숫자 찾기
    public static int smallestUnusedNumber(int[] nums){
        return -1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        // 무작위한 pivot 선택
        Random random = new Random();
        int randomIndex = random.nextInt(high - low + 1) + low;
        swap(arr, randomIndex, high);

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
