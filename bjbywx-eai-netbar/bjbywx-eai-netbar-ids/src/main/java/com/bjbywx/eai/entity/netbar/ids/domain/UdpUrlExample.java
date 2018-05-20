package com.bjbywx.eai.entity.netbar.ids.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UdpUrlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UdpUrlExample() {
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

        public Criteria andTypeSequenceIsNull() {
            addCriterion("TYPE_SEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceIsNotNull() {
            addCriterion("TYPE_SEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceEqualTo(Integer value) {
            addCriterion("TYPE_SEQUENCE =", value, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceNotEqualTo(Integer value) {
            addCriterion("TYPE_SEQUENCE <>", value, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceGreaterThan(Integer value) {
            addCriterion("TYPE_SEQUENCE >", value, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE_SEQUENCE >=", value, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceLessThan(Integer value) {
            addCriterion("TYPE_SEQUENCE <", value, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE_SEQUENCE <=", value, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceIn(List<Integer> values) {
            addCriterion("TYPE_SEQUENCE in", values, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceNotIn(List<Integer> values) {
            addCriterion("TYPE_SEQUENCE not in", values, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceBetween(Integer value1, Integer value2) {
            addCriterion("TYPE_SEQUENCE between", value1, value2, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE_SEQUENCE not between", value1, value2, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTotalSequenceIsNull() {
            addCriterion("TOTAL_SEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andTotalSequenceIsNotNull() {
            addCriterion("TOTAL_SEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSequenceEqualTo(Integer value) {
            addCriterion("TOTAL_SEQUENCE =", value, "totalSequence");
            return (Criteria) this;
        }

        public Criteria andTotalSequenceNotEqualTo(Integer value) {
            addCriterion("TOTAL_SEQUENCE <>", value, "totalSequence");
            return (Criteria) this;
        }

        public Criteria andTotalSequenceGreaterThan(Integer value) {
            addCriterion("TOTAL_SEQUENCE >", value, "totalSequence");
            return (Criteria) this;
        }

        public Criteria andTotalSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_SEQUENCE >=", value, "totalSequence");
            return (Criteria) this;
        }

        public Criteria andTotalSequenceLessThan(Integer value) {
            addCriterion("TOTAL_SEQUENCE <", value, "totalSequence");
            return (Criteria) this;
        }

        public Criteria andTotalSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("TOTAL_SEQUENCE <=", value, "totalSequence");
            return (Criteria) this;
        }

        public Criteria andTotalSequenceIn(List<Integer> values) {
            addCriterion("TOTAL_SEQUENCE in", values, "totalSequence");
            return (Criteria) this;
        }

        public Criteria andTotalSequenceNotIn(List<Integer> values) {
            addCriterion("TOTAL_SEQUENCE not in", values, "totalSequence");
            return (Criteria) this;
        }

        public Criteria andTotalSequenceBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_SEQUENCE between", value1, value2, "totalSequence");
            return (Criteria) this;
        }

        public Criteria andTotalSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("TOTAL_SEQUENCE not between", value1, value2, "totalSequence");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("UPDATE_AT is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("UPDATE_AT is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("UPDATE_AT =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("UPDATE_AT <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("UPDATE_AT >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_AT >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("UPDATE_AT <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_AT <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("UPDATE_AT in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("UPDATE_AT not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("UPDATE_AT between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_AT not between", value1, value2, "updateAt");
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