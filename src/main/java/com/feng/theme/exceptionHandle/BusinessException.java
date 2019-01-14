package com.feng.theme.exceptionHandle;

import org.springframework.http.HttpStatus;

public class BusinessException extends RuntimeException{

    private ErrorEnumInterface error;

    private HttpStatus status;//Http状态码

    private String errorCode;//异常码

    private String errorDesc;//异常描述

    /**
     * 业务层自定义返回消息时使用
     *
     * @param errorCode
     * @param errorDesc
     */
    public BusinessException(HttpStatus status, String errorCode, String errorDesc) {
        this.status = status;
        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
    }

    /**
     * 通用异常时使用
     *
     * @param error
     */
    public BusinessException(ErrorEnumInterface error) {
        this.error = error;
        this.status = error.getStatus();
        this.errorCode = error.getErrorCode();
        this.errorDesc = error.getErrorDesc();
    }

    public ErrorEnumInterface getError() {
        return error;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }
}
