package com.feng.theme.exceptionHandle;

import org.springframework.http.HttpStatus;

public interface ErrorEnumInterface {

    HttpStatus getStatus();

    String getErrorCode();

    String getErrorDesc();
}
