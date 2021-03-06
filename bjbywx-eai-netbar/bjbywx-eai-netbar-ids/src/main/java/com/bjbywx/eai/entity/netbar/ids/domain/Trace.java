package com.bjbywx.eai.entity.netbar.ids.domain;

import java.util.Date;

public class Trace {
    private Long id;

    private String sessionId;

    private Date loginAt;

    private Date logoutAt;

    private Integer idType;

    private String idCode;

    private String idName;

    private String areaCode;

    private String serviceCode;

    private String serviceWanIp;

    private String serviceLanIp;

    private String serviceMac;

    private String hostName;

    private String ids;

    private Integer status;

    private String reserve1;

    private String serverIp;

    private Integer reserve2;

    private Integer scanTag;

    private Integer createAccountFlag;

    private String nation;

    private Integer source;

    private String updateZipVersion;

    private String clientVersion;

    private String userNo;

    private Integer dataTag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
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

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
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

    public String getServiceLanIp() {
        return serviceLanIp;
    }

    public void setServiceLanIp(String serviceLanIp) {
        this.serviceLanIp = serviceLanIp == null ? null : serviceLanIp.trim();
    }

    public String getServiceMac() {
        return serviceMac;
    }

    public void setServiceMac(String serviceMac) {
        this.serviceMac = serviceMac == null ? null : serviceMac.trim();
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName == null ? null : hostName.trim();
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids == null ? null : ids.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    public Integer getReserve2() {
        return reserve2;
    }

    public void setReserve2(Integer reserve2) {
        this.reserve2 = reserve2;
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

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public String getUpdateZipVersion() {
        return updateZipVersion;
    }

    public void setUpdateZipVersion(String updateZipVersion) {
        this.updateZipVersion = updateZipVersion == null ? null : updateZipVersion.trim();
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion == null ? null : clientVersion.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public Integer getDataTag() {
        return dataTag;
    }

    public void setDataTag(Integer dataTag) {
        this.dataTag = dataTag;
    }
}