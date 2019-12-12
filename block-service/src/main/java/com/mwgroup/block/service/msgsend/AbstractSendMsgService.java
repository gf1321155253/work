package com.mwgroup.block.service.msgsend;

import com.google.common.base.Joiner;
import com.mwgroup.block.cache.CacheClient;
import com.mwgroup.block.model.common.MailVo;
import com.mwgroup.block.model.request.SendVerifyCodeRequest;
import com.mwgroup.block.utils.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * 描述:
 * 发送消息抽象类
 *
 * @author pcmd
 * @create 2019-11-24 11:01
 */
@Component
public abstract class AbstractSendMsgService {

    private static final Integer EXPIRE_TIME = 600;

    private static final String CODE_KEY = "code";
    private static final Joiner JOINER = Joiner.on(':') ;

    @Autowired
    private CacheClient cacheClient;

    private String buildCacheKey(String account){
        return JOINER.join(CODE_KEY,account);
    }

    public  void sendCode(SendVerifyCodeRequest request){
        // 校验账号是否正确
        verifyAccount(request.getAccount());

        MailVo  mailVo = new MailVo();

        String verifyCode = RandomUtils.getVerifyCode().toString();

        mailVo.setText(verifyCode);
        mailVo.setSendList(Collections.singletonList(request.getAccount()));
        mailVo.setSubject("验证码");

        //发送邮件
        sendMessage(mailVo);

        //写入缓存
        cacheClient.set(buildCacheKey(request.getAccount()),verifyCode,EXPIRE_TIME);


    }




    /**
     * 获取发送类型
     * @return
     */
    public  abstract Integer sendType();

    /**
     * 校验账号是否正确
     * @param account 账号
     * @return
     */
    public abstract boolean verifyAccount(String account);


    /**
     * 发送消息
     * @param mailVo
     */
    @Async
    public abstract void sendMessage(MailVo mailVo);



}
