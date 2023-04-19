package com.purple.service;

import com.purple.dto.VideoDTO;

import java.util.Map;

public interface OEmbedService {

    VideoDTO getOEmbedInfo(Map<String, Object> param);
}
