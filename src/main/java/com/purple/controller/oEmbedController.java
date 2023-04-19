package com.purple.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.purple.dto.VideoDTO;
import com.purple.util.ResponseCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import com.purple.service.*;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequiredArgsConstructor
public class oEmbedController {

    final OEmbedService oEmbedService;

    @GetMapping("/api/oEmbed")
    public ModelAndView getOEmbedInfo (HttpServletRequest request
                                                , @RequestParam Map<String, Object> param
                                                , ModelAndView model){
        long startTime = System.currentTimeMillis();
        String apiInfo ="[" + request.getMethod() + "] [" + request.getRequestURI() + "]";
        log.info("{} [START] [{}]", apiInfo, startTime);

        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("code", ResponseCode.FAIL.getCode());

        try{
            if(param.isEmpty()) {
               throw new Exception(ResponseCode.NO_REQUIRED_PARAM.getMessage());
            }
            else{
                VideoDTO responseDTO = oEmbedService.getOEmbedInfo(param);

                if(!responseDTO.equals(null)){
                    model.addObject("json", responseDTO);
                    responseMap.put("code", ResponseCode.SUCCESS.getCode());

                }

            }
        }
        catch(Exception exception){
            log.error("[Exception][getOEmbedInfo] - " + exception.getMessage());
        }
        finally {
            model.setViewName("oembed");
        }

        long endTime = System.currentTimeMillis();
        long procTime = endTime-startTime;
        log.info("{} [END] [{}] - {}", apiInfo, procTime, responseMap.get("code"));

        return model;
//        HttpHeaders headers = new HttpHeaders();
//        return new ResponseEntity(responseMap, headers, HttpStatus.OK);
    }

    @GetMapping("oembed")
    public String oembedView(Model model){
        return "oembed";
    }
}
