package com.bjbywx.eai.entity.netbar.bmc.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NetbarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NetbarExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andServiceNameIsNull() {
            addCriterion("SERVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("SERVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("SERVICE_NAME =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("SERVICE_NAME <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("SERVICE_NAME >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("SERVICE_NAME <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("SERVICE_NAME like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("SERVICE_NAME not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("SERVICE_NAME in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("SERVICE_NAME not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andZipIsNull() {
            addCriterion("ZIP is null");
            return (Criteria) this;
        }

        public Criteria andZipIsNotNull() {
            addCriterion("ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andZipEqualTo(String value) {
            addCriterion("ZIP =", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotEqualTo(String value) {
            addCriterion("ZIP <>", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThan(String value) {
            addCriterion("ZIP >", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP >=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThan(String value) {
            addCriterion("ZIP <", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThanOrEqualTo(String value) {
            addCriterion("ZIP <=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLike(String value) {
            addCriterion("ZIP like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotLike(String value) {
            addCriterion("ZIP not like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipIn(List<String> values) {
            addCriterion("ZIP in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotIn(List<String> values) {
            addCriterion("ZIP not in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipBetween(String value1, String value2) {
            addCriterion("ZIP between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotBetween(String value1, String value2) {
            addCriterion("ZIP not between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNull() {
            addCriterion("PRINCIPAL is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalIsNotNull() {
            addCriterion("PRINCIPAL is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalEqualTo(String value) {
            addCriterion("PRINCIPAL =", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotEqualTo(String value) {
            addCriterion("PRINCIPAL <>", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThan(String value) {
            addCriterion("PRINCIPAL >", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL >=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThan(String value) {
            addCriterion("PRINCIPAL <", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL <=", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalLike(String value) {
            addCriterion("PRINCIPAL like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotLike(String value) {
            addCriterion("PRINCIPAL not like", value, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalIn(List<String> values) {
            addCriterion("PRINCIPAL in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotIn(List<String> values) {
            addCriterion("PRINCIPAL not in", values, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalBetween(String value1, String value2) {
            addCriterion("PRINCIPAL between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalNotBetween(String value1, String value2) {
            addCriterion("PRINCIPAL not between", value1, value2, "principal");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelIsNull() {
            addCriterion("PRINCIPAL_TEL is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelIsNotNull() {
            addCriterion("PRINCIPAL_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelEqualTo(String value) {
            addCriterion("PRINCIPAL_TEL =", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelNotEqualTo(String value) {
            addCriterion("PRINCIPAL_TEL <>", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelGreaterThan(String value) {
            addCriterion("PRINCIPAL_TEL >", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelGreaterThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL_TEL >=", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelLessThan(String value) {
            addCriterion("PRINCIPAL_TEL <", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelLessThanOrEqualTo(String value) {
            addCriterion("PRINCIPAL_TEL <=", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelLike(String value) {
            addCriterion("PRINCIPAL_TEL like", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelNotLike(String value) {
            addCriterion("PRINCIPAL_TEL not like", value, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelIn(List<String> values) {
            addCriterion("PRINCIPAL_TEL in", values, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelNotIn(List<String> values) {
            addCriterion("PRINCIPAL_TEL not in", values, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelBetween(String value1, String value2) {
            addCriterion("PRINCIPAL_TEL between", value1, value2, "principalTel");
            return (Criteria) this;
        }

        public Criteria andPrincipalTelNotBetween(String value1, String value2) {
            addCriterion("PRINCIPAL_TEL not between", value1, value2, "principalTel");
            return (Criteria) this;
        }

        public Criteria andInforManIsNull() {
            addCriterion("INFOR_MAN is null");
            return (Criteria) this;
        }

        public Criteria andInforManIsNotNull() {
            addCriterion("INFOR_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andInforManEqualTo(String value) {
            addCriterion("INFOR_MAN =", value, "inforMan");
            return (Criteria) this;
        }

        public Criteria andInforManNotEqualTo(String value) {
            addCriterion("INFOR_MAN <>", value, "inforMan");
            return (Criteria) this;
        }

        public Criteria andInforManGreaterThan(String value) {
            addCriterion("INFOR_MAN >", value, "inforMan");
            return (Criteria) this;
        }

        public Criteria andInforManGreaterThanOrEqualTo(String value) {
            addCriterion("INFOR_MAN >=", value, "inforMan");
            return (Criteria) this;
        }

        public Criteria andInforManLessThan(String value) {
            addCriterion("INFOR_MAN <", value, "inforMan");
            return (Criteria) this;
        }

        public Criteria andInforManLessThanOrEqualTo(String value) {
            addCriterion("INFOR_MAN <=", value, "inforMan");
            return (Criteria) this;
        }

        public Criteria andInforManLike(String value) {
            addCriterion("INFOR_MAN like", value, "inforMan");
            return (Criteria) this;
        }

        public Criteria andInforManNotLike(String value) {
            addCriterion("INFOR_MAN not like", value, "inforMan");
            return (Criteria) this;
        }

        public Criteria andInforManIn(List<String> values) {
            addCriterion("INFOR_MAN in", values, "inforMan");
            return (Criteria) this;
        }

        public Criteria andInforManNotIn(List<String> values) {
            addCriterion("INFOR_MAN not in", values, "inforMan");
            return (Criteria) this;
        }

        public Criteria andInforManBetween(String value1, String value2) {
            addCriterion("INFOR_MAN between", value1, value2, "inforMan");
            return (Criteria) this;
        }

        public Criteria andInforManNotBetween(String value1, String value2) {
            addCriterion("INFOR_MAN not between", value1, value2, "inforMan");
            return (Criteria) this;
        }

        public Criteria andInforManTelIsNull() {
            addCriterion("INFOR_MAN_TEL is null");
            return (Criteria) this;
        }

        public Criteria andInforManTelIsNotNull() {
            addCriterion("INFOR_MAN_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andInforManTelEqualTo(String value) {
            addCriterion("INFOR_MAN_TEL =", value, "inforManTel");
            return (Criteria) this;
        }

        public Criteria andInforManTelNotEqualTo(String value) {
            addCriterion("INFOR_MAN_TEL <>", value, "inforManTel");
            return (Criteria) this;
        }

        public Criteria andInforManTelGreaterThan(String value) {
            addCriterion("INFOR_MAN_TEL >", value, "inforManTel");
            return (Criteria) this;
        }

        public Criteria andInforManTelGreaterThanOrEqualTo(String value) {
            addCriterion("INFOR_MAN_TEL >=", value, "inforManTel");
            return (Criteria) this;
        }

        public Criteria andInforManTelLessThan(String value) {
            addCriterion("INFOR_MAN_TEL <", value, "inforManTel");
            return (Criteria) this;
        }

        public Criteria andInforManTelLessThanOrEqualTo(String value) {
            addCriterion("INFOR_MAN_TEL <=", value, "inforManTel");
            return (Criteria) this;
        }

        public Criteria andInforManTelLike(String value) {
            addCriterion("INFOR_MAN_TEL like", value, "inforManTel");
            return (Criteria) this;
        }

        public Criteria andInforManTelNotLike(String value) {
            addCriterion("INFOR_MAN_TEL not like", value, "inforManTel");
            return (Criteria) this;
        }

        public Criteria andInforManTelIn(List<String> values) {
            addCriterion("INFOR_MAN_TEL in", values, "inforManTel");
            return (Criteria) this;
        }

        public Criteria andInforManTelNotIn(List<String> values) {
            addCriterion("INFOR_MAN_TEL not in", values, "inforManTel");
            return (Criteria) this;
        }

        public Criteria andInforManTelBetween(String value1, String value2) {
            addCriterion("INFOR_MAN_TEL between", value1, value2, "inforManTel");
            return (Criteria) this;
        }

        public Criteria andInforManTelNotBetween(String value1, String value2) {
            addCriterion("INFOR_MAN_TEL not between", value1, value2, "inforManTel");
            return (Criteria) this;
        }

        public Criteria andInforManEmailIsNull() {
            addCriterion("INFOR_MAN_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andInforManEmailIsNotNull() {
            addCriterion("INFOR_MAN_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andInforManEmailEqualTo(String value) {
            addCriterion("INFOR_MAN_EMAIL =", value, "inforManEmail");
            return (Criteria) this;
        }

        public Criteria andInforManEmailNotEqualTo(String value) {
            addCriterion("INFOR_MAN_EMAIL <>", value, "inforManEmail");
            return (Criteria) this;
        }

        public Criteria andInforManEmailGreaterThan(String value) {
            addCriterion("INFOR_MAN_EMAIL >", value, "inforManEmail");
            return (Criteria) this;
        }

        public Criteria andInforManEmailGreaterThanOrEqualTo(String value) {
            addCriterion("INFOR_MAN_EMAIL >=", value, "inforManEmail");
            return (Criteria) this;
        }

        public Criteria andInforManEmailLessThan(String value) {
            addCriterion("INFOR_MAN_EMAIL <", value, "inforManEmail");
            return (Criteria) this;
        }

        public Criteria andInforManEmailLessThanOrEqualTo(String value) {
            addCriterion("INFOR_MAN_EMAIL <=", value, "inforManEmail");
            return (Criteria) this;
        }

        public Criteria andInforManEmailLike(String value) {
            addCriterion("INFOR_MAN_EMAIL like", value, "inforManEmail");
            return (Criteria) this;
        }

        public Criteria andInforManEmailNotLike(String value) {
            addCriterion("INFOR_MAN_EMAIL not like", value, "inforManEmail");
            return (Criteria) this;
        }

        public Criteria andInforManEmailIn(List<String> values) {
            addCriterion("INFOR_MAN_EMAIL in", values, "inforManEmail");
            return (Criteria) this;
        }

        public Criteria andInforManEmailNotIn(List<String> values) {
            addCriterion("INFOR_MAN_EMAIL not in", values, "inforManEmail");
            return (Criteria) this;
        }

        public Criteria andInforManEmailBetween(String value1, String value2) {
            addCriterion("INFOR_MAN_EMAIL between", value1, value2, "inforManEmail");
            return (Criteria) this;
        }

        public Criteria andInforManEmailNotBetween(String value1, String value2) {
            addCriterion("INFOR_MAN_EMAIL not between", value1, value2, "inforManEmail");
            return (Criteria) this;
        }

        public Criteria andProducerCodeIsNull() {
            addCriterion("PRODUCER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProducerCodeIsNotNull() {
            addCriterion("PRODUCER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProducerCodeEqualTo(String value) {
            addCriterion("PRODUCER_CODE =", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeNotEqualTo(String value) {
            addCriterion("PRODUCER_CODE <>", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeGreaterThan(String value) {
            addCriterion("PRODUCER_CODE >", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCER_CODE >=", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeLessThan(String value) {
            addCriterion("PRODUCER_CODE <", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCER_CODE <=", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeLike(String value) {
            addCriterion("PRODUCER_CODE like", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeNotLike(String value) {
            addCriterion("PRODUCER_CODE not like", value, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeIn(List<String> values) {
            addCriterion("PRODUCER_CODE in", values, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeNotIn(List<String> values) {
            addCriterion("PRODUCER_CODE not in", values, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeBetween(String value1, String value2) {
            addCriterion("PRODUCER_CODE between", value1, value2, "producerCode");
            return (Criteria) this;
        }

        public Criteria andProducerCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCER_CODE not between", value1, value2, "producerCode");
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

        public Criteria andEndingNumberIsNull() {
            addCriterion("ENDING_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEndingNumberIsNotNull() {
            addCriterion("ENDING_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEndingNumberEqualTo(Integer value) {
            addCriterion("ENDING_NUMBER =", value, "endingNumber");
            return (Criteria) this;
        }

        public Criteria andEndingNumberNotEqualTo(Integer value) {
            addCriterion("ENDING_NUMBER <>", value, "endingNumber");
            return (Criteria) this;
        }

        public Criteria andEndingNumberGreaterThan(Integer value) {
            addCriterion("ENDING_NUMBER >", value, "endingNumber");
            return (Criteria) this;
        }

        public Criteria andEndingNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENDING_NUMBER >=", value, "endingNumber");
            return (Criteria) this;
        }

        public Criteria andEndingNumberLessThan(Integer value) {
            addCriterion("ENDING_NUMBER <", value, "endingNumber");
            return (Criteria) this;
        }

        public Criteria andEndingNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ENDING_NUMBER <=", value, "endingNumber");
            return (Criteria) this;
        }

        public Criteria andEndingNumberIn(List<Integer> values) {
            addCriterion("ENDING_NUMBER in", values, "endingNumber");
            return (Criteria) this;
        }

        public Criteria andEndingNumberNotIn(List<Integer> values) {
            addCriterion("ENDING_NUMBER not in", values, "endingNumber");
            return (Criteria) this;
        }

        public Criteria andEndingNumberBetween(Integer value1, Integer value2) {
            addCriterion("ENDING_NUMBER between", value1, value2, "endingNumber");
            return (Criteria) this;
        }

        public Criteria andEndingNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ENDING_NUMBER not between", value1, value2, "endingNumber");
            return (Criteria) this;
        }

        public Criteria andServerNumberIsNull() {
            addCriterion("SERVER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andServerNumberIsNotNull() {
            addCriterion("SERVER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andServerNumberEqualTo(Integer value) {
            addCriterion("SERVER_NUMBER =", value, "serverNumber");
            return (Criteria) this;
        }

        public Criteria andServerNumberNotEqualTo(Integer value) {
            addCriterion("SERVER_NUMBER <>", value, "serverNumber");
            return (Criteria) this;
        }

        public Criteria andServerNumberGreaterThan(Integer value) {
            addCriterion("SERVER_NUMBER >", value, "serverNumber");
            return (Criteria) this;
        }

        public Criteria andServerNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERVER_NUMBER >=", value, "serverNumber");
            return (Criteria) this;
        }

        public Criteria andServerNumberLessThan(Integer value) {
            addCriterion("SERVER_NUMBER <", value, "serverNumber");
            return (Criteria) this;
        }

        public Criteria andServerNumberLessThanOrEqualTo(Integer value) {
            addCriterion("SERVER_NUMBER <=", value, "serverNumber");
            return (Criteria) this;
        }

        public Criteria andServerNumberIn(List<Integer> values) {
            addCriterion("SERVER_NUMBER in", values, "serverNumber");
            return (Criteria) this;
        }

        public Criteria andServerNumberNotIn(List<Integer> values) {
            addCriterion("SERVER_NUMBER not in", values, "serverNumber");
            return (Criteria) this;
        }

        public Criteria andServerNumberBetween(Integer value1, Integer value2) {
            addCriterion("SERVER_NUMBER between", value1, value2, "serverNumber");
            return (Criteria) this;
        }

        public Criteria andServerNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("SERVER_NUMBER not between", value1, value2, "serverNumber");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andNetTypeIsNull() {
            addCriterion("NET_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNetTypeIsNotNull() {
            addCriterion("NET_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNetTypeEqualTo(String value) {
            addCriterion("NET_TYPE =", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeNotEqualTo(String value) {
            addCriterion("NET_TYPE <>", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeGreaterThan(String value) {
            addCriterion("NET_TYPE >", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NET_TYPE >=", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeLessThan(String value) {
            addCriterion("NET_TYPE <", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeLessThanOrEqualTo(String value) {
            addCriterion("NET_TYPE <=", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeLike(String value) {
            addCriterion("NET_TYPE like", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeNotLike(String value) {
            addCriterion("NET_TYPE not like", value, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeIn(List<String> values) {
            addCriterion("NET_TYPE in", values, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeNotIn(List<String> values) {
            addCriterion("NET_TYPE not in", values, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeBetween(String value1, String value2) {
            addCriterion("NET_TYPE between", value1, value2, "netType");
            return (Criteria) this;
        }

        public Criteria andNetTypeNotBetween(String value1, String value2) {
            addCriterion("NET_TYPE not between", value1, value2, "netType");
            return (Criteria) this;
        }

        public Criteria andPractitionerNumberIsNull() {
            addCriterion("PRACTITIONER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPractitionerNumberIsNotNull() {
            addCriterion("PRACTITIONER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPractitionerNumberEqualTo(Integer value) {
            addCriterion("PRACTITIONER_NUMBER =", value, "practitionerNumber");
            return (Criteria) this;
        }

        public Criteria andPractitionerNumberNotEqualTo(Integer value) {
            addCriterion("PRACTITIONER_NUMBER <>", value, "practitionerNumber");
            return (Criteria) this;
        }

        public Criteria andPractitionerNumberGreaterThan(Integer value) {
            addCriterion("PRACTITIONER_NUMBER >", value, "practitionerNumber");
            return (Criteria) this;
        }

        public Criteria andPractitionerNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRACTITIONER_NUMBER >=", value, "practitionerNumber");
            return (Criteria) this;
        }

        public Criteria andPractitionerNumberLessThan(Integer value) {
            addCriterion("PRACTITIONER_NUMBER <", value, "practitionerNumber");
            return (Criteria) this;
        }

        public Criteria andPractitionerNumberLessThanOrEqualTo(Integer value) {
            addCriterion("PRACTITIONER_NUMBER <=", value, "practitionerNumber");
            return (Criteria) this;
        }

        public Criteria andPractitionerNumberIn(List<Integer> values) {
            addCriterion("PRACTITIONER_NUMBER in", values, "practitionerNumber");
            return (Criteria) this;
        }

        public Criteria andPractitionerNumberNotIn(List<Integer> values) {
            addCriterion("PRACTITIONER_NUMBER not in", values, "practitionerNumber");
            return (Criteria) this;
        }

        public Criteria andPractitionerNumberBetween(Integer value1, Integer value2) {
            addCriterion("PRACTITIONER_NUMBER between", value1, value2, "practitionerNumber");
            return (Criteria) this;
        }

        public Criteria andPractitionerNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("PRACTITIONER_NUMBER not between", value1, value2, "practitionerNumber");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentIsNull() {
            addCriterion("NET_MONITOR_DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentIsNotNull() {
            addCriterion("NET_MONITOR_DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentEqualTo(String value) {
            addCriterion("NET_MONITOR_DEPARTMENT =", value, "netMonitorDepartment");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentNotEqualTo(String value) {
            addCriterion("NET_MONITOR_DEPARTMENT <>", value, "netMonitorDepartment");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentGreaterThan(String value) {
            addCriterion("NET_MONITOR_DEPARTMENT >", value, "netMonitorDepartment");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("NET_MONITOR_DEPARTMENT >=", value, "netMonitorDepartment");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentLessThan(String value) {
            addCriterion("NET_MONITOR_DEPARTMENT <", value, "netMonitorDepartment");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentLessThanOrEqualTo(String value) {
            addCriterion("NET_MONITOR_DEPARTMENT <=", value, "netMonitorDepartment");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentLike(String value) {
            addCriterion("NET_MONITOR_DEPARTMENT like", value, "netMonitorDepartment");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentNotLike(String value) {
            addCriterion("NET_MONITOR_DEPARTMENT not like", value, "netMonitorDepartment");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentIn(List<String> values) {
            addCriterion("NET_MONITOR_DEPARTMENT in", values, "netMonitorDepartment");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentNotIn(List<String> values) {
            addCriterion("NET_MONITOR_DEPARTMENT not in", values, "netMonitorDepartment");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentBetween(String value1, String value2) {
            addCriterion("NET_MONITOR_DEPARTMENT between", value1, value2, "netMonitorDepartment");
            return (Criteria) this;
        }

        public Criteria andNetMonitorDepartmentNotBetween(String value1, String value2) {
            addCriterion("NET_MONITOR_DEPARTMENT not between", value1, value2, "netMonitorDepartment");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManIsNull() {
            addCriterion("NET_MONITOR_MAN is null");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManIsNotNull() {
            addCriterion("NET_MONITOR_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManEqualTo(String value) {
            addCriterion("NET_MONITOR_MAN =", value, "netMonitorMan");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManNotEqualTo(String value) {
            addCriterion("NET_MONITOR_MAN <>", value, "netMonitorMan");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManGreaterThan(String value) {
            addCriterion("NET_MONITOR_MAN >", value, "netMonitorMan");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManGreaterThanOrEqualTo(String value) {
            addCriterion("NET_MONITOR_MAN >=", value, "netMonitorMan");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManLessThan(String value) {
            addCriterion("NET_MONITOR_MAN <", value, "netMonitorMan");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManLessThanOrEqualTo(String value) {
            addCriterion("NET_MONITOR_MAN <=", value, "netMonitorMan");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManLike(String value) {
            addCriterion("NET_MONITOR_MAN like", value, "netMonitorMan");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManNotLike(String value) {
            addCriterion("NET_MONITOR_MAN not like", value, "netMonitorMan");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManIn(List<String> values) {
            addCriterion("NET_MONITOR_MAN in", values, "netMonitorMan");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManNotIn(List<String> values) {
            addCriterion("NET_MONITOR_MAN not in", values, "netMonitorMan");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManBetween(String value1, String value2) {
            addCriterion("NET_MONITOR_MAN between", value1, value2, "netMonitorMan");
            return (Criteria) this;
        }

        public Criteria andNetMonitorManNotBetween(String value1, String value2) {
            addCriterion("NET_MONITOR_MAN not between", value1, value2, "netMonitorMan");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelIsNull() {
            addCriterion("NET_MONITOR_TEL is null");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelIsNotNull() {
            addCriterion("NET_MONITOR_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelEqualTo(String value) {
            addCriterion("NET_MONITOR_TEL =", value, "netMonitorTel");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelNotEqualTo(String value) {
            addCriterion("NET_MONITOR_TEL <>", value, "netMonitorTel");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelGreaterThan(String value) {
            addCriterion("NET_MONITOR_TEL >", value, "netMonitorTel");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelGreaterThanOrEqualTo(String value) {
            addCriterion("NET_MONITOR_TEL >=", value, "netMonitorTel");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelLessThan(String value) {
            addCriterion("NET_MONITOR_TEL <", value, "netMonitorTel");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelLessThanOrEqualTo(String value) {
            addCriterion("NET_MONITOR_TEL <=", value, "netMonitorTel");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelLike(String value) {
            addCriterion("NET_MONITOR_TEL like", value, "netMonitorTel");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelNotLike(String value) {
            addCriterion("NET_MONITOR_TEL not like", value, "netMonitorTel");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelIn(List<String> values) {
            addCriterion("NET_MONITOR_TEL in", values, "netMonitorTel");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelNotIn(List<String> values) {
            addCriterion("NET_MONITOR_TEL not in", values, "netMonitorTel");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelBetween(String value1, String value2) {
            addCriterion("NET_MONITOR_TEL between", value1, value2, "netMonitorTel");
            return (Criteria) this;
        }

        public Criteria andNetMonitorTelNotBetween(String value1, String value2) {
            addCriterion("NET_MONITOR_TEL not between", value1, value2, "netMonitorTel");
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

        public Criteria andGetLostcardAtIsNull() {
            addCriterion("GET_LOSTCARD_AT is null");
            return (Criteria) this;
        }

        public Criteria andGetLostcardAtIsNotNull() {
            addCriterion("GET_LOSTCARD_AT is not null");
            return (Criteria) this;
        }

        public Criteria andGetLostcardAtEqualTo(Date value) {
            addCriterion("GET_LOSTCARD_AT =", value, "getLostcardAt");
            return (Criteria) this;
        }

        public Criteria andGetLostcardAtNotEqualTo(Date value) {
            addCriterion("GET_LOSTCARD_AT <>", value, "getLostcardAt");
            return (Criteria) this;
        }

        public Criteria andGetLostcardAtGreaterThan(Date value) {
            addCriterion("GET_LOSTCARD_AT >", value, "getLostcardAt");
            return (Criteria) this;
        }

        public Criteria andGetLostcardAtGreaterThanOrEqualTo(Date value) {
            addCriterion("GET_LOSTCARD_AT >=", value, "getLostcardAt");
            return (Criteria) this;
        }

        public Criteria andGetLostcardAtLessThan(Date value) {
            addCriterion("GET_LOSTCARD_AT <", value, "getLostcardAt");
            return (Criteria) this;
        }

        public Criteria andGetLostcardAtLessThanOrEqualTo(Date value) {
            addCriterion("GET_LOSTCARD_AT <=", value, "getLostcardAt");
            return (Criteria) this;
        }

        public Criteria andGetLostcardAtIn(List<Date> values) {
            addCriterion("GET_LOSTCARD_AT in", values, "getLostcardAt");
            return (Criteria) this;
        }

        public Criteria andGetLostcardAtNotIn(List<Date> values) {
            addCriterion("GET_LOSTCARD_AT not in", values, "getLostcardAt");
            return (Criteria) this;
        }

        public Criteria andGetLostcardAtBetween(Date value1, Date value2) {
            addCriterion("GET_LOSTCARD_AT between", value1, value2, "getLostcardAt");
            return (Criteria) this;
        }

        public Criteria andGetLostcardAtNotBetween(Date value1, Date value2) {
            addCriterion("GET_LOSTCARD_AT not between", value1, value2, "getLostcardAt");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIsNull() {
            addCriterion("POLICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIsNotNull() {
            addCriterion("POLICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceIdEqualTo(Integer value) {
            addCriterion("POLICE_ID =", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotEqualTo(Integer value) {
            addCriterion("POLICE_ID <>", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThan(Integer value) {
            addCriterion("POLICE_ID >", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("POLICE_ID >=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThan(Integer value) {
            addCriterion("POLICE_ID <", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdLessThanOrEqualTo(Integer value) {
            addCriterion("POLICE_ID <=", value, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdIn(List<Integer> values) {
            addCriterion("POLICE_ID in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotIn(List<Integer> values) {
            addCriterion("POLICE_ID not in", values, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdBetween(Integer value1, Integer value2) {
            addCriterion("POLICE_ID between", value1, value2, "policeId");
            return (Criteria) this;
        }

        public Criteria andPoliceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("POLICE_ID not between", value1, value2, "policeId");
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

        public Criteria andPublicNetworkIsNull() {
            addCriterion("PUBLIC_NETWORK is null");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkIsNotNull() {
            addCriterion("PUBLIC_NETWORK is not null");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkEqualTo(String value) {
            addCriterion("PUBLIC_NETWORK =", value, "publicNetwork");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkNotEqualTo(String value) {
            addCriterion("PUBLIC_NETWORK <>", value, "publicNetwork");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkGreaterThan(String value) {
            addCriterion("PUBLIC_NETWORK >", value, "publicNetwork");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_NETWORK >=", value, "publicNetwork");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkLessThan(String value) {
            addCriterion("PUBLIC_NETWORK <", value, "publicNetwork");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_NETWORK <=", value, "publicNetwork");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkLike(String value) {
            addCriterion("PUBLIC_NETWORK like", value, "publicNetwork");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkNotLike(String value) {
            addCriterion("PUBLIC_NETWORK not like", value, "publicNetwork");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkIn(List<String> values) {
            addCriterion("PUBLIC_NETWORK in", values, "publicNetwork");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkNotIn(List<String> values) {
            addCriterion("PUBLIC_NETWORK not in", values, "publicNetwork");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkBetween(String value1, String value2) {
            addCriterion("PUBLIC_NETWORK between", value1, value2, "publicNetwork");
            return (Criteria) this;
        }

        public Criteria andPublicNetworkNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_NETWORK not between", value1, value2, "publicNetwork");
            return (Criteria) this;
        }

        public Criteria andEligibiityIsNull() {
            addCriterion("ELIGIBIITY is null");
            return (Criteria) this;
        }

        public Criteria andEligibiityIsNotNull() {
            addCriterion("ELIGIBIITY is not null");
            return (Criteria) this;
        }

        public Criteria andEligibiityEqualTo(String value) {
            addCriterion("ELIGIBIITY =", value, "eligibiity");
            return (Criteria) this;
        }

        public Criteria andEligibiityNotEqualTo(String value) {
            addCriterion("ELIGIBIITY <>", value, "eligibiity");
            return (Criteria) this;
        }

        public Criteria andEligibiityGreaterThan(String value) {
            addCriterion("ELIGIBIITY >", value, "eligibiity");
            return (Criteria) this;
        }

        public Criteria andEligibiityGreaterThanOrEqualTo(String value) {
            addCriterion("ELIGIBIITY >=", value, "eligibiity");
            return (Criteria) this;
        }

        public Criteria andEligibiityLessThan(String value) {
            addCriterion("ELIGIBIITY <", value, "eligibiity");
            return (Criteria) this;
        }

        public Criteria andEligibiityLessThanOrEqualTo(String value) {
            addCriterion("ELIGIBIITY <=", value, "eligibiity");
            return (Criteria) this;
        }

        public Criteria andEligibiityLike(String value) {
            addCriterion("ELIGIBIITY like", value, "eligibiity");
            return (Criteria) this;
        }

        public Criteria andEligibiityNotLike(String value) {
            addCriterion("ELIGIBIITY not like", value, "eligibiity");
            return (Criteria) this;
        }

        public Criteria andEligibiityIn(List<String> values) {
            addCriterion("ELIGIBIITY in", values, "eligibiity");
            return (Criteria) this;
        }

        public Criteria andEligibiityNotIn(List<String> values) {
            addCriterion("ELIGIBIITY not in", values, "eligibiity");
            return (Criteria) this;
        }

        public Criteria andEligibiityBetween(String value1, String value2) {
            addCriterion("ELIGIBIITY between", value1, value2, "eligibiity");
            return (Criteria) this;
        }

        public Criteria andEligibiityNotBetween(String value1, String value2) {
            addCriterion("ELIGIBIITY not between", value1, value2, "eligibiity");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeIsNull() {
            addCriterion("ECONOMY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeIsNotNull() {
            addCriterion("ECONOMY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeEqualTo(String value) {
            addCriterion("ECONOMY_TYPE =", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeNotEqualTo(String value) {
            addCriterion("ECONOMY_TYPE <>", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeGreaterThan(String value) {
            addCriterion("ECONOMY_TYPE >", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ECONOMY_TYPE >=", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeLessThan(String value) {
            addCriterion("ECONOMY_TYPE <", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeLessThanOrEqualTo(String value) {
            addCriterion("ECONOMY_TYPE <=", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeLike(String value) {
            addCriterion("ECONOMY_TYPE like", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeNotLike(String value) {
            addCriterion("ECONOMY_TYPE not like", value, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeIn(List<String> values) {
            addCriterion("ECONOMY_TYPE in", values, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeNotIn(List<String> values) {
            addCriterion("ECONOMY_TYPE not in", values, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeBetween(String value1, String value2) {
            addCriterion("ECONOMY_TYPE between", value1, value2, "economyType");
            return (Criteria) this;
        }

        public Criteria andEconomyTypeNotBetween(String value1, String value2) {
            addCriterion("ECONOMY_TYPE not between", value1, value2, "economyType");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLocaleStyleIsNull() {
            addCriterion("LOCALE_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andLocaleStyleIsNotNull() {
            addCriterion("LOCALE_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andLocaleStyleEqualTo(Integer value) {
            addCriterion("LOCALE_STYLE =", value, "localeStyle");
            return (Criteria) this;
        }

        public Criteria andLocaleStyleNotEqualTo(Integer value) {
            addCriterion("LOCALE_STYLE <>", value, "localeStyle");
            return (Criteria) this;
        }

        public Criteria andLocaleStyleGreaterThan(Integer value) {
            addCriterion("LOCALE_STYLE >", value, "localeStyle");
            return (Criteria) this;
        }

        public Criteria andLocaleStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOCALE_STYLE >=", value, "localeStyle");
            return (Criteria) this;
        }

        public Criteria andLocaleStyleLessThan(Integer value) {
            addCriterion("LOCALE_STYLE <", value, "localeStyle");
            return (Criteria) this;
        }

        public Criteria andLocaleStyleLessThanOrEqualTo(Integer value) {
            addCriterion("LOCALE_STYLE <=", value, "localeStyle");
            return (Criteria) this;
        }

        public Criteria andLocaleStyleIn(List<Integer> values) {
            addCriterion("LOCALE_STYLE in", values, "localeStyle");
            return (Criteria) this;
        }

        public Criteria andLocaleStyleNotIn(List<Integer> values) {
            addCriterion("LOCALE_STYLE not in", values, "localeStyle");
            return (Criteria) this;
        }

        public Criteria andLocaleStyleBetween(Integer value1, Integer value2) {
            addCriterion("LOCALE_STYLE between", value1, value2, "localeStyle");
            return (Criteria) this;
        }

        public Criteria andLocaleStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("LOCALE_STYLE not between", value1, value2, "localeStyle");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("CREATE_AT is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("CREATE_AT is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("CREATE_AT =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("CREATE_AT <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("CREATE_AT >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_AT >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("CREATE_AT <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_AT <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("CREATE_AT in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("CREATE_AT not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("CREATE_AT between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_AT not between", value1, value2, "createAt");
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

        public Criteria andPoliceManIsNull() {
            addCriterion("POLICE_MAN is null");
            return (Criteria) this;
        }

        public Criteria andPoliceManIsNotNull() {
            addCriterion("POLICE_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceManEqualTo(String value) {
            addCriterion("POLICE_MAN =", value, "policeMan");
            return (Criteria) this;
        }

        public Criteria andPoliceManNotEqualTo(String value) {
            addCriterion("POLICE_MAN <>", value, "policeMan");
            return (Criteria) this;
        }

        public Criteria andPoliceManGreaterThan(String value) {
            addCriterion("POLICE_MAN >", value, "policeMan");
            return (Criteria) this;
        }

        public Criteria andPoliceManGreaterThanOrEqualTo(String value) {
            addCriterion("POLICE_MAN >=", value, "policeMan");
            return (Criteria) this;
        }

        public Criteria andPoliceManLessThan(String value) {
            addCriterion("POLICE_MAN <", value, "policeMan");
            return (Criteria) this;
        }

        public Criteria andPoliceManLessThanOrEqualTo(String value) {
            addCriterion("POLICE_MAN <=", value, "policeMan");
            return (Criteria) this;
        }

        public Criteria andPoliceManLike(String value) {
            addCriterion("POLICE_MAN like", value, "policeMan");
            return (Criteria) this;
        }

        public Criteria andPoliceManNotLike(String value) {
            addCriterion("POLICE_MAN not like", value, "policeMan");
            return (Criteria) this;
        }

        public Criteria andPoliceManIn(List<String> values) {
            addCriterion("POLICE_MAN in", values, "policeMan");
            return (Criteria) this;
        }

        public Criteria andPoliceManNotIn(List<String> values) {
            addCriterion("POLICE_MAN not in", values, "policeMan");
            return (Criteria) this;
        }

        public Criteria andPoliceManBetween(String value1, String value2) {
            addCriterion("POLICE_MAN between", value1, value2, "policeMan");
            return (Criteria) this;
        }

        public Criteria andPoliceManNotBetween(String value1, String value2) {
            addCriterion("POLICE_MAN not between", value1, value2, "policeMan");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelIsNull() {
            addCriterion("POLICE_MAN_TEL is null");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelIsNotNull() {
            addCriterion("POLICE_MAN_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelEqualTo(String value) {
            addCriterion("POLICE_MAN_TEL =", value, "policeManTel");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelNotEqualTo(String value) {
            addCriterion("POLICE_MAN_TEL <>", value, "policeManTel");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelGreaterThan(String value) {
            addCriterion("POLICE_MAN_TEL >", value, "policeManTel");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelGreaterThanOrEqualTo(String value) {
            addCriterion("POLICE_MAN_TEL >=", value, "policeManTel");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelLessThan(String value) {
            addCriterion("POLICE_MAN_TEL <", value, "policeManTel");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelLessThanOrEqualTo(String value) {
            addCriterion("POLICE_MAN_TEL <=", value, "policeManTel");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelLike(String value) {
            addCriterion("POLICE_MAN_TEL like", value, "policeManTel");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelNotLike(String value) {
            addCriterion("POLICE_MAN_TEL not like", value, "policeManTel");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelIn(List<String> values) {
            addCriterion("POLICE_MAN_TEL in", values, "policeManTel");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelNotIn(List<String> values) {
            addCriterion("POLICE_MAN_TEL not in", values, "policeManTel");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelBetween(String value1, String value2) {
            addCriterion("POLICE_MAN_TEL between", value1, value2, "policeManTel");
            return (Criteria) this;
        }

        public Criteria andPoliceManTelNotBetween(String value1, String value2) {
            addCriterion("POLICE_MAN_TEL not between", value1, value2, "policeManTel");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoIsNull() {
            addCriterion("POLICE_MAN_NO is null");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoIsNotNull() {
            addCriterion("POLICE_MAN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoEqualTo(String value) {
            addCriterion("POLICE_MAN_NO =", value, "policeManNo");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoNotEqualTo(String value) {
            addCriterion("POLICE_MAN_NO <>", value, "policeManNo");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoGreaterThan(String value) {
            addCriterion("POLICE_MAN_NO >", value, "policeManNo");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoGreaterThanOrEqualTo(String value) {
            addCriterion("POLICE_MAN_NO >=", value, "policeManNo");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoLessThan(String value) {
            addCriterion("POLICE_MAN_NO <", value, "policeManNo");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoLessThanOrEqualTo(String value) {
            addCriterion("POLICE_MAN_NO <=", value, "policeManNo");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoLike(String value) {
            addCriterion("POLICE_MAN_NO like", value, "policeManNo");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoNotLike(String value) {
            addCriterion("POLICE_MAN_NO not like", value, "policeManNo");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoIn(List<String> values) {
            addCriterion("POLICE_MAN_NO in", values, "policeManNo");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoNotIn(List<String> values) {
            addCriterion("POLICE_MAN_NO not in", values, "policeManNo");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoBetween(String value1, String value2) {
            addCriterion("POLICE_MAN_NO between", value1, value2, "policeManNo");
            return (Criteria) this;
        }

        public Criteria andPoliceManNoNotBetween(String value1, String value2) {
            addCriterion("POLICE_MAN_NO not between", value1, value2, "policeManNo");
            return (Criteria) this;
        }

        public Criteria andPoliceNoIsNull() {
            addCriterion("POLICE_NO is null");
            return (Criteria) this;
        }

        public Criteria andPoliceNoIsNotNull() {
            addCriterion("POLICE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPoliceNoEqualTo(String value) {
            addCriterion("POLICE_NO =", value, "policeNo");
            return (Criteria) this;
        }

        public Criteria andPoliceNoNotEqualTo(String value) {
            addCriterion("POLICE_NO <>", value, "policeNo");
            return (Criteria) this;
        }

        public Criteria andPoliceNoGreaterThan(String value) {
            addCriterion("POLICE_NO >", value, "policeNo");
            return (Criteria) this;
        }

        public Criteria andPoliceNoGreaterThanOrEqualTo(String value) {
            addCriterion("POLICE_NO >=", value, "policeNo");
            return (Criteria) this;
        }

        public Criteria andPoliceNoLessThan(String value) {
            addCriterion("POLICE_NO <", value, "policeNo");
            return (Criteria) this;
        }

        public Criteria andPoliceNoLessThanOrEqualTo(String value) {
            addCriterion("POLICE_NO <=", value, "policeNo");
            return (Criteria) this;
        }

        public Criteria andPoliceNoLike(String value) {
            addCriterion("POLICE_NO like", value, "policeNo");
            return (Criteria) this;
        }

        public Criteria andPoliceNoNotLike(String value) {
            addCriterion("POLICE_NO not like", value, "policeNo");
            return (Criteria) this;
        }

        public Criteria andPoliceNoIn(List<String> values) {
            addCriterion("POLICE_NO in", values, "policeNo");
            return (Criteria) this;
        }

        public Criteria andPoliceNoNotIn(List<String> values) {
            addCriterion("POLICE_NO not in", values, "policeNo");
            return (Criteria) this;
        }

        public Criteria andPoliceNoBetween(String value1, String value2) {
            addCriterion("POLICE_NO between", value1, value2, "policeNo");
            return (Criteria) this;
        }

        public Criteria andPoliceNoNotBetween(String value1, String value2) {
            addCriterion("POLICE_NO not between", value1, value2, "policeNo");
            return (Criteria) this;
        }

        public Criteria andIsNetIsNull() {
            addCriterion("IS_NET is null");
            return (Criteria) this;
        }

        public Criteria andIsNetIsNotNull() {
            addCriterion("IS_NET is not null");
            return (Criteria) this;
        }

        public Criteria andIsNetEqualTo(Integer value) {
            addCriterion("IS_NET =", value, "isNet");
            return (Criteria) this;
        }

        public Criteria andIsNetNotEqualTo(Integer value) {
            addCriterion("IS_NET <>", value, "isNet");
            return (Criteria) this;
        }

        public Criteria andIsNetGreaterThan(Integer value) {
            addCriterion("IS_NET >", value, "isNet");
            return (Criteria) this;
        }

        public Criteria andIsNetGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_NET >=", value, "isNet");
            return (Criteria) this;
        }

        public Criteria andIsNetLessThan(Integer value) {
            addCriterion("IS_NET <", value, "isNet");
            return (Criteria) this;
        }

        public Criteria andIsNetLessThanOrEqualTo(Integer value) {
            addCriterion("IS_NET <=", value, "isNet");
            return (Criteria) this;
        }

        public Criteria andIsNetIn(List<Integer> values) {
            addCriterion("IS_NET in", values, "isNet");
            return (Criteria) this;
        }

        public Criteria andIsNetNotIn(List<Integer> values) {
            addCriterion("IS_NET not in", values, "isNet");
            return (Criteria) this;
        }

        public Criteria andIsNetBetween(Integer value1, Integer value2) {
            addCriterion("IS_NET between", value1, value2, "isNet");
            return (Criteria) this;
        }

        public Criteria andIsNetNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_NET not between", value1, value2, "isNet");
            return (Criteria) this;
        }

        public Criteria andVlanModeIsNull() {
            addCriterion("VLAN_MODE is null");
            return (Criteria) this;
        }

        public Criteria andVlanModeIsNotNull() {
            addCriterion("VLAN_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andVlanModeEqualTo(Integer value) {
            addCriterion("VLAN_MODE =", value, "vlanMode");
            return (Criteria) this;
        }

        public Criteria andVlanModeNotEqualTo(Integer value) {
            addCriterion("VLAN_MODE <>", value, "vlanMode");
            return (Criteria) this;
        }

        public Criteria andVlanModeGreaterThan(Integer value) {
            addCriterion("VLAN_MODE >", value, "vlanMode");
            return (Criteria) this;
        }

        public Criteria andVlanModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("VLAN_MODE >=", value, "vlanMode");
            return (Criteria) this;
        }

        public Criteria andVlanModeLessThan(Integer value) {
            addCriterion("VLAN_MODE <", value, "vlanMode");
            return (Criteria) this;
        }

        public Criteria andVlanModeLessThanOrEqualTo(Integer value) {
            addCriterion("VLAN_MODE <=", value, "vlanMode");
            return (Criteria) this;
        }

        public Criteria andVlanModeIn(List<Integer> values) {
            addCriterion("VLAN_MODE in", values, "vlanMode");
            return (Criteria) this;
        }

        public Criteria andVlanModeNotIn(List<Integer> values) {
            addCriterion("VLAN_MODE not in", values, "vlanMode");
            return (Criteria) this;
        }

        public Criteria andVlanModeBetween(Integer value1, Integer value2) {
            addCriterion("VLAN_MODE between", value1, value2, "vlanMode");
            return (Criteria) this;
        }

        public Criteria andVlanModeNotBetween(Integer value1, Integer value2) {
            addCriterion("VLAN_MODE not between", value1, value2, "vlanMode");
            return (Criteria) this;
        }

        public Criteria andIronmachineCountIsNull() {
            addCriterion("IRONMACHINE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andIronmachineCountIsNotNull() {
            addCriterion("IRONMACHINE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIronmachineCountEqualTo(Integer value) {
            addCriterion("IRONMACHINE_COUNT =", value, "ironmachineCount");
            return (Criteria) this;
        }

        public Criteria andIronmachineCountNotEqualTo(Integer value) {
            addCriterion("IRONMACHINE_COUNT <>", value, "ironmachineCount");
            return (Criteria) this;
        }

        public Criteria andIronmachineCountGreaterThan(Integer value) {
            addCriterion("IRONMACHINE_COUNT >", value, "ironmachineCount");
            return (Criteria) this;
        }

        public Criteria andIronmachineCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("IRONMACHINE_COUNT >=", value, "ironmachineCount");
            return (Criteria) this;
        }

        public Criteria andIronmachineCountLessThan(Integer value) {
            addCriterion("IRONMACHINE_COUNT <", value, "ironmachineCount");
            return (Criteria) this;
        }

        public Criteria andIronmachineCountLessThanOrEqualTo(Integer value) {
            addCriterion("IRONMACHINE_COUNT <=", value, "ironmachineCount");
            return (Criteria) this;
        }

        public Criteria andIronmachineCountIn(List<Integer> values) {
            addCriterion("IRONMACHINE_COUNT in", values, "ironmachineCount");
            return (Criteria) this;
        }

        public Criteria andIronmachineCountNotIn(List<Integer> values) {
            addCriterion("IRONMACHINE_COUNT not in", values, "ironmachineCount");
            return (Criteria) this;
        }

        public Criteria andIronmachineCountBetween(Integer value1, Integer value2) {
            addCriterion("IRONMACHINE_COUNT between", value1, value2, "ironmachineCount");
            return (Criteria) this;
        }

        public Criteria andIronmachineCountNotBetween(Integer value1, Integer value2) {
            addCriterion("IRONMACHINE_COUNT not between", value1, value2, "ironmachineCount");
            return (Criteria) this;
        }

        public Criteria andAuthStateIsNull() {
            addCriterion("AUTH_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAuthStateIsNotNull() {
            addCriterion("AUTH_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthStateEqualTo(Integer value) {
            addCriterion("AUTH_STATE =", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotEqualTo(Integer value) {
            addCriterion("AUTH_STATE <>", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateGreaterThan(Integer value) {
            addCriterion("AUTH_STATE >", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUTH_STATE >=", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLessThan(Integer value) {
            addCriterion("AUTH_STATE <", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateLessThanOrEqualTo(Integer value) {
            addCriterion("AUTH_STATE <=", value, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateIn(List<Integer> values) {
            addCriterion("AUTH_STATE in", values, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotIn(List<Integer> values) {
            addCriterion("AUTH_STATE not in", values, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateBetween(Integer value1, Integer value2) {
            addCriterion("AUTH_STATE between", value1, value2, "authState");
            return (Criteria) this;
        }

        public Criteria andAuthStateNotBetween(Integer value1, Integer value2) {
            addCriterion("AUTH_STATE not between", value1, value2, "authState");
            return (Criteria) this;
        }

        public Criteria andForhortIsNull() {
            addCriterion("FORHORT is null");
            return (Criteria) this;
        }

        public Criteria andForhortIsNotNull() {
            addCriterion("FORHORT is not null");
            return (Criteria) this;
        }

        public Criteria andForhortEqualTo(String value) {
            addCriterion("FORHORT =", value, "forhort");
            return (Criteria) this;
        }

        public Criteria andForhortNotEqualTo(String value) {
            addCriterion("FORHORT <>", value, "forhort");
            return (Criteria) this;
        }

        public Criteria andForhortGreaterThan(String value) {
            addCriterion("FORHORT >", value, "forhort");
            return (Criteria) this;
        }

        public Criteria andForhortGreaterThanOrEqualTo(String value) {
            addCriterion("FORHORT >=", value, "forhort");
            return (Criteria) this;
        }

        public Criteria andForhortLessThan(String value) {
            addCriterion("FORHORT <", value, "forhort");
            return (Criteria) this;
        }

        public Criteria andForhortLessThanOrEqualTo(String value) {
            addCriterion("FORHORT <=", value, "forhort");
            return (Criteria) this;
        }

        public Criteria andForhortLike(String value) {
            addCriterion("FORHORT like", value, "forhort");
            return (Criteria) this;
        }

        public Criteria andForhortNotLike(String value) {
            addCriterion("FORHORT not like", value, "forhort");
            return (Criteria) this;
        }

        public Criteria andForhortIn(List<String> values) {
            addCriterion("FORHORT in", values, "forhort");
            return (Criteria) this;
        }

        public Criteria andForhortNotIn(List<String> values) {
            addCriterion("FORHORT not in", values, "forhort");
            return (Criteria) this;
        }

        public Criteria andForhortBetween(String value1, String value2) {
            addCriterion("FORHORT between", value1, value2, "forhort");
            return (Criteria) this;
        }

        public Criteria andForhortNotBetween(String value1, String value2) {
            addCriterion("FORHORT not between", value1, value2, "forhort");
            return (Criteria) this;
        }

        public Criteria andStatesIsNull() {
            addCriterion("STATES is null");
            return (Criteria) this;
        }

        public Criteria andStatesIsNotNull() {
            addCriterion("STATES is not null");
            return (Criteria) this;
        }

        public Criteria andStatesEqualTo(Integer value) {
            addCriterion("STATES =", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotEqualTo(Integer value) {
            addCriterion("STATES <>", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThan(Integer value) {
            addCriterion("STATES >", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATES >=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThan(Integer value) {
            addCriterion("STATES <", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThanOrEqualTo(Integer value) {
            addCriterion("STATES <=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesIn(List<Integer> values) {
            addCriterion("STATES in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotIn(List<Integer> values) {
            addCriterion("STATES not in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesBetween(Integer value1, Integer value2) {
            addCriterion("STATES between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotBetween(Integer value1, Integer value2) {
            addCriterion("STATES not between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityIsNull() {
            addCriterion("INSTALLFACILITY is null");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityIsNotNull() {
            addCriterion("INSTALLFACILITY is not null");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityEqualTo(String value) {
            addCriterion("INSTALLFACILITY =", value, "installfacility");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityNotEqualTo(String value) {
            addCriterion("INSTALLFACILITY <>", value, "installfacility");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityGreaterThan(String value) {
            addCriterion("INSTALLFACILITY >", value, "installfacility");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityGreaterThanOrEqualTo(String value) {
            addCriterion("INSTALLFACILITY >=", value, "installfacility");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityLessThan(String value) {
            addCriterion("INSTALLFACILITY <", value, "installfacility");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityLessThanOrEqualTo(String value) {
            addCriterion("INSTALLFACILITY <=", value, "installfacility");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityLike(String value) {
            addCriterion("INSTALLFACILITY like", value, "installfacility");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityNotLike(String value) {
            addCriterion("INSTALLFACILITY not like", value, "installfacility");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityIn(List<String> values) {
            addCriterion("INSTALLFACILITY in", values, "installfacility");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityNotIn(List<String> values) {
            addCriterion("INSTALLFACILITY not in", values, "installfacility");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityBetween(String value1, String value2) {
            addCriterion("INSTALLFACILITY between", value1, value2, "installfacility");
            return (Criteria) this;
        }

        public Criteria andInstallfacilityNotBetween(String value1, String value2) {
            addCriterion("INSTALLFACILITY not between", value1, value2, "installfacility");
            return (Criteria) this;
        }

        public Criteria andBusinessdateIsNull() {
            addCriterion("BUSINESSDATE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessdateIsNotNull() {
            addCriterion("BUSINESSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessdateEqualTo(String value) {
            addCriterion("BUSINESSDATE =", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateNotEqualTo(String value) {
            addCriterion("BUSINESSDATE <>", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateGreaterThan(String value) {
            addCriterion("BUSINESSDATE >", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSDATE >=", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateLessThan(String value) {
            addCriterion("BUSINESSDATE <", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSDATE <=", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateLike(String value) {
            addCriterion("BUSINESSDATE like", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateNotLike(String value) {
            addCriterion("BUSINESSDATE not like", value, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateIn(List<String> values) {
            addCriterion("BUSINESSDATE in", values, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateNotIn(List<String> values) {
            addCriterion("BUSINESSDATE not in", values, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateBetween(String value1, String value2) {
            addCriterion("BUSINESSDATE between", value1, value2, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessdateNotBetween(String value1, String value2) {
            addCriterion("BUSINESSDATE not between", value1, value2, "businessdate");
            return (Criteria) this;
        }

        public Criteria andBusinessmanIsNull() {
            addCriterion("BUSINESSMAN is null");
            return (Criteria) this;
        }

        public Criteria andBusinessmanIsNotNull() {
            addCriterion("BUSINESSMAN is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessmanEqualTo(String value) {
            addCriterion("BUSINESSMAN =", value, "businessman");
            return (Criteria) this;
        }

        public Criteria andBusinessmanNotEqualTo(String value) {
            addCriterion("BUSINESSMAN <>", value, "businessman");
            return (Criteria) this;
        }

        public Criteria andBusinessmanGreaterThan(String value) {
            addCriterion("BUSINESSMAN >", value, "businessman");
            return (Criteria) this;
        }

        public Criteria andBusinessmanGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSMAN >=", value, "businessman");
            return (Criteria) this;
        }

        public Criteria andBusinessmanLessThan(String value) {
            addCriterion("BUSINESSMAN <", value, "businessman");
            return (Criteria) this;
        }

        public Criteria andBusinessmanLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSMAN <=", value, "businessman");
            return (Criteria) this;
        }

        public Criteria andBusinessmanLike(String value) {
            addCriterion("BUSINESSMAN like", value, "businessman");
            return (Criteria) this;
        }

        public Criteria andBusinessmanNotLike(String value) {
            addCriterion("BUSINESSMAN not like", value, "businessman");
            return (Criteria) this;
        }

        public Criteria andBusinessmanIn(List<String> values) {
            addCriterion("BUSINESSMAN in", values, "businessman");
            return (Criteria) this;
        }

        public Criteria andBusinessmanNotIn(List<String> values) {
            addCriterion("BUSINESSMAN not in", values, "businessman");
            return (Criteria) this;
        }

        public Criteria andBusinessmanBetween(String value1, String value2) {
            addCriterion("BUSINESSMAN between", value1, value2, "businessman");
            return (Criteria) this;
        }

        public Criteria andBusinessmanNotBetween(String value1, String value2) {
            addCriterion("BUSINESSMAN not between", value1, value2, "businessman");
            return (Criteria) this;
        }

        public Criteria andKeepphoneIsNull() {
            addCriterion("KEEPPHONE is null");
            return (Criteria) this;
        }

        public Criteria andKeepphoneIsNotNull() {
            addCriterion("KEEPPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andKeepphoneEqualTo(String value) {
            addCriterion("KEEPPHONE =", value, "keepphone");
            return (Criteria) this;
        }

        public Criteria andKeepphoneNotEqualTo(String value) {
            addCriterion("KEEPPHONE <>", value, "keepphone");
            return (Criteria) this;
        }

        public Criteria andKeepphoneGreaterThan(String value) {
            addCriterion("KEEPPHONE >", value, "keepphone");
            return (Criteria) this;
        }

        public Criteria andKeepphoneGreaterThanOrEqualTo(String value) {
            addCriterion("KEEPPHONE >=", value, "keepphone");
            return (Criteria) this;
        }

        public Criteria andKeepphoneLessThan(String value) {
            addCriterion("KEEPPHONE <", value, "keepphone");
            return (Criteria) this;
        }

        public Criteria andKeepphoneLessThanOrEqualTo(String value) {
            addCriterion("KEEPPHONE <=", value, "keepphone");
            return (Criteria) this;
        }

        public Criteria andKeepphoneLike(String value) {
            addCriterion("KEEPPHONE like", value, "keepphone");
            return (Criteria) this;
        }

        public Criteria andKeepphoneNotLike(String value) {
            addCriterion("KEEPPHONE not like", value, "keepphone");
            return (Criteria) this;
        }

        public Criteria andKeepphoneIn(List<String> values) {
            addCriterion("KEEPPHONE in", values, "keepphone");
            return (Criteria) this;
        }

        public Criteria andKeepphoneNotIn(List<String> values) {
            addCriterion("KEEPPHONE not in", values, "keepphone");
            return (Criteria) this;
        }

        public Criteria andKeepphoneBetween(String value1, String value2) {
            addCriterion("KEEPPHONE between", value1, value2, "keepphone");
            return (Criteria) this;
        }

        public Criteria andKeepphoneNotBetween(String value1, String value2) {
            addCriterion("KEEPPHONE not between", value1, value2, "keepphone");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerIsNull() {
            addCriterion("SAFETYMANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerIsNotNull() {
            addCriterion("SAFETYMANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerEqualTo(String value) {
            addCriterion("SAFETYMANUFACTURER =", value, "safetymanufacturer");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerNotEqualTo(String value) {
            addCriterion("SAFETYMANUFACTURER <>", value, "safetymanufacturer");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerGreaterThan(String value) {
            addCriterion("SAFETYMANUFACTURER >", value, "safetymanufacturer");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("SAFETYMANUFACTURER >=", value, "safetymanufacturer");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerLessThan(String value) {
            addCriterion("SAFETYMANUFACTURER <", value, "safetymanufacturer");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerLessThanOrEqualTo(String value) {
            addCriterion("SAFETYMANUFACTURER <=", value, "safetymanufacturer");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerLike(String value) {
            addCriterion("SAFETYMANUFACTURER like", value, "safetymanufacturer");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerNotLike(String value) {
            addCriterion("SAFETYMANUFACTURER not like", value, "safetymanufacturer");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerIn(List<String> values) {
            addCriterion("SAFETYMANUFACTURER in", values, "safetymanufacturer");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerNotIn(List<String> values) {
            addCriterion("SAFETYMANUFACTURER not in", values, "safetymanufacturer");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerBetween(String value1, String value2) {
            addCriterion("SAFETYMANUFACTURER between", value1, value2, "safetymanufacturer");
            return (Criteria) this;
        }

        public Criteria andSafetymanufacturerNotBetween(String value1, String value2) {
            addCriterion("SAFETYMANUFACTURER not between", value1, value2, "safetymanufacturer");
            return (Criteria) this;
        }

        public Criteria andLegalStateIsNull() {
            addCriterion("LEGAL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLegalStateIsNotNull() {
            addCriterion("LEGAL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLegalStateEqualTo(Integer value) {
            addCriterion("LEGAL_STATE =", value, "legalState");
            return (Criteria) this;
        }

        public Criteria andLegalStateNotEqualTo(Integer value) {
            addCriterion("LEGAL_STATE <>", value, "legalState");
            return (Criteria) this;
        }

        public Criteria andLegalStateGreaterThan(Integer value) {
            addCriterion("LEGAL_STATE >", value, "legalState");
            return (Criteria) this;
        }

        public Criteria andLegalStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEGAL_STATE >=", value, "legalState");
            return (Criteria) this;
        }

        public Criteria andLegalStateLessThan(Integer value) {
            addCriterion("LEGAL_STATE <", value, "legalState");
            return (Criteria) this;
        }

        public Criteria andLegalStateLessThanOrEqualTo(Integer value) {
            addCriterion("LEGAL_STATE <=", value, "legalState");
            return (Criteria) this;
        }

        public Criteria andLegalStateIn(List<Integer> values) {
            addCriterion("LEGAL_STATE in", values, "legalState");
            return (Criteria) this;
        }

        public Criteria andLegalStateNotIn(List<Integer> values) {
            addCriterion("LEGAL_STATE not in", values, "legalState");
            return (Criteria) this;
        }

        public Criteria andLegalStateBetween(Integer value1, Integer value2) {
            addCriterion("LEGAL_STATE between", value1, value2, "legalState");
            return (Criteria) this;
        }

        public Criteria andLegalStateNotBetween(Integer value1, Integer value2) {
            addCriterion("LEGAL_STATE not between", value1, value2, "legalState");
            return (Criteria) this;
        }

        public Criteria andRegistNumberIsNull() {
            addCriterion("REGIST_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRegistNumberIsNotNull() {
            addCriterion("REGIST_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRegistNumberEqualTo(String value) {
            addCriterion("REGIST_NUMBER =", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotEqualTo(String value) {
            addCriterion("REGIST_NUMBER <>", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberGreaterThan(String value) {
            addCriterion("REGIST_NUMBER >", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberGreaterThanOrEqualTo(String value) {
            addCriterion("REGIST_NUMBER >=", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberLessThan(String value) {
            addCriterion("REGIST_NUMBER <", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberLessThanOrEqualTo(String value) {
            addCriterion("REGIST_NUMBER <=", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberLike(String value) {
            addCriterion("REGIST_NUMBER like", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotLike(String value) {
            addCriterion("REGIST_NUMBER not like", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberIn(List<String> values) {
            addCriterion("REGIST_NUMBER in", values, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotIn(List<String> values) {
            addCriterion("REGIST_NUMBER not in", values, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberBetween(String value1, String value2) {
            addCriterion("REGIST_NUMBER between", value1, value2, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotBetween(String value1, String value2) {
            addCriterion("REGIST_NUMBER not between", value1, value2, "registNumber");
            return (Criteria) this;
        }

        public Criteria andAllTerminalIsNull() {
            addCriterion("ALL_TERMINAL is null");
            return (Criteria) this;
        }

        public Criteria andAllTerminalIsNotNull() {
            addCriterion("ALL_TERMINAL is not null");
            return (Criteria) this;
        }

        public Criteria andAllTerminalEqualTo(Integer value) {
            addCriterion("ALL_TERMINAL =", value, "allTerminal");
            return (Criteria) this;
        }

        public Criteria andAllTerminalNotEqualTo(Integer value) {
            addCriterion("ALL_TERMINAL <>", value, "allTerminal");
            return (Criteria) this;
        }

        public Criteria andAllTerminalGreaterThan(Integer value) {
            addCriterion("ALL_TERMINAL >", value, "allTerminal");
            return (Criteria) this;
        }

        public Criteria andAllTerminalGreaterThanOrEqualTo(Integer value) {
            addCriterion("ALL_TERMINAL >=", value, "allTerminal");
            return (Criteria) this;
        }

        public Criteria andAllTerminalLessThan(Integer value) {
            addCriterion("ALL_TERMINAL <", value, "allTerminal");
            return (Criteria) this;
        }

        public Criteria andAllTerminalLessThanOrEqualTo(Integer value) {
            addCriterion("ALL_TERMINAL <=", value, "allTerminal");
            return (Criteria) this;
        }

        public Criteria andAllTerminalIn(List<Integer> values) {
            addCriterion("ALL_TERMINAL in", values, "allTerminal");
            return (Criteria) this;
        }

        public Criteria andAllTerminalNotIn(List<Integer> values) {
            addCriterion("ALL_TERMINAL not in", values, "allTerminal");
            return (Criteria) this;
        }

        public Criteria andAllTerminalBetween(Integer value1, Integer value2) {
            addCriterion("ALL_TERMINAL between", value1, value2, "allTerminal");
            return (Criteria) this;
        }

        public Criteria andAllTerminalNotBetween(Integer value1, Integer value2) {
            addCriterion("ALL_TERMINAL not between", value1, value2, "allTerminal");
            return (Criteria) this;
        }

        public Criteria andOnlineTerminalIsNull() {
            addCriterion("ONLINE_TERMINAL is null");
            return (Criteria) this;
        }

        public Criteria andOnlineTerminalIsNotNull() {
            addCriterion("ONLINE_TERMINAL is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineTerminalEqualTo(Integer value) {
            addCriterion("ONLINE_TERMINAL =", value, "onlineTerminal");
            return (Criteria) this;
        }

        public Criteria andOnlineTerminalNotEqualTo(Integer value) {
            addCriterion("ONLINE_TERMINAL <>", value, "onlineTerminal");
            return (Criteria) this;
        }

        public Criteria andOnlineTerminalGreaterThan(Integer value) {
            addCriterion("ONLINE_TERMINAL >", value, "onlineTerminal");
            return (Criteria) this;
        }

        public Criteria andOnlineTerminalGreaterThanOrEqualTo(Integer value) {
            addCriterion("ONLINE_TERMINAL >=", value, "onlineTerminal");
            return (Criteria) this;
        }

        public Criteria andOnlineTerminalLessThan(Integer value) {
            addCriterion("ONLINE_TERMINAL <", value, "onlineTerminal");
            return (Criteria) this;
        }

        public Criteria andOnlineTerminalLessThanOrEqualTo(Integer value) {
            addCriterion("ONLINE_TERMINAL <=", value, "onlineTerminal");
            return (Criteria) this;
        }

        public Criteria andOnlineTerminalIn(List<Integer> values) {
            addCriterion("ONLINE_TERMINAL in", values, "onlineTerminal");
            return (Criteria) this;
        }

        public Criteria andOnlineTerminalNotIn(List<Integer> values) {
            addCriterion("ONLINE_TERMINAL not in", values, "onlineTerminal");
            return (Criteria) this;
        }

        public Criteria andOnlineTerminalBetween(Integer value1, Integer value2) {
            addCriterion("ONLINE_TERMINAL between", value1, value2, "onlineTerminal");
            return (Criteria) this;
        }

        public Criteria andOnlineTerminalNotBetween(Integer value1, Integer value2) {
            addCriterion("ONLINE_TERMINAL not between", value1, value2, "onlineTerminal");
            return (Criteria) this;
        }

        public Criteria andShieldWebIsNull() {
            addCriterion("SHIELD_WEB is null");
            return (Criteria) this;
        }

        public Criteria andShieldWebIsNotNull() {
            addCriterion("SHIELD_WEB is not null");
            return (Criteria) this;
        }

        public Criteria andShieldWebEqualTo(Integer value) {
            addCriterion("SHIELD_WEB =", value, "shieldWeb");
            return (Criteria) this;
        }

        public Criteria andShieldWebNotEqualTo(Integer value) {
            addCriterion("SHIELD_WEB <>", value, "shieldWeb");
            return (Criteria) this;
        }

        public Criteria andShieldWebGreaterThan(Integer value) {
            addCriterion("SHIELD_WEB >", value, "shieldWeb");
            return (Criteria) this;
        }

        public Criteria andShieldWebGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHIELD_WEB >=", value, "shieldWeb");
            return (Criteria) this;
        }

        public Criteria andShieldWebLessThan(Integer value) {
            addCriterion("SHIELD_WEB <", value, "shieldWeb");
            return (Criteria) this;
        }

        public Criteria andShieldWebLessThanOrEqualTo(Integer value) {
            addCriterion("SHIELD_WEB <=", value, "shieldWeb");
            return (Criteria) this;
        }

        public Criteria andShieldWebIn(List<Integer> values) {
            addCriterion("SHIELD_WEB in", values, "shieldWeb");
            return (Criteria) this;
        }

        public Criteria andShieldWebNotIn(List<Integer> values) {
            addCriterion("SHIELD_WEB not in", values, "shieldWeb");
            return (Criteria) this;
        }

        public Criteria andShieldWebBetween(Integer value1, Integer value2) {
            addCriterion("SHIELD_WEB between", value1, value2, "shieldWeb");
            return (Criteria) this;
        }

        public Criteria andShieldWebNotBetween(Integer value1, Integer value2) {
            addCriterion("SHIELD_WEB not between", value1, value2, "shieldWeb");
            return (Criteria) this;
        }

        public Criteria andShieldWindowIsNull() {
            addCriterion("SHIELD_WINDOW is null");
            return (Criteria) this;
        }

        public Criteria andShieldWindowIsNotNull() {
            addCriterion("SHIELD_WINDOW is not null");
            return (Criteria) this;
        }

        public Criteria andShieldWindowEqualTo(Integer value) {
            addCriterion("SHIELD_WINDOW =", value, "shieldWindow");
            return (Criteria) this;
        }

        public Criteria andShieldWindowNotEqualTo(Integer value) {
            addCriterion("SHIELD_WINDOW <>", value, "shieldWindow");
            return (Criteria) this;
        }

        public Criteria andShieldWindowGreaterThan(Integer value) {
            addCriterion("SHIELD_WINDOW >", value, "shieldWindow");
            return (Criteria) this;
        }

        public Criteria andShieldWindowGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHIELD_WINDOW >=", value, "shieldWindow");
            return (Criteria) this;
        }

        public Criteria andShieldWindowLessThan(Integer value) {
            addCriterion("SHIELD_WINDOW <", value, "shieldWindow");
            return (Criteria) this;
        }

        public Criteria andShieldWindowLessThanOrEqualTo(Integer value) {
            addCriterion("SHIELD_WINDOW <=", value, "shieldWindow");
            return (Criteria) this;
        }

        public Criteria andShieldWindowIn(List<Integer> values) {
            addCriterion("SHIELD_WINDOW in", values, "shieldWindow");
            return (Criteria) this;
        }

        public Criteria andShieldWindowNotIn(List<Integer> values) {
            addCriterion("SHIELD_WINDOW not in", values, "shieldWindow");
            return (Criteria) this;
        }

        public Criteria andShieldWindowBetween(Integer value1, Integer value2) {
            addCriterion("SHIELD_WINDOW between", value1, value2, "shieldWindow");
            return (Criteria) this;
        }

        public Criteria andShieldWindowNotBetween(Integer value1, Integer value2) {
            addCriterion("SHIELD_WINDOW not between", value1, value2, "shieldWindow");
            return (Criteria) this;
        }

        public Criteria andShieldProgressIsNull() {
            addCriterion("SHIELD_PROGRESS is null");
            return (Criteria) this;
        }

        public Criteria andShieldProgressIsNotNull() {
            addCriterion("SHIELD_PROGRESS is not null");
            return (Criteria) this;
        }

        public Criteria andShieldProgressEqualTo(Integer value) {
            addCriterion("SHIELD_PROGRESS =", value, "shieldProgress");
            return (Criteria) this;
        }

        public Criteria andShieldProgressNotEqualTo(Integer value) {
            addCriterion("SHIELD_PROGRESS <>", value, "shieldProgress");
            return (Criteria) this;
        }

        public Criteria andShieldProgressGreaterThan(Integer value) {
            addCriterion("SHIELD_PROGRESS >", value, "shieldProgress");
            return (Criteria) this;
        }

        public Criteria andShieldProgressGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHIELD_PROGRESS >=", value, "shieldProgress");
            return (Criteria) this;
        }

        public Criteria andShieldProgressLessThan(Integer value) {
            addCriterion("SHIELD_PROGRESS <", value, "shieldProgress");
            return (Criteria) this;
        }

        public Criteria andShieldProgressLessThanOrEqualTo(Integer value) {
            addCriterion("SHIELD_PROGRESS <=", value, "shieldProgress");
            return (Criteria) this;
        }

        public Criteria andShieldProgressIn(List<Integer> values) {
            addCriterion("SHIELD_PROGRESS in", values, "shieldProgress");
            return (Criteria) this;
        }

        public Criteria andShieldProgressNotIn(List<Integer> values) {
            addCriterion("SHIELD_PROGRESS not in", values, "shieldProgress");
            return (Criteria) this;
        }

        public Criteria andShieldProgressBetween(Integer value1, Integer value2) {
            addCriterion("SHIELD_PROGRESS between", value1, value2, "shieldProgress");
            return (Criteria) this;
        }

        public Criteria andShieldProgressNotBetween(Integer value1, Integer value2) {
            addCriterion("SHIELD_PROGRESS not between", value1, value2, "shieldProgress");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("NATURE is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(Integer value) {
            addCriterion("NATURE =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(Integer value) {
            addCriterion("NATURE <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(Integer value) {
            addCriterion("NATURE >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("NATURE >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(Integer value) {
            addCriterion("NATURE <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(Integer value) {
            addCriterion("NATURE <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<Integer> values) {
            addCriterion("NATURE in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<Integer> values) {
            addCriterion("NATURE not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(Integer value1, Integer value2) {
            addCriterion("NATURE between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("NATURE not between", value1, value2, "nature");
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

        public Criteria andIsCheckIsNull() {
            addCriterion("IS_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("IS_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(Integer value) {
            addCriterion("IS_CHECK =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(Integer value) {
            addCriterion("IS_CHECK <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(Integer value) {
            addCriterion("IS_CHECK >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_CHECK >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(Integer value) {
            addCriterion("IS_CHECK <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(Integer value) {
            addCriterion("IS_CHECK <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<Integer> values) {
            addCriterion("IS_CHECK in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<Integer> values) {
            addCriterion("IS_CHECK not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(Integer value1, Integer value2) {
            addCriterion("IS_CHECK between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_CHECK not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsEquipmentIsNull() {
            addCriterion("IS_EQUIPMENT is null");
            return (Criteria) this;
        }

        public Criteria andIsEquipmentIsNotNull() {
            addCriterion("IS_EQUIPMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsEquipmentEqualTo(Integer value) {
            addCriterion("IS_EQUIPMENT =", value, "isEquipment");
            return (Criteria) this;
        }

        public Criteria andIsEquipmentNotEqualTo(Integer value) {
            addCriterion("IS_EQUIPMENT <>", value, "isEquipment");
            return (Criteria) this;
        }

        public Criteria andIsEquipmentGreaterThan(Integer value) {
            addCriterion("IS_EQUIPMENT >", value, "isEquipment");
            return (Criteria) this;
        }

        public Criteria andIsEquipmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_EQUIPMENT >=", value, "isEquipment");
            return (Criteria) this;
        }

        public Criteria andIsEquipmentLessThan(Integer value) {
            addCriterion("IS_EQUIPMENT <", value, "isEquipment");
            return (Criteria) this;
        }

        public Criteria andIsEquipmentLessThanOrEqualTo(Integer value) {
            addCriterion("IS_EQUIPMENT <=", value, "isEquipment");
            return (Criteria) this;
        }

        public Criteria andIsEquipmentIn(List<Integer> values) {
            addCriterion("IS_EQUIPMENT in", values, "isEquipment");
            return (Criteria) this;
        }

        public Criteria andIsEquipmentNotIn(List<Integer> values) {
            addCriterion("IS_EQUIPMENT not in", values, "isEquipment");
            return (Criteria) this;
        }

        public Criteria andIsEquipmentBetween(Integer value1, Integer value2) {
            addCriterion("IS_EQUIPMENT between", value1, value2, "isEquipment");
            return (Criteria) this;
        }

        public Criteria andIsEquipmentNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_EQUIPMENT not between", value1, value2, "isEquipment");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonIsNull() {
            addCriterion("TRANSINENT_STOP_REASON is null");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonIsNotNull() {
            addCriterion("TRANSINENT_STOP_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonEqualTo(String value) {
            addCriterion("TRANSINENT_STOP_REASON =", value, "transinentStopReason");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonNotEqualTo(String value) {
            addCriterion("TRANSINENT_STOP_REASON <>", value, "transinentStopReason");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonGreaterThan(String value) {
            addCriterion("TRANSINENT_STOP_REASON >", value, "transinentStopReason");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSINENT_STOP_REASON >=", value, "transinentStopReason");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonLessThan(String value) {
            addCriterion("TRANSINENT_STOP_REASON <", value, "transinentStopReason");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonLessThanOrEqualTo(String value) {
            addCriterion("TRANSINENT_STOP_REASON <=", value, "transinentStopReason");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonLike(String value) {
            addCriterion("TRANSINENT_STOP_REASON like", value, "transinentStopReason");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonNotLike(String value) {
            addCriterion("TRANSINENT_STOP_REASON not like", value, "transinentStopReason");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonIn(List<String> values) {
            addCriterion("TRANSINENT_STOP_REASON in", values, "transinentStopReason");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonNotIn(List<String> values) {
            addCriterion("TRANSINENT_STOP_REASON not in", values, "transinentStopReason");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonBetween(String value1, String value2) {
            addCriterion("TRANSINENT_STOP_REASON between", value1, value2, "transinentStopReason");
            return (Criteria) this;
        }

        public Criteria andTransinentStopReasonNotBetween(String value1, String value2) {
            addCriterion("TRANSINENT_STOP_REASON not between", value1, value2, "transinentStopReason");
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

        public Criteria andOperatorTypeIsNull() {
            addCriterion("OPERATOR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeIsNotNull() {
            addCriterion("OPERATOR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeEqualTo(Integer value) {
            addCriterion("OPERATOR_TYPE =", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeNotEqualTo(Integer value) {
            addCriterion("OPERATOR_TYPE <>", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeGreaterThan(Integer value) {
            addCriterion("OPERATOR_TYPE >", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPERATOR_TYPE >=", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeLessThan(Integer value) {
            addCriterion("OPERATOR_TYPE <", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeLessThanOrEqualTo(Integer value) {
            addCriterion("OPERATOR_TYPE <=", value, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeIn(List<Integer> values) {
            addCriterion("OPERATOR_TYPE in", values, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeNotIn(List<Integer> values) {
            addCriterion("OPERATOR_TYPE not in", values, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeBetween(Integer value1, Integer value2) {
            addCriterion("OPERATOR_TYPE between", value1, value2, "operatorType");
            return (Criteria) this;
        }

        public Criteria andOperatorTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("OPERATOR_TYPE not between", value1, value2, "operatorType");
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

        public Criteria andStatTmIsNull() {
            addCriterion("STAT_TM is null");
            return (Criteria) this;
        }

        public Criteria andStatTmIsNotNull() {
            addCriterion("STAT_TM is not null");
            return (Criteria) this;
        }

        public Criteria andStatTmEqualTo(Date value) {
            addCriterionForJDBCTime("STAT_TM =", value, "statTm");
            return (Criteria) this;
        }

        public Criteria andStatTmNotEqualTo(Date value) {
            addCriterionForJDBCTime("STAT_TM <>", value, "statTm");
            return (Criteria) this;
        }

        public Criteria andStatTmGreaterThan(Date value) {
            addCriterionForJDBCTime("STAT_TM >", value, "statTm");
            return (Criteria) this;
        }

        public Criteria andStatTmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("STAT_TM >=", value, "statTm");
            return (Criteria) this;
        }

        public Criteria andStatTmLessThan(Date value) {
            addCriterionForJDBCTime("STAT_TM <", value, "statTm");
            return (Criteria) this;
        }

        public Criteria andStatTmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("STAT_TM <=", value, "statTm");
            return (Criteria) this;
        }

        public Criteria andStatTmIn(List<Date> values) {
            addCriterionForJDBCTime("STAT_TM in", values, "statTm");
            return (Criteria) this;
        }

        public Criteria andStatTmNotIn(List<Date> values) {
            addCriterionForJDBCTime("STAT_TM not in", values, "statTm");
            return (Criteria) this;
        }

        public Criteria andStatTmBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("STAT_TM between", value1, value2, "statTm");
            return (Criteria) this;
        }

        public Criteria andStatTmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("STAT_TM not between", value1, value2, "statTm");
            return (Criteria) this;
        }

        public Criteria andEndTmIsNull() {
            addCriterion("END_TM is null");
            return (Criteria) this;
        }

        public Criteria andEndTmIsNotNull() {
            addCriterion("END_TM is not null");
            return (Criteria) this;
        }

        public Criteria andEndTmEqualTo(Date value) {
            addCriterionForJDBCTime("END_TM =", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmNotEqualTo(Date value) {
            addCriterionForJDBCTime("END_TM <>", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmGreaterThan(Date value) {
            addCriterionForJDBCTime("END_TM >", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("END_TM >=", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmLessThan(Date value) {
            addCriterionForJDBCTime("END_TM <", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("END_TM <=", value, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmIn(List<Date> values) {
            addCriterionForJDBCTime("END_TM in", values, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmNotIn(List<Date> values) {
            addCriterionForJDBCTime("END_TM not in", values, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("END_TM between", value1, value2, "endTm");
            return (Criteria) this;
        }

        public Criteria andEndTmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("END_TM not between", value1, value2, "endTm");
            return (Criteria) this;
        }

        public Criteria andSafeIdIsNull() {
            addCriterion("SAFE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSafeIdIsNotNull() {
            addCriterion("SAFE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSafeIdEqualTo(Integer value) {
            addCriterion("SAFE_ID =", value, "safeId");
            return (Criteria) this;
        }

        public Criteria andSafeIdNotEqualTo(Integer value) {
            addCriterion("SAFE_ID <>", value, "safeId");
            return (Criteria) this;
        }

        public Criteria andSafeIdGreaterThan(Integer value) {
            addCriterion("SAFE_ID >", value, "safeId");
            return (Criteria) this;
        }

        public Criteria andSafeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAFE_ID >=", value, "safeId");
            return (Criteria) this;
        }

        public Criteria andSafeIdLessThan(Integer value) {
            addCriterion("SAFE_ID <", value, "safeId");
            return (Criteria) this;
        }

        public Criteria andSafeIdLessThanOrEqualTo(Integer value) {
            addCriterion("SAFE_ID <=", value, "safeId");
            return (Criteria) this;
        }

        public Criteria andSafeIdIn(List<Integer> values) {
            addCriterion("SAFE_ID in", values, "safeId");
            return (Criteria) this;
        }

        public Criteria andSafeIdNotIn(List<Integer> values) {
            addCriterion("SAFE_ID not in", values, "safeId");
            return (Criteria) this;
        }

        public Criteria andSafeIdBetween(Integer value1, Integer value2) {
            addCriterion("SAFE_ID between", value1, value2, "safeId");
            return (Criteria) this;
        }

        public Criteria andSafeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SAFE_ID not between", value1, value2, "safeId");
            return (Criteria) this;
        }

        public Criteria andStartTmIsNull() {
            addCriterion("START_TM is null");
            return (Criteria) this;
        }

        public Criteria andStartTmIsNotNull() {
            addCriterion("START_TM is not null");
            return (Criteria) this;
        }

        public Criteria andStartTmEqualTo(Date value) {
            addCriterionForJDBCTime("START_TM =", value, "startTm");
            return (Criteria) this;
        }

        public Criteria andStartTmNotEqualTo(Date value) {
            addCriterionForJDBCTime("START_TM <>", value, "startTm");
            return (Criteria) this;
        }

        public Criteria andStartTmGreaterThan(Date value) {
            addCriterionForJDBCTime("START_TM >", value, "startTm");
            return (Criteria) this;
        }

        public Criteria andStartTmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("START_TM >=", value, "startTm");
            return (Criteria) this;
        }

        public Criteria andStartTmLessThan(Date value) {
            addCriterionForJDBCTime("START_TM <", value, "startTm");
            return (Criteria) this;
        }

        public Criteria andStartTmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("START_TM <=", value, "startTm");
            return (Criteria) this;
        }

        public Criteria andStartTmIn(List<Date> values) {
            addCriterionForJDBCTime("START_TM in", values, "startTm");
            return (Criteria) this;
        }

        public Criteria andStartTmNotIn(List<Date> values) {
            addCriterionForJDBCTime("START_TM not in", values, "startTm");
            return (Criteria) this;
        }

        public Criteria andStartTmBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("START_TM between", value1, value2, "startTm");
            return (Criteria) this;
        }

        public Criteria andStartTmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("START_TM not between", value1, value2, "startTm");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andSafeIdsIsNull() {
            addCriterion("SAFE_IDS is null");
            return (Criteria) this;
        }

        public Criteria andSafeIdsIsNotNull() {
            addCriterion("SAFE_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andSafeIdsEqualTo(String value) {
            addCriterion("SAFE_IDS =", value, "safeIds");
            return (Criteria) this;
        }

        public Criteria andSafeIdsNotEqualTo(String value) {
            addCriterion("SAFE_IDS <>", value, "safeIds");
            return (Criteria) this;
        }

        public Criteria andSafeIdsGreaterThan(String value) {
            addCriterion("SAFE_IDS >", value, "safeIds");
            return (Criteria) this;
        }

        public Criteria andSafeIdsGreaterThanOrEqualTo(String value) {
            addCriterion("SAFE_IDS >=", value, "safeIds");
            return (Criteria) this;
        }

        public Criteria andSafeIdsLessThan(String value) {
            addCriterion("SAFE_IDS <", value, "safeIds");
            return (Criteria) this;
        }

        public Criteria andSafeIdsLessThanOrEqualTo(String value) {
            addCriterion("SAFE_IDS <=", value, "safeIds");
            return (Criteria) this;
        }

        public Criteria andSafeIdsLike(String value) {
            addCriterion("SAFE_IDS like", value, "safeIds");
            return (Criteria) this;
        }

        public Criteria andSafeIdsNotLike(String value) {
            addCriterion("SAFE_IDS not like", value, "safeIds");
            return (Criteria) this;
        }

        public Criteria andSafeIdsIn(List<String> values) {
            addCriterion("SAFE_IDS in", values, "safeIds");
            return (Criteria) this;
        }

        public Criteria andSafeIdsNotIn(List<String> values) {
            addCriterion("SAFE_IDS not in", values, "safeIds");
            return (Criteria) this;
        }

        public Criteria andSafeIdsBetween(String value1, String value2) {
            addCriterion("SAFE_IDS between", value1, value2, "safeIds");
            return (Criteria) this;
        }

        public Criteria andSafeIdsNotBetween(String value1, String value2) {
            addCriterion("SAFE_IDS not between", value1, value2, "safeIds");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeIsNull() {
            addCriterion("PLACE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeIsNotNull() {
            addCriterion("PLACE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeEqualTo(Integer value) {
            addCriterion("PLACE_TYPE =", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeNotEqualTo(Integer value) {
            addCriterion("PLACE_TYPE <>", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeGreaterThan(Integer value) {
            addCriterion("PLACE_TYPE >", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLACE_TYPE >=", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeLessThan(Integer value) {
            addCriterion("PLACE_TYPE <", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PLACE_TYPE <=", value, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeIn(List<Integer> values) {
            addCriterion("PLACE_TYPE in", values, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeNotIn(List<Integer> values) {
            addCriterion("PLACE_TYPE not in", values, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeBetween(Integer value1, Integer value2) {
            addCriterion("PLACE_TYPE between", value1, value2, "placeType");
            return (Criteria) this;
        }

        public Criteria andPlaceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PLACE_TYPE not between", value1, value2, "placeType");
            return (Criteria) this;
        }

        public Criteria andDialingIdIsNull() {
            addCriterion("DIALING_ID is null");
            return (Criteria) this;
        }

        public Criteria andDialingIdIsNotNull() {
            addCriterion("DIALING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDialingIdEqualTo(String value) {
            addCriterion("DIALING_ID =", value, "dialingId");
            return (Criteria) this;
        }

        public Criteria andDialingIdNotEqualTo(String value) {
            addCriterion("DIALING_ID <>", value, "dialingId");
            return (Criteria) this;
        }

        public Criteria andDialingIdGreaterThan(String value) {
            addCriterion("DIALING_ID >", value, "dialingId");
            return (Criteria) this;
        }

        public Criteria andDialingIdGreaterThanOrEqualTo(String value) {
            addCriterion("DIALING_ID >=", value, "dialingId");
            return (Criteria) this;
        }

        public Criteria andDialingIdLessThan(String value) {
            addCriterion("DIALING_ID <", value, "dialingId");
            return (Criteria) this;
        }

        public Criteria andDialingIdLessThanOrEqualTo(String value) {
            addCriterion("DIALING_ID <=", value, "dialingId");
            return (Criteria) this;
        }

        public Criteria andDialingIdLike(String value) {
            addCriterion("DIALING_ID like", value, "dialingId");
            return (Criteria) this;
        }

        public Criteria andDialingIdNotLike(String value) {
            addCriterion("DIALING_ID not like", value, "dialingId");
            return (Criteria) this;
        }

        public Criteria andDialingIdIn(List<String> values) {
            addCriterion("DIALING_ID in", values, "dialingId");
            return (Criteria) this;
        }

        public Criteria andDialingIdNotIn(List<String> values) {
            addCriterion("DIALING_ID not in", values, "dialingId");
            return (Criteria) this;
        }

        public Criteria andDialingIdBetween(String value1, String value2) {
            addCriterion("DIALING_ID between", value1, value2, "dialingId");
            return (Criteria) this;
        }

        public Criteria andDialingIdNotBetween(String value1, String value2) {
            addCriterion("DIALING_ID not between", value1, value2, "dialingId");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorTelIsNull() {
            addCriterion("OPERATOR_TEL is null");
            return (Criteria) this;
        }

        public Criteria andOperatorTelIsNotNull() {
            addCriterion("OPERATOR_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorTelEqualTo(String value) {
            addCriterion("OPERATOR_TEL =", value, "operatorTel");
            return (Criteria) this;
        }

        public Criteria andOperatorTelNotEqualTo(String value) {
            addCriterion("OPERATOR_TEL <>", value, "operatorTel");
            return (Criteria) this;
        }

        public Criteria andOperatorTelGreaterThan(String value) {
            addCriterion("OPERATOR_TEL >", value, "operatorTel");
            return (Criteria) this;
        }

        public Criteria andOperatorTelGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_TEL >=", value, "operatorTel");
            return (Criteria) this;
        }

        public Criteria andOperatorTelLessThan(String value) {
            addCriterion("OPERATOR_TEL <", value, "operatorTel");
            return (Criteria) this;
        }

        public Criteria andOperatorTelLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_TEL <=", value, "operatorTel");
            return (Criteria) this;
        }

        public Criteria andOperatorTelLike(String value) {
            addCriterion("OPERATOR_TEL like", value, "operatorTel");
            return (Criteria) this;
        }

        public Criteria andOperatorTelNotLike(String value) {
            addCriterion("OPERATOR_TEL not like", value, "operatorTel");
            return (Criteria) this;
        }

        public Criteria andOperatorTelIn(List<String> values) {
            addCriterion("OPERATOR_TEL in", values, "operatorTel");
            return (Criteria) this;
        }

        public Criteria andOperatorTelNotIn(List<String> values) {
            addCriterion("OPERATOR_TEL not in", values, "operatorTel");
            return (Criteria) this;
        }

        public Criteria andOperatorTelBetween(String value1, String value2) {
            addCriterion("OPERATOR_TEL between", value1, value2, "operatorTel");
            return (Criteria) this;
        }

        public Criteria andOperatorTelNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_TEL not between", value1, value2, "operatorTel");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNull() {
            addCriterion("ABBREVIATION is null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNotNull() {
            addCriterion("ABBREVIATION is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationEqualTo(String value) {
            addCriterion("ABBREVIATION =", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotEqualTo(String value) {
            addCriterion("ABBREVIATION <>", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThan(String value) {
            addCriterion("ABBREVIATION >", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("ABBREVIATION >=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThan(String value) {
            addCriterion("ABBREVIATION <", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("ABBREVIATION <=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLike(String value) {
            addCriterion("ABBREVIATION like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotLike(String value) {
            addCriterion("ABBREVIATION not like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIn(List<String> values) {
            addCriterion("ABBREVIATION in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotIn(List<String> values) {
            addCriterion("ABBREVIATION not in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationBetween(String value1, String value2) {
            addCriterion("ABBREVIATION between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotBetween(String value1, String value2) {
            addCriterion("ABBREVIATION not between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceIsNull() {
            addCriterion("IS_ACCEPTANCE is null");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceIsNotNull() {
            addCriterion("IS_ACCEPTANCE is not null");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceEqualTo(Integer value) {
            addCriterion("IS_ACCEPTANCE =", value, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceNotEqualTo(Integer value) {
            addCriterion("IS_ACCEPTANCE <>", value, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceGreaterThan(Integer value) {
            addCriterion("IS_ACCEPTANCE >", value, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ACCEPTANCE >=", value, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceLessThan(Integer value) {
            addCriterion("IS_ACCEPTANCE <", value, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ACCEPTANCE <=", value, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceIn(List<Integer> values) {
            addCriterion("IS_ACCEPTANCE in", values, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceNotIn(List<Integer> values) {
            addCriterion("IS_ACCEPTANCE not in", values, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceBetween(Integer value1, Integer value2) {
            addCriterion("IS_ACCEPTANCE between", value1, value2, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andIsAcceptanceNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ACCEPTANCE not between", value1, value2, "isAcceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManIsNull() {
            addCriterion("ACCEPTANCE_MAN is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManIsNotNull() {
            addCriterion("ACCEPTANCE_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManEqualTo(String value) {
            addCriterion("ACCEPTANCE_MAN =", value, "acceptanceMan");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManNotEqualTo(String value) {
            addCriterion("ACCEPTANCE_MAN <>", value, "acceptanceMan");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManGreaterThan(String value) {
            addCriterion("ACCEPTANCE_MAN >", value, "acceptanceMan");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManGreaterThanOrEqualTo(String value) {
            addCriterion("ACCEPTANCE_MAN >=", value, "acceptanceMan");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManLessThan(String value) {
            addCriterion("ACCEPTANCE_MAN <", value, "acceptanceMan");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManLessThanOrEqualTo(String value) {
            addCriterion("ACCEPTANCE_MAN <=", value, "acceptanceMan");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManLike(String value) {
            addCriterion("ACCEPTANCE_MAN like", value, "acceptanceMan");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManNotLike(String value) {
            addCriterion("ACCEPTANCE_MAN not like", value, "acceptanceMan");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManIn(List<String> values) {
            addCriterion("ACCEPTANCE_MAN in", values, "acceptanceMan");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManNotIn(List<String> values) {
            addCriterion("ACCEPTANCE_MAN not in", values, "acceptanceMan");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManBetween(String value1, String value2) {
            addCriterion("ACCEPTANCE_MAN between", value1, value2, "acceptanceMan");
            return (Criteria) this;
        }

        public Criteria andAcceptanceManNotBetween(String value1, String value2) {
            addCriterion("ACCEPTANCE_MAN not between", value1, value2, "acceptanceMan");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateIsNull() {
            addCriterion("ACCEPTANCE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateIsNotNull() {
            addCriterion("ACCEPTANCE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateEqualTo(Date value) {
            addCriterion("ACCEPTANCE_DATE =", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateNotEqualTo(Date value) {
            addCriterion("ACCEPTANCE_DATE <>", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateGreaterThan(Date value) {
            addCriterion("ACCEPTANCE_DATE >", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ACCEPTANCE_DATE >=", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateLessThan(Date value) {
            addCriterion("ACCEPTANCE_DATE <", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateLessThanOrEqualTo(Date value) {
            addCriterion("ACCEPTANCE_DATE <=", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateIn(List<Date> values) {
            addCriterion("ACCEPTANCE_DATE in", values, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateNotIn(List<Date> values) {
            addCriterion("ACCEPTANCE_DATE not in", values, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateBetween(Date value1, Date value2) {
            addCriterion("ACCEPTANCE_DATE between", value1, value2, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateNotBetween(Date value1, Date value2) {
            addCriterion("ACCEPTANCE_DATE not between", value1, value2, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andInstallerIsNull() {
            addCriterion("INSTALLER is null");
            return (Criteria) this;
        }

        public Criteria andInstallerIsNotNull() {
            addCriterion("INSTALLER is not null");
            return (Criteria) this;
        }

        public Criteria andInstallerEqualTo(String value) {
            addCriterion("INSTALLER =", value, "installer");
            return (Criteria) this;
        }

        public Criteria andInstallerNotEqualTo(String value) {
            addCriterion("INSTALLER <>", value, "installer");
            return (Criteria) this;
        }

        public Criteria andInstallerGreaterThan(String value) {
            addCriterion("INSTALLER >", value, "installer");
            return (Criteria) this;
        }

        public Criteria andInstallerGreaterThanOrEqualTo(String value) {
            addCriterion("INSTALLER >=", value, "installer");
            return (Criteria) this;
        }

        public Criteria andInstallerLessThan(String value) {
            addCriterion("INSTALLER <", value, "installer");
            return (Criteria) this;
        }

        public Criteria andInstallerLessThanOrEqualTo(String value) {
            addCriterion("INSTALLER <=", value, "installer");
            return (Criteria) this;
        }

        public Criteria andInstallerLike(String value) {
            addCriterion("INSTALLER like", value, "installer");
            return (Criteria) this;
        }

        public Criteria andInstallerNotLike(String value) {
            addCriterion("INSTALLER not like", value, "installer");
            return (Criteria) this;
        }

        public Criteria andInstallerIn(List<String> values) {
            addCriterion("INSTALLER in", values, "installer");
            return (Criteria) this;
        }

        public Criteria andInstallerNotIn(List<String> values) {
            addCriterion("INSTALLER not in", values, "installer");
            return (Criteria) this;
        }

        public Criteria andInstallerBetween(String value1, String value2) {
            addCriterion("INSTALLER between", value1, value2, "installer");
            return (Criteria) this;
        }

        public Criteria andInstallerNotBetween(String value1, String value2) {
            addCriterion("INSTALLER not between", value1, value2, "installer");
            return (Criteria) this;
        }

        public Criteria andInstallTmIsNull() {
            addCriterion("INSTALL_TM is null");
            return (Criteria) this;
        }

        public Criteria andInstallTmIsNotNull() {
            addCriterion("INSTALL_TM is not null");
            return (Criteria) this;
        }

        public Criteria andInstallTmEqualTo(Date value) {
            addCriterionForJDBCTime("INSTALL_TM =", value, "installTm");
            return (Criteria) this;
        }

        public Criteria andInstallTmNotEqualTo(Date value) {
            addCriterionForJDBCTime("INSTALL_TM <>", value, "installTm");
            return (Criteria) this;
        }

        public Criteria andInstallTmGreaterThan(Date value) {
            addCriterionForJDBCTime("INSTALL_TM >", value, "installTm");
            return (Criteria) this;
        }

        public Criteria andInstallTmGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("INSTALL_TM >=", value, "installTm");
            return (Criteria) this;
        }

        public Criteria andInstallTmLessThan(Date value) {
            addCriterionForJDBCTime("INSTALL_TM <", value, "installTm");
            return (Criteria) this;
        }

        public Criteria andInstallTmLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("INSTALL_TM <=", value, "installTm");
            return (Criteria) this;
        }

        public Criteria andInstallTmIn(List<Date> values) {
            addCriterionForJDBCTime("INSTALL_TM in", values, "installTm");
            return (Criteria) this;
        }

        public Criteria andInstallTmNotIn(List<Date> values) {
            addCriterionForJDBCTime("INSTALL_TM not in", values, "installTm");
            return (Criteria) this;
        }

        public Criteria andInstallTmBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("INSTALL_TM between", value1, value2, "installTm");
            return (Criteria) this;
        }

        public Criteria andInstallTmNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("INSTALL_TM not between", value1, value2, "installTm");
            return (Criteria) this;
        }

        public Criteria andInstaillTimeIsNull() {
            addCriterion("INSTAILL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInstaillTimeIsNotNull() {
            addCriterion("INSTAILL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInstaillTimeEqualTo(Date value) {
            addCriterion("INSTAILL_TIME =", value, "instaillTime");
            return (Criteria) this;
        }

        public Criteria andInstaillTimeNotEqualTo(Date value) {
            addCriterion("INSTAILL_TIME <>", value, "instaillTime");
            return (Criteria) this;
        }

        public Criteria andInstaillTimeGreaterThan(Date value) {
            addCriterion("INSTAILL_TIME >", value, "instaillTime");
            return (Criteria) this;
        }

        public Criteria andInstaillTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INSTAILL_TIME >=", value, "instaillTime");
            return (Criteria) this;
        }

        public Criteria andInstaillTimeLessThan(Date value) {
            addCriterion("INSTAILL_TIME <", value, "instaillTime");
            return (Criteria) this;
        }

        public Criteria andInstaillTimeLessThanOrEqualTo(Date value) {
            addCriterion("INSTAILL_TIME <=", value, "instaillTime");
            return (Criteria) this;
        }

        public Criteria andInstaillTimeIn(List<Date> values) {
            addCriterion("INSTAILL_TIME in", values, "instaillTime");
            return (Criteria) this;
        }

        public Criteria andInstaillTimeNotIn(List<Date> values) {
            addCriterion("INSTAILL_TIME not in", values, "instaillTime");
            return (Criteria) this;
        }

        public Criteria andInstaillTimeBetween(Date value1, Date value2) {
            addCriterion("INSTAILL_TIME between", value1, value2, "instaillTime");
            return (Criteria) this;
        }

        public Criteria andInstaillTimeNotBetween(Date value1, Date value2) {
            addCriterion("INSTAILL_TIME not between", value1, value2, "instaillTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeIsNull() {
            addCriterion("INSTALL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInstallTimeIsNotNull() {
            addCriterion("INSTALL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInstallTimeEqualTo(Date value) {
            addCriterion("INSTALL_TIME =", value, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeNotEqualTo(Date value) {
            addCriterion("INSTALL_TIME <>", value, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeGreaterThan(Date value) {
            addCriterion("INSTALL_TIME >", value, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INSTALL_TIME >=", value, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeLessThan(Date value) {
            addCriterion("INSTALL_TIME <", value, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeLessThanOrEqualTo(Date value) {
            addCriterion("INSTALL_TIME <=", value, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeIn(List<Date> values) {
            addCriterion("INSTALL_TIME in", values, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeNotIn(List<Date> values) {
            addCriterion("INSTALL_TIME not in", values, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeBetween(Date value1, Date value2) {
            addCriterion("INSTALL_TIME between", value1, value2, "installTime");
            return (Criteria) this;
        }

        public Criteria andInstallTimeNotBetween(Date value1, Date value2) {
            addCriterion("INSTALL_TIME not between", value1, value2, "installTime");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("POINT is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("POINT is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(String value) {
            addCriterion("POINT =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(String value) {
            addCriterion("POINT <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(String value) {
            addCriterion("POINT >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(String value) {
            addCriterion("POINT >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(String value) {
            addCriterion("POINT <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(String value) {
            addCriterion("POINT <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLike(String value) {
            addCriterion("POINT like", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotLike(String value) {
            addCriterion("POINT not like", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<String> values) {
            addCriterion("POINT in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<String> values) {
            addCriterion("POINT not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(String value1, String value2) {
            addCriterion("POINT between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(String value1, String value2) {
            addCriterion("POINT not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andActPointIsNull() {
            addCriterion("ACT_POINT is null");
            return (Criteria) this;
        }

        public Criteria andActPointIsNotNull() {
            addCriterion("ACT_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andActPointEqualTo(String value) {
            addCriterion("ACT_POINT =", value, "actPoint");
            return (Criteria) this;
        }

        public Criteria andActPointNotEqualTo(String value) {
            addCriterion("ACT_POINT <>", value, "actPoint");
            return (Criteria) this;
        }

        public Criteria andActPointGreaterThan(String value) {
            addCriterion("ACT_POINT >", value, "actPoint");
            return (Criteria) this;
        }

        public Criteria andActPointGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_POINT >=", value, "actPoint");
            return (Criteria) this;
        }

        public Criteria andActPointLessThan(String value) {
            addCriterion("ACT_POINT <", value, "actPoint");
            return (Criteria) this;
        }

        public Criteria andActPointLessThanOrEqualTo(String value) {
            addCriterion("ACT_POINT <=", value, "actPoint");
            return (Criteria) this;
        }

        public Criteria andActPointLike(String value) {
            addCriterion("ACT_POINT like", value, "actPoint");
            return (Criteria) this;
        }

        public Criteria andActPointNotLike(String value) {
            addCriterion("ACT_POINT not like", value, "actPoint");
            return (Criteria) this;
        }

        public Criteria andActPointIn(List<String> values) {
            addCriterion("ACT_POINT in", values, "actPoint");
            return (Criteria) this;
        }

        public Criteria andActPointNotIn(List<String> values) {
            addCriterion("ACT_POINT not in", values, "actPoint");
            return (Criteria) this;
        }

        public Criteria andActPointBetween(String value1, String value2) {
            addCriterion("ACT_POINT between", value1, value2, "actPoint");
            return (Criteria) this;
        }

        public Criteria andActPointNotBetween(String value1, String value2) {
            addCriterion("ACT_POINT not between", value1, value2, "actPoint");
            return (Criteria) this;
        }

        public Criteria andActAddressIsNull() {
            addCriterion("ACT_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andActAddressIsNotNull() {
            addCriterion("ACT_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andActAddressEqualTo(String value) {
            addCriterion("ACT_ADDRESS =", value, "actAddress");
            return (Criteria) this;
        }

        public Criteria andActAddressNotEqualTo(String value) {
            addCriterion("ACT_ADDRESS <>", value, "actAddress");
            return (Criteria) this;
        }

        public Criteria andActAddressGreaterThan(String value) {
            addCriterion("ACT_ADDRESS >", value, "actAddress");
            return (Criteria) this;
        }

        public Criteria andActAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_ADDRESS >=", value, "actAddress");
            return (Criteria) this;
        }

        public Criteria andActAddressLessThan(String value) {
            addCriterion("ACT_ADDRESS <", value, "actAddress");
            return (Criteria) this;
        }

        public Criteria andActAddressLessThanOrEqualTo(String value) {
            addCriterion("ACT_ADDRESS <=", value, "actAddress");
            return (Criteria) this;
        }

        public Criteria andActAddressLike(String value) {
            addCriterion("ACT_ADDRESS like", value, "actAddress");
            return (Criteria) this;
        }

        public Criteria andActAddressNotLike(String value) {
            addCriterion("ACT_ADDRESS not like", value, "actAddress");
            return (Criteria) this;
        }

        public Criteria andActAddressIn(List<String> values) {
            addCriterion("ACT_ADDRESS in", values, "actAddress");
            return (Criteria) this;
        }

        public Criteria andActAddressNotIn(List<String> values) {
            addCriterion("ACT_ADDRESS not in", values, "actAddress");
            return (Criteria) this;
        }

        public Criteria andActAddressBetween(String value1, String value2) {
            addCriterion("ACT_ADDRESS between", value1, value2, "actAddress");
            return (Criteria) this;
        }

        public Criteria andActAddressNotBetween(String value1, String value2) {
            addCriterion("ACT_ADDRESS not between", value1, value2, "actAddress");
            return (Criteria) this;
        }

        public Criteria andMaintainStateIsNull() {
            addCriterion("MAINTAIN_STATE is null");
            return (Criteria) this;
        }

        public Criteria andMaintainStateIsNotNull() {
            addCriterion("MAINTAIN_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainStateEqualTo(Integer value) {
            addCriterion("MAINTAIN_STATE =", value, "maintainState");
            return (Criteria) this;
        }

        public Criteria andMaintainStateNotEqualTo(Integer value) {
            addCriterion("MAINTAIN_STATE <>", value, "maintainState");
            return (Criteria) this;
        }

        public Criteria andMaintainStateGreaterThan(Integer value) {
            addCriterion("MAINTAIN_STATE >", value, "maintainState");
            return (Criteria) this;
        }

        public Criteria andMaintainStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAINTAIN_STATE >=", value, "maintainState");
            return (Criteria) this;
        }

        public Criteria andMaintainStateLessThan(Integer value) {
            addCriterion("MAINTAIN_STATE <", value, "maintainState");
            return (Criteria) this;
        }

        public Criteria andMaintainStateLessThanOrEqualTo(Integer value) {
            addCriterion("MAINTAIN_STATE <=", value, "maintainState");
            return (Criteria) this;
        }

        public Criteria andMaintainStateIn(List<Integer> values) {
            addCriterion("MAINTAIN_STATE in", values, "maintainState");
            return (Criteria) this;
        }

        public Criteria andMaintainStateNotIn(List<Integer> values) {
            addCriterion("MAINTAIN_STATE not in", values, "maintainState");
            return (Criteria) this;
        }

        public Criteria andMaintainStateBetween(Integer value1, Integer value2) {
            addCriterion("MAINTAIN_STATE between", value1, value2, "maintainState");
            return (Criteria) this;
        }

        public Criteria andMaintainStateNotBetween(Integer value1, Integer value2) {
            addCriterion("MAINTAIN_STATE not between", value1, value2, "maintainState");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessStatdateIsNull() {
            addCriterion("REGAIN_BUSINESS_STATDATE is null");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessStatdateIsNotNull() {
            addCriterion("REGAIN_BUSINESS_STATDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessStatdateEqualTo(Date value) {
            addCriterion("REGAIN_BUSINESS_STATDATE =", value, "regainBusinessStatdate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessStatdateNotEqualTo(Date value) {
            addCriterion("REGAIN_BUSINESS_STATDATE <>", value, "regainBusinessStatdate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessStatdateGreaterThan(Date value) {
            addCriterion("REGAIN_BUSINESS_STATDATE >", value, "regainBusinessStatdate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessStatdateGreaterThanOrEqualTo(Date value) {
            addCriterion("REGAIN_BUSINESS_STATDATE >=", value, "regainBusinessStatdate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessStatdateLessThan(Date value) {
            addCriterion("REGAIN_BUSINESS_STATDATE <", value, "regainBusinessStatdate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessStatdateLessThanOrEqualTo(Date value) {
            addCriterion("REGAIN_BUSINESS_STATDATE <=", value, "regainBusinessStatdate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessStatdateIn(List<Date> values) {
            addCriterion("REGAIN_BUSINESS_STATDATE in", values, "regainBusinessStatdate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessStatdateNotIn(List<Date> values) {
            addCriterion("REGAIN_BUSINESS_STATDATE not in", values, "regainBusinessStatdate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessStatdateBetween(Date value1, Date value2) {
            addCriterion("REGAIN_BUSINESS_STATDATE between", value1, value2, "regainBusinessStatdate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessStatdateNotBetween(Date value1, Date value2) {
            addCriterion("REGAIN_BUSINESS_STATDATE not between", value1, value2, "regainBusinessStatdate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessEnddateIsNull() {
            addCriterion("REGAIN_BUSINESS_ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessEnddateIsNotNull() {
            addCriterion("REGAIN_BUSINESS_ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessEnddateEqualTo(Date value) {
            addCriterion("REGAIN_BUSINESS_ENDDATE =", value, "regainBusinessEnddate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessEnddateNotEqualTo(Date value) {
            addCriterion("REGAIN_BUSINESS_ENDDATE <>", value, "regainBusinessEnddate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessEnddateGreaterThan(Date value) {
            addCriterion("REGAIN_BUSINESS_ENDDATE >", value, "regainBusinessEnddate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("REGAIN_BUSINESS_ENDDATE >=", value, "regainBusinessEnddate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessEnddateLessThan(Date value) {
            addCriterion("REGAIN_BUSINESS_ENDDATE <", value, "regainBusinessEnddate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessEnddateLessThanOrEqualTo(Date value) {
            addCriterion("REGAIN_BUSINESS_ENDDATE <=", value, "regainBusinessEnddate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessEnddateIn(List<Date> values) {
            addCriterion("REGAIN_BUSINESS_ENDDATE in", values, "regainBusinessEnddate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessEnddateNotIn(List<Date> values) {
            addCriterion("REGAIN_BUSINESS_ENDDATE not in", values, "regainBusinessEnddate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessEnddateBetween(Date value1, Date value2) {
            addCriterion("REGAIN_BUSINESS_ENDDATE between", value1, value2, "regainBusinessEnddate");
            return (Criteria) this;
        }

        public Criteria andRegainBusinessEnddateNotBetween(Date value1, Date value2) {
            addCriterion("REGAIN_BUSINESS_ENDDATE not between", value1, value2, "regainBusinessEnddate");
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