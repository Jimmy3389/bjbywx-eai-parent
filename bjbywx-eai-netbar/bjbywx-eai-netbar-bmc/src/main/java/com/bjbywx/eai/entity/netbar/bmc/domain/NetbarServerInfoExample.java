package com.bjbywx.eai.entity.netbar.bmc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NetbarServerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NetbarServerInfoExample() {
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

        public Criteria andStartAtIsNull() {
            addCriterion("START_AT is null");
            return (Criteria) this;
        }

        public Criteria andStartAtIsNotNull() {
            addCriterion("START_AT is not null");
            return (Criteria) this;
        }

        public Criteria andStartAtEqualTo(Date value) {
            addCriterion("START_AT =", value, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtNotEqualTo(Date value) {
            addCriterion("START_AT <>", value, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtGreaterThan(Date value) {
            addCriterion("START_AT >", value, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtGreaterThanOrEqualTo(Date value) {
            addCriterion("START_AT >=", value, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtLessThan(Date value) {
            addCriterion("START_AT <", value, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtLessThanOrEqualTo(Date value) {
            addCriterion("START_AT <=", value, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtIn(List<Date> values) {
            addCriterion("START_AT in", values, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtNotIn(List<Date> values) {
            addCriterion("START_AT not in", values, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtBetween(Date value1, Date value2) {
            addCriterion("START_AT between", value1, value2, "startAt");
            return (Criteria) this;
        }

        public Criteria andStartAtNotBetween(Date value1, Date value2) {
            addCriterion("START_AT not between", value1, value2, "startAt");
            return (Criteria) this;
        }

        public Criteria andEndAtIsNull() {
            addCriterion("END_AT is null");
            return (Criteria) this;
        }

        public Criteria andEndAtIsNotNull() {
            addCriterion("END_AT is not null");
            return (Criteria) this;
        }

        public Criteria andEndAtEqualTo(Date value) {
            addCriterion("END_AT =", value, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtNotEqualTo(Date value) {
            addCriterion("END_AT <>", value, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtGreaterThan(Date value) {
            addCriterion("END_AT >", value, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtGreaterThanOrEqualTo(Date value) {
            addCriterion("END_AT >=", value, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtLessThan(Date value) {
            addCriterion("END_AT <", value, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtLessThanOrEqualTo(Date value) {
            addCriterion("END_AT <=", value, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtIn(List<Date> values) {
            addCriterion("END_AT in", values, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtNotIn(List<Date> values) {
            addCriterion("END_AT not in", values, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtBetween(Date value1, Date value2) {
            addCriterion("END_AT between", value1, value2, "endAt");
            return (Criteria) this;
        }

        public Criteria andEndAtNotBetween(Date value1, Date value2) {
            addCriterion("END_AT not between", value1, value2, "endAt");
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

        public Criteria andCountIsNull() {
            addCriterion("COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("COUNT =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("COUNT <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("COUNT >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("COUNT <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("COUNT <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("COUNT in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("COUNT not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("COUNT between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT not between", value1, value2, "count");
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