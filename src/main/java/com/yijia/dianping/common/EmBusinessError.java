package com.yijia.dianping.common;

public enum EmBusinessError {
    // General Error
    NO_OBJECT_FOUND(10001,"Request Object Does Not Exists"),
    UNKNOWN_ERROR(10002,"Unknown Error"),
    NO_HANDLER_FOUND(10003,"Cannot Find Path"),
    BIND_EXCEPTION_ERROR(10004,"Request parameter error"),
    PARAMETER_VALIDATION_ERROR(10005,"Request parameter verification failed"),

    // User Serivce Related Error 20000
    REGISTER_DUP_FAIL(20001, "User exists"),
    LOGIN_FAIL(20002, "Phone number does not exist or password is not correct"),

    // Admin related error
    ADMIN_SHOULD_LOGIN(30001, "Admin should log in first"),;


    private Integer errCode;
    private String errMsg;

    EmBusinessError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
