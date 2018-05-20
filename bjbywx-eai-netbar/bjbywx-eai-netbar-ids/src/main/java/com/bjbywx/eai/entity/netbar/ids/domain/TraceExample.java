package com.bjbywx.eai.entity.netbar.ids.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("SESSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("SESSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("SESSION_ID =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("SESSION_ID <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("SESSION_ID >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("SESSION_ID >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("SESSION_ID <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("SESSION_ID <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("SESSION_ID like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("SESSION_ID not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("SESSION_ID in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("SESSION_ID not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("SESSION_ID between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("SESSION_ID not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andLoginAtIsNull() {
            addCriterion("LOGIN_AT is null");
            return (Criteria) this;
        }

        public Criteria andLoginAtIsNotNull() {
            addCriterion("LOGIN_AT is not null");
            return (Criteria) this;
        }

        public Criteria andLoginAtEqualTo(Date value) {
            addCriterion("LOGIN_AT =", value, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtNotEqualTo(Date value) {
            addCriterion("LOGIN_AT <>", value, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtGreaterThan(Date value) {
            addCriterion("LOGIN_AT >", value, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGIN_AT >=", value, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtLessThan(Date value) {
            addCriterion("LOGIN_AT <", value, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtLessThanOrEqualTo(Date value) {
            addCriterion("LOGIN_AT <=", value, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtIn(List<Date> values) {
            addCriterion("LOGIN_AT in", values, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtNotIn(List<Date> values) {
            addCriterion("LOGIN_AT not in", values, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtBetween(Date value1, Date value2) {
            addCriterion("LOGIN_AT between", value1, value2, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLoginAtNotBetween(Date value1, Date value2) {
            addCriterion("LOGIN_AT not between", value1, value2, "loginAt");
            return (Criteria) this;
        }

        public Criteria andLogoutAtIsNull() {
            addCriterion("LOGOUT_AT is null");
            return (Criteria) this;
        }

        public Criteria andLogoutAtIsNotNull() {
            addCriterion("LOGOUT_AT is not null");
            return (Criteria) this;
        }

        public Criteria andLogoutAtEqualTo(Date value) {
            addCriterion("LOGOUT_AT =", value, "logoutAt");
            return (Criteria) this;
        }

        public Criteria andLogoutAtNotEqualTo(Date value) {
            addCriterion("LOGOUT_AT <>", value, "logoutAt");
            return (Criteria) this;
        }

        public Criteria andLogoutAtGreaterThan(Date value) {
            addCriterion("LOGOUT_AT >", value, "logoutAt");
            return (Criteria) this;
        }

        public Criteria andLogoutAtGreaterThanOrEqualTo(Date value) {
            addCriterion("LOGOUT_AT >=", value, "logoutAt");
            return (Criteria) this;
        }

        public Criteria andLogoutAtLessThan(Date value) {
            addCriterion("LOGOUT_AT <", value, "logoutAt");
            return (Criteria) this;
        }

        public Criteria andLogoutAtLessThanOrEqualTo(Date value) {
            addCriterion("LOGOUT_AT <=", value, "logoutAt");
            return (Criteria) this;
        }

        public Criteria andLogoutAtIn(List<Date> values) {
            addCriterion("LOGOUT_AT in", values, "logoutAt");
            return (Criteria) this;
        }

        public Criteria andLogoutAtNotIn(List<Date> values) {
            addCriterion("LOGOUT_AT not in", values, "logoutAt");
            return (Criteria) this;
        }

        public Criteria andLogoutAtBetween(Date value1, Date value2) {
            addCriterion("LOGOUT_AT between", value1, value2, "logoutAt");
            return (Criteria) this;
        }

        public Criteria andLogoutAtNotBetween(Date value1, Date value2) {
            addCriterion("LOGOUT_AT not between", value1, value2, "logoutAt");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("ID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("ID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(Integer value) {
            addCriterion("ID_TYPE =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(Integer value) {
            addCriterion("ID_TYPE <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(Integer value) {
            addCriterion("ID_TYPE >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_TYPE >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(Integer value) {
            addCriterion("ID_TYPE <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ID_TYPE <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<Integer> values) {
            addCriterion("ID_TYPE in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<Integer> values) {
            addCriterion("ID_TYPE not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(Integer value1, Integer value2) {
            addCriterion("ID_TYPE between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_TYPE not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdCodeIsNull() {
            addCriterion("ID_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIdCodeIsNotNull() {
            addCriterion("ID_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIdCodeEqualTo(String value) {
            addCriterion("ID_CODE =", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotEqualTo(String value) {
            addCriterion("ID_CODE <>", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeGreaterThan(String value) {
            addCriterion("ID_CODE >", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CODE >=", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLessThan(String value) {
            addCriterion("ID_CODE <", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLessThanOrEqualTo(String value) {
            addCriterion("ID_CODE <=", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeLike(String value) {
            addCriterion("ID_CODE like", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotLike(String value) {
            addCriterion("ID_CODE not like", value, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeIn(List<String> values) {
            addCriterion("ID_CODE in", values, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotIn(List<String> values) {
            addCriterion("ID_CODE not in", values, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeBetween(String value1, String value2) {
            addCriterion("ID_CODE between", value1, value2, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdCodeNotBetween(String value1, String value2) {
            addCriterion("ID_CODE not between", value1, value2, "idCode");
            return (Criteria) this;
        }

        public Criteria andIdNameIsNull() {
            addCriterion("ID_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIdNameIsNotNull() {
            addCriterion("ID_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIdNameEqualTo(String value) {
            addCriterion("ID_NAME =", value, "idName");
            return (Criteria) this;
        }

        public Criteria andIdNameNotEqualTo(String value) {
            addCriterion("ID_NAME <>", value, "idName");
            return (Criteria) this;
        }

        public Criteria andIdNameGreaterThan(String value) {
            addCriterion("ID_NAME >", value, "idName");
            return (Criteria) this;
        }

        public Criteria andIdNameGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NAME >=", value, "idName");
            return (Criteria) this;
        }

        public Criteria andIdNameLessThan(String value) {
            addCriterion("ID_NAME <", value, "idName");
            return (Criteria) this;
        }

        public Criteria andIdNameLessThanOrEqualTo(String value) {
            addCriterion("ID_NAME <=", value, "idName");
            return (Criteria) this;
        }

        public Criteria andIdNameLike(String value) {
            addCriterion("ID_NAME like", value, "idName");
            return (Criteria) this;
        }

        public Criteria andIdNameNotLike(String value) {
            addCriterion("ID_NAME not like", value, "idName");
            return (Criteria) this;
        }

        public Criteria andIdNameIn(List<String> values) {
            addCriterion("ID_NAME in", values, "idName");
            return (Criteria) this;
        }

        public Criteria andIdNameNotIn(List<String> values) {
            addCriterion("ID_NAME not in", values, "idName");
            return (Criteria) this;
        }

        public Criteria andIdNameBetween(String value1, String value2) {
            addCriterion("ID_NAME between", value1, value2, "idName");
            return (Criteria) this;
        }

        public Criteria andIdNameNotBetween(String value1, String value2) {
            addCriterion("ID_NAME not between", value1, value2, "idName");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNull() {
            addCriterion("SERVICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNotNull() {
            addCriterion("SERVICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeEqualTo(String value) {
            addCriterion("SERVICE_CODE =", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotEqualTo(String value) {
            addCriterion("SERVICE_CODE <>", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThan(String value) {
            addCriterion("SERVICE_CODE >", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_CODE >=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThan(String value) {
            addCriterion("SERVICE_CODE <", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_CODE <=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLike(String value) {
            addCriterion("SERVICE_CODE like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotLike(String value) {
            addCriterion("SERVICE_CODE not like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIn(List<String> values) {
            addCriterion("SERVICE_CODE in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotIn(List<String> values) {
            addCriterion("SERVICE_CODE not in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeBetween(String value1, String value2) {
            addCriterion("SERVICE_CODE between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotBetween(String value1, String value2) {
            addCriterion("SERVICE_CODE not between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpIsNull() {
            addCriterion("SERVICE_WAN_IP is null");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpIsNotNull() {
            addCriterion("SERVICE_WAN_IP is not null");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpEqualTo(String value) {
            addCriterion("SERVICE_WAN_IP =", value, "serviceWanIp");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpNotEqualTo(String value) {
            addCriterion("SERVICE_WAN_IP <>", value, "serviceWanIp");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpGreaterThan(String value) {
            addCriterion("SERVICE_WAN_IP >", value, "serviceWanIp");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_WAN_IP >=", value, "serviceWanIp");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpLessThan(String value) {
            addCriterion("SERVICE_WAN_IP <", value, "serviceWanIp");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_WAN_IP <=", value, "serviceWanIp");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpLike(String value) {
            addCriterion("SERVICE_WAN_IP like", value, "serviceWanIp");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpNotLike(String value) {
            addCriterion("SERVICE_WAN_IP not like", value, "serviceWanIp");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpIn(List<String> values) {
            addCriterion("SERVICE_WAN_IP in", values, "serviceWanIp");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpNotIn(List<String> values) {
            addCriterion("SERVICE_WAN_IP not in", values, "serviceWanIp");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpBetween(String value1, String value2) {
            addCriterion("SERVICE_WAN_IP between", value1, value2, "serviceWanIp");
            return (Criteria) this;
        }

        public Criteria andServiceWanIpNotBetween(String value1, String value2) {
            addCriterion("SERVICE_WAN_IP not between", value1, value2, "serviceWanIp");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpIsNull() {
            addCriterion("SERVICE_LAN_IP is null");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpIsNotNull() {
            addCriterion("SERVICE_LAN_IP is not null");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpEqualTo(String value) {
            addCriterion("SERVICE_LAN_IP =", value, "serviceLanIp");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpNotEqualTo(String value) {
            addCriterion("SERVICE_LAN_IP <>", value, "serviceLanIp");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpGreaterThan(String value) {
            addCriterion("SERVICE_LAN_IP >", value, "serviceLanIp");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_LAN_IP >=", value, "serviceLanIp");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpLessThan(String value) {
            addCriterion("SERVICE_LAN_IP <", value, "serviceLanIp");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_LAN_IP <=", value, "serviceLanIp");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpLike(String value) {
            addCriterion("SERVICE_LAN_IP like", value, "serviceLanIp");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpNotLike(String value) {
            addCriterion("SERVICE_LAN_IP not like", value, "serviceLanIp");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpIn(List<String> values) {
            addCriterion("SERVICE_LAN_IP in", values, "serviceLanIp");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpNotIn(List<String> values) {
            addCriterion("SERVICE_LAN_IP not in", values, "serviceLanIp");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpBetween(String value1, String value2) {
            addCriterion("SERVICE_LAN_IP between", value1, value2, "serviceLanIp");
            return (Criteria) this;
        }

        public Criteria andServiceLanIpNotBetween(String value1, String value2) {
            addCriterion("SERVICE_LAN_IP not between", value1, value2, "serviceLanIp");
            return (Criteria) this;
        }

        public Criteria andServiceMacIsNull() {
            addCriterion("SERVICE_MAC is null");
            return (Criteria) this;
        }

        public Criteria andServiceMacIsNotNull() {
            addCriterion("SERVICE_MAC is not null");
            return (Criteria) this;
        }

        public Criteria andServiceMacEqualTo(String value) {
            addCriterion("SERVICE_MAC =", value, "serviceMac");
            return (Criteria) this;
        }

        public Criteria andServiceMacNotEqualTo(String value) {
            addCriterion("SERVICE_MAC <>", value, "serviceMac");
            return (Criteria) this;
        }

        public Criteria andServiceMacGreaterThan(String value) {
            addCriterion("SERVICE_MAC >", value, "serviceMac");
            return (Criteria) this;
        }

        public Criteria andServiceMacGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_MAC >=", value, "serviceMac");
            return (Criteria) this;
        }

        public Criteria andServiceMacLessThan(String value) {
            addCriterion("SERVICE_MAC <", value, "serviceMac");
            return (Criteria) this;
        }

        public Criteria andServiceMacLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_MAC <=", value, "serviceMac");
            return (Criteria) this;
        }

        public Criteria andServiceMacLike(String value) {
            addCriterion("SERVICE_MAC like", value, "serviceMac");
            return (Criteria) this;
        }

        public Criteria andServiceMacNotLike(String value) {
            addCriterion("SERVICE_MAC not like", value, "serviceMac");
            return (Criteria) this;
        }

        public Criteria andServiceMacIn(List<String> values) {
            addCriterion("SERVICE_MAC in", values, "serviceMac");
            return (Criteria) this;
        }

        public Criteria andServiceMacNotIn(List<String> values) {
            addCriterion("SERVICE_MAC not in", values, "serviceMac");
            return (Criteria) this;
        }

        public Criteria andServiceMacBetween(String value1, String value2) {
            addCriterion("SERVICE_MAC between", value1, value2, "serviceMac");
            return (Criteria) this;
        }

        public Criteria andServiceMacNotBetween(String value1, String value2) {
            addCriterion("SERVICE_MAC not between", value1, value2, "serviceMac");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNull() {
            addCriterion("HOST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHostNameIsNotNull() {
            addCriterion("HOST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHostNameEqualTo(String value) {
            addCriterion("HOST_NAME =", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotEqualTo(String value) {
            addCriterion("HOST_NAME <>", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThan(String value) {
            addCriterion("HOST_NAME >", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOST_NAME >=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThan(String value) {
            addCriterion("HOST_NAME <", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLessThanOrEqualTo(String value) {
            addCriterion("HOST_NAME <=", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameLike(String value) {
            addCriterion("HOST_NAME like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotLike(String value) {
            addCriterion("HOST_NAME not like", value, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameIn(List<String> values) {
            addCriterion("HOST_NAME in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotIn(List<String> values) {
            addCriterion("HOST_NAME not in", values, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameBetween(String value1, String value2) {
            addCriterion("HOST_NAME between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andHostNameNotBetween(String value1, String value2) {
            addCriterion("HOST_NAME not between", value1, value2, "hostName");
            return (Criteria) this;
        }

        public Criteria andIdsIsNull() {
            addCriterion("IDS is null");
            return (Criteria) this;
        }

        public Criteria andIdsIsNotNull() {
            addCriterion("IDS is not null");
            return (Criteria) this;
        }

        public Criteria andIdsEqualTo(String value) {
            addCriterion("IDS =", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsNotEqualTo(String value) {
            addCriterion("IDS <>", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsGreaterThan(String value) {
            addCriterion("IDS >", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsGreaterThanOrEqualTo(String value) {
            addCriterion("IDS >=", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsLessThan(String value) {
            addCriterion("IDS <", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsLessThanOrEqualTo(String value) {
            addCriterion("IDS <=", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsLike(String value) {
            addCriterion("IDS like", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsNotLike(String value) {
            addCriterion("IDS not like", value, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsIn(List<String> values) {
            addCriterion("IDS in", values, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsNotIn(List<String> values) {
            addCriterion("IDS not in", values, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsBetween(String value1, String value2) {
            addCriterion("IDS between", value1, value2, "ids");
            return (Criteria) this;
        }

        public Criteria andIdsNotBetween(String value1, String value2) {
            addCriterion("IDS not between", value1, value2, "ids");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNull() {
            addCriterion("RESERVE1 is null");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNotNull() {
            addCriterion("RESERVE1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve1EqualTo(String value) {
            addCriterion("RESERVE1 =", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotEqualTo(String value) {
            addCriterion("RESERVE1 <>", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThan(String value) {
            addCriterion("RESERVE1 >", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThanOrEqualTo(String value) {
            addCriterion("RESERVE1 >=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThan(String value) {
            addCriterion("RESERVE1 <", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThanOrEqualTo(String value) {
            addCriterion("RESERVE1 <=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Like(String value) {
            addCriterion("RESERVE1 like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotLike(String value) {
            addCriterion("RESERVE1 not like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1In(List<String> values) {
            addCriterion("RESERVE1 in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotIn(List<String> values) {
            addCriterion("RESERVE1 not in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Between(String value1, String value2) {
            addCriterion("RESERVE1 between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotBetween(String value1, String value2) {
            addCriterion("RESERVE1 not between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNull() {
            addCriterion("SERVER_IP is null");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNotNull() {
            addCriterion("SERVER_IP is not null");
            return (Criteria) this;
        }

        public Criteria andServerIpEqualTo(String value) {
            addCriterion("SERVER_IP =", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotEqualTo(String value) {
            addCriterion("SERVER_IP <>", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThan(String value) {
            addCriterion("SERVER_IP >", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_IP >=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThan(String value) {
            addCriterion("SERVER_IP <", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThanOrEqualTo(String value) {
            addCriterion("SERVER_IP <=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLike(String value) {
            addCriterion("SERVER_IP like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotLike(String value) {
            addCriterion("SERVER_IP not like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpIn(List<String> values) {
            addCriterion("SERVER_IP in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotIn(List<String> values) {
            addCriterion("SERVER_IP not in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpBetween(String value1, String value2) {
            addCriterion("SERVER_IP between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotBetween(String value1, String value2) {
            addCriterion("SERVER_IP not between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNull() {
            addCriterion("RESERVE2 is null");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNotNull() {
            addCriterion("RESERVE2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve2EqualTo(Integer value) {
            addCriterion("RESERVE2 =", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotEqualTo(Integer value) {
            addCriterion("RESERVE2 <>", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThan(Integer value) {
            addCriterion("RESERVE2 >", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThanOrEqualTo(Integer value) {
            addCriterion("RESERVE2 >=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThan(Integer value) {
            addCriterion("RESERVE2 <", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThanOrEqualTo(Integer value) {
            addCriterion("RESERVE2 <=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2In(List<Integer> values) {
            addCriterion("RESERVE2 in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotIn(List<Integer> values) {
            addCriterion("RESERVE2 not in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Between(Integer value1, Integer value2) {
            addCriterion("RESERVE2 between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotBetween(Integer value1, Integer value2) {
            addCriterion("RESERVE2 not between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andScanTagIsNull() {
            addCriterion("SCAN_TAG is null");
            return (Criteria) this;
        }

        public Criteria andScanTagIsNotNull() {
            addCriterion("SCAN_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andScanTagEqualTo(Integer value) {
            addCriterion("SCAN_TAG =", value, "scanTag");
            return (Criteria) this;
        }

        public Criteria andScanTagNotEqualTo(Integer value) {
            addCriterion("SCAN_TAG <>", value, "scanTag");
            return (Criteria) this;
        }

        public Criteria andScanTagGreaterThan(Integer value) {
            addCriterion("SCAN_TAG >", value, "scanTag");
            return (Criteria) this;
        }

        public Criteria andScanTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCAN_TAG >=", value, "scanTag");
            return (Criteria) this;
        }

        public Criteria andScanTagLessThan(Integer value) {
            addCriterion("SCAN_TAG <", value, "scanTag");
            return (Criteria) this;
        }

        public Criteria andScanTagLessThanOrEqualTo(Integer value) {
            addCriterion("SCAN_TAG <=", value, "scanTag");
            return (Criteria) this;
        }

        public Criteria andScanTagIn(List<Integer> values) {
            addCriterion("SCAN_TAG in", values, "scanTag");
            return (Criteria) this;
        }

        public Criteria andScanTagNotIn(List<Integer> values) {
            addCriterion("SCAN_TAG not in", values, "scanTag");
            return (Criteria) this;
        }

        public Criteria andScanTagBetween(Integer value1, Integer value2) {
            addCriterion("SCAN_TAG between", value1, value2, "scanTag");
            return (Criteria) this;
        }

        public Criteria andScanTagNotBetween(Integer value1, Integer value2) {
            addCriterion("SCAN_TAG not between", value1, value2, "scanTag");
            return (Criteria) this;
        }

        public Criteria andCreateAccountFlagIsNull() {
            addCriterion("CREATE_ACCOUNT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCreateAccountFlagIsNotNull() {
            addCriterion("CREATE_ACCOUNT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAccountFlagEqualTo(Integer value) {
            addCriterion("CREATE_ACCOUNT_FLAG =", value, "createAccountFlag");
            return (Criteria) this;
        }

        public Criteria andCreateAccountFlagNotEqualTo(Integer value) {
            addCriterion("CREATE_ACCOUNT_FLAG <>", value, "createAccountFlag");
            return (Criteria) this;
        }

        public Criteria andCreateAccountFlagGreaterThan(Integer value) {
            addCriterion("CREATE_ACCOUNT_FLAG >", value, "createAccountFlag");
            return (Criteria) this;
        }

        public Criteria andCreateAccountFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATE_ACCOUNT_FLAG >=", value, "createAccountFlag");
            return (Criteria) this;
        }

        public Criteria andCreateAccountFlagLessThan(Integer value) {
            addCriterion("CREATE_ACCOUNT_FLAG <", value, "createAccountFlag");
            return (Criteria) this;
        }

        public Criteria andCreateAccountFlagLessThanOrEqualTo(Integer value) {
            addCriterion("CREATE_ACCOUNT_FLAG <=", value, "createAccountFlag");
            return (Criteria) this;
        }

        public Criteria andCreateAccountFlagIn(List<Integer> values) {
            addCriterion("CREATE_ACCOUNT_FLAG in", values, "createAccountFlag");
            return (Criteria) this;
        }

        public Criteria andCreateAccountFlagNotIn(List<Integer> values) {
            addCriterion("CREATE_ACCOUNT_FLAG not in", values, "createAccountFlag");
            return (Criteria) this;
        }

        public Criteria andCreateAccountFlagBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_ACCOUNT_FLAG between", value1, value2, "createAccountFlag");
            return (Criteria) this;
        }

        public Criteria andCreateAccountFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_ACCOUNT_FLAG not between", value1, value2, "createAccountFlag");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionIsNull() {
            addCriterion("UPDATE_ZIP_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionIsNotNull() {
            addCriterion("UPDATE_ZIP_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionEqualTo(String value) {
            addCriterion("UPDATE_ZIP_VERSION =", value, "updateZipVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionNotEqualTo(String value) {
            addCriterion("UPDATE_ZIP_VERSION <>", value, "updateZipVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionGreaterThan(String value) {
            addCriterion("UPDATE_ZIP_VERSION >", value, "updateZipVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_ZIP_VERSION >=", value, "updateZipVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionLessThan(String value) {
            addCriterion("UPDATE_ZIP_VERSION <", value, "updateZipVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_ZIP_VERSION <=", value, "updateZipVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionLike(String value) {
            addCriterion("UPDATE_ZIP_VERSION like", value, "updateZipVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionNotLike(String value) {
            addCriterion("UPDATE_ZIP_VERSION not like", value, "updateZipVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionIn(List<String> values) {
            addCriterion("UPDATE_ZIP_VERSION in", values, "updateZipVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionNotIn(List<String> values) {
            addCriterion("UPDATE_ZIP_VERSION not in", values, "updateZipVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionBetween(String value1, String value2) {
            addCriterion("UPDATE_ZIP_VERSION between", value1, value2, "updateZipVersion");
            return (Criteria) this;
        }

        public Criteria andUpdateZipVersionNotBetween(String value1, String value2) {
            addCriterion("UPDATE_ZIP_VERSION not between", value1, value2, "updateZipVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionIsNull() {
            addCriterion("CLIENT_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andClientVersionIsNotNull() {
            addCriterion("CLIENT_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andClientVersionEqualTo(String value) {
            addCriterion("CLIENT_VERSION =", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotEqualTo(String value) {
            addCriterion("CLIENT_VERSION <>", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionGreaterThan(String value) {
            addCriterion("CLIENT_VERSION >", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_VERSION >=", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionLessThan(String value) {
            addCriterion("CLIENT_VERSION <", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_VERSION <=", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionLike(String value) {
            addCriterion("CLIENT_VERSION like", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotLike(String value) {
            addCriterion("CLIENT_VERSION not like", value, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionIn(List<String> values) {
            addCriterion("CLIENT_VERSION in", values, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotIn(List<String> values) {
            addCriterion("CLIENT_VERSION not in", values, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionBetween(String value1, String value2) {
            addCriterion("CLIENT_VERSION between", value1, value2, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andClientVersionNotBetween(String value1, String value2) {
            addCriterion("CLIENT_VERSION not between", value1, value2, "clientVersion");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("USER_NO like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("USER_NO not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andDataTagIsNull() {
            addCriterion("DATA_TAG is null");
            return (Criteria) this;
        }

        public Criteria andDataTagIsNotNull() {
            addCriterion("DATA_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andDataTagEqualTo(Integer value) {
            addCriterion("DATA_TAG =", value, "dataTag");
            return (Criteria) this;
        }

        public Criteria andDataTagNotEqualTo(Integer value) {
            addCriterion("DATA_TAG <>", value, "dataTag");
            return (Criteria) this;
        }

        public Criteria andDataTagGreaterThan(Integer value) {
            addCriterion("DATA_TAG >", value, "dataTag");
            return (Criteria) this;
        }

        public Criteria andDataTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("DATA_TAG >=", value, "dataTag");
            return (Criteria) this;
        }

        public Criteria andDataTagLessThan(Integer value) {
            addCriterion("DATA_TAG <", value, "dataTag");
            return (Criteria) this;
        }

        public Criteria andDataTagLessThanOrEqualTo(Integer value) {
            addCriterion("DATA_TAG <=", value, "dataTag");
            return (Criteria) this;
        }

        public Criteria andDataTagIn(List<Integer> values) {
            addCriterion("DATA_TAG in", values, "dataTag");
            return (Criteria) this;
        }

        public Criteria andDataTagNotIn(List<Integer> values) {
            addCriterion("DATA_TAG not in", values, "dataTag");
            return (Criteria) this;
        }

        public Criteria andDataTagBetween(Integer value1, Integer value2) {
            addCriterion("DATA_TAG between", value1, value2, "dataTag");
            return (Criteria) this;
        }

        public Criteria andDataTagNotBetween(Integer value1, Integer value2) {
            addCriterion("DATA_TAG not between", value1, value2, "dataTag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}