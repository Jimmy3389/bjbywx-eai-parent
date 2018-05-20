package com.bjbywx.eai.entity.netbar.bmc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NetbarOnlineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NetbarOnlineExample() {
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

        public Criteria andPoliceCodeIsNull() {
            addCriterion("POLICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeIsNotNull() {
            addCriterion("POLICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeEqualTo(String value) {
            addCriterion("POLICE_CODE =", value, "policeCode");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeNotEqualTo(String value) {
            addCriterion("POLICE_CODE <>", value, "policeCode");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeGreaterThan(String value) {
            addCriterion("POLICE_CODE >", value, "policeCode");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POLICE_CODE >=", value, "policeCode");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeLessThan(String value) {
            addCriterion("POLICE_CODE <", value, "policeCode");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeLessThanOrEqualTo(String value) {
            addCriterion("POLICE_CODE <=", value, "policeCode");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeLike(String value) {
            addCriterion("POLICE_CODE like", value, "policeCode");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeNotLike(String value) {
            addCriterion("POLICE_CODE not like", value, "policeCode");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeIn(List<String> values) {
            addCriterion("POLICE_CODE in", values, "policeCode");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeNotIn(List<String> values) {
            addCriterion("POLICE_CODE not in", values, "policeCode");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeBetween(String value1, String value2) {
            addCriterion("POLICE_CODE between", value1, value2, "policeCode");
            return (Criteria) this;
        }

        public Criteria andPoliceCodeNotBetween(String value1, String value2) {
            addCriterion("POLICE_CODE not between", value1, value2, "policeCode");
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

        public Criteria andIsStopIsNull() {
            addCriterion("IS_STOP is null");
            return (Criteria) this;
        }

        public Criteria andIsStopIsNotNull() {
            addCriterion("IS_STOP is not null");
            return (Criteria) this;
        }

        public Criteria andIsStopEqualTo(Integer value) {
            addCriterion("IS_STOP =", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopNotEqualTo(Integer value) {
            addCriterion("IS_STOP <>", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopGreaterThan(Integer value) {
            addCriterion("IS_STOP >", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_STOP >=", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopLessThan(Integer value) {
            addCriterion("IS_STOP <", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopLessThanOrEqualTo(Integer value) {
            addCriterion("IS_STOP <=", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopIn(List<Integer> values) {
            addCriterion("IS_STOP in", values, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopNotIn(List<Integer> values) {
            addCriterion("IS_STOP not in", values, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopBetween(Integer value1, Integer value2) {
            addCriterion("IS_STOP between", value1, value2, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_STOP not between", value1, value2, "isStop");
            return (Criteria) this;
        }

        public Criteria andServiceIsOnlineIsNull() {
            addCriterion("SERVICE_IS_ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsOnlineIsNotNull() {
            addCriterion("SERVICE_IS_ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIsOnlineEqualTo(Integer value) {
            addCriterion("SERVICE_IS_ONLINE =", value, "serviceIsOnline");
            return (Criteria) this;
        }

        public Criteria andServiceIsOnlineNotEqualTo(Integer value) {
            addCriterion("SERVICE_IS_ONLINE <>", value, "serviceIsOnline");
            return (Criteria) this;
        }

        public Criteria andServiceIsOnlineGreaterThan(Integer value) {
            addCriterion("SERVICE_IS_ONLINE >", value, "serviceIsOnline");
            return (Criteria) this;
        }

        public Criteria andServiceIsOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_IS_ONLINE >=", value, "serviceIsOnline");
            return (Criteria) this;
        }

        public Criteria andServiceIsOnlineLessThan(Integer value) {
            addCriterion("SERVICE_IS_ONLINE <", value, "serviceIsOnline");
            return (Criteria) this;
        }

        public Criteria andServiceIsOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_IS_ONLINE <=", value, "serviceIsOnline");
            return (Criteria) this;
        }

        public Criteria andServiceIsOnlineIn(List<Integer> values) {
            addCriterion("SERVICE_IS_ONLINE in", values, "serviceIsOnline");
            return (Criteria) this;
        }

        public Criteria andServiceIsOnlineNotIn(List<Integer> values) {
            addCriterion("SERVICE_IS_ONLINE not in", values, "serviceIsOnline");
            return (Criteria) this;
        }

        public Criteria andServiceIsOnlineBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_IS_ONLINE between", value1, value2, "serviceIsOnline");
            return (Criteria) this;
        }

        public Criteria andServiceIsOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_IS_ONLINE not between", value1, value2, "serviceIsOnline");
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

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
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