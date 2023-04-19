package com.purple.util;

public enum nameUtils {

    YOUTUBE("youtube", "https://www.youtube.com/oembed?format=json&url=https://www.youtube.com/watch?v="),
    INSTAGRAM( "instagram", "https://api.instagram.com/oembed?url=https://www.instagram.com/p/"),
    TWITTER( "twitter", "https://publish.twitter.com/oembed?url=https://twitter.com/"),
    VIMEO( "vimeo", "https://vimeo.com/api/oembed.json?url=https://vimeo.com/");


    private String codeName;
    private String url;

    nameUtils(String codeName, String url){
        this.codeName = codeName;
        this.url = url;
    }
    public String getCodeName() {
        return codeName;
    }

    public String getUrl() {
        return url;
    }
}