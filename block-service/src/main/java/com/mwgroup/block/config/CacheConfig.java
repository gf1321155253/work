package com.mwgroup.block.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.cache.integration.CacheLoader;
import java.util.concurrent.TimeUnit;

/**
 * 描述:
 * 缓存配置类
 *
 * @author jinb.z
 * @create 2019-11-25 12:33
 */
@Configuration
public class CacheConfig {



    @Bean(name = "caffeine")
    public CacheManager cacheManagerWithCaffeine(){

        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        Caffeine caffeine = Caffeine.newBuilder()
                .initialCapacity(1000)
                .maximumSize(100000)
                .expireAfterAccess(1, TimeUnit.DAYS);
        cacheManager.setCaffeine(caffeine);
        return cacheManager;
    }
}
