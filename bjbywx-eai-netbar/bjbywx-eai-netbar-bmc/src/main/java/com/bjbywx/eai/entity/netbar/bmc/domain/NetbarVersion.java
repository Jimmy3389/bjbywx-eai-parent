package com.bjbywx.eai.entity.netbar.bmc.domain;

import java.util.Date;

public class NetbarVersion {
    private Long id;

    private String serviceCode;

    private Integer type;

    private Integer versionId;

    private String serverId;

    private Integer versionTm;

    private String version;

    private Date logTm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId == null ? null : serverId.trim();
    }

    public Integer getVersionTm() {
        return versionTm;
    }

    public void setVersionTm(Integer versionTm) {
        this.versionTm = versionTm;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Date getLogTm() {
        return logTm;
    }

    public void setLogTm(Date logTm) {
        this.logTm = logTm;
    }
}