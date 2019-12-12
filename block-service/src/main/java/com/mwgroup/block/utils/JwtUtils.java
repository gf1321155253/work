package com.mwgroup.block.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.mwgroup.block.entity.UserEntity;
import springfox.documentation.service.ApiListing;

import javax.swing.*;

/**
 * 描述:
 * jwt 工具类
 *
 * @author pcmd
 * @create 2019-11-21 01:30
 */
public class JwtUtils {


    /**
     * 获取 用户登陆的token
     * @param uid 用户ID
     * @param password 用户密码
     * @return
     */
    public static String getToken(Long uid , String password){
        return JWT.create().withAudience(uid.toString())
                .sign(Algorithm.HMAC256(password));
    }
}
