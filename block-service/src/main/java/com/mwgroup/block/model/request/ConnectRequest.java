package com.mwgroup.block.model.request;

import com.mwgroup.block.common.request.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 描述:
 *
 * @author jinb.z
 * @create 2019-11-25 00:22
 */
@Data
@ApiModel
public class ConnectRequest extends BaseRequest implements Serializable {

    private static final long serialVersionUID = 242723319393884417L;
    /**手机*/
    private String mobile;
    /**邮箱*/
    private String email;
    /**内容*/
    private String desc;
}

