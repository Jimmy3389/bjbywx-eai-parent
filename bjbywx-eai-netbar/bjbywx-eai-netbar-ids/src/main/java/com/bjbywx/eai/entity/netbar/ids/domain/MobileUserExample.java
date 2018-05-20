package com.bjbywx.eai.entity.netbar.ids.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MobileUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MobileUserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
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

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andVerifyIsNull() {
            addCriterion("VERIFY is null");
            return (Criteria) this;
        }

        public Criteria andVerifyIsNotNull() {
            addCriterion("VERIFY is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyEqualTo(String value) {
            addCriterion("VERIFY =", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotEqualTo(String value) {
            addCriterion("VERIFY <>", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyGreaterThan(String value) {
            addCriterion("VERIFY >", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY >=", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyLessThan(String value) {
            addCriterion("VERIFY <", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyLessThanOrEqualTo(String value) {
            addCriterion("VERIFY <=", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyLike(String value) {
            addCriterion("VERIFY like", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotLike(String value) {
            addCriterion("VERIFY not like", value, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyIn(List<String> values) {
            addCriterion("VERIFY in", values, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotIn(List<String> values) {
            addCriterion("VERIFY not in", values, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyBetween(String value1, String value2) {
            addCriterion("VERIFY between", value1, value2, "verify");
            return (Criteria) this;
        }

        public Criteria andVerifyNotBetween(String value1, String value2) {
            addCriterion("VERIFY not between", value1, value2, "verify");
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

        public Criteria andKeyIsNull() {
            addCriterion("KEY is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("KEY is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("KEY =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("KEY <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("KEY >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("KEY >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("KEY <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("KEY <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("KEY like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("KEY not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("KEY in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("KEY not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("KEY between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("KEY not between", value1, value2, "key");
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

        public Criteria andRegTmIsNull() {
            addCriterion("REG_TM is null");
            return (Criteria) this;
        }

        public Criteria andRegTmIsNotNull() {
            addCriterion("REG_TM is not null");
            return (Criteria) this;
        }

        public Criteria andRegTmEqualTo(Date value) {
            addCriterion("REG_TM =", value, "regTm");
            return (Criteria) this;
        }

        public Criteria andRegTmNotEqualTo(Date value) {
            addCriterion("REG_TM <>", value, "regTm");
            return (Criteria) this;
        }

        public Criteria andRegTmGreaterThan(Date value) {
            addCriterion("REG_TM >", value, "regTm");
            return (Criteria) this;
        }

        public Criteria andRegTmGreaterThanOrEqualTo(Date value) {
            addCriterion("REG_TM >=", value, "regTm");
            return (Criteria) this;
        }

        public Criteria andRegTmLessThan(Date value) {
            addCriterion("REG_TM <", value, "regTm");
            return (Criteria) this;
        }

        public Criteria andRegTmLessThanOrEqualTo(Date value) {
            addCriterion("REG_TM <=", value, "regTm");
            return (Criteria) this;
        }

        public Criteria andRegTmIn(List<Date> values) {
            addCriterion("REG_TM in", values, "regTm");
            return (Criteria) this;
        }

        public Criteria andRegTmNotIn(List<Date> values) {
            addCriterion("REG_TM not in", values, "regTm");
            return (Criteria) this;
        }

        public Criteria andRegTmBetween(Date value1, Date value2) {
            addCriterion("REG_TM between", value1, value2, "regTm");
            return (Criteria) this;
        }

        public Criteria andRegTmNotBetween(Date value1, Date value2) {
            addCriterion("REG_TM not between", value1, value2, "regTm");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyIsNull() {
            addCriterion("REG_USER_KEY is null");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyIsNotNull() {
            addCriterion("REG_USER_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyEqualTo(String value) {
            addCriterion("REG_USER_KEY =", value, "regUserKey");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyNotEqualTo(String value) {
            addCriterion("REG_USER_KEY <>", value, "regUserKey");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyGreaterThan(String value) {
            addCriterion("REG_USER_KEY >", value, "regUserKey");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyGreaterThanOrEqualTo(String value) {
            addCriterion("REG_USER_KEY >=", value, "regUserKey");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyLessThan(String value) {
            addCriterion("REG_USER_KEY <", value, "regUserKey");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyLessThanOrEqualTo(String value) {
            addCriterion("REG_USER_KEY <=", value, "regUserKey");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyLike(String value) {
            addCriterion("REG_USER_KEY like", value, "regUserKey");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyNotLike(String value) {
            addCriterion("REG_USER_KEY not like", value, "regUserKey");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyIn(List<String> values) {
            addCriterion("REG_USER_KEY in", values, "regUserKey");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyNotIn(List<String> values) {
            addCriterion("REG_USER_KEY not in", values, "regUserKey");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyBetween(String value1, String value2) {
            addCriterion("REG_USER_KEY between", value1, value2, "regUserKey");
            return (Criteria) this;
        }

        public Criteria andRegUserKeyNotBetween(String value1, String value2) {
            addCriterion("REG_USER_KEY not between", value1, value2, "regUserKey");
            return (Criteria) this;
        }

        public Criteria andIdAddressIsNull() {
            addCriterion("ID_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andIdAddressIsNotNull() {
            addCriterion("ID_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andIdAddressEqualTo(String value) {
            addCriterion("ID_ADDRESS =", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressNotEqualTo(String value) {
            addCriterion("ID_ADDRESS <>", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressGreaterThan(String value) {
            addCriterion("ID_ADDRESS >", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ID_ADDRESS >=", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressLessThan(String value) {
            addCriterion("ID_ADDRESS <", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressLessThanOrEqualTo(String value) {
            addCriterion("ID_ADDRESS <=", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressLike(String value) {
            addCriterion("ID_ADDRESS like", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressNotLike(String value) {
            addCriterion("ID_ADDRESS not like", value, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressIn(List<String> values) {
            addCriterion("ID_ADDRESS in", values, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressNotIn(List<String> values) {
            addCriterion("ID_ADDRESS not in", values, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressBetween(String value1, String value2) {
            addCriterion("ID_ADDRESS between", value1, value2, "idAddress");
            return (Criteria) this;
        }

        public Criteria andIdAddressNotBetween(String value1, String value2) {
            addCriterion("ID_ADDRESS not between", value1, value2, "idAddress");
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

        public Criteria andLimitDateIsNull() {
            addCriterion("LIMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLimitDateIsNotNull() {
            addCriterion("LIMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLimitDateEqualTo(Date value) {
            addCriterion("LIMIT_DATE =", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotEqualTo(Date value) {
            addCriterion("LIMIT_DATE <>", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateGreaterThan(Date value) {
            addCriterion("LIMIT_DATE >", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LIMIT_DATE >=", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLessThan(Date value) {
            addCriterion("LIMIT_DATE <", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLessThanOrEqualTo(Date value) {
            addCriterion("LIMIT_DATE <=", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateIn(List<Date> values) {
            addCriterion("LIMIT_DATE in", values, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotIn(List<Date> values) {
            addCriterion("LIMIT_DATE not in", values, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateBetween(Date value1, Date value2) {
            addCriterion("LIMIT_DATE between", value1, value2, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotBetween(Date value1, Date value2) {
            addCriterion("LIMIT_DATE not between", value1, value2, "limitDate");
            return (Criteria) this;
        }

        public Criteria andIncepttimeIsNull() {
            addCriterion("INCEPTTIME is null");
            return (Criteria) this;
        }

        public Criteria andIncepttimeIsNotNull() {
            addCriterion("INCEPTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andIncepttimeEqualTo(Date value) {
            addCriterionForJDBCDate("INCEPTTIME =", value, "incepttime");
            return (Criteria) this;
        }

        public Criteria andIncepttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("INCEPTTIME <>", value, "incepttime");
            return (Criteria) this;
        }

        public Criteria andIncepttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("INCEPTTIME >", value, "incepttime");
            return (Criteria) this;
        }

        public Criteria andIncepttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INCEPTTIME >=", value, "incepttime");
            return (Criteria) this;
        }

        public Criteria andIncepttimeLessThan(Date value) {
            addCriterionForJDBCDate("INCEPTTIME <", value, "incepttime");
            return (Criteria) this;
        }

        public Criteria andIncepttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INCEPTTIME <=", value, "incepttime");
            return (Criteria) this;
        }

        public Criteria andIncepttimeIn(List<Date> values) {
            addCriterionForJDBCDate("INCEPTTIME in", values, "incepttime");
            return (Criteria) this;
        }

        public Criteria andIncepttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("INCEPTTIME not in", values, "incepttime");
            return (Criteria) this;
        }

        public Criteria andIncepttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INCEPTTIME between", value1, value2, "incepttime");
            return (Criteria) this;
        }

        public Criteria andIncepttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INCEPTTIME not between", value1, value2, "incepttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameIsNull() {
            addCriterion("DISBIND_USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameIsNotNull() {
            addCriterion("DISBIND_USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameEqualTo(String value) {
            addCriterion("DISBIND_USER_NAME =", value, "disbindUserName");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameNotEqualTo(String value) {
            addCriterion("DISBIND_USER_NAME <>", value, "disbindUserName");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameGreaterThan(String value) {
            addCriterion("DISBIND_USER_NAME >", value, "disbindUserName");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("DISBIND_USER_NAME >=", value, "disbindUserName");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameLessThan(String value) {
            addCriterion("DISBIND_USER_NAME <", value, "disbindUserName");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameLessThanOrEqualTo(String value) {
            addCriterion("DISBIND_USER_NAME <=", value, "disbindUserName");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameLike(String value) {
            addCriterion("DISBIND_USER_NAME like", value, "disbindUserName");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameNotLike(String value) {
            addCriterion("DISBIND_USER_NAME not like", value, "disbindUserName");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameIn(List<String> values) {
            addCriterion("DISBIND_USER_NAME in", values, "disbindUserName");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameNotIn(List<String> values) {
            addCriterion("DISBIND_USER_NAME not in", values, "disbindUserName");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameBetween(String value1, String value2) {
            addCriterion("DISBIND_USER_NAME between", value1, value2, "disbindUserName");
            return (Criteria) this;
        }

        public Criteria andDisbindUserNameNotBetween(String value1, String value2) {
            addCriterion("DISBIND_USER_NAME not between", value1, value2, "disbindUserName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andDisbindTmIsNull() {
            addCriterion("DISBIND_TM is null");
            return (Criteria) this;
        }

        public Criteria andDisbindTmIsNotNull() {
            addCriterion("DISBIND_TM is not null");
            return (Criteria) this;
        }

        public Criteria andDisbindTmEqualTo(Date value) {
            addCriterion("DISBIND_TM =", value, "disbindTm");
            return (Criteria) this;
        }

        public Criteria andDisbindTmNotEqualTo(Date value) {
            addCriterion("DISBIND_TM <>", value, "disbindTm");
            return (Criteria) this;
        }

        public Criteria andDisbindTmGreaterThan(Date value) {
            addCriterion("DISBIND_TM >", value, "disbindTm");
            return (Criteria) this;
        }

        public Criteria andDisbindTmGreaterThanOrEqualTo(Date value) {
            addCriterion("DISBIND_TM >=", value, "disbindTm");
            return (Criteria) this;
        }

        public Criteria andDisbindTmLessThan(Date value) {
            addCriterion("DISBIND_TM <", value, "disbindTm");
            return (Criteria) this;
        }

        public Criteria andDisbindTmLessThanOrEqualTo(Date value) {
            addCriterion("DISBIND_TM <=", value, "disbindTm");
            return (Criteria) this;
        }

        public Criteria andDisbindTmIn(List<Date> values) {
            addCriterion("DISBIND_TM in", values, "disbindTm");
            return (Criteria) this;
        }

        public Criteria andDisbindTmNotIn(List<Date> values) {
            addCriterion("DISBIND_TM not in", values, "disbindTm");
            return (Criteria) this;
        }

        public Criteria andDisbindTmBetween(Date value1, Date value2) {
            addCriterion("DISBIND_TM between", value1, value2, "disbindTm");
            return (Criteria) this;
        }

        public Criteria andDisbindTmNotBetween(Date value1, Date value2) {
            addCriterion("DISBIND_TM not between", value1, value2, "disbindTm");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("TAG is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("TAG is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(Integer value) {
            addCriterion("TAG =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(Integer value) {
            addCriterion("TAG <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(Integer value) {
            addCriterion("TAG >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("TAG >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(Integer value) {
            addCriterion("TAG <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(Integer value) {
            addCriterion("TAG <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<Integer> values) {
            addCriterion("TAG in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<Integer> values) {
            addCriterion("TAG not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(Integer value1, Integer value2) {
            addCriterion("TAG between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(Integer value1, Integer value2) {
            addCriterion("TAG not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andOkngstatusIsNull() {
            addCriterion("OKNGSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andOkngstatusIsNotNull() {
            addCriterion("OKNGSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOkngstatusEqualTo(Integer value) {
            addCriterion("OKNGSTATUS =", value, "okngstatus");
            return (Criteria) this;
        }

        public Criteria andOkngstatusNotEqualTo(Integer value) {
            addCriterion("OKNGSTATUS <>", value, "okngstatus");
            return (Criteria) this;
        }

        public Criteria andOkngstatusGreaterThan(Integer value) {
            addCriterion("OKNGSTATUS >", value, "okngstatus");
            return (Criteria) this;
        }

        public Criteria andOkngstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("OKNGSTATUS >=", value, "okngstatus");
            return (Criteria) this;
        }

        public Criteria andOkngstatusLessThan(Integer value) {
            addCriterion("OKNGSTATUS <", value, "okngstatus");
            return (Criteria) this;
        }

        public Criteria andOkngstatusLessThanOrEqualTo(Integer value) {
            addCriterion("OKNGSTATUS <=", value, "okngstatus");
            return (Criteria) this;
        }

        public Criteria andOkngstatusIn(List<Integer> values) {
            addCriterion("OKNGSTATUS in", values, "okngstatus");
            return (Criteria) this;
        }

        public Criteria andOkngstatusNotIn(List<Integer> values) {
            addCriterion("OKNGSTATUS not in", values, "okngstatus");
            return (Criteria) this;
        }

        public Criteria andOkngstatusBetween(Integer value1, Integer value2) {
            addCriterion("OKNGSTATUS between", value1, value2, "okngstatus");
            return (Criteria) this;
        }

        public Criteria andOkngstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("OKNGSTATUS not between", value1, value2, "okngstatus");
            return (Criteria) this;
        }

        public Criteria andOkngusernameIsNull() {
            addCriterion("OKNGUSERNAME is null");
            return (Criteria) this;
        }

        public Criteria andOkngusernameIsNotNull() {
            addCriterion("OKNGUSERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOkngusernameEqualTo(String value) {
            addCriterion("OKNGUSERNAME =", value, "okngusername");
            return (Criteria) this;
        }

        public Criteria andOkngusernameNotEqualTo(String value) {
            addCriterion("OKNGUSERNAME <>", value, "okngusername");
            return (Criteria) this;
        }

        public Criteria andOkngusernameGreaterThan(String value) {
            addCriterion("OKNGUSERNAME >", value, "okngusername");
            return (Criteria) this;
        }

        public Criteria andOkngusernameGreaterThanOrEqualTo(String value) {
            addCriterion("OKNGUSERNAME >=", value, "okngusername");
            return (Criteria) this;
        }

        public Criteria andOkngusernameLessThan(String value) {
            addCriterion("OKNGUSERNAME <", value, "okngusername");
            return (Criteria) this;
        }

        public Criteria andOkngusernameLessThanOrEqualTo(String value) {
            addCriterion("OKNGUSERNAME <=", value, "okngusername");
            return (Criteria) this;
        }

        public Criteria andOkngusernameLike(String value) {
            addCriterion("OKNGUSERNAME like", value, "okngusername");
            return (Criteria) this;
        }

        public Criteria andOkngusernameNotLike(String value) {
            addCriterion("OKNGUSERNAME not like", value, "okngusername");
            return (Criteria) this;
        }

        public Criteria andOkngusernameIn(List<String> values) {
            addCriterion("OKNGUSERNAME in", values, "okngusername");
            return (Criteria) this;
        }

        public Criteria andOkngusernameNotIn(List<String> values) {
            addCriterion("OKNGUSERNAME not in", values, "okngusername");
            return (Criteria) this;
        }

        public Criteria andOkngusernameBetween(String value1, String value2) {
            addCriterion("OKNGUSERNAME between", value1, value2, "okngusername");
            return (Criteria) this;
        }

        public Criteria andOkngusernameNotBetween(String value1, String value2) {
            addCriterion("OKNGUSERNAME not between", value1, value2, "okngusername");
            return (Criteria) this;
        }

        public Criteria andOkngtmIsNull() {
            addCriterion("OKNGTM is null");
            return (Criteria) this;
        }

        public Criteria andOkngtmIsNotNull() {
            addCriterion("OKNGTM is not null");
            return (Criteria) this;
        }

        public Criteria andOkngtmEqualTo(Date value) {
            addCriterion("OKNGTM =", value, "okngtm");
            return (Criteria) this;
        }

        public Criteria andOkngtmNotEqualTo(Date value) {
            addCriterion("OKNGTM <>", value, "okngtm");
            return (Criteria) this;
        }

        public Criteria andOkngtmGreaterThan(Date value) {
            addCriterion("OKNGTM >", value, "okngtm");
            return (Criteria) this;
        }

        public Criteria andOkngtmGreaterThanOrEqualTo(Date value) {
            addCriterion("OKNGTM >=", value, "okngtm");
            return (Criteria) this;
        }

        public Criteria andOkngtmLessThan(Date value) {
            addCriterion("OKNGTM <", value, "okngtm");
            return (Criteria) this;
        }

        public Criteria andOkngtmLessThanOrEqualTo(Date value) {
            addCriterion("OKNGTM <=", value, "okngtm");
            return (Criteria) this;
        }

        public Criteria andOkngtmIn(List<Date> values) {
            addCriterion("OKNGTM in", values, "okngtm");
            return (Criteria) this;
        }

        public Criteria andOkngtmNotIn(List<Date> values) {
            addCriterion("OKNGTM not in", values, "okngtm");
            return (Criteria) this;
        }

        public Criteria andOkngtmBetween(Date value1, Date value2) {
            addCriterion("OKNGTM between", value1, value2, "okngtm");
            return (Criteria) this;
        }

        public Criteria andOkngtmNotBetween(Date value1, Date value2) {
            addCriterion("OKNGTM not between", value1, value2, "okngtm");
            return (Criteria) this;
        }

        public Criteria andNgreasonIsNull() {
            addCriterion("NGREASON is null");
            return (Criteria) this;
        }

        public Criteria andNgreasonIsNotNull() {
            addCriterion("NGREASON is not null");
            return (Criteria) this;
        }

        public Criteria andNgreasonEqualTo(String value) {
            addCriterion("NGREASON =", value, "ngreason");
            return (Criteria) this;
        }

        public Criteria andNgreasonNotEqualTo(String value) {
            addCriterion("NGREASON <>", value, "ngreason");
            return (Criteria) this;
        }

        public Criteria andNgreasonGreaterThan(String value) {
            addCriterion("NGREASON >", value, "ngreason");
            return (Criteria) this;
        }

        public Criteria andNgreasonGreaterThanOrEqualTo(String value) {
            addCriterion("NGREASON >=", value, "ngreason");
            return (Criteria) this;
        }

        public Criteria andNgreasonLessThan(String value) {
            addCriterion("NGREASON <", value, "ngreason");
            return (Criteria) this;
        }

        public Criteria andNgreasonLessThanOrEqualTo(String value) {
            addCriterion("NGREASON <=", value, "ngreason");
            return (Criteria) this;
        }

        public Criteria andNgreasonLike(String value) {
            addCriterion("NGREASON like", value, "ngreason");
            return (Criteria) this;
        }

        public Criteria andNgreasonNotLike(String value) {
            addCriterion("NGREASON not like", value, "ngreason");
            return (Criteria) this;
        }

        public Criteria andNgreasonIn(List<String> values) {
            addCriterion("NGREASON in", values, "ngreason");
            return (Criteria) this;
        }

        public Criteria andNgreasonNotIn(List<String> values) {
            addCriterion("NGREASON not in", values, "ngreason");
            return (Criteria) this;
        }

        public Criteria andNgreasonBetween(String value1, String value2) {
            addCriterion("NGREASON between", value1, value2, "ngreason");
            return (Criteria) this;
        }

        public Criteria andNgreasonNotBetween(String value1, String value2) {
            addCriterion("NGREASON not between", value1, value2, "ngreason");
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