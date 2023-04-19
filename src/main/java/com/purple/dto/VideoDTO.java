package com.purple.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VideoDTO {
    private String title;
    private String type;
    private String version;
    private String provider_name;
    private String provider_url;
    private String author_name;
    private String author_url;
    private String is_plus;
    private String html;
    private String cache_age;
    private String account_type;
    private Integer width;
    private Integer height;
    private Integer duration;
    private String description;
    private String thumbnail_url;
    private Integer thumbnail_width;
    private Integer thumbnail_height;
    private String thumbnail_url_with_play_button;
    private String upload_date;
    private Integer video_id;
    private String uri;
    private String url;

    // getters and setters
}