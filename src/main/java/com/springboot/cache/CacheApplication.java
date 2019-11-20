package com.springboot.cache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
*
* 用来演示springboot缓存
* @param
* @author qiaoyn
*/

@SpringBootApplication
@EnableCaching  //开启缓存注解
public class CacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheApplication.class, args);
    }

}
