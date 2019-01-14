package com.feng.theme.exceptionHandle.constant;

import com.feng.theme.exceptionHandle.ErrorEnumInterface;
import org.springframework.http.HttpStatus;

/**
 * @desc 用于存放系统中的常量
 */
public class CommonConstants {

    public enum ErrorEnum implements ErrorEnumInterface{
        UNKOWN_REASON(HttpStatus.BAD_REQUEST,"1001", "未知原因错误！"),
        ;

        ErrorEnum(HttpStatus status, String errorCode, String errorDesc) {
            this.status = status;
            this.errorCode = errorCode;
            this.errorDesc = errorDesc;
        }

        private HttpStatus status;//Http状态码

        private String errorCode;//异常码

        private String errorDesc;//异常描述

        @Override
        public HttpStatus getStatus() {
            return this.status;
        }

        @Override
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override
        public String getErrorDesc() {
            return this.errorDesc;
        }
    }
}
