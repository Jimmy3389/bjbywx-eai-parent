package com.bjbywx.eai.entity.netbar.ids.domain;

import java.util.Date;

public class UdpUrl {
    private String sessionId;

    private Integer typeSequence;

    private Integer totalSequence;

    private Date updateAt;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public Integer getTypeSequence() {
        return typeSequence;
    }

    public void setTypeSequence(Integer typeSequence) {
        this.typeSequence = typeSequence;
    }

    public Integer getTotalSequence() {
        return totalSequence;
    }

    public void setTotalSequence(Integer totalSequence) {
        this.totalSequence = totalSequence;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}