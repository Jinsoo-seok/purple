package com.purple.controller;

import com.purple.util.ResponseCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import com.purple.service.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class oEmbedController {

    final OEmbedService oEmbedService;

    @GetMapping("/api/oEmbed")
    public ResponseEntity<Object> getOEmbedInfo (HttpServletRequest request, @RequestParam Map<String, Object> param){
        long startTime = System.currentTimeMillis();
        String apiInfo ="[" + request.getMethod() + "] [" + request.getRequestURI() + "]";
        log.info("{} [START] [{}]", apiInfo, startTime);

        Map<String, Object> responseMap = new HashMap<>();

        try{
            if(param.isEmpty()) {
               throw new Exception(ResponseCode.NO_REQUIRED_PARAM.getMessage());
            }
            else{
                responseMap = oEmbedService.getOEmbedInfo(param);
            }
        }
        catch(Exception exception){
            log.error("[Exception][getOEmbedInfo] - " + exception.getMessage());
            responseMap.put("log", exception.getMessage());
            responseMap.put("code", ResponseCode.FAIL.getCode());
            responseMap.put("message", ResponseCode.FAIL.getMessage());
        }

        long endTime = System.currentTimeMillis();
        long procTime = endTime-startTime;
        log.info("{} [END] [{}] - {}", apiInfo, procTime, responseMap.get("code"));

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity(responseMap, headers, HttpStatus.OK);
    }

}
