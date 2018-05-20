package com.bjbywx.eai.entity.netbar.ids.domain;

import java.util.Date;

public class MobileUser {
    private Long id;

    private String mobile;

    private String idCode;

    private Integer idType;

    private String password;

    private String verify;

    private Integer status;

    private String key;

    private String idName;

    private Date regTm;

    private String regUserKey;

    private String idAddress;

    private String serviceCode;

    private Date limitDate;

    private Date incepttime;

    private Date endtime;

    private String disbindUserName;

    private String userName;

    private Date disbindTm;

    private Integer tag;

    private Integer okngstatus;

    private String okngusername;

    private Date okngtm;

    private String ngreason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode == null ? null : idCode.trim();
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify == null ? null : verify.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName == null ? null : idName.trim();
    }

    public Date getRegTm() {
        return regTm;
    }

    public void setRegTm(Date regTm) {
        this.regTm = regTm;
    }

    public String getRegUserKey() {
        return regUserKey;
    }

    public void setRegUserKey(String regUserKey) {
        this.regUserKey = regUserKey == null ? null : regUserKey.trim();
    }

    public String getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(String idAddress) {
        this.idAddress = idAddress == null ? null : idAddress.trim();
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public Date getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(Date limitDate) {
        this.limitDate = limitDate;
    }

    public Date getIncepttime() {
        return incepttime;
    }

    public void setIncepttime(Date incepttime) {
        this.incepttime = incepttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getDisbindUserName() {
        return disbindUserName;
    }

    public void setDisbindUserName(String disbindUserName) {
        this.disbindUserName = disbindUserName == null ? null : disbindUserName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getDisbindTm() {
        return disbindTm;
    }

    public void setDisbindTm(Date disbindTm) {
        this.disbindTm = disbindTm;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public Integer getOkngstatus() {
        return okngstatus;
    }

    public void setOkngstatus(Integer okngstatus) {
        this.okngstatus = okngstatus;
    }

    public String getOkngusername() {
        return okngusername;
    }

    public void setOkngusername(String okngusername) {
        this.okngusername = okngusername == null ? null : okngusername.trim();
    }

    public Date getOkngtm() {
        return okngtm;
    }

    public void setOkngtm(Date okngtm) {
        this.okngtm = okngtm;
    }

    public String getNgreason() {
        return ngreason;
    }

    public void setNgreason(String ngreason) {
        this.ngreason = ngreason == null ? null : ngreason.trim();
    }
}