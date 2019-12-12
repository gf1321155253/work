package com.mwgroup.block.service.msgsend;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import com.mwgroup.block.constant.BlockServiceConstant;
import com.mwgroup.block.exception.BlockErrorCode;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.model.common.MailVo;
import com.mwgroup.block.utils.VerifyParamUtils;
import jodd.util.ArraysUtil;
import org.json.JSONException;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 描述:
 * 发送短信service
 *
 * @author pcmd
 * @create 2019-11-24 10:56
 */
@Service
public class SendSmsService extends AbstractSendMsgService {


    /** 短信应用 SDK AppID*/
    private static final int APPID = 1400009099;
     /**短信应用 SDK AppKey */
    private static final String APPKEY = "9ff91d87c2cd7cd0ea762f141975d1df37481d48700d70ac37470aefc60f9bad";
    /** 短信模板 ID，需要在短信应用中申请*/
    private static final int TEMPLATE_ID = 7839;
    /** 签名 */
    private static final String SMS_SIGN = "腾讯云";

    @Override
    public Integer sendType() {
        return BlockServiceConstant.LOGIN_TYPE_MOBILE;
    }


    @Override
    public boolean verifyAccount(String account) {

        if (!VerifyParamUtils.isMobileNO(account)) {
            throw new BlockException(BlockErrorCode.ACCOUNT_TYPE_ERROR);
        }
        return true;
    }


    @Override
    public void sendMessage(MailVo mailVo) {
        try {


            SmsSingleSender ssender = new SmsSingleSender(APPID, APPKEY);
            SmsSingleSenderResult result = ssender.sendWithParam("86", mailVo.getSendList().get(0),
                    TEMPLATE_ID, new String[]{mailVo.getText()}, SMS_SIGN, "", "");
            System.out.println(result);
        } catch (HTTPException e) {
            // HTTP 响应码错误
            e.printStackTrace();
        } catch (JSONException e) {
            // JSON 解析错误
            e.printStackTrace();
        } catch (IOException e) {
            // 网络 IO 错误
            e.printStackTrace();
        }


    }
}
