package com.bjbywx.eai.entity.netbar.bmc.domain;

import java.util.Date;

public class NetbarServerInfo {
    private Long id;

    private Date startAt;

    private Date endAt;

    private String serviceCode;

    private String serviceWanIp;

    private String serviceMac;

    private Integer count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
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

    public String getServiceMac() {
        return serviceMac;
    }

    public void setServiceMac(String serviceMac) {
        this.serviceMac = serviceMac == null ? null : serviceMac.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}