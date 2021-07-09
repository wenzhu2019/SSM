package com.ssm.mybatis.bean;

public class User {
    private Integer id;
    private String userName;
    private  String sex;
    private Integer age;
    private String addrs;
    private  String passWord;
    private String acct;
    private String tel;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User(Integer id, String userName, String sex, Integer age, String addrs, String passWord, String acct, String tel) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.age = age;
        this.addrs = addrs;
        this.passWord = passWord;
        this.acct = acct;
        this.tel = tel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", addrs='" + addrs + '\'' +
                ", passWord='" + passWord + '\'' +
                ", acct='" + acct + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
