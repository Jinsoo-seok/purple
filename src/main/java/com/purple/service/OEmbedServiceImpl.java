package com.purple.service;

import com.purple.util.ResponseCode;
import com.purple.util.nameUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class OEmbedServiceImpl implements OEmbedService {

    @Override
    public Map<String, Object> getOEmbedInfo(Map<String, Object> param) {
        Map<String, Object> responseMap = new HashMap<>();
        Map<String, Object> paramMap = new HashMap<>();


        ResponseEntity<Map> responseEntity = useWebClient(param);

        responseMap.put("data", responseEntity.getBody());
        responseMap.put("code", ResponseCode.SUCCESS.getCode());
        responseMap.put("message", ResponseCode.SUCCESS.getMessage());


        return responseMap;
    }

    public ResponseEntity<Map> useWebClient (Map<String, Object> param){
        WebClient webClient = WebClient.create();
        ResponseEntity<Map> response = null;

        String type = (String) param.get("type");
        String url = "";

        if(type.equals(nameUtils.YOUTUBE.getCodeName())) {
            url = nameUtils.YOUTUBE.getUrl();
        }
        else if(type.equals(nameUtils.TWITTER.getCodeName())) {
            url = nameUtils.TWITTER.getUrl();
        }
        else if(type.equals(nameUtils.VIMEO.getCodeName())) {
            url = nameUtils.VIMEO.getUrl();
        }
        else if(type.equals(nameUtils.INSTAGRAM.getCodeName())) {
            url = nameUtils.INSTAGRAM.getUrl();
        }
        url += param.get("id");


        log.info("Call URL = {}", url);
        if(!url.equals("")){
             response = webClient
                    .get()
                    .uri(url)
                    .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .retrieve()
                    .toEntity(Map.class)
                    .block();
        }
        return response;
    }


    public String urlUtils (String type){

        String result = null;

        if(type.equals(nameUtils.YOUTUBE.getCodeName())){
            result = nameUtils.YOUTUBE.getUrl();
        }

        return result;
    }
}
