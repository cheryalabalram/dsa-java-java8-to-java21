package com.balram.demo.sd.tinyurl;

import java.util.HashMap;
import java.util.Map;

public class TinyUrl {

    public static Map<String, String> urlMap = new HashMap<>();

    public static String getShortUrl(String url) {
        String shortUrl = "tinyurl.com/" + url.hashCode();
        urlMap.put(shortUrl, url);
        return shortUrl;
    }

    public static String getOriginalUrl(String url){
        return urlMap.get(url);
    }

    public static void main(String[] args) {
        String shortUrl = getShortUrl("www.example.com");
        System.out.println(shortUrl);

        String originalUrl = getOriginalUrl(shortUrl);
        System.out.println(originalUrl);
    }
}
