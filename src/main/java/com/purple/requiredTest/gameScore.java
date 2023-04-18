package com.purple.requiredTest;

import static java.lang.Integer.parseInt;

public class gameScore {
    public static int gameScore(String[] scoreList){

        String Pattern = "[0-4]:[0-4]";
        int scoreResult = 0;

        // 경기 수 : 오버 / 오버 and 언더 / 고정 10
//        if(scoreList.length > 10){
//        if(scoreList.length > 10 || scoreList.length < 0){
        if(scoreList.length != 10){
            return -1;
        }

        for (String score : scoreList) {
            if(score.matches(Pattern)) {
                String[] splitScore = score.split(":");
                if (splitScore[0].equals(splitScore[1])) {
                    scoreResult += 1;
                } else {
                    scoreResult += parseInt(splitScore[0]) > parseInt(splitScore[1]) ? 3 : 0;
                }
            }
            else{
                return -2;
            }
        }

        return scoreResult;
    }

}
