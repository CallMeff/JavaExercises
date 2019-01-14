package com.feng.theme.exceptionHandle;

import com.feng.theme.exceptionHandle.constant.CommonConstants;

public class Client {

    public static void main(String[] args) {
        try {
            //手动抛出一个逻辑异常
            throw new BusinessException(CommonConstants.ErrorEnum.UNKOWN_REASON);
        }catch (BusinessException bx){
            System.out.println(bx.getErrorDesc());
        }
    }
}
