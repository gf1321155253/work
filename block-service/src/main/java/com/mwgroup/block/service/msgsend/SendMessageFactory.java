package com.mwgroup.block.service.msgsend;

import com.mwgroup.block.exception.BlockErrorCode;
import com.mwgroup.block.exception.BlockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * 发送消息简单工厂
 *
 * @author pcmd
 * @create 2019-11-24 11:00
 */

@Service
public class SendMessageFactory {

    @Autowired
    private SendMailService sendMailService;
    @Autowired
    private SendSmsService sendSmsService;
    @Autowired
    private List<AbstractSendMsgService> sendMsgServiceList;

    public volatile Map<Integer,AbstractSendMsgService> sendMsgServiceMap = null;




    public <T extends AbstractSendMsgService> T get (Integer LoginType){

        dclpInitMap();

        AbstractSendMsgService sendMsgService = sendMsgServiceMap.get(LoginType);

        if(null == sendMsgService){
            throw new BlockException(BlockErrorCode.LOGTIN_TYPE_NOT_EXIST);
        }
        return (T) sendMsgService;

    }




    private void dclpInitMap(){

        if(null == sendMsgServiceMap){
           synchronized (this){
               if(null == sendMsgServiceMap){
                   if(CollectionUtils.isEmpty(sendMsgServiceMap)){
                       sendMsgServiceMap = new HashMap<>(sendMsgServiceList.size());
                       sendMsgServiceList.forEach(item -> sendMsgServiceMap.put(item.sendType(), item));

                   }
               }
           }

        }
    }



//    public void setSendMsgServiceList(List<AbstractSendMsgService> sendMsgServiceList) {
//        sendMsgServiceList.add(sendMailService);
//        sendMsgServiceList.add(sendSmsService);
//        this.sendMsgServiceList = sendMsgServiceList;
//    }
}
