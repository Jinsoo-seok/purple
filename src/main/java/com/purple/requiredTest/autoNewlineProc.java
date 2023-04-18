package com.purple.requiredTest;

public class autoNewlineProc {

    public static String autoNewlineProc(String text) {
        String patternASCII = "(3([3-9]))|([4-9]([0-9]))|(10([0-9]))|(11([0-9]))|(12([0-6]))";
        String resultString = "";
        boolean endKorean = false;
        int index = 0;


//        인덱스가 하나 필요함 -> 인덱스로 안돌아가니까 위치가 바뀌면 못따라감
        try {
            byte[] temp = text.getBytes("euc-kr");
            System.out.println("temp.length = " + temp.length);

            double tempLength = temp.length;
            int loop = (int) Math.ceil(((tempLength/80)*100)/100);

            for(int i = 0; i<loop; i++){
                if(tempLength < i*80 + 80){

                }
                else if(i != 0){
                    String checkASCII = String.valueOf(temp[index]);
                    if(!checkASCII.matches(patternASCII)){
                        endKorean = true;
                        index = index-1;
                    }
                    resultString += getString(text, index, 80, endKorean);
                }
                else if (i == 0){
                    resultString += getString(text, index, 80, endKorean);
                }
                index = index + 80;
                resultString += "\n";
                endKorean = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultString;
    }

    public static String getString(String str, int sPoint, int length, boolean endKorean) throws Exception{
        String patternASCII = "(3([3-9]))|([4-9]([0-9]))|(10([0-9]))|(11([0-9]))|(12([0-6]))";
        String CharSet = "euc-kr";
        byte[] bytes = str.getBytes(CharSet);
        byte[] value = new byte[length];

//        String koreanCheck = String.valueOf(bytes[sPoint]);
        // First letter >> skip space
        int spaceCheck = 0;
//        int spaceCheck = (koreanCheck.equals("32")) ? 1 : 0;
//        if(koreanCheck.matches(patternASCII)){
//            value[length] = bytes[sPoint + length];
//        }

//        if(endKorean){
//            sPoint = sPoint-1;
//        }
        // less
        if(bytes.length < sPoint + length){
            int less = bytes.length-sPoint;
            for(int i = spaceCheck; i < less; i++){
                value[i] = bytes[sPoint + i];
            }
        }
        // max
        else{
            for(int i = spaceCheck; i < length-1; i++){
                value[i] = bytes[sPoint + i];
            }
//            String temp = String.valueOf(bytes[length]);
//            if(temp.matches(patternASCII)){
//                value[length] = bytes[sPoint + length];
//            }
//            else{
//            }
        }
        System.out.println("sPoint = " + sPoint);
        return new String(value, CharSet).trim();
    }


}
