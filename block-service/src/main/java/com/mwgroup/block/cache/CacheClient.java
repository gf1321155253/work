package com.mwgroup.block.cache;

import com.google.common.base.Joiner;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RBucket;
import org.redisson.api.RBuckets;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 描述:
 * 缓存service
 *
 * @author pcmd
 * @create 2019-11-24 00:56
 */
@Slf4j
@Service
public class CacheClient {


    private static final String CODE_KEY = "code";
    private static final Joiner JOINER = Joiner.on(':') ;

    @Autowired
    private RedissonClient redissonClient;
    /**
     * redisson 封装set
     *
     * @param key        key
     * @param value      值
     * @param expireTime 过期时间 unit second
     */
    public void set(String key, String value, Integer expireTime) {
        try {
            RBucket<Object> bucket = redissonClient.getBucket(key);
            bucket.set(value, expireTime, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.error("redis 连接异常", e);
        }
    }


    /**
     * 获取get 值
     *
     * @param key key
     * @return
     */
    public Object get(String key) {
        try {
            RBucket<Object> bucket = redissonClient.getBucket(key);
            return bucket.get();
        } catch (Exception e) {
            log.error("redis 连接异常", e);
        }
        return null;
    }


    /**
     * 批量获取 缓存
     *
     * @param keys redis keys
     * @return Map<Key, value> cacheResultMap
     */
    public Map<String, Object> mget(String... keys) {
        try {
            RBuckets buckets = redissonClient.getBuckets();
            return buckets.get(keys);
        } catch (Exception e) {
            log.error("redis 连接异常", e);
        }
        return null;

    }


}
