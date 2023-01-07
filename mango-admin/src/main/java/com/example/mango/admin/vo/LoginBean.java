package com.example.mango.admin.vo;

/**
 * 登录接口封装对象
 * @author genleel
 */
public class LoginBean {
    private String account;
    private String password;
    private String captcha;

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
