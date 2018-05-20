package com.bjbywx.eai.entity.netbar.bmc.domain;

public class PoliceStation {
    private Integer id;

    private String areaCode;

    private String policeCode;

    private String policeName;

    private String remark;

    private String policeArea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getPoliceCode() {
        return policeCode;
    }

    public void setPoliceCode(String policeCode) {
        this.policeCode = policeCode == null ? null : policeCode.trim();
    }

    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName == null ? null : policeName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPoliceArea() {
        return policeArea;
    }

    public void setPoliceArea(String policeArea) {
        this.policeArea = policeArea == null ? null : policeArea.trim();
    }
}