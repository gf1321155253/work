package com.mwgroup.block.utils;

import com.mwgroup.block.exception.BlockErrorCode;
import com.mwgroup.block.exception.BlockException;
import org.springframework.data.repository.query.parser.PartTree;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 描述:
 * 参数校验工具类
 *
 * @author pcmd
 * @create 2019-11-21 01:21
 */
public class VerifyParamUtils {

    /**手机号验证 正则*/
    private static final Pattern MOBILE_REGEX = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(17[0-9])|(18[0,5-9]))\\d{8}$");

    /**邮箱验证正则*/
    private static final Pattern EMAIL_REGEX = Pattern.compile("^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$" );
    public static VerifyParamUtils newCheck(){
        return new VerifyParamUtils();
    }


    /**
     * 校验入参是否为空
     * @param args
     * @return
     */
    public VerifyParamUtils check(Object... args){

        for (Object arg : args) {
            if(null == arg){
                throw new BlockException(BlockErrorCode.PARAM_IS_BLANK);
            }
        }
        return this;
    }

    /**
     * 校验List 是否为空为空，是否超过限制
     * @param collection list
     * @param maxSize 最大长度
     * @return
     */
    public VerifyParamUtils check(Collection<?> collection,int maxSize ){
        if(CollectionUtils.isEmpty(collection)){
            throw new BlockException(BlockErrorCode.LIST_IS_BLANK);
        }

        if(collection.size() > maxSize){
            throw new BlockException(BlockErrorCode.LIST_IS_OVER_LIMIT);
        }

        return this;
    }


    /**
     * 验证手机号是否正确
     * @param mobiles
     * @return
     */
    public static boolean isMobileNO(  String mobiles){
        boolean flag = false;
        try{
            Matcher m = MOBILE_REGEX .matcher(mobiles);
            flag = m.matches();
        }catch(Exception e){
            flag = false;
        }
        return flag;
    }


    /**
     * 校验邮箱是否正确
     * @param email
     * @return
     */
    public static boolean isEmail(String email){
        Matcher matcher = EMAIL_REGEX.matcher(email);

        return matcher.matches();
    }
}
