package com.mwgroup.block.model.request;

import com.mwgroup.block.common.request.BaseRequest;
import com.mwgroup.block.common.response.BaseResponse;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述:
 * 发送验证码对象
 *
 * @author pcmd
 * @create 2019-11-24 17:33
 */
@Data
@ApiModel
public class SendVerifyCodeRequest extends BaseRequest implements Serializable {
    private static final long serialVersionUID = -1779393376870529864L;

    /**用户账号*/
    private String account;
    /**y登陆类型*/
    private Integer LoginType;


}
