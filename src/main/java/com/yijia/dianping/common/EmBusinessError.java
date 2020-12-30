package com.yijia.dianping.common;

public enum EmBusinessError {
    //
    NO_OBJECT_FOUND(10001,"Request Object Does Not Exists"),
    UNKNOWN_ERROR(10002,"Unknown Error"),
    NO_HANDLER_FOUND(10003,"Cannot Find Path"),
    BIND_EXCEPTION_ERROR(10004,"Request parameter error"),
    PARAMETER_VALIDATION_ERROR(10005,"Request parameter verification failed"),;

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
