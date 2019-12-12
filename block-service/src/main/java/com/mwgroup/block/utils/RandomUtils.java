package com.mwgroup.block.utils;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 描述:
 * 随机工具类
 *
 * @author pcmd
 * @create 2019-11-24 10:34
 */
public class RandomUtils {


    /**
     * 获取随机验证码
     * 生成 300000L～ 7000000L 之间的随机验证码
     * @return
     */
    public static Long getVerifyCode(){
        return ThreadLocalRandom.current().nextLong(300000L,700000L);
    }

}
