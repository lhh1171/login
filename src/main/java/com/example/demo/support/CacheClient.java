package com.example.demo.support;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class CacheClient {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    public Object getValue(String key) {
        if (key == null || "".equals(key)) {
            return null;
        } else {
//            System.out.println("命中cache");
//            return "success";
            return redisTemplate.opsForValue().get(key);
        }
    }

    public void putValue(String key, Object o, int expire) {
        if ("".equals(key)) {

//            System.out.println("命中cache");
//            return "success";
            redisTemplate.opsForValue().set(key, o, expire, TimeUnit.SECONDS);
        }
    }
}