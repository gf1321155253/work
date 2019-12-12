package com.mwgroup.block.model.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 描述:
 * 邮件vo
 *
 * @author pcmd
 * @create 2019-11-23 23:55
 */
@Data
public class MailVo implements Serializable {

    private static final long serialVersionUID = 5342311866966011811L;

    /**需要发送邮件List*/
    private List<String> sendList;
    /**主题*/
    private String subject;
    /**发送内容*/
    private String text;

}

