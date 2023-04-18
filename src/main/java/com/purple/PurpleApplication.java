package com.purple;

import com.purple.requiredTest.plusMinus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.Integer.parseInt;

@SpringBootApplication
public class PurpleApplication {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();

        SpringApplication.run(PurpleApplication.class, args);

        ///////////////////////////////////////////////////////////////////////////////////////
        // 1.
//        for(int i = -20; i<20; i++){
//            int result = quarterCalculator.quarterCalculator(i);
//
//            if (result == -1) {
//                System.out.println("result = " + result);
//            } else {
//                System.out.println("result = " + result + " 분기");
//            }
//        }

        ///////////////////////////////////////////////////////////////////////////////////////
        // 2. 미완 >> quick Sort, random pivot
////        int[] nums = { 0, 1, 2, 6, 9, 11, 15 }; // 3
////        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14 }; // 10
////        int[] nums = { 0, 1, 2, 3, 4, 5, 6 }; // 7
////        int[] nums = { 0, 1, 2, 3, 4, 4, 4, 4, 4, 4, 6 }; // 5
//        int[] nums = { 3, 1, 5, 2, 3, 9, 8, 6 }; // 4

//        System.out.println("findSmallestMissing : " +findSmallestMissing.findSmallestMissing(nums));
////        System.out.println("Before sorting: " + Arrays.toString(nums));
////        quickSort(nums, 0, nums.length - 1);
////        System.out.println("After sorting: " + Arrays.toString(nums));

        ///////////////////////////////////////////////////////////////////////////////////////
        // 3.
////        String[] scoreList = {"1:1", "2:2", "3:3", "4:4", "1:1", "2:2", "3:3", "4:4", "1:1", "2:2"}; // 10
////        String[] scoreList = {"4:1", "4:2", "4:3", "4:3", "4:1", "4:2", "4:3", "4:3", "4:1", "4:2"}; // 30
////        String[] scoreList = {"0:1", "0:2", "0:3", "0:3", "0:1", "0:2", "0:3", "0:3", "0:1", "0:2"}; // 0
////        String[] scoreList = {"0:1", "0:2", "0:3", "0:3", "0:1", "0:2", "0:3", "0:3", "0:1"}; // -1
//        String[] scoreList = {"0:1", "0:2", "0:3", "0:3", "0:1", "0:2", "0:3", "0:3", "0:1", "0:5"}; // -2
//
//        System.out.println("gameScore : " +gameScore.gameScore(scoreList));



        ///////////////////////////////////////////////////////////////////////////////////////
        // 4. 한글 체크, 공백 체크 필요
//        String text = "이 글은 도커에 대해 1도 모르는 시스템 관리자나 서버 개발자를 대상으로 도커 전반에 대해 얕고 넓은 지식을 담고 있습니다. 도커가 등장한 배경과 도커의 역사, 그리고 도커의 핵심 개념인 컨테이너와 이미지에 대해 알아보고 실제로 도커를 설치하고 컨테이너를 실행해 보도록 하겠습니다.";
//        String text = "이 글은 도커에 대해 1도 모르는 시스템 관리자나 서버 개발자를 대상으로 도커 전반에 대해";
        // 아스키 33~126
        // 65~90 대문자 || 97~122 소문자
//        String patternUpper = "(6([5-9]))|([7-8]([0-9]))|(9([0-1]))";
//        String patternLower = "(9([7-9]))|(10([0-9]))|(11([0-9]))|(12([0-2]))";
//        String patternASCII = "(3([3-9]))|([4-9]([0-9]))|(10([0-9]))|(11([0-9]))|(12([0-6]))";
//
//        String temp9 = autoNewlineProc.autoNewlineProc(text);
//        System.out.println("temp = \n" + temp9);


        ///////////////////////////////////////////////////////////////////////////////////////
        // 5. 좀 이상한듯?
//        int num = 98;
//
//        System.out.println("plusMinus = " + plusMinus.plusMinus(num));


        ///////////////////////////////////////////////////////////////////////////////////////
//        long endTime = System.currentTimeMillis();
//        System.out.println("start Time = " + startTime);
//        System.out.println("end Time = " + endTime);
//        long procTime = endTime-startTime;
//        System.out.println("proc Time = " + (endTime - startTime));
    }


}

