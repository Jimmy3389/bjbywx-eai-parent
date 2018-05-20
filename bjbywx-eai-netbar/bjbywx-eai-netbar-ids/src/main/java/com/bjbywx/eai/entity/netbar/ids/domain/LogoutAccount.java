package com.bjbywx.eai.entity.netbar.ids.domain;

import java.util.Date;

public class LogoutAccount {
    private Long id;

    private Integer idType;

    private String idCode;

    private String idName;

    private String userNo;

    private String serviceCode;

    private String serviceWanIp;

    private Date loginAt;

    private Date logoutAt;

    private Date netbarLoginAt;

    private Date netbarLogoutAt;

    private Integer scanTag;

    private Integer createAccountFlag;

    private String nation;

    private String recordOrder;

    private Long consumeMoney;

    private Long timeSpace;

    private String ids;

    private Integer sendStatus;

    private String sessionId;

    private Integer source;

    private Integer status;

    private String areaCode;

    private String reserve1;

    private String reserve2;

    private Integer dataTag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode == null ? null : idCode.trim();
    }

    public String getIdName() {
        return idName;
    }

    public void setIdName(String idName) {
        this.idName = idName == null ? null : idName.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public String getServiceWanIp() {
        return serviceWanIp;
    }

    public void setServiceWanIp(String serviceWanIp) {
        this.serviceWanIp = serviceWanIp == null ? null : serviceWanIp.trim();
    }

    public Date getLoginAt() {
        return loginAt;
    }

    public void setLoginAt(Date loginAt) {
        this.loginAt = loginAt;
    }

    public Date getLogoutAt() {
        return logoutAt;
    }

    public void setLogoutAt(Date logoutAt) {
        this.logoutAt = logoutAt;
    }

    public Date getNetbarLoginAt() {
        return netbarLoginAt;
    }

    public void setNetbarLoginAt(Date netbarLoginAt) {
        this.netbarLoginAt = netbarLoginAt;
    }

    public Date getNetbarLogoutAt() {
        return netbarLogoutAt;
    }

    public void setNetbarLogoutAt(Date netbarLogoutAt) {
        this.netbarLogoutAt = netbarLogoutAt;
    }

    public Integer getScanTag() {
        return scanTag;
    }

    public void setScanTag(Integer scanTag) {
        this.scanTag = scanTag;
    }

    public Integer getCreateAccountFlag() {
        return createAccountFlag;
    }

    public void setCreateAccountFlag(Integer createAccountFlag) {
        this.createAccountFlag = createAccountFlag;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getRecordOrder() {
        return recordOrder;
    }

    public void setRecordOrder(String recordOrder) {
        this.recordOrder = recordOrder == null ? null : recordOrder.trim();
    }

    public Long getConsumeMoney() {
        return consumeMoney;
    }

    public void setConsumeMoney(Long consumeMoney) {
        this.consumeMoney = consumeMoney;
    }

    public Long getTimeSpace() {
        return timeSpace;
    }

    public void setTimeSpace(Long timeSpace) {
        this.timeSpace = timeSpace;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids == null ? null : ids.trim();
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public Integer getDataTag() {
        return dataTag;
    }

    public void setDataTag(Integer dataTag) {
        this.dataTag = dataTag;
    }
}