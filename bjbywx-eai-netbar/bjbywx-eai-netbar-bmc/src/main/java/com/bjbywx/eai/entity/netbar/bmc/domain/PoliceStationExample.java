package com.bjbywx.eai.entity.netbar.bmc.domain;

import java.util.ArrayList;
import java.util.List;

public class PoliceStationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoliceStationExample() {
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

        public Criteria andPoliceNameIsNull() {
            addCriterion("POLICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPoliceNameIsNotNull() {
            addCriterion("POLICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceNameEqualTo(String value) {
            addCriterion("POLICE_NAME =", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotEqualTo(String value) {
            addCriterion("POLICE_NAME <>", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameGreaterThan(String value) {
            addCriterion("POLICE_NAME >", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameGreaterThanOrEqualTo(String value) {
            addCriterion("POLICE_NAME >=", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameLessThan(String value) {
            addCriterion("POLICE_NAME <", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameLessThanOrEqualTo(String value) {
            addCriterion("POLICE_NAME <=", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameLike(String value) {
            addCriterion("POLICE_NAME like", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotLike(String value) {
            addCriterion("POLICE_NAME not like", value, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameIn(List<String> values) {
            addCriterion("POLICE_NAME in", values, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotIn(List<String> values) {
            addCriterion("POLICE_NAME not in", values, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameBetween(String value1, String value2) {
            addCriterion("POLICE_NAME between", value1, value2, "policeName");
            return (Criteria) this;
        }

        public Criteria andPoliceNameNotBetween(String value1, String value2) {
            addCriterion("POLICE_NAME not between", value1, value2, "policeName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaIsNull() {
            addCriterion("POLICE_AREA is null");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaIsNotNull() {
            addCriterion("POLICE_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaEqualTo(String value) {
            addCriterion("POLICE_AREA =", value, "policeArea");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaNotEqualTo(String value) {
            addCriterion("POLICE_AREA <>", value, "policeArea");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaGreaterThan(String value) {
            addCriterion("POLICE_AREA >", value, "policeArea");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaGreaterThanOrEqualTo(String value) {
            addCriterion("POLICE_AREA >=", value, "policeArea");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaLessThan(String value) {
            addCriterion("POLICE_AREA <", value, "policeArea");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaLessThanOrEqualTo(String value) {
            addCriterion("POLICE_AREA <=", value, "policeArea");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaLike(String value) {
            addCriterion("POLICE_AREA like", value, "policeArea");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaNotLike(String value) {
            addCriterion("POLICE_AREA not like", value, "policeArea");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaIn(List<String> values) {
            addCriterion("POLICE_AREA in", values, "policeArea");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaNotIn(List<String> values) {
            addCriterion("POLICE_AREA not in", values, "policeArea");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaBetween(String value1, String value2) {
            addCriterion("POLICE_AREA between", value1, value2, "policeArea");
            return (Criteria) this;
        }

        public Criteria andPoliceAreaNotBetween(String value1, String value2) {
            addCriterion("POLICE_AREA not between", value1, value2, "policeArea");
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