package com.benmu.erospluginwxpay.model;

/**
 * Created by Carry on 2017/9/26.
 */

public class WeChatPayResultModel {
    public int resCode;
    public int status;
    public String msg;

    public WeChatPayResultModel(int resCode, String msg) {
        this.resCode = resCode;
        this.msg = msg;
    }

    public WeChatPayResultModel() {
    }
}
