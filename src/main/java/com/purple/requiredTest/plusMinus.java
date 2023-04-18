package com.purple.requiredTest;
public class plusMinus {

    public static String plusMinus(int number){
        // 9의 배수(apple) 말고는 패턴이...
        String[] fruitList = {
                "kiwi",      "pear",      "kiwi",      "banana",    "melon",     "banana",    "melon",     "pineapple", "apple",
                "pineapple", "cucumber",  "pineapple", "cucumber",  "orange",    "grape",     "orange",    "grape",     "apple",
                "grape",     "cherry",    "pear",      "cherry",    "pear",      "kiwi",      "banana",    "kiwi",      "apple",
                "melon",     "banana",    "melon",     "pineapple", "melon",     "pineapple", "cucumber",  "orange",    "apple",
                "orange",    "grape",     "orange",    "grape",     "cherry",    "pear",      "cherry",    "pear",      "apple",
                "pear",      "kiwi",      "banana",    "kiwi",      "banana",    "melon",     "pineapple", "melon",     "apple",
                "cucumber",  "pineapple", "cucumber",  "orange",    "cucumber",  "orange",    "grape",     "cherry",    "apple",
                "cherry",    "pear",      "cherry",    "pear",      "kiwi",      "pear",      "kiwi",      "banana",    "apple",
                "banana",    "melon",     "pineapple", "melon",     "pineapple", "cucumber",  "pineapple", "cucumber",  "apple",
                "grape",     "orange",    "grape",     "cherry",    "grape",     "cherry",    "pear",      "cherry",    "apple",
                "kiwi",      "banana",    "kiwi",      "banana",    "melon",     "banana",    "melon",     "pineapple", "apple",
                "pineapple"
        };

        int sum = 0;
        int tempNumber = number;

        // 101 ~ 10000 >> 99로 수렴
//        if(tempNumber > 100){
//            return "apple";
//        }
//        else {
            while (tempNumber > 100) {
                String numStr = Integer.toString(tempNumber);
                sum = 0;
                for (int i = 0; i < numStr.length(); i++) {
                    sum += Integer.parseInt(Character.toString(numStr.charAt(i)));
                }
                tempNumber = tempNumber - sum;
            }
//        }

        return fruitList[tempNumber];
    }
}