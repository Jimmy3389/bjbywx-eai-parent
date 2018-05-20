package com.bjbywx.eai.entity.netbar.bmc.domain;

import java.util.Date;

public class NetbarOnline {
    private Long id;

    private String serviceCode;

    private String policeCode;

    private String areaCode;

    private Integer isStop;

    private Integer serviceIsOnline;

    private Integer isOnline;

    private Date startDate;

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

    public String getPoliceCode() {
        return policeCode;
    }

    public void setPoliceCode(String policeCode) {
        this.policeCode = policeCode == null ? null : policeCode.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public Integer getIsStop() {
        return isStop;
    }

    public void setIsStop(Integer isStop) {
        this.isStop = isStop;
    }

    public Integer getServiceIsOnline() {
        return serviceIsOnline;
    }

    public void setServiceIsOnline(Integer serviceIsOnline) {
        this.serviceIsOnline = serviceIsOnline;
    }

    public Integer getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}