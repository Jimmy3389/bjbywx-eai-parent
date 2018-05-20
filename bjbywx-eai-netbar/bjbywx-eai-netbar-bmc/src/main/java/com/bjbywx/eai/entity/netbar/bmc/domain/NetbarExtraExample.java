package com.bjbywx.eai.entity.netbar.bmc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NetbarExtraExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NetbarExtraExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andIsOnlineIsNull() {
            addCriterion("IS_ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("IS_ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(Integer value) {
            addCriterion("IS_ONLINE =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(Integer value) {
            addCriterion("IS_ONLINE <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(Integer value) {
            addCriterion("IS_ONLINE >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ONLINE >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(Integer value) {
            addCriterion("IS_ONLINE <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ONLINE <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<Integer> values) {
            addCriterion("IS_ONLINE in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<Integer> values) {
            addCriterion("IS_ONLINE not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(Integer value1, Integer value2) {
            addCriterion("IS_ONLINE between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ONLINE not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andCurrentMachineCountIsNull() {
            addCriterion("CURRENT_MACHINE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMachineCountIsNotNull() {
            addCriterion("CURRENT_MACHINE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMachineCountEqualTo(Integer value) {
            addCriterion("CURRENT_MACHINE_COUNT =", value, "currentMachineCount");
            return (Criteria) this;
        }

        public Criteria andCurrentMachineCountNotEqualTo(Integer value) {
            addCriterion("CURRENT_MACHINE_COUNT <>", value, "currentMachineCount");
            return (Criteria) this;
        }

        public Criteria andCurrentMachineCountGreaterThan(Integer value) {
            addCriterion("CURRENT_MACHINE_COUNT >", value, "currentMachineCount");
            return (Criteria) this;
        }

        public Criteria andCurrentMachineCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CURRENT_MACHINE_COUNT >=", value, "currentMachineCount");
            return (Criteria) this;
        }

        public Criteria andCurrentMachineCountLessThan(Integer value) {
            addCriterion("CURRENT_MACHINE_COUNT <", value, "currentMachineCount");
            return (Criteria) this;
        }

        public Criteria andCurrentMachineCountLessThanOrEqualTo(Integer value) {
            addCriterion("CURRENT_MACHINE_COUNT <=", value, "currentMachineCount");
            return (Criteria) this;
        }

        public Criteria andCurrentMachineCountIn(List<Integer> values) {
            addCriterion("CURRENT_MACHINE_COUNT in", values, "currentMachineCount");
            return (Criteria) this;
        }

        public Criteria andCurrentMachineCountNotIn(List<Integer> values) {
            addCriterion("CURRENT_MACHINE_COUNT not in", values, "currentMachineCount");
            return (Criteria) this;
        }

        public Criteria andCurrentMachineCountBetween(Integer value1, Integer value2) {
            addCriterion("CURRENT_MACHINE_COUNT between", value1, value2, "currentMachineCount");
            return (Criteria) this;
        }

        public Criteria andCurrentMachineCountNotBetween(Integer value1, Integer value2) {
            addCriterion("CURRENT_MACHINE_COUNT not between", value1, value2, "currentMachineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineMachineCountIsNull() {
            addCriterion("ONLINE_MACHINE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andOnlineMachineCountIsNotNull() {
            addCriterion("ONLINE_MACHINE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineMachineCountEqualTo(Integer value) {
            addCriterion("ONLINE_MACHINE_COUNT =", value, "onlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineMachineCountNotEqualTo(Integer value) {
            addCriterion("ONLINE_MACHINE_COUNT <>", value, "onlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineMachineCountGreaterThan(Integer value) {
            addCriterion("ONLINE_MACHINE_COUNT >", value, "onlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineMachineCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ONLINE_MACHINE_COUNT >=", value, "onlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineMachineCountLessThan(Integer value) {
            addCriterion("ONLINE_MACHINE_COUNT <", value, "onlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineMachineCountLessThanOrEqualTo(Integer value) {
            addCriterion("ONLINE_MACHINE_COUNT <=", value, "onlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineMachineCountIn(List<Integer> values) {
            addCriterion("ONLINE_MACHINE_COUNT in", values, "onlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineMachineCountNotIn(List<Integer> values) {
            addCriterion("ONLINE_MACHINE_COUNT not in", values, "onlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineMachineCountBetween(Integer value1, Integer value2) {
            addCriterion("ONLINE_MACHINE_COUNT between", value1, value2, "onlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOnlineMachineCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ONLINE_MACHINE_COUNT not between", value1, value2, "onlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineMachineCountIsNull() {
            addCriterion("OFFLINE_MACHINE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andOfflineMachineCountIsNotNull() {
            addCriterion("OFFLINE_MACHINE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineMachineCountEqualTo(Integer value) {
            addCriterion("OFFLINE_MACHINE_COUNT =", value, "offlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineMachineCountNotEqualTo(Integer value) {
            addCriterion("OFFLINE_MACHINE_COUNT <>", value, "offlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineMachineCountGreaterThan(Integer value) {
            addCriterion("OFFLINE_MACHINE_COUNT >", value, "offlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineMachineCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("OFFLINE_MACHINE_COUNT >=", value, "offlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineMachineCountLessThan(Integer value) {
            addCriterion("OFFLINE_MACHINE_COUNT <", value, "offlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineMachineCountLessThanOrEqualTo(Integer value) {
            addCriterion("OFFLINE_MACHINE_COUNT <=", value, "offlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineMachineCountIn(List<Integer> values) {
            addCriterion("OFFLINE_MACHINE_COUNT in", values, "offlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineMachineCountNotIn(List<Integer> values) {
            addCriterion("OFFLINE_MACHINE_COUNT not in", values, "offlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineMachineCountBetween(Integer value1, Integer value2) {
            addCriterion("OFFLINE_MACHINE_COUNT between", value1, value2, "offlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andOfflineMachineCountNotBetween(Integer value1, Integer value2) {
            addCriterion("OFFLINE_MACHINE_COUNT not between", value1, value2, "offlineMachineCount");
            return (Criteria) this;
        }

        public Criteria andServerVersionIsNull() {
            addCriterion("SERVER_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andServerVersionIsNotNull() {
            addCriterion("SERVER_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andServerVersionEqualTo(String value) {
            addCriterion("SERVER_VERSION =", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionNotEqualTo(String value) {
            addCriterion("SERVER_VERSION <>", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionGreaterThan(String value) {
            addCriterion("SERVER_VERSION >", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_VERSION >=", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionLessThan(String value) {
            addCriterion("SERVER_VERSION <", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionLessThanOrEqualTo(String value) {
            addCriterion("SERVER_VERSION <=", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionLike(String value) {
            addCriterion("SERVER_VERSION like", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionNotLike(String value) {
            addCriterion("SERVER_VERSION not like", value, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionIn(List<String> values) {
            addCriterion("SERVER_VERSION in", values, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionNotIn(List<String> values) {
            addCriterion("SERVER_VERSION not in", values, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionBetween(String value1, String value2) {
            addCriterion("SERVER_VERSION between", value1, value2, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andServerVersionNotBetween(String value1, String value2) {
            addCriterion("SERVER_VERSION not between", value1, value2, "serverVersion");
            return (Criteria) this;
        }

        public Criteria andPostSwitchIsNull() {
            addCriterion("POST_SWITCH is null");
            return (Criteria) this;
        }

        public Criteria andPostSwitchIsNotNull() {
            addCriterion("POST_SWITCH is not null");
            return (Criteria) this;
        }

        public Criteria andPostSwitchEqualTo(Integer value) {
            addCriterion("POST_SWITCH =", value, "postSwitch");
            return (Criteria) this;
        }

        public Criteria andPostSwitchNotEqualTo(Integer value) {
            addCriterion("POST_SWITCH <>", value, "postSwitch");
            return (Criteria) this;
        }

        public Criteria andPostSwitchGreaterThan(Integer value) {
            addCriterion("POST_SWITCH >", value, "postSwitch");
            return (Criteria) this;
        }

        public Criteria andPostSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("POST_SWITCH >=", value, "postSwitch");
            return (Criteria) this;
        }

        public Criteria andPostSwitchLessThan(Integer value) {
            addCriterion("POST_SWITCH <", value, "postSwitch");
            return (Criteria) this;
        }

        public Criteria andPostSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("POST_SWITCH <=", value, "postSwitch");
            return (Criteria) this;
        }

        public Criteria andPostSwitchIn(List<Integer> values) {
            addCriterion("POST_SWITCH in", values, "postSwitch");
            return (Criteria) this;
        }

        public Criteria andPostSwitchNotIn(List<Integer> values) {
            addCriterion("POST_SWITCH not in", values, "postSwitch");
            return (Criteria) this;
        }

        public Criteria andPostSwitchBetween(Integer value1, Integer value2) {
            addCriterion("POST_SWITCH between", value1, value2, "postSwitch");
            return (Criteria) this;
        }

        public Criteria andPostSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("POST_SWITCH not between", value1, value2, "postSwitch");
            return (Criteria) this;
        }

        public Criteria andUrlSwitchIsNull() {
            addCriterion("URL_SWITCH is null");
            return (Criteria) this;
        }

        public Criteria andUrlSwitchIsNotNull() {
            addCriterion("URL_SWITCH is not null");
            return (Criteria) this;
        }

        public Criteria andUrlSwitchEqualTo(Integer value) {
            addCriterion("URL_SWITCH =", value, "urlSwitch");
            return (Criteria) this;
        }

        public Criteria andUrlSwitchNotEqualTo(Integer value) {
            addCriterion("URL_SWITCH <>", value, "urlSwitch");
            return (Criteria) this;
        }

        public Criteria andUrlSwitchGreaterThan(Integer value) {
            addCriterion("URL_SWITCH >", value, "urlSwitch");
            return (Criteria) this;
        }

        public Criteria andUrlSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("URL_SWITCH >=", value, "urlSwitch");
            return (Criteria) this;
        }

        public Criteria andUrlSwitchLessThan(Integer value) {
            addCriterion("URL_SWITCH <", value, "urlSwitch");
            return (Criteria) this;
        }

        public Criteria andUrlSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("URL_SWITCH <=", value, "urlSwitch");
            return (Criteria) this;
        }

        public Criteria andUrlSwitchIn(List<Integer> values) {
            addCriterion("URL_SWITCH in", values, "urlSwitch");
            return (Criteria) this;
        }

        public Criteria andUrlSwitchNotIn(List<Integer> values) {
            addCriterion("URL_SWITCH not in", values, "urlSwitch");
            return (Criteria) this;
        }

        public Criteria andUrlSwitchBetween(Integer value1, Integer value2) {
            addCriterion("URL_SWITCH between", value1, value2, "urlSwitch");
            return (Criteria) this;
        }

        public Criteria andUrlSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("URL_SWITCH not between", value1, value2, "urlSwitch");
            return (Criteria) this;
        }

        public Criteria andProtocollTypeIsNull() {
            addCriterion("PROTOCOLL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProtocollTypeIsNotNull() {
            addCriterion("PROTOCOLL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProtocollTypeEqualTo(Integer value) {
            addCriterion("PROTOCOLL_TYPE =", value, "protocollType");
            return (Criteria) this;
        }

        public Criteria andProtocollTypeNotEqualTo(Integer value) {
            addCriterion("PROTOCOLL_TYPE <>", value, "protocollType");
            return (Criteria) this;
        }

        public Criteria andProtocollTypeGreaterThan(Integer value) {
            addCriterion("PROTOCOLL_TYPE >", value, "protocollType");
            return (Criteria) this;
        }

        public Criteria andProtocollTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROTOCOLL_TYPE >=", value, "protocollType");
            return (Criteria) this;
        }

        public Criteria andProtocollTypeLessThan(Integer value) {
            addCriterion("PROTOCOLL_TYPE <", value, "protocollType");
            return (Criteria) this;
        }

        public Criteria andProtocollTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PROTOCOLL_TYPE <=", value, "protocollType");
            return (Criteria) this;
        }

        public Criteria andProtocollTypeIn(List<Integer> values) {
            addCriterion("PROTOCOLL_TYPE in", values, "protocollType");
            return (Criteria) this;
        }

        public Criteria andProtocollTypeNotIn(List<Integer> values) {
            addCriterion("PROTOCOLL_TYPE not in", values, "protocollType");
            return (Criteria) this;
        }

        public Criteria andProtocollTypeBetween(Integer value1, Integer value2) {
            addCriterion("PROTOCOLL_TYPE between", value1, value2, "protocollType");
            return (Criteria) this;
        }

        public Criteria andProtocollTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PROTOCOLL_TYPE not between", value1, value2, "protocollType");
            return (Criteria) this;
        }

        public Criteria andQqSwitchIsNull() {
            addCriterion("QQ_SWITCH is null");
            return (Criteria) this;
        }

        public Criteria andQqSwitchIsNotNull() {
            addCriterion("QQ_SWITCH is not null");
            return (Criteria) this;
        }

        public Criteria andQqSwitchEqualTo(Integer value) {
            addCriterion("QQ_SWITCH =", value, "qqSwitch");
            return (Criteria) this;
        }

        public Criteria andQqSwitchNotEqualTo(Integer value) {
            addCriterion("QQ_SWITCH <>", value, "qqSwitch");
            return (Criteria) this;
        }

        public Criteria andQqSwitchGreaterThan(Integer value) {
            addCriterion("QQ_SWITCH >", value, "qqSwitch");
            return (Criteria) this;
        }

        public Criteria andQqSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("QQ_SWITCH >=", value, "qqSwitch");
            return (Criteria) this;
        }

        public Criteria andQqSwitchLessThan(Integer value) {
            addCriterion("QQ_SWITCH <", value, "qqSwitch");
            return (Criteria) this;
        }

        public Criteria andQqSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("QQ_SWITCH <=", value, "qqSwitch");
            return (Criteria) this;
        }

        public Criteria andQqSwitchIn(List<Integer> values) {
            addCriterion("QQ_SWITCH in", values, "qqSwitch");
            return (Criteria) this;
        }

        public Criteria andQqSwitchNotIn(List<Integer> values) {
            addCriterion("QQ_SWITCH not in", values, "qqSwitch");
            return (Criteria) this;
        }

        public Criteria andQqSwitchBetween(Integer value1, Integer value2) {
            addCriterion("QQ_SWITCH between", value1, value2, "qqSwitch");
            return (Criteria) this;
        }

        public Criteria andQqSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("QQ_SWITCH not between", value1, value2, "qqSwitch");
            return (Criteria) this;
        }

        public Criteria andUpdateSwitchIsNull() {
            addCriterion("UPDATE_SWITCH is null");
            return (Criteria) this;
        }

        public Criteria andUpdateSwitchIsNotNull() {
            addCriterion("UPDATE_SWITCH is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateSwitchEqualTo(Integer value) {
            addCriterion("UPDATE_SWITCH =", value, "updateSwitch");
            return (Criteria) this;
        }

        public Criteria andUpdateSwitchNotEqualTo(Integer value) {
            addCriterion("UPDATE_SWITCH <>", value, "updateSwitch");
            return (Criteria) this;
        }

        public Criteria andUpdateSwitchGreaterThan(Integer value) {
            addCriterion("UPDATE_SWITCH >", value, "updateSwitch");
            return (Criteria) this;
        }

        public Criteria andUpdateSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_SWITCH >=", value, "updateSwitch");
            return (Criteria) this;
        }

        public Criteria andUpdateSwitchLessThan(Integer value) {
            addCriterion("UPDATE_SWITCH <", value, "updateSwitch");
            return (Criteria) this;
        }

        public Criteria andUpdateSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_SWITCH <=", value, "updateSwitch");
            return (Criteria) this;
        }

        public Criteria andUpdateSwitchIn(List<Integer> values) {
            addCriterion("UPDATE_SWITCH in", values, "updateSwitch");
            return (Criteria) this;
        }

        public Criteria andUpdateSwitchNotIn(List<Integer> values) {
            addCriterion("UPDATE_SWITCH not in", values, "updateSwitch");
            return (Criteria) this;
        }

        public Criteria andUpdateSwitchBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_SWITCH between", value1, value2, "updateSwitch");
            return (Criteria) this;
        }

        public Criteria andUpdateSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_SWITCH not between", value1, value2, "updateSwitch");
            return (Criteria) this;
        }

        public Criteria andNetbarIdIsNull() {
            addCriterion("NETBAR_ID is null");
            return (Criteria) this;
        }

        public Criteria andNetbarIdIsNotNull() {
            addCriterion("NETBAR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNetbarIdEqualTo(Integer value) {
            addCriterion("NETBAR_ID =", value, "netbarId");
            return (Criteria) this;
        }

        public Criteria andNetbarIdNotEqualTo(Integer value) {
            addCriterion("NETBAR_ID <>", value, "netbarId");
            return (Criteria) this;
        }

        public Criteria andNetbarIdGreaterThan(Integer value) {
            addCriterion("NETBAR_ID >", value, "netbarId");
            return (Criteria) this;
        }

        public Criteria andNetbarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NETBAR_ID >=", value, "netbarId");
            return (Criteria) this;
        }

        public Criteria andNetbarIdLessThan(Integer value) {
            addCriterion("NETBAR_ID <", value, "netbarId");
            return (Criteria) this;
        }

        public Criteria andNetbarIdLessThanOrEqualTo(Integer value) {
            addCriterion("NETBAR_ID <=", value, "netbarId");
            return (Criteria) this;
        }

        public Criteria andNetbarIdIn(List<Integer> values) {
            addCriterion("NETBAR_ID in", values, "netbarId");
            return (Criteria) this;
        }

        public Criteria andNetbarIdNotIn(List<Integer> values) {
            addCriterion("NETBAR_ID not in", values, "netbarId");
            return (Criteria) this;
        }

        public Criteria andNetbarIdBetween(Integer value1, Integer value2) {
            addCriterion("NETBAR_ID between", value1, value2, "netbarId");
            return (Criteria) this;
        }

        public Criteria andNetbarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NETBAR_ID not between", value1, value2, "netbarId");
            return (Criteria) this;
        }

        public Criteria andIsSetipIsNull() {
            addCriterion("IS_SETIP is null");
            return (Criteria) this;
        }

        public Criteria andIsSetipIsNotNull() {
            addCriterion("IS_SETIP is not null");
            return (Criteria) this;
        }

        public Criteria andIsSetipEqualTo(Integer value) {
            addCriterion("IS_SETIP =", value, "isSetip");
            return (Criteria) this;
        }

        public Criteria andIsSetipNotEqualTo(Integer value) {
            addCriterion("IS_SETIP <>", value, "isSetip");
            return (Criteria) this;
        }

        public Criteria andIsSetipGreaterThan(Integer value) {
            addCriterion("IS_SETIP >", value, "isSetip");
            return (Criteria) this;
        }

        public Criteria andIsSetipGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_SETIP >=", value, "isSetip");
            return (Criteria) this;
        }

        public Criteria andIsSetipLessThan(Integer value) {
            addCriterion("IS_SETIP <", value, "isSetip");
            return (Criteria) this;
        }

        public Criteria andIsSetipLessThanOrEqualTo(Integer value) {
            addCriterion("IS_SETIP <=", value, "isSetip");
            return (Criteria) this;
        }

        public Criteria andIsSetipIn(List<Integer> values) {
            addCriterion("IS_SETIP in", values, "isSetip");
            return (Criteria) this;
        }

        public Criteria andIsSetipNotIn(List<Integer> values) {
            addCriterion("IS_SETIP not in", values, "isSetip");
            return (Criteria) this;
        }

        public Criteria andIsSetipBetween(Integer value1, Integer value2) {
            addCriterion("IS_SETIP between", value1, value2, "isSetip");
            return (Criteria) this;
        }

        public Criteria andIsSetipNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_SETIP not between", value1, value2, "isSetip");
            return (Criteria) this;
        }

        public Criteria andIsReportIsNull() {
            addCriterion("IS_REPORT is null");
            return (Criteria) this;
        }

        public Criteria andIsReportIsNotNull() {
            addCriterion("IS_REPORT is not null");
            return (Criteria) this;
        }

        public Criteria andIsReportEqualTo(String value) {
            addCriterion("IS_REPORT =", value, "isReport");
            return (Criteria) this;
        }

        public Criteria andIsReportNotEqualTo(String value) {
            addCriterion("IS_REPORT <>", value, "isReport");
            return (Criteria) this;
        }

        public Criteria andIsReportGreaterThan(String value) {
            addCriterion("IS_REPORT >", value, "isReport");
            return (Criteria) this;
        }

        public Criteria andIsReportGreaterThanOrEqualTo(String value) {
            addCriterion("IS_REPORT >=", value, "isReport");
            return (Criteria) this;
        }

        public Criteria andIsReportLessThan(String value) {
            addCriterion("IS_REPORT <", value, "isReport");
            return (Criteria) this;
        }

        public Criteria andIsReportLessThanOrEqualTo(String value) {
            addCriterion("IS_REPORT <=", value, "isReport");
            return (Criteria) this;
        }

        public Criteria andIsReportLike(String value) {
            addCriterion("IS_REPORT like", value, "isReport");
            return (Criteria) this;
        }

        public Criteria andIsReportNotLike(String value) {
            addCriterion("IS_REPORT not like", value, "isReport");
            return (Criteria) this;
        }

        public Criteria andIsReportIn(List<String> values) {
            addCriterion("IS_REPORT in", values, "isReport");
            return (Criteria) this;
        }

        public Criteria andIsReportNotIn(List<String> values) {
            addCriterion("IS_REPORT not in", values, "isReport");
            return (Criteria) this;
        }

        public Criteria andIsReportBetween(String value1, String value2) {
            addCriterion("IS_REPORT between", value1, value2, "isReport");
            return (Criteria) this;
        }

        public Criteria andIsReportNotBetween(String value1, String value2) {
            addCriterion("IS_REPORT not between", value1, value2, "isReport");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andVersionTypeIsNull() {
            addCriterion("VERSION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVersionTypeIsNotNull() {
            addCriterion("VERSION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVersionTypeEqualTo(Integer value) {
            addCriterion("VERSION_TYPE =", value, "versionType");
            return (Criteria) this;
        }

        public Criteria andVersionTypeNotEqualTo(Integer value) {
            addCriterion("VERSION_TYPE <>", value, "versionType");
            return (Criteria) this;
        }

        public Criteria andVersionTypeGreaterThan(Integer value) {
            addCriterion("VERSION_TYPE >", value, "versionType");
            return (Criteria) this;
        }

        public Criteria andVersionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION_TYPE >=", value, "versionType");
            return (Criteria) this;
        }

        public Criteria andVersionTypeLessThan(Integer value) {
            addCriterion("VERSION_TYPE <", value, "versionType");
            return (Criteria) this;
        }

        public Criteria andVersionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION_TYPE <=", value, "versionType");
            return (Criteria) this;
        }

        public Criteria andVersionTypeIn(List<Integer> values) {
            addCriterion("VERSION_TYPE in", values, "versionType");
            return (Criteria) this;
        }

        public Criteria andVersionTypeNotIn(List<Integer> values) {
            addCriterion("VERSION_TYPE not in", values, "versionType");
            return (Criteria) this;
        }

        public Criteria andVersionTypeBetween(Integer value1, Integer value2) {
            addCriterion("VERSION_TYPE between", value1, value2, "versionType");
            return (Criteria) this;
        }

        public Criteria andVersionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION_TYPE not between", value1, value2, "versionType");
            return (Criteria) this;
        }

        public Criteria andCameraIsNull() {
            addCriterion("CAMERA is null");
            return (Criteria) this;
        }

        public Criteria andCameraIsNotNull() {
            addCriterion("CAMERA is not null");
            return (Criteria) this;
        }

        public Criteria andCameraEqualTo(Integer value) {
            addCriterion("CAMERA =", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotEqualTo(Integer value) {
            addCriterion("CAMERA <>", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraGreaterThan(Integer value) {
            addCriterion("CAMERA >", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraGreaterThanOrEqualTo(Integer value) {
            addCriterion("CAMERA >=", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraLessThan(Integer value) {
            addCriterion("CAMERA <", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraLessThanOrEqualTo(Integer value) {
            addCriterion("CAMERA <=", value, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraIn(List<Integer> values) {
            addCriterion("CAMERA in", values, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotIn(List<Integer> values) {
            addCriterion("CAMERA not in", values, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraBetween(Integer value1, Integer value2) {
            addCriterion("CAMERA between", value1, value2, "camera");
            return (Criteria) this;
        }

        public Criteria andCameraNotBetween(Integer value1, Integer value2) {
            addCriterion("CAMERA not between", value1, value2, "camera");
            return (Criteria) this;
        }

        public Criteria andScannerIsNull() {
            addCriterion("SCANNER is null");
            return (Criteria) this;
        }

        public Criteria andScannerIsNotNull() {
            addCriterion("SCANNER is not null");
            return (Criteria) this;
        }

        public Criteria andScannerEqualTo(Integer value) {
            addCriterion("SCANNER =", value, "scanner");
            return (Criteria) this;
        }

        public Criteria andScannerNotEqualTo(Integer value) {
            addCriterion("SCANNER <>", value, "scanner");
            return (Criteria) this;
        }

        public Criteria andScannerGreaterThan(Integer value) {
            addCriterion("SCANNER >", value, "scanner");
            return (Criteria) this;
        }

        public Criteria andScannerGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCANNER >=", value, "scanner");
            return (Criteria) this;
        }

        public Criteria andScannerLessThan(Integer value) {
            addCriterion("SCANNER <", value, "scanner");
            return (Criteria) this;
        }

        public Criteria andScannerLessThanOrEqualTo(Integer value) {
            addCriterion("SCANNER <=", value, "scanner");
            return (Criteria) this;
        }

        public Criteria andScannerIn(List<Integer> values) {
            addCriterion("SCANNER in", values, "scanner");
            return (Criteria) this;
        }

        public Criteria andScannerNotIn(List<Integer> values) {
            addCriterion("SCANNER not in", values, "scanner");
            return (Criteria) this;
        }

        public Criteria andScannerBetween(Integer value1, Integer value2) {
            addCriterion("SCANNER between", value1, value2, "scanner");
            return (Criteria) this;
        }

        public Criteria andScannerNotBetween(Integer value1, Integer value2) {
            addCriterion("SCANNER not between", value1, value2, "scanner");
            return (Criteria) this;
        }

        public Criteria andReaderIsNull() {
            addCriterion("READER is null");
            return (Criteria) this;
        }

        public Criteria andReaderIsNotNull() {
            addCriterion("READER is not null");
            return (Criteria) this;
        }

        public Criteria andReaderEqualTo(Integer value) {
            addCriterion("READER =", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotEqualTo(Integer value) {
            addCriterion("READER <>", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderGreaterThan(Integer value) {
            addCriterion("READER >", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("READER >=", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderLessThan(Integer value) {
            addCriterion("READER <", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderLessThanOrEqualTo(Integer value) {
            addCriterion("READER <=", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderIn(List<Integer> values) {
            addCriterion("READER in", values, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotIn(List<Integer> values) {
            addCriterion("READER not in", values, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderBetween(Integer value1, Integer value2) {
            addCriterion("READER between", value1, value2, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotBetween(Integer value1, Integer value2) {
            addCriterion("READER not between", value1, value2, "reader");
            return (Criteria) this;
        }

        public Criteria andServerIsOnlineIsNull() {
            addCriterion("SERVER_IS_ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andServerIsOnlineIsNotNull() {
            addCriterion("SERVER_IS_ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andServerIsOnlineEqualTo(Integer value) {
            addCriterion("SERVER_IS_ONLINE =", value, "serverIsOnline");
            return (Criteria) this;
        }

        public Criteria andServerIsOnlineNotEqualTo(Integer value) {
            addCriterion("SERVER_IS_ONLINE <>", value, "serverIsOnline");
            return (Criteria) this;
        }

        public Criteria andServerIsOnlineGreaterThan(Integer value) {
            addCriterion("SERVER_IS_ONLINE >", value, "serverIsOnline");
            return (Criteria) this;
        }

        public Criteria andServerIsOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERVER_IS_ONLINE >=", value, "serverIsOnline");
            return (Criteria) this;
        }

        public Criteria andServerIsOnlineLessThan(Integer value) {
            addCriterion("SERVER_IS_ONLINE <", value, "serverIsOnline");
            return (Criteria) this;
        }

        public Criteria andServerIsOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("SERVER_IS_ONLINE <=", value, "serverIsOnline");
            return (Criteria) this;
        }

        public Criteria andServerIsOnlineIn(List<Integer> values) {
            addCriterion("SERVER_IS_ONLINE in", values, "serverIsOnline");
            return (Criteria) this;
        }

        public Criteria andServerIsOnlineNotIn(List<Integer> values) {
            addCriterion("SERVER_IS_ONLINE not in", values, "serverIsOnline");
            return (Criteria) this;
        }

        public Criteria andServerIsOnlineBetween(Integer value1, Integer value2) {
            addCriterion("SERVER_IS_ONLINE between", value1, value2, "serverIsOnline");
            return (Criteria) this;
        }

        public Criteria andServerIsOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("SERVER_IS_ONLINE not between", value1, value2, "serverIsOnline");
            return (Criteria) this;
        }

        public Criteria andTraceTmIsNull() {
            addCriterion("TRACE_TM is null");
            return (Criteria) this;
        }

        public Criteria andTraceTmIsNotNull() {
            addCriterion("TRACE_TM is not null");
            return (Criteria) this;
        }

        public Criteria andTraceTmEqualTo(Date value) {
            addCriterion("TRACE_TM =", value, "traceTm");
            return (Criteria) this;
        }

        public Criteria andTraceTmNotEqualTo(Date value) {
            addCriterion("TRACE_TM <>", value, "traceTm");
            return (Criteria) this;
        }

        public Criteria andTraceTmGreaterThan(Date value) {
            addCriterion("TRACE_TM >", value, "traceTm");
            return (Criteria) this;
        }

        public Criteria andTraceTmGreaterThanOrEqualTo(Date value) {
            addCriterion("TRACE_TM >=", value, "traceTm");
            return (Criteria) this;
        }

        public Criteria andTraceTmLessThan(Date value) {
            addCriterion("TRACE_TM <", value, "traceTm");
            return (Criteria) this;
        }

        public Criteria andTraceTmLessThanOrEqualTo(Date value) {
            addCriterion("TRACE_TM <=", value, "traceTm");
            return (Criteria) this;
        }

        public Criteria andTraceTmIn(List<Date> values) {
            addCriterion("TRACE_TM in", values, "traceTm");
            return (Criteria) this;
        }

        public Criteria andTraceTmNotIn(List<Date> values) {
            addCriterion("TRACE_TM not in", values, "traceTm");
            return (Criteria) this;
        }

        public Criteria andTraceTmBetween(Date value1, Date value2) {
            addCriterion("TRACE_TM between", value1, value2, "traceTm");
            return (Criteria) this;
        }

        public Criteria andTraceTmNotBetween(Date value1, Date value2) {
            addCriterion("TRACE_TM not between", value1, value2, "traceTm");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTmIsNull() {
            addCriterion("LAST_ONLINE_TM is null");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTmIsNotNull() {
            addCriterion("LAST_ONLINE_TM is not null");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTmEqualTo(Date value) {
            addCriterion("LAST_ONLINE_TM =", value, "lastOnlineTm");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTmNotEqualTo(Date value) {
            addCriterion("LAST_ONLINE_TM <>", value, "lastOnlineTm");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTmGreaterThan(Date value) {
            addCriterion("LAST_ONLINE_TM >", value, "lastOnlineTm");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTmGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_ONLINE_TM >=", value, "lastOnlineTm");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTmLessThan(Date value) {
            addCriterion("LAST_ONLINE_TM <", value, "lastOnlineTm");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTmLessThanOrEqualTo(Date value) {
            addCriterion("LAST_ONLINE_TM <=", value, "lastOnlineTm");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTmIn(List<Date> values) {
            addCriterion("LAST_ONLINE_TM in", values, "lastOnlineTm");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTmNotIn(List<Date> values) {
            addCriterion("LAST_ONLINE_TM not in", values, "lastOnlineTm");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTmBetween(Date value1, Date value2) {
            addCriterion("LAST_ONLINE_TM between", value1, value2, "lastOnlineTm");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTmNotBetween(Date value1, Date value2) {
            addCriterion("LAST_ONLINE_TM not between", value1, value2, "lastOnlineTm");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusIsNull() {
            addCriterion("HDWARE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusIsNotNull() {
            addCriterion("HDWARE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusEqualTo(String value) {
            addCriterion("HDWARE_STATUS =", value, "hdwareStatus");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusNotEqualTo(String value) {
            addCriterion("HDWARE_STATUS <>", value, "hdwareStatus");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusGreaterThan(String value) {
            addCriterion("HDWARE_STATUS >", value, "hdwareStatus");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusGreaterThanOrEqualTo(String value) {
            addCriterion("HDWARE_STATUS >=", value, "hdwareStatus");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusLessThan(String value) {
            addCriterion("HDWARE_STATUS <", value, "hdwareStatus");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusLessThanOrEqualTo(String value) {
            addCriterion("HDWARE_STATUS <=", value, "hdwareStatus");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusLike(String value) {
            addCriterion("HDWARE_STATUS like", value, "hdwareStatus");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusNotLike(String value) {
            addCriterion("HDWARE_STATUS not like", value, "hdwareStatus");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusIn(List<String> values) {
            addCriterion("HDWARE_STATUS in", values, "hdwareStatus");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusNotIn(List<String> values) {
            addCriterion("HDWARE_STATUS not in", values, "hdwareStatus");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusBetween(String value1, String value2) {
            addCriterion("HDWARE_STATUS between", value1, value2, "hdwareStatus");
            return (Criteria) this;
        }

        public Criteria andHdwareStatusNotBetween(String value1, String value2) {
            addCriterion("HDWARE_STATUS not between", value1, value2, "hdwareStatus");
            return (Criteria) this;
        }

        public Criteria andAdminUseCountIsNull() {
            addCriterion("ADMIN_USE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andAdminUseCountIsNotNull() {
            addCriterion("ADMIN_USE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUseCountEqualTo(Integer value) {
            addCriterion("ADMIN_USE_COUNT =", value, "adminUseCount");
            return (Criteria) this;
        }

        public Criteria andAdminUseCountNotEqualTo(Integer value) {
            addCriterion("ADMIN_USE_COUNT <>", value, "adminUseCount");
            return (Criteria) this;
        }

        public Criteria andAdminUseCountGreaterThan(Integer value) {
            addCriterion("ADMIN_USE_COUNT >", value, "adminUseCount");
            return (Criteria) this;
        }

        public Criteria andAdminUseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADMIN_USE_COUNT >=", value, "adminUseCount");
            return (Criteria) this;
        }

        public Criteria andAdminUseCountLessThan(Integer value) {
            addCriterion("ADMIN_USE_COUNT <", value, "adminUseCount");
            return (Criteria) this;
        }

        public Criteria andAdminUseCountLessThanOrEqualTo(Integer value) {
            addCriterion("ADMIN_USE_COUNT <=", value, "adminUseCount");
            return (Criteria) this;
        }

        public Criteria andAdminUseCountIn(List<Integer> values) {
            addCriterion("ADMIN_USE_COUNT in", values, "adminUseCount");
            return (Criteria) this;
        }

        public Criteria andAdminUseCountNotIn(List<Integer> values) {
            addCriterion("ADMIN_USE_COUNT not in", values, "adminUseCount");
            return (Criteria) this;
        }

        public Criteria andAdminUseCountBetween(Integer value1, Integer value2) {
            addCriterion("ADMIN_USE_COUNT between", value1, value2, "adminUseCount");
            return (Criteria) this;
        }

        public Criteria andAdminUseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ADMIN_USE_COUNT not between", value1, value2, "adminUseCount");
            return (Criteria) this;
        }

        public Criteria andPluginVersionIsNull() {
            addCriterion("PLUGIN_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andPluginVersionIsNotNull() {
            addCriterion("PLUGIN_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andPluginVersionEqualTo(Integer value) {
            addCriterion("PLUGIN_VERSION =", value, "pluginVersion");
            return (Criteria) this;
        }

        public Criteria andPluginVersionNotEqualTo(Integer value) {
            addCriterion("PLUGIN_VERSION <>", value, "pluginVersion");
            return (Criteria) this;
        }

        public Criteria andPluginVersionGreaterThan(Integer value) {
            addCriterion("PLUGIN_VERSION >", value, "pluginVersion");
            return (Criteria) this;
        }

        public Criteria andPluginVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLUGIN_VERSION >=", value, "pluginVersion");
            return (Criteria) this;
        }

        public Criteria andPluginVersionLessThan(Integer value) {
            addCriterion("PLUGIN_VERSION <", value, "pluginVersion");
            return (Criteria) this;
        }

        public Criteria andPluginVersionLessThanOrEqualTo(Integer value) {
            addCriterion("PLUGIN_VERSION <=", value, "pluginVersion");
            return (Criteria) this;
        }

        public Criteria andPluginVersionIn(List<Integer> values) {
            addCriterion("PLUGIN_VERSION in", values, "pluginVersion");
            return (Criteria) this;
        }

        public Criteria andPluginVersionNotIn(List<Integer> values) {
            addCriterion("PLUGIN_VERSION not in", values, "pluginVersion");
            return (Criteria) this;
        }

        public Criteria andPluginVersionBetween(Integer value1, Integer value2) {
            addCriterion("PLUGIN_VERSION between", value1, value2, "pluginVersion");
            return (Criteria) this;
        }

        public Criteria andPluginVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("PLUGIN_VERSION not between", value1, value2, "pluginVersion");
            return (Criteria) this;
        }

        public Criteria andUseAdminIsNull() {
            addCriterion("USE_ADMIN is null");
            return (Criteria) this;
        }

        public Criteria andUseAdminIsNotNull() {
            addCriterion("USE_ADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andUseAdminEqualTo(Integer value) {
            addCriterion("USE_ADMIN =", value, "useAdmin");
            return (Criteria) this;
        }

        public Criteria andUseAdminNotEqualTo(Integer value) {
            addCriterion("USE_ADMIN <>", value, "useAdmin");
            return (Criteria) this;
        }

        public Criteria andUseAdminGreaterThan(Integer value) {
            addCriterion("USE_ADMIN >", value, "useAdmin");
            return (Criteria) this;
        }

        public Criteria andUseAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("USE_ADMIN >=", value, "useAdmin");
            return (Criteria) this;
        }

        public Criteria andUseAdminLessThan(Integer value) {
            addCriterion("USE_ADMIN <", value, "useAdmin");
            return (Criteria) this;
        }

        public Criteria andUseAdminLessThanOrEqualTo(Integer value) {
            addCriterion("USE_ADMIN <=", value, "useAdmin");
            return (Criteria) this;
        }

        public Criteria andUseAdminIn(List<Integer> values) {
            addCriterion("USE_ADMIN in", values, "useAdmin");
            return (Criteria) this;
        }

        public Criteria andUseAdminNotIn(List<Integer> values) {
            addCriterion("USE_ADMIN not in", values, "useAdmin");
            return (Criteria) this;
        }

        public Criteria andUseAdminBetween(Integer value1, Integer value2) {
            addCriterion("USE_ADMIN between", value1, value2, "useAdmin");
            return (Criteria) this;
        }

        public Criteria andUseAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("USE_ADMIN not between", value1, value2, "useAdmin");
            return (Criteria) this;
        }

        public Criteria andXCoordinateIsNull() {
            addCriterion("X_COORDINATE is null");
            return (Criteria) this;
        }

        public Criteria andXCoordinateIsNotNull() {
            addCriterion("X_COORDINATE is not null");
            return (Criteria) this;
        }

        public Criteria andXCoordinateEqualTo(String value) {
            addCriterion("X_COORDINATE =", value, "xCoordinate");
            return (Criteria) this;
        }

        public Criteria andXCoordinateNotEqualTo(String value) {
            addCriterion("X_COORDINATE <>", value, "xCoordinate");
            return (Criteria) this;
        }

        public Criteria andXCoordinateGreaterThan(String value) {
            addCriterion("X_COORDINATE >", value, "xCoordinate");
            return (Criteria) this;
        }

        public Criteria andXCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("X_COORDINATE >=", value, "xCoordinate");
            return (Criteria) this;
        }

        public Criteria andXCoordinateLessThan(String value) {
            addCriterion("X_COORDINATE <", value, "xCoordinate");
            return (Criteria) this;
        }

        public Criteria andXCoordinateLessThanOrEqualTo(String value) {
            addCriterion("X_COORDINATE <=", value, "xCoordinate");
            return (Criteria) this;
        }

        public Criteria andXCoordinateLike(String value) {
            addCriterion("X_COORDINATE like", value, "xCoordinate");
            return (Criteria) this;
        }

        public Criteria andXCoordinateNotLike(String value) {
            addCriterion("X_COORDINATE not like", value, "xCoordinate");
            return (Criteria) this;
        }

        public Criteria andXCoordinateIn(List<String> values) {
            addCriterion("X_COORDINATE in", values, "xCoordinate");
            return (Criteria) this;
        }

        public Criteria andXCoordinateNotIn(List<String> values) {
            addCriterion("X_COORDINATE not in", values, "xCoordinate");
            return (Criteria) this;
        }

        public Criteria andXCoordinateBetween(String value1, String value2) {
            addCriterion("X_COORDINATE between", value1, value2, "xCoordinate");
            return (Criteria) this;
        }

        public Criteria andXCoordinateNotBetween(String value1, String value2) {
            addCriterion("X_COORDINATE not between", value1, value2, "xCoordinate");
            return (Criteria) this;
        }

        public Criteria andYCoordinateIsNull() {
            addCriterion("Y_COORDINATE is null");
            return (Criteria) this;
        }

        public Criteria andYCoordinateIsNotNull() {
            addCriterion("Y_COORDINATE is not null");
            return (Criteria) this;
        }

        public Criteria andYCoordinateEqualTo(String value) {
            addCriterion("Y_COORDINATE =", value, "yCoordinate");
            return (Criteria) this;
        }

        public Criteria andYCoordinateNotEqualTo(String value) {
            addCriterion("Y_COORDINATE <>", value, "yCoordinate");
            return (Criteria) this;
        }

        public Criteria andYCoordinateGreaterThan(String value) {
            addCriterion("Y_COORDINATE >", value, "yCoordinate");
            return (Criteria) this;
        }

        public Criteria andYCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("Y_COORDINATE >=", value, "yCoordinate");
            return (Criteria) this;
        }

        public Criteria andYCoordinateLessThan(String value) {
            addCriterion("Y_COORDINATE <", value, "yCoordinate");
            return (Criteria) this;
        }

        public Criteria andYCoordinateLessThanOrEqualTo(String value) {
            addCriterion("Y_COORDINATE <=", value, "yCoordinate");
            return (Criteria) this;
        }

        public Criteria andYCoordinateLike(String value) {
            addCriterion("Y_COORDINATE like", value, "yCoordinate");
            return (Criteria) this;
        }

        public Criteria andYCoordinateNotLike(String value) {
            addCriterion("Y_COORDINATE not like", value, "yCoordinate");
            return (Criteria) this;
        }

        public Criteria andYCoordinateIn(List<String> values) {
            addCriterion("Y_COORDINATE in", values, "yCoordinate");
            return (Criteria) this;
        }

        public Criteria andYCoordinateNotIn(List<String> values) {
            addCriterion("Y_COORDINATE not in", values, "yCoordinate");
            return (Criteria) this;
        }

        public Criteria andYCoordinateBetween(String value1, String value2) {
            addCriterion("Y_COORDINATE between", value1, value2, "yCoordinate");
            return (Criteria) this;
        }

        public Criteria andYCoordinateNotBetween(String value1, String value2) {
            addCriterion("Y_COORDINATE not between", value1, value2, "yCoordinate");
            return (Criteria) this;
        }

        public Criteria andUseMobileIsNull() {
            addCriterion("USE_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andUseMobileIsNotNull() {
            addCriterion("USE_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andUseMobileEqualTo(Integer value) {
            addCriterion("USE_MOBILE =", value, "useMobile");
            return (Criteria) this;
        }

        public Criteria andUseMobileNotEqualTo(Integer value) {
            addCriterion("USE_MOBILE <>", value, "useMobile");
            return (Criteria) this;
        }

        public Criteria andUseMobileGreaterThan(Integer value) {
            addCriterion("USE_MOBILE >", value, "useMobile");
            return (Criteria) this;
        }

        public Criteria andUseMobileGreaterThanOrEqualTo(Integer value) {
            addCriterion("USE_MOBILE >=", value, "useMobile");
            return (Criteria) this;
        }

        public Criteria andUseMobileLessThan(Integer value) {
            addCriterion("USE_MOBILE <", value, "useMobile");
            return (Criteria) this;
        }

        public Criteria andUseMobileLessThanOrEqualTo(Integer value) {
            addCriterion("USE_MOBILE <=", value, "useMobile");
            return (Criteria) this;
        }

        public Criteria andUseMobileIn(List<Integer> values) {
            addCriterion("USE_MOBILE in", values, "useMobile");
            return (Criteria) this;
        }

        public Criteria andUseMobileNotIn(List<Integer> values) {
            addCriterion("USE_MOBILE not in", values, "useMobile");
            return (Criteria) this;
        }

        public Criteria andUseMobileBetween(Integer value1, Integer value2) {
            addCriterion("USE_MOBILE between", value1, value2, "useMobile");
            return (Criteria) this;
        }

        public Criteria andUseMobileNotBetween(Integer value1, Integer value2) {
            addCriterion("USE_MOBILE not between", value1, value2, "useMobile");
            return (Criteria) this;
        }

        public Criteria andUseCertIsNull() {
            addCriterion("USE_CERT is null");
            return (Criteria) this;
        }

        public Criteria andUseCertIsNotNull() {
            addCriterion("USE_CERT is not null");
            return (Criteria) this;
        }

        public Criteria andUseCertEqualTo(Integer value) {
            addCriterion("USE_CERT =", value, "useCert");
            return (Criteria) this;
        }

        public Criteria andUseCertNotEqualTo(Integer value) {
            addCriterion("USE_CERT <>", value, "useCert");
            return (Criteria) this;
        }

        public Criteria andUseCertGreaterThan(Integer value) {
            addCriterion("USE_CERT >", value, "useCert");
            return (Criteria) this;
        }

        public Criteria andUseCertGreaterThanOrEqualTo(Integer value) {
            addCriterion("USE_CERT >=", value, "useCert");
            return (Criteria) this;
        }

        public Criteria andUseCertLessThan(Integer value) {
            addCriterion("USE_CERT <", value, "useCert");
            return (Criteria) this;
        }

        public Criteria andUseCertLessThanOrEqualTo(Integer value) {
            addCriterion("USE_CERT <=", value, "useCert");
            return (Criteria) this;
        }

        public Criteria andUseCertIn(List<Integer> values) {
            addCriterion("USE_CERT in", values, "useCert");
            return (Criteria) this;
        }

        public Criteria andUseCertNotIn(List<Integer> values) {
            addCriterion("USE_CERT not in", values, "useCert");
            return (Criteria) this;
        }

        public Criteria andUseCertBetween(Integer value1, Integer value2) {
            addCriterion("USE_CERT between", value1, value2, "useCert");
            return (Criteria) this;
        }

        public Criteria andUseCertNotBetween(Integer value1, Integer value2) {
            addCriterion("USE_CERT not between", value1, value2, "useCert");
            return (Criteria) this;
        }

        public Criteria andCertTypesIsNull() {
            addCriterion("CERT_TYPES is null");
            return (Criteria) this;
        }

        public Criteria andCertTypesIsNotNull() {
            addCriterion("CERT_TYPES is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypesEqualTo(String value) {
            addCriterion("CERT_TYPES =", value, "certTypes");
            return (Criteria) this;
        }

        public Criteria andCertTypesNotEqualTo(String value) {
            addCriterion("CERT_TYPES <>", value, "certTypes");
            return (Criteria) this;
        }

        public Criteria andCertTypesGreaterThan(String value) {
            addCriterion("CERT_TYPES >", value, "certTypes");
            return (Criteria) this;
        }

        public Criteria andCertTypesGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_TYPES >=", value, "certTypes");
            return (Criteria) this;
        }

        public Criteria andCertTypesLessThan(String value) {
            addCriterion("CERT_TYPES <", value, "certTypes");
            return (Criteria) this;
        }

        public Criteria andCertTypesLessThanOrEqualTo(String value) {
            addCriterion("CERT_TYPES <=", value, "certTypes");
            return (Criteria) this;
        }

        public Criteria andCertTypesLike(String value) {
            addCriterion("CERT_TYPES like", value, "certTypes");
            return (Criteria) this;
        }

        public Criteria andCertTypesNotLike(String value) {
            addCriterion("CERT_TYPES not like", value, "certTypes");
            return (Criteria) this;
        }

        public Criteria andCertTypesIn(List<String> values) {
            addCriterion("CERT_TYPES in", values, "certTypes");
            return (Criteria) this;
        }

        public Criteria andCertTypesNotIn(List<String> values) {
            addCriterion("CERT_TYPES not in", values, "certTypes");
            return (Criteria) this;
        }

        public Criteria andCertTypesBetween(String value1, String value2) {
            addCriterion("CERT_TYPES between", value1, value2, "certTypes");
            return (Criteria) this;
        }

        public Criteria andCertTypesNotBetween(String value1, String value2) {
            addCriterion("CERT_TYPES not between", value1, value2, "certTypes");
            return (Criteria) this;
        }

        public Criteria andBougieflgIsNull() {
            addCriterion("BOUGIEFLG is null");
            return (Criteria) this;
        }

        public Criteria andBougieflgIsNotNull() {
            addCriterion("BOUGIEFLG is not null");
            return (Criteria) this;
        }

        public Criteria andBougieflgEqualTo(Integer value) {
            addCriterion("BOUGIEFLG =", value, "bougieflg");
            return (Criteria) this;
        }

        public Criteria andBougieflgNotEqualTo(Integer value) {
            addCriterion("BOUGIEFLG <>", value, "bougieflg");
            return (Criteria) this;
        }

        public Criteria andBougieflgGreaterThan(Integer value) {
            addCriterion("BOUGIEFLG >", value, "bougieflg");
            return (Criteria) this;
        }

        public Criteria andBougieflgGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOUGIEFLG >=", value, "bougieflg");
            return (Criteria) this;
        }

        public Criteria andBougieflgLessThan(Integer value) {
            addCriterion("BOUGIEFLG <", value, "bougieflg");
            return (Criteria) this;
        }

        public Criteria andBougieflgLessThanOrEqualTo(Integer value) {
            addCriterion("BOUGIEFLG <=", value, "bougieflg");
            return (Criteria) this;
        }

        public Criteria andBougieflgIn(List<Integer> values) {
            addCriterion("BOUGIEFLG in", values, "bougieflg");
            return (Criteria) this;
        }

        public Criteria andBougieflgNotIn(List<Integer> values) {
            addCriterion("BOUGIEFLG not in", values, "bougieflg");
            return (Criteria) this;
        }

        public Criteria andBougieflgBetween(Integer value1, Integer value2) {
            addCriterion("BOUGIEFLG between", value1, value2, "bougieflg");
            return (Criteria) this;
        }

        public Criteria andBougieflgNotBetween(Integer value1, Integer value2) {
            addCriterion("BOUGIEFLG not between", value1, value2, "bougieflg");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNull() {
            addCriterion("UPDATE_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNotNull() {
            addCriterion("UPDATE_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameEqualTo(String value) {
            addCriterion("UPDATE_USER_NAME =", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotEqualTo(String value) {
            addCriterion("UPDATE_USER_NAME <>", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThan(String value) {
            addCriterion("UPDATE_USER_NAME >", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_NAME >=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThan(String value) {
            addCriterion("UPDATE_USER_NAME <", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_NAME <=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLike(String value) {
            addCriterion("UPDATE_USER_NAME like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotLike(String value) {
            addCriterion("UPDATE_USER_NAME not like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIn(List<String> values) {
            addCriterion("UPDATE_USER_NAME in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotIn(List<String> values) {
            addCriterion("UPDATE_USER_NAME not in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_NAME between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_NAME not between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerIsNull() {
            addCriterion("CERT_TYPES_FINGER is null");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerIsNotNull() {
            addCriterion("CERT_TYPES_FINGER is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerEqualTo(String value) {
            addCriterion("CERT_TYPES_FINGER =", value, "certTypesFinger");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerNotEqualTo(String value) {
            addCriterion("CERT_TYPES_FINGER <>", value, "certTypesFinger");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerGreaterThan(String value) {
            addCriterion("CERT_TYPES_FINGER >", value, "certTypesFinger");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_TYPES_FINGER >=", value, "certTypesFinger");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerLessThan(String value) {
            addCriterion("CERT_TYPES_FINGER <", value, "certTypesFinger");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerLessThanOrEqualTo(String value) {
            addCriterion("CERT_TYPES_FINGER <=", value, "certTypesFinger");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerLike(String value) {
            addCriterion("CERT_TYPES_FINGER like", value, "certTypesFinger");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerNotLike(String value) {
            addCriterion("CERT_TYPES_FINGER not like", value, "certTypesFinger");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerIn(List<String> values) {
            addCriterion("CERT_TYPES_FINGER in", values, "certTypesFinger");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerNotIn(List<String> values) {
            addCriterion("CERT_TYPES_FINGER not in", values, "certTypesFinger");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerBetween(String value1, String value2) {
            addCriterion("CERT_TYPES_FINGER between", value1, value2, "certTypesFinger");
            return (Criteria) this;
        }

        public Criteria andCertTypesFingerNotBetween(String value1, String value2) {
            addCriterion("CERT_TYPES_FINGER not between", value1, value2, "certTypesFinger");
            return (Criteria) this;
        }

        public Criteria andCertTypesfIsNull() {
            addCriterion("CERT_TYPESF is null");
            return (Criteria) this;
        }

        public Criteria andCertTypesfIsNotNull() {
            addCriterion("CERT_TYPESF is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypesfEqualTo(String value) {
            addCriterion("CERT_TYPESF =", value, "certTypesf");
            return (Criteria) this;
        }

        public Criteria andCertTypesfNotEqualTo(String value) {
            addCriterion("CERT_TYPESF <>", value, "certTypesf");
            return (Criteria) this;
        }

        public Criteria andCertTypesfGreaterThan(String value) {
            addCriterion("CERT_TYPESF >", value, "certTypesf");
            return (Criteria) this;
        }

        public Criteria andCertTypesfGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_TYPESF >=", value, "certTypesf");
            return (Criteria) this;
        }

        public Criteria andCertTypesfLessThan(String value) {
            addCriterion("CERT_TYPESF <", value, "certTypesf");
            return (Criteria) this;
        }

        public Criteria andCertTypesfLessThanOrEqualTo(String value) {
            addCriterion("CERT_TYPESF <=", value, "certTypesf");
            return (Criteria) this;
        }

        public Criteria andCertTypesfLike(String value) {
            addCriterion("CERT_TYPESF like", value, "certTypesf");
            return (Criteria) this;
        }

        public Criteria andCertTypesfNotLike(String value) {
            addCriterion("CERT_TYPESF not like", value, "certTypesf");
            return (Criteria) this;
        }

        public Criteria andCertTypesfIn(List<String> values) {
            addCriterion("CERT_TYPESF in", values, "certTypesf");
            return (Criteria) this;
        }

        public Criteria andCertTypesfNotIn(List<String> values) {
            addCriterion("CERT_TYPESF not in", values, "certTypesf");
            return (Criteria) this;
        }

        public Criteria andCertTypesfBetween(String value1, String value2) {
            addCriterion("CERT_TYPESF between", value1, value2, "certTypesf");
            return (Criteria) this;
        }

        public Criteria andCertTypesfNotBetween(String value1, String value2) {
            addCriterion("CERT_TYPESF not between", value1, value2, "certTypesf");
            return (Criteria) this;
        }

        public Criteria andUpdateTimefIsNull() {
            addCriterion("UPDATE_TIMEF is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimefIsNotNull() {
            addCriterion("UPDATE_TIMEF is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimefEqualTo(Date value) {
            addCriterion("UPDATE_TIMEF =", value, "updateTimef");
            return (Criteria) this;
        }

        public Criteria andUpdateTimefNotEqualTo(Date value) {
            addCriterion("UPDATE_TIMEF <>", value, "updateTimef");
            return (Criteria) this;
        }

        public Criteria andUpdateTimefGreaterThan(Date value) {
            addCriterion("UPDATE_TIMEF >", value, "updateTimef");
            return (Criteria) this;
        }

        public Criteria andUpdateTimefGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIMEF >=", value, "updateTimef");
            return (Criteria) this;
        }

        public Criteria andUpdateTimefLessThan(Date value) {
            addCriterion("UPDATE_TIMEF <", value, "updateTimef");
            return (Criteria) this;
        }

        public Criteria andUpdateTimefLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIMEF <=", value, "updateTimef");
            return (Criteria) this;
        }

        public Criteria andUpdateTimefIn(List<Date> values) {
            addCriterion("UPDATE_TIMEF in", values, "updateTimef");
            return (Criteria) this;
        }

        public Criteria andUpdateTimefNotIn(List<Date> values) {
            addCriterion("UPDATE_TIMEF not in", values, "updateTimef");
            return (Criteria) this;
        }

        public Criteria andUpdateTimefBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIMEF between", value1, value2, "updateTimef");
            return (Criteria) this;
        }

        public Criteria andUpdateTimefNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIMEF not between", value1, value2, "updateTimef");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfIsNull() {
            addCriterion("UPDATE_USERF is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfIsNotNull() {
            addCriterion("UPDATE_USERF is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfEqualTo(String value) {
            addCriterion("UPDATE_USERF =", value, "updateUserf");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfNotEqualTo(String value) {
            addCriterion("UPDATE_USERF <>", value, "updateUserf");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfGreaterThan(String value) {
            addCriterion("UPDATE_USERF >", value, "updateUserf");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USERF >=", value, "updateUserf");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfLessThan(String value) {
            addCriterion("UPDATE_USERF <", value, "updateUserf");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USERF <=", value, "updateUserf");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfLike(String value) {
            addCriterion("UPDATE_USERF like", value, "updateUserf");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfNotLike(String value) {
            addCriterion("UPDATE_USERF not like", value, "updateUserf");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfIn(List<String> values) {
            addCriterion("UPDATE_USERF in", values, "updateUserf");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfNotIn(List<String> values) {
            addCriterion("UPDATE_USERF not in", values, "updateUserf");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfBetween(String value1, String value2) {
            addCriterion("UPDATE_USERF between", value1, value2, "updateUserf");
            return (Criteria) this;
        }

        public Criteria andUpdateUserfNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USERF not between", value1, value2, "updateUserf");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefIsNull() {
            addCriterion("UPDATE_USER_NAMEF is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefIsNotNull() {
            addCriterion("UPDATE_USER_NAMEF is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefEqualTo(String value) {
            addCriterion("UPDATE_USER_NAMEF =", value, "updateUserNamef");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefNotEqualTo(String value) {
            addCriterion("UPDATE_USER_NAMEF <>", value, "updateUserNamef");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefGreaterThan(String value) {
            addCriterion("UPDATE_USER_NAMEF >", value, "updateUserNamef");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_NAMEF >=", value, "updateUserNamef");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefLessThan(String value) {
            addCriterion("UPDATE_USER_NAMEF <", value, "updateUserNamef");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_NAMEF <=", value, "updateUserNamef");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefLike(String value) {
            addCriterion("UPDATE_USER_NAMEF like", value, "updateUserNamef");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefNotLike(String value) {
            addCriterion("UPDATE_USER_NAMEF not like", value, "updateUserNamef");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefIn(List<String> values) {
            addCriterion("UPDATE_USER_NAMEF in", values, "updateUserNamef");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefNotIn(List<String> values) {
            addCriterion("UPDATE_USER_NAMEF not in", values, "updateUserNamef");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_NAMEF between", value1, value2, "updateUserNamef");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNamefNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_NAMEF not between", value1, value2, "updateUserNamef");
            return (Criteria) this;
        }

        public Criteria andMediaComIsNull() {
            addCriterion("MEDIA_COM is null");
            return (Criteria) this;
        }

        public Criteria andMediaComIsNotNull() {
            addCriterion("MEDIA_COM is not null");
            return (Criteria) this;
        }

        public Criteria andMediaComEqualTo(Integer value) {
            addCriterion("MEDIA_COM =", value, "mediaCom");
            return (Criteria) this;
        }

        public Criteria andMediaComNotEqualTo(Integer value) {
            addCriterion("MEDIA_COM <>", value, "mediaCom");
            return (Criteria) this;
        }

        public Criteria andMediaComGreaterThan(Integer value) {
            addCriterion("MEDIA_COM >", value, "mediaCom");
            return (Criteria) this;
        }

        public Criteria andMediaComGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEDIA_COM >=", value, "mediaCom");
            return (Criteria) this;
        }

        public Criteria andMediaComLessThan(Integer value) {
            addCriterion("MEDIA_COM <", value, "mediaCom");
            return (Criteria) this;
        }

        public Criteria andMediaComLessThanOrEqualTo(Integer value) {
            addCriterion("MEDIA_COM <=", value, "mediaCom");
            return (Criteria) this;
        }

        public Criteria andMediaComIn(List<Integer> values) {
            addCriterion("MEDIA_COM in", values, "mediaCom");
            return (Criteria) this;
        }

        public Criteria andMediaComNotIn(List<Integer> values) {
            addCriterion("MEDIA_COM not in", values, "mediaCom");
            return (Criteria) this;
        }

        public Criteria andMediaComBetween(Integer value1, Integer value2) {
            addCriterion("MEDIA_COM between", value1, value2, "mediaCom");
            return (Criteria) this;
        }

        public Criteria andMediaComNotBetween(Integer value1, Integer value2) {
            addCriterion("MEDIA_COM not between", value1, value2, "mediaCom");
            return (Criteria) this;
        }

        public Criteria andAdminLogoutIsNull() {
            addCriterion("ADMIN_LOGOUT is null");
            return (Criteria) this;
        }

        public Criteria andAdminLogoutIsNotNull() {
            addCriterion("ADMIN_LOGOUT is not null");
            return (Criteria) this;
        }

        public Criteria andAdminLogoutEqualTo(Integer value) {
            addCriterion("ADMIN_LOGOUT =", value, "adminLogout");
            return (Criteria) this;
        }

        public Criteria andAdminLogoutNotEqualTo(Integer value) {
            addCriterion("ADMIN_LOGOUT <>", value, "adminLogout");
            return (Criteria) this;
        }

        public Criteria andAdminLogoutGreaterThan(Integer value) {
            addCriterion("ADMIN_LOGOUT >", value, "adminLogout");
            return (Criteria) this;
        }

        public Criteria andAdminLogoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADMIN_LOGOUT >=", value, "adminLogout");
            return (Criteria) this;
        }

        public Criteria andAdminLogoutLessThan(Integer value) {
            addCriterion("ADMIN_LOGOUT <", value, "adminLogout");
            return (Criteria) this;
        }

        public Criteria andAdminLogoutLessThanOrEqualTo(Integer value) {
            addCriterion("ADMIN_LOGOUT <=", value, "adminLogout");
            return (Criteria) this;
        }

        public Criteria andAdminLogoutIn(List<Integer> values) {
            addCriterion("ADMIN_LOGOUT in", values, "adminLogout");
            return (Criteria) this;
        }

        public Criteria andAdminLogoutNotIn(List<Integer> values) {
            addCriterion("ADMIN_LOGOUT not in", values, "adminLogout");
            return (Criteria) this;
        }

        public Criteria andAdminLogoutBetween(Integer value1, Integer value2) {
            addCriterion("ADMIN_LOGOUT between", value1, value2, "adminLogout");
            return (Criteria) this;
        }

        public Criteria andAdminLogoutNotBetween(Integer value1, Integer value2) {
            addCriterion("ADMIN_LOGOUT not between", value1, value2, "adminLogout");
            return (Criteria) this;
        }

        public Criteria andOnlineStateIsNull() {
            addCriterion("ONLINE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStateIsNotNull() {
            addCriterion("ONLINE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStateEqualTo(Integer value) {
            addCriterion("ONLINE_STATE =", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateNotEqualTo(Integer value) {
            addCriterion("ONLINE_STATE <>", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateGreaterThan(Integer value) {
            addCriterion("ONLINE_STATE >", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ONLINE_STATE >=", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateLessThan(Integer value) {
            addCriterion("ONLINE_STATE <", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateLessThanOrEqualTo(Integer value) {
            addCriterion("ONLINE_STATE <=", value, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateIn(List<Integer> values) {
            addCriterion("ONLINE_STATE in", values, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateNotIn(List<Integer> values) {
            addCriterion("ONLINE_STATE not in", values, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateBetween(Integer value1, Integer value2) {
            addCriterion("ONLINE_STATE between", value1, value2, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOnlineStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ONLINE_STATE not between", value1, value2, "onlineState");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNull() {
            addCriterion("ORGANIZATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNotNull() {
            addCriterion("ORGANIZATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE =", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE <>", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThan(String value) {
            addCriterion("ORGANIZATION_CODE >", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE >=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThan(String value) {
            addCriterion("ORGANIZATION_CODE <", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_CODE <=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLike(String value) {
            addCriterion("ORGANIZATION_CODE like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotLike(String value) {
            addCriterion("ORGANIZATION_CODE not like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIn(List<String> values) {
            addCriterion("ORGANIZATION_CODE in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotIn(List<String> values) {
            addCriterion("ORGANIZATION_CODE not in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_CODE between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_CODE not between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andLocaleSortIsNull() {
            addCriterion("LOCALE_SORT is null");
            return (Criteria) this;
        }

        public Criteria andLocaleSortIsNotNull() {
            addCriterion("LOCALE_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleSortEqualTo(String value) {
            addCriterion("LOCALE_SORT =", value, "localeSort");
            return (Criteria) this;
        }

        public Criteria andLocaleSortNotEqualTo(String value) {
            addCriterion("LOCALE_SORT <>", value, "localeSort");
            return (Criteria) this;
        }

        public Criteria andLocaleSortGreaterThan(String value) {
            addCriterion("LOCALE_SORT >", value, "localeSort");
            return (Criteria) this;
        }

        public Criteria andLocaleSortGreaterThanOrEqualTo(String value) {
            addCriterion("LOCALE_SORT >=", value, "localeSort");
            return (Criteria) this;
        }

        public Criteria andLocaleSortLessThan(String value) {
            addCriterion("LOCALE_SORT <", value, "localeSort");
            return (Criteria) this;
        }

        public Criteria andLocaleSortLessThanOrEqualTo(String value) {
            addCriterion("LOCALE_SORT <=", value, "localeSort");
            return (Criteria) this;
        }

        public Criteria andLocaleSortLike(String value) {
            addCriterion("LOCALE_SORT like", value, "localeSort");
            return (Criteria) this;
        }

        public Criteria andLocaleSortNotLike(String value) {
            addCriterion("LOCALE_SORT not like", value, "localeSort");
            return (Criteria) this;
        }

        public Criteria andLocaleSortIn(List<String> values) {
            addCriterion("LOCALE_SORT in", values, "localeSort");
            return (Criteria) this;
        }

        public Criteria andLocaleSortNotIn(List<String> values) {
            addCriterion("LOCALE_SORT not in", values, "localeSort");
            return (Criteria) this;
        }

        public Criteria andLocaleSortBetween(String value1, String value2) {
            addCriterion("LOCALE_SORT between", value1, value2, "localeSort");
            return (Criteria) this;
        }

        public Criteria andLocaleSortNotBetween(String value1, String value2) {
            addCriterion("LOCALE_SORT not between", value1, value2, "localeSort");
            return (Criteria) this;
        }

        public Criteria andInterPeopleIsNull() {
            addCriterion("INTER_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andInterPeopleIsNotNull() {
            addCriterion("INTER_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andInterPeopleEqualTo(Integer value) {
            addCriterion("INTER_PEOPLE =", value, "interPeople");
            return (Criteria) this;
        }

        public Criteria andInterPeopleNotEqualTo(Integer value) {
            addCriterion("INTER_PEOPLE <>", value, "interPeople");
            return (Criteria) this;
        }

        public Criteria andInterPeopleGreaterThan(Integer value) {
            addCriterion("INTER_PEOPLE >", value, "interPeople");
            return (Criteria) this;
        }

        public Criteria andInterPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("INTER_PEOPLE >=", value, "interPeople");
            return (Criteria) this;
        }

        public Criteria andInterPeopleLessThan(Integer value) {
            addCriterion("INTER_PEOPLE <", value, "interPeople");
            return (Criteria) this;
        }

        public Criteria andInterPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("INTER_PEOPLE <=", value, "interPeople");
            return (Criteria) this;
        }

        public Criteria andInterPeopleIn(List<Integer> values) {
            addCriterion("INTER_PEOPLE in", values, "interPeople");
            return (Criteria) this;
        }

        public Criteria andInterPeopleNotIn(List<Integer> values) {
            addCriterion("INTER_PEOPLE not in", values, "interPeople");
            return (Criteria) this;
        }

        public Criteria andInterPeopleBetween(Integer value1, Integer value2) {
            addCriterion("INTER_PEOPLE between", value1, value2, "interPeople");
            return (Criteria) this;
        }

        public Criteria andInterPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("INTER_PEOPLE not between", value1, value2, "interPeople");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeIsNull() {
            addCriterion("LEAD_ID_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeIsNotNull() {
            addCriterion("LEAD_ID_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeEqualTo(String value) {
            addCriterion("LEAD_ID_CODE =", value, "leadIdCode");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeNotEqualTo(String value) {
            addCriterion("LEAD_ID_CODE <>", value, "leadIdCode");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeGreaterThan(String value) {
            addCriterion("LEAD_ID_CODE >", value, "leadIdCode");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LEAD_ID_CODE >=", value, "leadIdCode");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeLessThan(String value) {
            addCriterion("LEAD_ID_CODE <", value, "leadIdCode");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeLessThanOrEqualTo(String value) {
            addCriterion("LEAD_ID_CODE <=", value, "leadIdCode");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeLike(String value) {
            addCriterion("LEAD_ID_CODE like", value, "leadIdCode");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeNotLike(String value) {
            addCriterion("LEAD_ID_CODE not like", value, "leadIdCode");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeIn(List<String> values) {
            addCriterion("LEAD_ID_CODE in", values, "leadIdCode");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeNotIn(List<String> values) {
            addCriterion("LEAD_ID_CODE not in", values, "leadIdCode");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeBetween(String value1, String value2) {
            addCriterion("LEAD_ID_CODE between", value1, value2, "leadIdCode");
            return (Criteria) this;
        }

        public Criteria andLeadIdCodeNotBetween(String value1, String value2) {
            addCriterion("LEAD_ID_CODE not between", value1, value2, "leadIdCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeIsNull() {
            addCriterion("LEGAL_ID_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeIsNotNull() {
            addCriterion("LEGAL_ID_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeEqualTo(String value) {
            addCriterion("LEGAL_ID_CODE =", value, "legalIdCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeNotEqualTo(String value) {
            addCriterion("LEGAL_ID_CODE <>", value, "legalIdCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeGreaterThan(String value) {
            addCriterion("LEGAL_ID_CODE >", value, "legalIdCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_CODE >=", value, "legalIdCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeLessThan(String value) {
            addCriterion("LEGAL_ID_CODE <", value, "legalIdCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_ID_CODE <=", value, "legalIdCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeLike(String value) {
            addCriterion("LEGAL_ID_CODE like", value, "legalIdCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeNotLike(String value) {
            addCriterion("LEGAL_ID_CODE not like", value, "legalIdCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeIn(List<String> values) {
            addCriterion("LEGAL_ID_CODE in", values, "legalIdCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeNotIn(List<String> values) {
            addCriterion("LEGAL_ID_CODE not in", values, "legalIdCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_CODE between", value1, value2, "legalIdCode");
            return (Criteria) this;
        }

        public Criteria andLegalIdCodeNotBetween(String value1, String value2) {
            addCriterion("LEGAL_ID_CODE not between", value1, value2, "legalIdCode");
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