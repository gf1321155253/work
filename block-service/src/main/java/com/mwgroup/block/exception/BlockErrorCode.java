package com.mwgroup.block.exception;

import lombok.Data;
import lombok.Getter;

/**
 * 描述:
 *
 * @author pcmd
 * @create 2019-11-18 23:38
 */
@Getter
public enum BlockErrorCode {


    /**
     * 错误码规范
     * xxx xx xxx
     * xxx 服务
     * xx
     */

    /**
     * 处理成功
     */
    SUCCESS("0", "处理成功"),
    /**
     * 处理失败，非业务异常
     */
    ERROR("999999", "处理失败"),
    PARAM_IS_BLANK("100001", "入参为空"),

    LIST_IS_BLANK("100002", "List 为空"),

    LIST_IS_OVER_LIMIT("100003", "List超过限制"),


    USER_PASSWORD_ERROR("110001", "用户名或密码不正确"),

    USER_NOT_EXIST("110002", "用户不存在"),

    USER_NOT_LOGIN("110004", "请登录"),

    IDENTIFY_CODE_EXPIRE("110005", "验证码错误"),

    MODIFY_PASSWORD_ERROR("110005", "修改密码失败"),


    LOGTIN_TYPE_NOT_EXIST("110006", "登陆类型不存在"),

    ACCOUNT_TYPE_ERROR("110007", "账号格式不正确"),

    CODE_SEND_TO_FAST("110008", "验证码发送过于频繁，请稍后重试"),
    ;


    /**
     * 错误码
     */
    private String errorCode;
    /**
     * 错误信息
     */
    private String errorMSg;


    BlockErrorCode(String errorCode, String errorMSg) {
        this.errorCode = errorCode;
        this.errorMSg = errorMSg;
    }
}
