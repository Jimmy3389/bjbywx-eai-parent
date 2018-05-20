package com.bjbywx.eai.entity.netbar.ids.domain;

public class LibsCcic {
    private Integer id;

    private String idCard;

    private String name;

    private Long createTm;

    private String memo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getCreateTm() {
        return createTm;
    }

    public void setCreateTm(Long createTm) {
        this.createTm = createTm;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}