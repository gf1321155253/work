package com.mwgroup.block.service.msgsend;

import com.mwgroup.block.constant.BlockServiceConstant;
import com.mwgroup.block.exception.BlockErrorCode;
import com.mwgroup.block.exception.BlockException;
import com.mwgroup.block.model.common.MailVo;
import com.mwgroup.block.utils.VerifyParamUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * 发送邮件service
 *
 * @author pcmd
 * @create 2019-11-23 23:53
 */
@Service
public class SendMailService  extends AbstractSendMsgService{

    /**发送邮件服务器*/
    @Value("${mail.from}")
    private  String FROM_MAIL ;

    @Autowired
    private JavaMailSender javaMailSender;


    @Override
    public Integer sendType() {
        return BlockServiceConstant.LOGIN_TYPE_EMAIL;
    }


    @Override
    public boolean verifyAccount(String account) {

        if(!VerifyParamUtils.isEmail(account)){
            throw new BlockException(BlockErrorCode.ACCOUNT_TYPE_ERROR);
        }
        return true;
    }


    @Override
    public void sendMessage(MailVo mailVo) {
        sendSimpleMail(mailVo);
    }

    /**
     * 发送简单邮件
     * @param mailVo
     */
    public void sendSimpleMail(MailVo mailVo){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("pcmd@casualzao.com");
        message.setSubject(mailVo.getSubject());
        message.setTo(mailVo.getSendList().toArray(new String[0]));
        message.setText(mailVo.getText());

        javaMailSender.send(message);


    }

}
