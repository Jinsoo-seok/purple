package com.purple;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class study {

    public void test(){

        int result = quarterCalculator(1);
        System.out.println("result = "+ result +" 분기");

    }

    public int quarterCalculator (int month){
        return (int) Math.ceil(month/3);
    }
}
