package com.mwgroup.block.model.request;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述:
 * 用户信息 request
 *
 * @author pcmd
 * @create 2019-11-21 23:44
 */
@Data
@ApiModel
public class UserInfoRequest implements Serializable {
    private static final long serialVersionUID = -3641908535481652012L;
    /**用户id*/
    private Long uid;

}
