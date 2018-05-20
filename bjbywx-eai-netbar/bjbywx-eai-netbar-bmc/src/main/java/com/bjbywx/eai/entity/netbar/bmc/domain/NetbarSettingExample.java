package com.bjbywx.eai.entity.netbar.bmc.domain;

import java.util.ArrayList;
import java.util.List;

public class NetbarSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NetbarSettingExample() {
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

        public Criteria andMaxadminIsNull() {
            addCriterion("MAXADMIN is null");
            return (Criteria) this;
        }

        public Criteria andMaxadminIsNotNull() {
            addCriterion("MAXADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andMaxadminEqualTo(Integer value) {
            addCriterion("MAXADMIN =", value, "maxadmin");
            return (Criteria) this;
        }

        public Criteria andMaxadminNotEqualTo(Integer value) {
            addCriterion("MAXADMIN <>", value, "maxadmin");
            return (Criteria) this;
        }

        public Criteria andMaxadminGreaterThan(Integer value) {
            addCriterion("MAXADMIN >", value, "maxadmin");
            return (Criteria) this;
        }

        public Criteria andMaxadminGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAXADMIN >=", value, "maxadmin");
            return (Criteria) this;
        }

        public Criteria andMaxadminLessThan(Integer value) {
            addCriterion("MAXADMIN <", value, "maxadmin");
            return (Criteria) this;
        }

        public Criteria andMaxadminLessThanOrEqualTo(Integer value) {
            addCriterion("MAXADMIN <=", value, "maxadmin");
            return (Criteria) this;
        }

        public Criteria andMaxadminIn(List<Integer> values) {
            addCriterion("MAXADMIN in", values, "maxadmin");
            return (Criteria) this;
        }

        public Criteria andMaxadminNotIn(List<Integer> values) {
            addCriterion("MAXADMIN not in", values, "maxadmin");
            return (Criteria) this;
        }

        public Criteria andMaxadminBetween(Integer value1, Integer value2) {
            addCriterion("MAXADMIN between", value1, value2, "maxadmin");
            return (Criteria) this;
        }

        public Criteria andMaxadminNotBetween(Integer value1, Integer value2) {
            addCriterion("MAXADMIN not between", value1, value2, "maxadmin");
            return (Criteria) this;
        }

        public Criteria andAdmintimerIsNull() {
            addCriterion("ADMINTIMER is null");
            return (Criteria) this;
        }

        public Criteria andAdmintimerIsNotNull() {
            addCriterion("ADMINTIMER is not null");
            return (Criteria) this;
        }

        public Criteria andAdmintimerEqualTo(Integer value) {
            addCriterion("ADMINTIMER =", value, "admintimer");
            return (Criteria) this;
        }

        public Criteria andAdmintimerNotEqualTo(Integer value) {
            addCriterion("ADMINTIMER <>", value, "admintimer");
            return (Criteria) this;
        }

        public Criteria andAdmintimerGreaterThan(Integer value) {
            addCriterion("ADMINTIMER >", value, "admintimer");
            return (Criteria) this;
        }

        public Criteria andAdmintimerGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADMINTIMER >=", value, "admintimer");
            return (Criteria) this;
        }

        public Criteria andAdmintimerLessThan(Integer value) {
            addCriterion("ADMINTIMER <", value, "admintimer");
            return (Criteria) this;
        }

        public Criteria andAdmintimerLessThanOrEqualTo(Integer value) {
            addCriterion("ADMINTIMER <=", value, "admintimer");
            return (Criteria) this;
        }

        public Criteria andAdmintimerIn(List<Integer> values) {
            addCriterion("ADMINTIMER in", values, "admintimer");
            return (Criteria) this;
        }

        public Criteria andAdmintimerNotIn(List<Integer> values) {
            addCriterion("ADMINTIMER not in", values, "admintimer");
            return (Criteria) this;
        }

        public Criteria andAdmintimerBetween(Integer value1, Integer value2) {
            addCriterion("ADMINTIMER between", value1, value2, "admintimer");
            return (Criteria) this;
        }

        public Criteria andAdmintimerNotBetween(Integer value1, Integer value2) {
            addCriterion("ADMINTIMER not between", value1, value2, "admintimer");
            return (Criteria) this;
        }

        public Criteria andDupcertidtimesIsNull() {
            addCriterion("DUPCERTIDTIMES is null");
            return (Criteria) this;
        }

        public Criteria andDupcertidtimesIsNotNull() {
            addCriterion("DUPCERTIDTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andDupcertidtimesEqualTo(Integer value) {
            addCriterion("DUPCERTIDTIMES =", value, "dupcertidtimes");
            return (Criteria) this;
        }

        public Criteria andDupcertidtimesNotEqualTo(Integer value) {
            addCriterion("DUPCERTIDTIMES <>", value, "dupcertidtimes");
            return (Criteria) this;
        }

        public Criteria andDupcertidtimesGreaterThan(Integer value) {
            addCriterion("DUPCERTIDTIMES >", value, "dupcertidtimes");
            return (Criteria) this;
        }

        public Criteria andDupcertidtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("DUPCERTIDTIMES >=", value, "dupcertidtimes");
            return (Criteria) this;
        }

        public Criteria andDupcertidtimesLessThan(Integer value) {
            addCriterion("DUPCERTIDTIMES <", value, "dupcertidtimes");
            return (Criteria) this;
        }

        public Criteria andDupcertidtimesLessThanOrEqualTo(Integer value) {
            addCriterion("DUPCERTIDTIMES <=", value, "dupcertidtimes");
            return (Criteria) this;
        }

        public Criteria andDupcertidtimesIn(List<Integer> values) {
            addCriterion("DUPCERTIDTIMES in", values, "dupcertidtimes");
            return (Criteria) this;
        }

        public Criteria andDupcertidtimesNotIn(List<Integer> values) {
            addCriterion("DUPCERTIDTIMES not in", values, "dupcertidtimes");
            return (Criteria) this;
        }

        public Criteria andDupcertidtimesBetween(Integer value1, Integer value2) {
            addCriterion("DUPCERTIDTIMES between", value1, value2, "dupcertidtimes");
            return (Criteria) this;
        }

        public Criteria andDupcertidtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("DUPCERTIDTIMES not between", value1, value2, "dupcertidtimes");
            return (Criteria) this;
        }

        public Criteria andMoncertidratioIsNull() {
            addCriterion("MONCERTIDRATIO is null");
            return (Criteria) this;
        }

        public Criteria andMoncertidratioIsNotNull() {
            addCriterion("MONCERTIDRATIO is not null");
            return (Criteria) this;
        }

        public Criteria andMoncertidratioEqualTo(Integer value) {
            addCriterion("MONCERTIDRATIO =", value, "moncertidratio");
            return (Criteria) this;
        }

        public Criteria andMoncertidratioNotEqualTo(Integer value) {
            addCriterion("MONCERTIDRATIO <>", value, "moncertidratio");
            return (Criteria) this;
        }

        public Criteria andMoncertidratioGreaterThan(Integer value) {
            addCriterion("MONCERTIDRATIO >", value, "moncertidratio");
            return (Criteria) this;
        }

        public Criteria andMoncertidratioGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONCERTIDRATIO >=", value, "moncertidratio");
            return (Criteria) this;
        }

        public Criteria andMoncertidratioLessThan(Integer value) {
            addCriterion("MONCERTIDRATIO <", value, "moncertidratio");
            return (Criteria) this;
        }

        public Criteria andMoncertidratioLessThanOrEqualTo(Integer value) {
            addCriterion("MONCERTIDRATIO <=", value, "moncertidratio");
            return (Criteria) this;
        }

        public Criteria andMoncertidratioIn(List<Integer> values) {
            addCriterion("MONCERTIDRATIO in", values, "moncertidratio");
            return (Criteria) this;
        }

        public Criteria andMoncertidratioNotIn(List<Integer> values) {
            addCriterion("MONCERTIDRATIO not in", values, "moncertidratio");
            return (Criteria) this;
        }

        public Criteria andMoncertidratioBetween(Integer value1, Integer value2) {
            addCriterion("MONCERTIDRATIO between", value1, value2, "moncertidratio");
            return (Criteria) this;
        }

        public Criteria andMoncertidratioNotBetween(Integer value1, Integer value2) {
            addCriterion("MONCERTIDRATIO not between", value1, value2, "moncertidratio");
            return (Criteria) this;
        }

        public Criteria andShutoutTmIsNull() {
            addCriterion("SHUTOUT_TM is null");
            return (Criteria) this;
        }

        public Criteria andShutoutTmIsNotNull() {
            addCriterion("SHUTOUT_TM is not null");
            return (Criteria) this;
        }

        public Criteria andShutoutTmEqualTo(Integer value) {
            addCriterion("SHUTOUT_TM =", value, "shutoutTm");
            return (Criteria) this;
        }

        public Criteria andShutoutTmNotEqualTo(Integer value) {
            addCriterion("SHUTOUT_TM <>", value, "shutoutTm");
            return (Criteria) this;
        }

        public Criteria andShutoutTmGreaterThan(Integer value) {
            addCriterion("SHUTOUT_TM >", value, "shutoutTm");
            return (Criteria) this;
        }

        public Criteria andShutoutTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHUTOUT_TM >=", value, "shutoutTm");
            return (Criteria) this;
        }

        public Criteria andShutoutTmLessThan(Integer value) {
            addCriterion("SHUTOUT_TM <", value, "shutoutTm");
            return (Criteria) this;
        }

        public Criteria andShutoutTmLessThanOrEqualTo(Integer value) {
            addCriterion("SHUTOUT_TM <=", value, "shutoutTm");
            return (Criteria) this;
        }

        public Criteria andShutoutTmIn(List<Integer> values) {
            addCriterion("SHUTOUT_TM in", values, "shutoutTm");
            return (Criteria) this;
        }

        public Criteria andShutoutTmNotIn(List<Integer> values) {
            addCriterion("SHUTOUT_TM not in", values, "shutoutTm");
            return (Criteria) this;
        }

        public Criteria andShutoutTmBetween(Integer value1, Integer value2) {
            addCriterion("SHUTOUT_TM between", value1, value2, "shutoutTm");
            return (Criteria) this;
        }

        public Criteria andShutoutTmNotBetween(Integer value1, Integer value2) {
            addCriterion("SHUTOUT_TM not between", value1, value2, "shutoutTm");
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

        public Criteria andClientLogoutIsNull() {
            addCriterion("CLIENT_LOGOUT is null");
            return (Criteria) this;
        }

        public Criteria andClientLogoutIsNotNull() {
            addCriterion("CLIENT_LOGOUT is not null");
            return (Criteria) this;
        }

        public Criteria andClientLogoutEqualTo(Integer value) {
            addCriterion("CLIENT_LOGOUT =", value, "clientLogout");
            return (Criteria) this;
        }

        public Criteria andClientLogoutNotEqualTo(Integer value) {
            addCriterion("CLIENT_LOGOUT <>", value, "clientLogout");
            return (Criteria) this;
        }

        public Criteria andClientLogoutGreaterThan(Integer value) {
            addCriterion("CLIENT_LOGOUT >", value, "clientLogout");
            return (Criteria) this;
        }

        public Criteria andClientLogoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLIENT_LOGOUT >=", value, "clientLogout");
            return (Criteria) this;
        }

        public Criteria andClientLogoutLessThan(Integer value) {
            addCriterion("CLIENT_LOGOUT <", value, "clientLogout");
            return (Criteria) this;
        }

        public Criteria andClientLogoutLessThanOrEqualTo(Integer value) {
            addCriterion("CLIENT_LOGOUT <=", value, "clientLogout");
            return (Criteria) this;
        }

        public Criteria andClientLogoutIn(List<Integer> values) {
            addCriterion("CLIENT_LOGOUT in", values, "clientLogout");
            return (Criteria) this;
        }

        public Criteria andClientLogoutNotIn(List<Integer> values) {
            addCriterion("CLIENT_LOGOUT not in", values, "clientLogout");
            return (Criteria) this;
        }

        public Criteria andClientLogoutBetween(Integer value1, Integer value2) {
            addCriterion("CLIENT_LOGOUT between", value1, value2, "clientLogout");
            return (Criteria) this;
        }

        public Criteria andClientLogoutNotBetween(Integer value1, Integer value2) {
            addCriterion("CLIENT_LOGOUT not between", value1, value2, "clientLogout");
            return (Criteria) this;
        }

        public Criteria andMobilePwdLoginTmIsNull() {
            addCriterion("MOBILE_PWD_LOGIN_TM is null");
            return (Criteria) this;
        }

        public Criteria andMobilePwdLoginTmIsNotNull() {
            addCriterion("MOBILE_PWD_LOGIN_TM is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePwdLoginTmEqualTo(Integer value) {
            addCriterion("MOBILE_PWD_LOGIN_TM =", value, "mobilePwdLoginTm");
            return (Criteria) this;
        }

        public Criteria andMobilePwdLoginTmNotEqualTo(Integer value) {
            addCriterion("MOBILE_PWD_LOGIN_TM <>", value, "mobilePwdLoginTm");
            return (Criteria) this;
        }

        public Criteria andMobilePwdLoginTmGreaterThan(Integer value) {
            addCriterion("MOBILE_PWD_LOGIN_TM >", value, "mobilePwdLoginTm");
            return (Criteria) this;
        }

        public Criteria andMobilePwdLoginTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("MOBILE_PWD_LOGIN_TM >=", value, "mobilePwdLoginTm");
            return (Criteria) this;
        }

        public Criteria andMobilePwdLoginTmLessThan(Integer value) {
            addCriterion("MOBILE_PWD_LOGIN_TM <", value, "mobilePwdLoginTm");
            return (Criteria) this;
        }

        public Criteria andMobilePwdLoginTmLessThanOrEqualTo(Integer value) {
            addCriterion("MOBILE_PWD_LOGIN_TM <=", value, "mobilePwdLoginTm");
            return (Criteria) this;
        }

        public Criteria andMobilePwdLoginTmIn(List<Integer> values) {
            addCriterion("MOBILE_PWD_LOGIN_TM in", values, "mobilePwdLoginTm");
            return (Criteria) this;
        }

        public Criteria andMobilePwdLoginTmNotIn(List<Integer> values) {
            addCriterion("MOBILE_PWD_LOGIN_TM not in", values, "mobilePwdLoginTm");
            return (Criteria) this;
        }

        public Criteria andMobilePwdLoginTmBetween(Integer value1, Integer value2) {
            addCriterion("MOBILE_PWD_LOGIN_TM between", value1, value2, "mobilePwdLoginTm");
            return (Criteria) this;
        }

        public Criteria andMobilePwdLoginTmNotBetween(Integer value1, Integer value2) {
            addCriterion("MOBILE_PWD_LOGIN_TM not between", value1, value2, "mobilePwdLoginTm");
            return (Criteria) this;
        }

        public Criteria andMobileSwitchTmIsNull() {
            addCriterion("MOBILE_SWITCH_TM is null");
            return (Criteria) this;
        }

        public Criteria andMobileSwitchTmIsNotNull() {
            addCriterion("MOBILE_SWITCH_TM is not null");
            return (Criteria) this;
        }

        public Criteria andMobileSwitchTmEqualTo(Integer value) {
            addCriterion("MOBILE_SWITCH_TM =", value, "mobileSwitchTm");
            return (Criteria) this;
        }

        public Criteria andMobileSwitchTmNotEqualTo(Integer value) {
            addCriterion("MOBILE_SWITCH_TM <>", value, "mobileSwitchTm");
            return (Criteria) this;
        }

        public Criteria andMobileSwitchTmGreaterThan(Integer value) {
            addCriterion("MOBILE_SWITCH_TM >", value, "mobileSwitchTm");
            return (Criteria) this;
        }

        public Criteria andMobileSwitchTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("MOBILE_SWITCH_TM >=", value, "mobileSwitchTm");
            return (Criteria) this;
        }

        public Criteria andMobileSwitchTmLessThan(Integer value) {
            addCriterion("MOBILE_SWITCH_TM <", value, "mobileSwitchTm");
            return (Criteria) this;
        }

        public Criteria andMobileSwitchTmLessThanOrEqualTo(Integer value) {
            addCriterion("MOBILE_SWITCH_TM <=", value, "mobileSwitchTm");
            return (Criteria) this;
        }

        public Criteria andMobileSwitchTmIn(List<Integer> values) {
            addCriterion("MOBILE_SWITCH_TM in", values, "mobileSwitchTm");
            return (Criteria) this;
        }

        public Criteria andMobileSwitchTmNotIn(List<Integer> values) {
            addCriterion("MOBILE_SWITCH_TM not in", values, "mobileSwitchTm");
            return (Criteria) this;
        }

        public Criteria andMobileSwitchTmBetween(Integer value1, Integer value2) {
            addCriterion("MOBILE_SWITCH_TM between", value1, value2, "mobileSwitchTm");
            return (Criteria) this;
        }

        public Criteria andMobileSwitchTmNotBetween(Integer value1, Integer value2) {
            addCriterion("MOBILE_SWITCH_TM not between", value1, value2, "mobileSwitchTm");
            return (Criteria) this;
        }

        public Criteria andIdtempCountIsNull() {
            addCriterion("IDTEMP_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andIdtempCountIsNotNull() {
            addCriterion("IDTEMP_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIdtempCountEqualTo(Integer value) {
            addCriterion("IDTEMP_COUNT =", value, "idtempCount");
            return (Criteria) this;
        }

        public Criteria andIdtempCountNotEqualTo(Integer value) {
            addCriterion("IDTEMP_COUNT <>", value, "idtempCount");
            return (Criteria) this;
        }

        public Criteria andIdtempCountGreaterThan(Integer value) {
            addCriterion("IDTEMP_COUNT >", value, "idtempCount");
            return (Criteria) this;
        }

        public Criteria andIdtempCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDTEMP_COUNT >=", value, "idtempCount");
            return (Criteria) this;
        }

        public Criteria andIdtempCountLessThan(Integer value) {
            addCriterion("IDTEMP_COUNT <", value, "idtempCount");
            return (Criteria) this;
        }

        public Criteria andIdtempCountLessThanOrEqualTo(Integer value) {
            addCriterion("IDTEMP_COUNT <=", value, "idtempCount");
            return (Criteria) this;
        }

        public Criteria andIdtempCountIn(List<Integer> values) {
            addCriterion("IDTEMP_COUNT in", values, "idtempCount");
            return (Criteria) this;
        }

        public Criteria andIdtempCountNotIn(List<Integer> values) {
            addCriterion("IDTEMP_COUNT not in", values, "idtempCount");
            return (Criteria) this;
        }

        public Criteria andIdtempCountBetween(Integer value1, Integer value2) {
            addCriterion("IDTEMP_COUNT between", value1, value2, "idtempCount");
            return (Criteria) this;
        }

        public Criteria andIdtempCountNotBetween(Integer value1, Integer value2) {
            addCriterion("IDTEMP_COUNT not between", value1, value2, "idtempCount");
            return (Criteria) this;
        }

        public Criteria andIsFgboundIsNull() {
            addCriterion("IS_FGBOUND is null");
            return (Criteria) this;
        }

        public Criteria andIsFgboundIsNotNull() {
            addCriterion("IS_FGBOUND is not null");
            return (Criteria) this;
        }

        public Criteria andIsFgboundEqualTo(Integer value) {
            addCriterion("IS_FGBOUND =", value, "isFgbound");
            return (Criteria) this;
        }

        public Criteria andIsFgboundNotEqualTo(Integer value) {
            addCriterion("IS_FGBOUND <>", value, "isFgbound");
            return (Criteria) this;
        }

        public Criteria andIsFgboundGreaterThan(Integer value) {
            addCriterion("IS_FGBOUND >", value, "isFgbound");
            return (Criteria) this;
        }

        public Criteria andIsFgboundGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_FGBOUND >=", value, "isFgbound");
            return (Criteria) this;
        }

        public Criteria andIsFgboundLessThan(Integer value) {
            addCriterion("IS_FGBOUND <", value, "isFgbound");
            return (Criteria) this;
        }

        public Criteria andIsFgboundLessThanOrEqualTo(Integer value) {
            addCriterion("IS_FGBOUND <=", value, "isFgbound");
            return (Criteria) this;
        }

        public Criteria andIsFgboundIn(List<Integer> values) {
            addCriterion("IS_FGBOUND in", values, "isFgbound");
            return (Criteria) this;
        }

        public Criteria andIsFgboundNotIn(List<Integer> values) {
            addCriterion("IS_FGBOUND not in", values, "isFgbound");
            return (Criteria) this;
        }

        public Criteria andIsFgboundBetween(Integer value1, Integer value2) {
            addCriterion("IS_FGBOUND between", value1, value2, "isFgbound");
            return (Criteria) this;
        }

        public Criteria andIsFgboundNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_FGBOUND not between", value1, value2, "isFgbound");
            return (Criteria) this;
        }

        public Criteria andAutoUploadTrackIsNull() {
            addCriterion("AUTO_UPLOAD_TRACK is null");
            return (Criteria) this;
        }

        public Criteria andAutoUploadTrackIsNotNull() {
            addCriterion("AUTO_UPLOAD_TRACK is not null");
            return (Criteria) this;
        }

        public Criteria andAutoUploadTrackEqualTo(Integer value) {
            addCriterion("AUTO_UPLOAD_TRACK =", value, "autoUploadTrack");
            return (Criteria) this;
        }

        public Criteria andAutoUploadTrackNotEqualTo(Integer value) {
            addCriterion("AUTO_UPLOAD_TRACK <>", value, "autoUploadTrack");
            return (Criteria) this;
        }

        public Criteria andAutoUploadTrackGreaterThan(Integer value) {
            addCriterion("AUTO_UPLOAD_TRACK >", value, "autoUploadTrack");
            return (Criteria) this;
        }

        public Criteria andAutoUploadTrackGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUTO_UPLOAD_TRACK >=", value, "autoUploadTrack");
            return (Criteria) this;
        }

        public Criteria andAutoUploadTrackLessThan(Integer value) {
            addCriterion("AUTO_UPLOAD_TRACK <", value, "autoUploadTrack");
            return (Criteria) this;
        }

        public Criteria andAutoUploadTrackLessThanOrEqualTo(Integer value) {
            addCriterion("AUTO_UPLOAD_TRACK <=", value, "autoUploadTrack");
            return (Criteria) this;
        }

        public Criteria andAutoUploadTrackIn(List<Integer> values) {
            addCriterion("AUTO_UPLOAD_TRACK in", values, "autoUploadTrack");
            return (Criteria) this;
        }

        public Criteria andAutoUploadTrackNotIn(List<Integer> values) {
            addCriterion("AUTO_UPLOAD_TRACK not in", values, "autoUploadTrack");
            return (Criteria) this;
        }

        public Criteria andAutoUploadTrackBetween(Integer value1, Integer value2) {
            addCriterion("AUTO_UPLOAD_TRACK between", value1, value2, "autoUploadTrack");
            return (Criteria) this;
        }

        public Criteria andAutoUploadTrackNotBetween(Integer value1, Integer value2) {
            addCriterion("AUTO_UPLOAD_TRACK not between", value1, value2, "autoUploadTrack");
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

        public Criteria andIsPriceLimitIsNull() {
            addCriterion("IS_PRICE_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andIsPriceLimitIsNotNull() {
            addCriterion("IS_PRICE_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsPriceLimitEqualTo(Integer value) {
            addCriterion("IS_PRICE_LIMIT =", value, "isPriceLimit");
            return (Criteria) this;
        }

        public Criteria andIsPriceLimitNotEqualTo(Integer value) {
            addCriterion("IS_PRICE_LIMIT <>", value, "isPriceLimit");
            return (Criteria) this;
        }

        public Criteria andIsPriceLimitGreaterThan(Integer value) {
            addCriterion("IS_PRICE_LIMIT >", value, "isPriceLimit");
            return (Criteria) this;
        }

        public Criteria andIsPriceLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_PRICE_LIMIT >=", value, "isPriceLimit");
            return (Criteria) this;
        }

        public Criteria andIsPriceLimitLessThan(Integer value) {
            addCriterion("IS_PRICE_LIMIT <", value, "isPriceLimit");
            return (Criteria) this;
        }

        public Criteria andIsPriceLimitLessThanOrEqualTo(Integer value) {
            addCriterion("IS_PRICE_LIMIT <=", value, "isPriceLimit");
            return (Criteria) this;
        }

        public Criteria andIsPriceLimitIn(List<Integer> values) {
            addCriterion("IS_PRICE_LIMIT in", values, "isPriceLimit");
            return (Criteria) this;
        }

        public Criteria andIsPriceLimitNotIn(List<Integer> values) {
            addCriterion("IS_PRICE_LIMIT not in", values, "isPriceLimit");
            return (Criteria) this;
        }

        public Criteria andIsPriceLimitBetween(Integer value1, Integer value2) {
            addCriterion("IS_PRICE_LIMIT between", value1, value2, "isPriceLimit");
            return (Criteria) this;
        }

        public Criteria andIsPriceLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_PRICE_LIMIT not between", value1, value2, "isPriceLimit");
            return (Criteria) this;
        }

        public Criteria andCommonPriceIsNull() {
            addCriterion("COMMON_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCommonPriceIsNotNull() {
            addCriterion("COMMON_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCommonPriceEqualTo(Integer value) {
            addCriterion("COMMON_PRICE =", value, "commonPrice");
            return (Criteria) this;
        }

        public Criteria andCommonPriceNotEqualTo(Integer value) {
            addCriterion("COMMON_PRICE <>", value, "commonPrice");
            return (Criteria) this;
        }

        public Criteria andCommonPriceGreaterThan(Integer value) {
            addCriterion("COMMON_PRICE >", value, "commonPrice");
            return (Criteria) this;
        }

        public Criteria andCommonPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMON_PRICE >=", value, "commonPrice");
            return (Criteria) this;
        }

        public Criteria andCommonPriceLessThan(Integer value) {
            addCriterion("COMMON_PRICE <", value, "commonPrice");
            return (Criteria) this;
        }

        public Criteria andCommonPriceLessThanOrEqualTo(Integer value) {
            addCriterion("COMMON_PRICE <=", value, "commonPrice");
            return (Criteria) this;
        }

        public Criteria andCommonPriceIn(List<Integer> values) {
            addCriterion("COMMON_PRICE in", values, "commonPrice");
            return (Criteria) this;
        }

        public Criteria andCommonPriceNotIn(List<Integer> values) {
            addCriterion("COMMON_PRICE not in", values, "commonPrice");
            return (Criteria) this;
        }

        public Criteria andCommonPriceBetween(Integer value1, Integer value2) {
            addCriterion("COMMON_PRICE between", value1, value2, "commonPrice");
            return (Criteria) this;
        }

        public Criteria andCommonPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMON_PRICE not between", value1, value2, "commonPrice");
            return (Criteria) this;
        }

        public Criteria andNightPriceIsNull() {
            addCriterion("NIGHT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andNightPriceIsNotNull() {
            addCriterion("NIGHT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andNightPriceEqualTo(Integer value) {
            addCriterion("NIGHT_PRICE =", value, "nightPrice");
            return (Criteria) this;
        }

        public Criteria andNightPriceNotEqualTo(Integer value) {
            addCriterion("NIGHT_PRICE <>", value, "nightPrice");
            return (Criteria) this;
        }

        public Criteria andNightPriceGreaterThan(Integer value) {
            addCriterion("NIGHT_PRICE >", value, "nightPrice");
            return (Criteria) this;
        }

        public Criteria andNightPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("NIGHT_PRICE >=", value, "nightPrice");
            return (Criteria) this;
        }

        public Criteria andNightPriceLessThan(Integer value) {
            addCriterion("NIGHT_PRICE <", value, "nightPrice");
            return (Criteria) this;
        }

        public Criteria andNightPriceLessThanOrEqualTo(Integer value) {
            addCriterion("NIGHT_PRICE <=", value, "nightPrice");
            return (Criteria) this;
        }

        public Criteria andNightPriceIn(List<Integer> values) {
            addCriterion("NIGHT_PRICE in", values, "nightPrice");
            return (Criteria) this;
        }

        public Criteria andNightPriceNotIn(List<Integer> values) {
            addCriterion("NIGHT_PRICE not in", values, "nightPrice");
            return (Criteria) this;
        }

        public Criteria andNightPriceBetween(Integer value1, Integer value2) {
            addCriterion("NIGHT_PRICE between", value1, value2, "nightPrice");
            return (Criteria) this;
        }

        public Criteria andNightPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("NIGHT_PRICE not between", value1, value2, "nightPrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceIsNull() {
            addCriterion("TIME_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andTimePriceIsNotNull() {
            addCriterion("TIME_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTimePriceEqualTo(Integer value) {
            addCriterion("TIME_PRICE =", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceNotEqualTo(Integer value) {
            addCriterion("TIME_PRICE <>", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceGreaterThan(Integer value) {
            addCriterion("TIME_PRICE >", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIME_PRICE >=", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceLessThan(Integer value) {
            addCriterion("TIME_PRICE <", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceLessThanOrEqualTo(Integer value) {
            addCriterion("TIME_PRICE <=", value, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceIn(List<Integer> values) {
            addCriterion("TIME_PRICE in", values, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceNotIn(List<Integer> values) {
            addCriterion("TIME_PRICE not in", values, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceBetween(Integer value1, Integer value2) {
            addCriterion("TIME_PRICE between", value1, value2, "timePrice");
            return (Criteria) this;
        }

        public Criteria andTimePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("TIME_PRICE not between", value1, value2, "timePrice");
            return (Criteria) this;
        }

        public Criteria andIsMemfunLimitIsNull() {
            addCriterion("IS_MEMFUN_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andIsMemfunLimitIsNotNull() {
            addCriterion("IS_MEMFUN_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsMemfunLimitEqualTo(Integer value) {
            addCriterion("IS_MEMFUN_LIMIT =", value, "isMemfunLimit");
            return (Criteria) this;
        }

        public Criteria andIsMemfunLimitNotEqualTo(Integer value) {
            addCriterion("IS_MEMFUN_LIMIT <>", value, "isMemfunLimit");
            return (Criteria) this;
        }

        public Criteria andIsMemfunLimitGreaterThan(Integer value) {
            addCriterion("IS_MEMFUN_LIMIT >", value, "isMemfunLimit");
            return (Criteria) this;
        }

        public Criteria andIsMemfunLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_MEMFUN_LIMIT >=", value, "isMemfunLimit");
            return (Criteria) this;
        }

        public Criteria andIsMemfunLimitLessThan(Integer value) {
            addCriterion("IS_MEMFUN_LIMIT <", value, "isMemfunLimit");
            return (Criteria) this;
        }

        public Criteria andIsMemfunLimitLessThanOrEqualTo(Integer value) {
            addCriterion("IS_MEMFUN_LIMIT <=", value, "isMemfunLimit");
            return (Criteria) this;
        }

        public Criteria andIsMemfunLimitIn(List<Integer> values) {
            addCriterion("IS_MEMFUN_LIMIT in", values, "isMemfunLimit");
            return (Criteria) this;
        }

        public Criteria andIsMemfunLimitNotIn(List<Integer> values) {
            addCriterion("IS_MEMFUN_LIMIT not in", values, "isMemfunLimit");
            return (Criteria) this;
        }

        public Criteria andIsMemfunLimitBetween(Integer value1, Integer value2) {
            addCriterion("IS_MEMFUN_LIMIT between", value1, value2, "isMemfunLimit");
            return (Criteria) this;
        }

        public Criteria andIsMemfunLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_MEMFUN_LIMIT not between", value1, value2, "isMemfunLimit");
            return (Criteria) this;
        }

        public Criteria andMemFunctionNewIsNull() {
            addCriterion("MEM_FUNCTION_NEW is null");
            return (Criteria) this;
        }

        public Criteria andMemFunctionNewIsNotNull() {
            addCriterion("MEM_FUNCTION_NEW is not null");
            return (Criteria) this;
        }

        public Criteria andMemFunctionNewEqualTo(Integer value) {
            addCriterion("MEM_FUNCTION_NEW =", value, "memFunctionNew");
            return (Criteria) this;
        }

        public Criteria andMemFunctionNewNotEqualTo(Integer value) {
            addCriterion("MEM_FUNCTION_NEW <>", value, "memFunctionNew");
            return (Criteria) this;
        }

        public Criteria andMemFunctionNewGreaterThan(Integer value) {
            addCriterion("MEM_FUNCTION_NEW >", value, "memFunctionNew");
            return (Criteria) this;
        }

        public Criteria andMemFunctionNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEM_FUNCTION_NEW >=", value, "memFunctionNew");
            return (Criteria) this;
        }

        public Criteria andMemFunctionNewLessThan(Integer value) {
            addCriterion("MEM_FUNCTION_NEW <", value, "memFunctionNew");
            return (Criteria) this;
        }

        public Criteria andMemFunctionNewLessThanOrEqualTo(Integer value) {
            addCriterion("MEM_FUNCTION_NEW <=", value, "memFunctionNew");
            return (Criteria) this;
        }

        public Criteria andMemFunctionNewIn(List<Integer> values) {
            addCriterion("MEM_FUNCTION_NEW in", values, "memFunctionNew");
            return (Criteria) this;
        }

        public Criteria andMemFunctionNewNotIn(List<Integer> values) {
            addCriterion("MEM_FUNCTION_NEW not in", values, "memFunctionNew");
            return (Criteria) this;
        }

        public Criteria andMemFunctionNewBetween(Integer value1, Integer value2) {
            addCriterion("MEM_FUNCTION_NEW between", value1, value2, "memFunctionNew");
            return (Criteria) this;
        }

        public Criteria andMemFunctionNewNotBetween(Integer value1, Integer value2) {
            addCriterion("MEM_FUNCTION_NEW not between", value1, value2, "memFunctionNew");
            return (Criteria) this;
        }

        public Criteria andMemFunctionAddIsNull() {
            addCriterion("MEM_FUNCTION_ADD is null");
            return (Criteria) this;
        }

        public Criteria andMemFunctionAddIsNotNull() {
            addCriterion("MEM_FUNCTION_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andMemFunctionAddEqualTo(Integer value) {
            addCriterion("MEM_FUNCTION_ADD =", value, "memFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andMemFunctionAddNotEqualTo(Integer value) {
            addCriterion("MEM_FUNCTION_ADD <>", value, "memFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andMemFunctionAddGreaterThan(Integer value) {
            addCriterion("MEM_FUNCTION_ADD >", value, "memFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andMemFunctionAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEM_FUNCTION_ADD >=", value, "memFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andMemFunctionAddLessThan(Integer value) {
            addCriterion("MEM_FUNCTION_ADD <", value, "memFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andMemFunctionAddLessThanOrEqualTo(Integer value) {
            addCriterion("MEM_FUNCTION_ADD <=", value, "memFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andMemFunctionAddIn(List<Integer> values) {
            addCriterion("MEM_FUNCTION_ADD in", values, "memFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andMemFunctionAddNotIn(List<Integer> values) {
            addCriterion("MEM_FUNCTION_ADD not in", values, "memFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andMemFunctionAddBetween(Integer value1, Integer value2) {
            addCriterion("MEM_FUNCTION_ADD between", value1, value2, "memFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andMemFunctionAddNotBetween(Integer value1, Integer value2) {
            addCriterion("MEM_FUNCTION_ADD not between", value1, value2, "memFunctionAdd");
            return (Criteria) this;
        }

        public Criteria andMemAddPresentIsNull() {
            addCriterion("MEM_ADD_PRESENT is null");
            return (Criteria) this;
        }

        public Criteria andMemAddPresentIsNotNull() {
            addCriterion("MEM_ADD_PRESENT is not null");
            return (Criteria) this;
        }

        public Criteria andMemAddPresentEqualTo(Integer value) {
            addCriterion("MEM_ADD_PRESENT =", value, "memAddPresent");
            return (Criteria) this;
        }

        public Criteria andMemAddPresentNotEqualTo(Integer value) {
            addCriterion("MEM_ADD_PRESENT <>", value, "memAddPresent");
            return (Criteria) this;
        }

        public Criteria andMemAddPresentGreaterThan(Integer value) {
            addCriterion("MEM_ADD_PRESENT >", value, "memAddPresent");
            return (Criteria) this;
        }

        public Criteria andMemAddPresentGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEM_ADD_PRESENT >=", value, "memAddPresent");
            return (Criteria) this;
        }

        public Criteria andMemAddPresentLessThan(Integer value) {
            addCriterion("MEM_ADD_PRESENT <", value, "memAddPresent");
            return (Criteria) this;
        }

        public Criteria andMemAddPresentLessThanOrEqualTo(Integer value) {
            addCriterion("MEM_ADD_PRESENT <=", value, "memAddPresent");
            return (Criteria) this;
        }

        public Criteria andMemAddPresentIn(List<Integer> values) {
            addCriterion("MEM_ADD_PRESENT in", values, "memAddPresent");
            return (Criteria) this;
        }

        public Criteria andMemAddPresentNotIn(List<Integer> values) {
            addCriterion("MEM_ADD_PRESENT not in", values, "memAddPresent");
            return (Criteria) this;
        }

        public Criteria andMemAddPresentBetween(Integer value1, Integer value2) {
            addCriterion("MEM_ADD_PRESENT between", value1, value2, "memAddPresent");
            return (Criteria) this;
        }

        public Criteria andMemAddPresentNotBetween(Integer value1, Integer value2) {
            addCriterion("MEM_ADD_PRESENT not between", value1, value2, "memAddPresent");
            return (Criteria) this;
        }

        public Criteria andIsIdlecheckoutLimitIsNull() {
            addCriterion("IS_IDLECHECKOUT_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andIsIdlecheckoutLimitIsNotNull() {
            addCriterion("IS_IDLECHECKOUT_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsIdlecheckoutLimitEqualTo(Integer value) {
            addCriterion("IS_IDLECHECKOUT_LIMIT =", value, "isIdlecheckoutLimit");
            return (Criteria) this;
        }

        public Criteria andIsIdlecheckoutLimitNotEqualTo(Integer value) {
            addCriterion("IS_IDLECHECKOUT_LIMIT <>", value, "isIdlecheckoutLimit");
            return (Criteria) this;
        }

        public Criteria andIsIdlecheckoutLimitGreaterThan(Integer value) {
            addCriterion("IS_IDLECHECKOUT_LIMIT >", value, "isIdlecheckoutLimit");
            return (Criteria) this;
        }

        public Criteria andIsIdlecheckoutLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_IDLECHECKOUT_LIMIT >=", value, "isIdlecheckoutLimit");
            return (Criteria) this;
        }

        public Criteria andIsIdlecheckoutLimitLessThan(Integer value) {
            addCriterion("IS_IDLECHECKOUT_LIMIT <", value, "isIdlecheckoutLimit");
            return (Criteria) this;
        }

        public Criteria andIsIdlecheckoutLimitLessThanOrEqualTo(Integer value) {
            addCriterion("IS_IDLECHECKOUT_LIMIT <=", value, "isIdlecheckoutLimit");
            return (Criteria) this;
        }

        public Criteria andIsIdlecheckoutLimitIn(List<Integer> values) {
            addCriterion("IS_IDLECHECKOUT_LIMIT in", values, "isIdlecheckoutLimit");
            return (Criteria) this;
        }

        public Criteria andIsIdlecheckoutLimitNotIn(List<Integer> values) {
            addCriterion("IS_IDLECHECKOUT_LIMIT not in", values, "isIdlecheckoutLimit");
            return (Criteria) this;
        }

        public Criteria andIsIdlecheckoutLimitBetween(Integer value1, Integer value2) {
            addCriterion("IS_IDLECHECKOUT_LIMIT between", value1, value2, "isIdlecheckoutLimit");
            return (Criteria) this;
        }

        public Criteria andIsIdlecheckoutLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_IDLECHECKOUT_LIMIT not between", value1, value2, "isIdlecheckoutLimit");
            return (Criteria) this;
        }

        public Criteria andTempidleTmIsNull() {
            addCriterion("TEMPIDLE_TM is null");
            return (Criteria) this;
        }

        public Criteria andTempidleTmIsNotNull() {
            addCriterion("TEMPIDLE_TM is not null");
            return (Criteria) this;
        }

        public Criteria andTempidleTmEqualTo(Integer value) {
            addCriterion("TEMPIDLE_TM =", value, "tempidleTm");
            return (Criteria) this;
        }

        public Criteria andTempidleTmNotEqualTo(Integer value) {
            addCriterion("TEMPIDLE_TM <>", value, "tempidleTm");
            return (Criteria) this;
        }

        public Criteria andTempidleTmGreaterThan(Integer value) {
            addCriterion("TEMPIDLE_TM >", value, "tempidleTm");
            return (Criteria) this;
        }

        public Criteria andTempidleTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEMPIDLE_TM >=", value, "tempidleTm");
            return (Criteria) this;
        }

        public Criteria andTempidleTmLessThan(Integer value) {
            addCriterion("TEMPIDLE_TM <", value, "tempidleTm");
            return (Criteria) this;
        }

        public Criteria andTempidleTmLessThanOrEqualTo(Integer value) {
            addCriterion("TEMPIDLE_TM <=", value, "tempidleTm");
            return (Criteria) this;
        }

        public Criteria andTempidleTmIn(List<Integer> values) {
            addCriterion("TEMPIDLE_TM in", values, "tempidleTm");
            return (Criteria) this;
        }

        public Criteria andTempidleTmNotIn(List<Integer> values) {
            addCriterion("TEMPIDLE_TM not in", values, "tempidleTm");
            return (Criteria) this;
        }

        public Criteria andTempidleTmBetween(Integer value1, Integer value2) {
            addCriterion("TEMPIDLE_TM between", value1, value2, "tempidleTm");
            return (Criteria) this;
        }

        public Criteria andTempidleTmNotBetween(Integer value1, Integer value2) {
            addCriterion("TEMPIDLE_TM not between", value1, value2, "tempidleTm");
            return (Criteria) this;
        }

        public Criteria andMemidleTmIsNull() {
            addCriterion("MEMIDLE_TM is null");
            return (Criteria) this;
        }

        public Criteria andMemidleTmIsNotNull() {
            addCriterion("MEMIDLE_TM is not null");
            return (Criteria) this;
        }

        public Criteria andMemidleTmEqualTo(Integer value) {
            addCriterion("MEMIDLE_TM =", value, "memidleTm");
            return (Criteria) this;
        }

        public Criteria andMemidleTmNotEqualTo(Integer value) {
            addCriterion("MEMIDLE_TM <>", value, "memidleTm");
            return (Criteria) this;
        }

        public Criteria andMemidleTmGreaterThan(Integer value) {
            addCriterion("MEMIDLE_TM >", value, "memidleTm");
            return (Criteria) this;
        }

        public Criteria andMemidleTmGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMIDLE_TM >=", value, "memidleTm");
            return (Criteria) this;
        }

        public Criteria andMemidleTmLessThan(Integer value) {
            addCriterion("MEMIDLE_TM <", value, "memidleTm");
            return (Criteria) this;
        }

        public Criteria andMemidleTmLessThanOrEqualTo(Integer value) {
            addCriterion("MEMIDLE_TM <=", value, "memidleTm");
            return (Criteria) this;
        }

        public Criteria andMemidleTmIn(List<Integer> values) {
            addCriterion("MEMIDLE_TM in", values, "memidleTm");
            return (Criteria) this;
        }

        public Criteria andMemidleTmNotIn(List<Integer> values) {
            addCriterion("MEMIDLE_TM not in", values, "memidleTm");
            return (Criteria) this;
        }

        public Criteria andMemidleTmBetween(Integer value1, Integer value2) {
            addCriterion("MEMIDLE_TM between", value1, value2, "memidleTm");
            return (Criteria) this;
        }

        public Criteria andMemidleTmNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMIDLE_TM not between", value1, value2, "memidleTm");
            return (Criteria) this;
        }

        public Criteria andIsPcnumlimitIsNull() {
            addCriterion("IS_PCNUMLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andIsPcnumlimitIsNotNull() {
            addCriterion("IS_PCNUMLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsPcnumlimitEqualTo(Integer value) {
            addCriterion("IS_PCNUMLIMIT =", value, "isPcnumlimit");
            return (Criteria) this;
        }

        public Criteria andIsPcnumlimitNotEqualTo(Integer value) {
            addCriterion("IS_PCNUMLIMIT <>", value, "isPcnumlimit");
            return (Criteria) this;
        }

        public Criteria andIsPcnumlimitGreaterThan(Integer value) {
            addCriterion("IS_PCNUMLIMIT >", value, "isPcnumlimit");
            return (Criteria) this;
        }

        public Criteria andIsPcnumlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_PCNUMLIMIT >=", value, "isPcnumlimit");
            return (Criteria) this;
        }

        public Criteria andIsPcnumlimitLessThan(Integer value) {
            addCriterion("IS_PCNUMLIMIT <", value, "isPcnumlimit");
            return (Criteria) this;
        }

        public Criteria andIsPcnumlimitLessThanOrEqualTo(Integer value) {
            addCriterion("IS_PCNUMLIMIT <=", value, "isPcnumlimit");
            return (Criteria) this;
        }

        public Criteria andIsPcnumlimitIn(List<Integer> values) {
            addCriterion("IS_PCNUMLIMIT in", values, "isPcnumlimit");
            return (Criteria) this;
        }

        public Criteria andIsPcnumlimitNotIn(List<Integer> values) {
            addCriterion("IS_PCNUMLIMIT not in", values, "isPcnumlimit");
            return (Criteria) this;
        }

        public Criteria andIsPcnumlimitBetween(Integer value1, Integer value2) {
            addCriterion("IS_PCNUMLIMIT between", value1, value2, "isPcnumlimit");
            return (Criteria) this;
        }

        public Criteria andIsPcnumlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_PCNUMLIMIT not between", value1, value2, "isPcnumlimit");
            return (Criteria) this;
        }

        public Criteria andPclimitNumIsNull() {
            addCriterion("PCLIMIT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andPclimitNumIsNotNull() {
            addCriterion("PCLIMIT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andPclimitNumEqualTo(Integer value) {
            addCriterion("PCLIMIT_NUM =", value, "pclimitNum");
            return (Criteria) this;
        }

        public Criteria andPclimitNumNotEqualTo(Integer value) {
            addCriterion("PCLIMIT_NUM <>", value, "pclimitNum");
            return (Criteria) this;
        }

        public Criteria andPclimitNumGreaterThan(Integer value) {
            addCriterion("PCLIMIT_NUM >", value, "pclimitNum");
            return (Criteria) this;
        }

        public Criteria andPclimitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PCLIMIT_NUM >=", value, "pclimitNum");
            return (Criteria) this;
        }

        public Criteria andPclimitNumLessThan(Integer value) {
            addCriterion("PCLIMIT_NUM <", value, "pclimitNum");
            return (Criteria) this;
        }

        public Criteria andPclimitNumLessThanOrEqualTo(Integer value) {
            addCriterion("PCLIMIT_NUM <=", value, "pclimitNum");
            return (Criteria) this;
        }

        public Criteria andPclimitNumIn(List<Integer> values) {
            addCriterion("PCLIMIT_NUM in", values, "pclimitNum");
            return (Criteria) this;
        }

        public Criteria andPclimitNumNotIn(List<Integer> values) {
            addCriterion("PCLIMIT_NUM not in", values, "pclimitNum");
            return (Criteria) this;
        }

        public Criteria andPclimitNumBetween(Integer value1, Integer value2) {
            addCriterion("PCLIMIT_NUM between", value1, value2, "pclimitNum");
            return (Criteria) this;
        }

        public Criteria andPclimitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("PCLIMIT_NUM not between", value1, value2, "pclimitNum");
            return (Criteria) this;
        }

        public Criteria andSpotPercentIsNull() {
            addCriterion("SPOT_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andSpotPercentIsNotNull() {
            addCriterion("SPOT_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andSpotPercentEqualTo(String value) {
            addCriterion("SPOT_PERCENT =", value, "spotPercent");
            return (Criteria) this;
        }

        public Criteria andSpotPercentNotEqualTo(String value) {
            addCriterion("SPOT_PERCENT <>", value, "spotPercent");
            return (Criteria) this;
        }

        public Criteria andSpotPercentGreaterThan(String value) {
            addCriterion("SPOT_PERCENT >", value, "spotPercent");
            return (Criteria) this;
        }

        public Criteria andSpotPercentGreaterThanOrEqualTo(String value) {
            addCriterion("SPOT_PERCENT >=", value, "spotPercent");
            return (Criteria) this;
        }

        public Criteria andSpotPercentLessThan(String value) {
            addCriterion("SPOT_PERCENT <", value, "spotPercent");
            return (Criteria) this;
        }

        public Criteria andSpotPercentLessThanOrEqualTo(String value) {
            addCriterion("SPOT_PERCENT <=", value, "spotPercent");
            return (Criteria) this;
        }

        public Criteria andSpotPercentLike(String value) {
            addCriterion("SPOT_PERCENT like", value, "spotPercent");
            return (Criteria) this;
        }

        public Criteria andSpotPercentNotLike(String value) {
            addCriterion("SPOT_PERCENT not like", value, "spotPercent");
            return (Criteria) this;
        }

        public Criteria andSpotPercentIn(List<String> values) {
            addCriterion("SPOT_PERCENT in", values, "spotPercent");
            return (Criteria) this;
        }

        public Criteria andSpotPercentNotIn(List<String> values) {
            addCriterion("SPOT_PERCENT not in", values, "spotPercent");
            return (Criteria) this;
        }

        public Criteria andSpotPercentBetween(String value1, String value2) {
            addCriterion("SPOT_PERCENT between", value1, value2, "spotPercent");
            return (Criteria) this;
        }

        public Criteria andSpotPercentNotBetween(String value1, String value2) {
            addCriterion("SPOT_PERCENT not between", value1, value2, "spotPercent");
            return (Criteria) this;
        }

        public Criteria andLossReasonIsNull() {
            addCriterion("LOSS_REASON is null");
            return (Criteria) this;
        }

        public Criteria andLossReasonIsNotNull() {
            addCriterion("LOSS_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andLossReasonEqualTo(String value) {
            addCriterion("LOSS_REASON =", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonNotEqualTo(String value) {
            addCriterion("LOSS_REASON <>", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonGreaterThan(String value) {
            addCriterion("LOSS_REASON >", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonGreaterThanOrEqualTo(String value) {
            addCriterion("LOSS_REASON >=", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonLessThan(String value) {
            addCriterion("LOSS_REASON <", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonLessThanOrEqualTo(String value) {
            addCriterion("LOSS_REASON <=", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonLike(String value) {
            addCriterion("LOSS_REASON like", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonNotLike(String value) {
            addCriterion("LOSS_REASON not like", value, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonIn(List<String> values) {
            addCriterion("LOSS_REASON in", values, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonNotIn(List<String> values) {
            addCriterion("LOSS_REASON not in", values, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonBetween(String value1, String value2) {
            addCriterion("LOSS_REASON between", value1, value2, "lossReason");
            return (Criteria) this;
        }

        public Criteria andLossReasonNotBetween(String value1, String value2) {
            addCriterion("LOSS_REASON not between", value1, value2, "lossReason");
            return (Criteria) this;
        }

        public Criteria andGetFingerPicIsNull() {
            addCriterion("GET_FINGER_PIC is null");
            return (Criteria) this;
        }

        public Criteria andGetFingerPicIsNotNull() {
            addCriterion("GET_FINGER_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andGetFingerPicEqualTo(Integer value) {
            addCriterion("GET_FINGER_PIC =", value, "getFingerPic");
            return (Criteria) this;
        }

        public Criteria andGetFingerPicNotEqualTo(Integer value) {
            addCriterion("GET_FINGER_PIC <>", value, "getFingerPic");
            return (Criteria) this;
        }

        public Criteria andGetFingerPicGreaterThan(Integer value) {
            addCriterion("GET_FINGER_PIC >", value, "getFingerPic");
            return (Criteria) this;
        }

        public Criteria andGetFingerPicGreaterThanOrEqualTo(Integer value) {
            addCriterion("GET_FINGER_PIC >=", value, "getFingerPic");
            return (Criteria) this;
        }

        public Criteria andGetFingerPicLessThan(Integer value) {
            addCriterion("GET_FINGER_PIC <", value, "getFingerPic");
            return (Criteria) this;
        }

        public Criteria andGetFingerPicLessThanOrEqualTo(Integer value) {
            addCriterion("GET_FINGER_PIC <=", value, "getFingerPic");
            return (Criteria) this;
        }

        public Criteria andGetFingerPicIn(List<Integer> values) {
            addCriterion("GET_FINGER_PIC in", values, "getFingerPic");
            return (Criteria) this;
        }

        public Criteria andGetFingerPicNotIn(List<Integer> values) {
            addCriterion("GET_FINGER_PIC not in", values, "getFingerPic");
            return (Criteria) this;
        }

        public Criteria andGetFingerPicBetween(Integer value1, Integer value2) {
            addCriterion("GET_FINGER_PIC between", value1, value2, "getFingerPic");
            return (Criteria) this;
        }

        public Criteria andGetFingerPicNotBetween(Integer value1, Integer value2) {
            addCriterion("GET_FINGER_PIC not between", value1, value2, "getFingerPic");
            return (Criteria) this;
        }

        public Criteria andGetFingerUnlockIsNull() {
            addCriterion("GET_FINGER_UNLOCK is null");
            return (Criteria) this;
        }

        public Criteria andGetFingerUnlockIsNotNull() {
            addCriterion("GET_FINGER_UNLOCK is not null");
            return (Criteria) this;
        }

        public Criteria andGetFingerUnlockEqualTo(Integer value) {
            addCriterion("GET_FINGER_UNLOCK =", value, "getFingerUnlock");
            return (Criteria) this;
        }

        public Criteria andGetFingerUnlockNotEqualTo(Integer value) {
            addCriterion("GET_FINGER_UNLOCK <>", value, "getFingerUnlock");
            return (Criteria) this;
        }

        public Criteria andGetFingerUnlockGreaterThan(Integer value) {
            addCriterion("GET_FINGER_UNLOCK >", value, "getFingerUnlock");
            return (Criteria) this;
        }

        public Criteria andGetFingerUnlockGreaterThanOrEqualTo(Integer value) {
            addCriterion("GET_FINGER_UNLOCK >=", value, "getFingerUnlock");
            return (Criteria) this;
        }

        public Criteria andGetFingerUnlockLessThan(Integer value) {
            addCriterion("GET_FINGER_UNLOCK <", value, "getFingerUnlock");
            return (Criteria) this;
        }

        public Criteria andGetFingerUnlockLessThanOrEqualTo(Integer value) {
            addCriterion("GET_FINGER_UNLOCK <=", value, "getFingerUnlock");
            return (Criteria) this;
        }

        public Criteria andGetFingerUnlockIn(List<Integer> values) {
            addCriterion("GET_FINGER_UNLOCK in", values, "getFingerUnlock");
            return (Criteria) this;
        }

        public Criteria andGetFingerUnlockNotIn(List<Integer> values) {
            addCriterion("GET_FINGER_UNLOCK not in", values, "getFingerUnlock");
            return (Criteria) this;
        }

        public Criteria andGetFingerUnlockBetween(Integer value1, Integer value2) {
            addCriterion("GET_FINGER_UNLOCK between", value1, value2, "getFingerUnlock");
            return (Criteria) this;
        }

        public Criteria andGetFingerUnlockNotBetween(Integer value1, Integer value2) {
            addCriterion("GET_FINGER_UNLOCK not between", value1, value2, "getFingerUnlock");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeIsNull() {
            addCriterion("OVERNIGHT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeIsNotNull() {
            addCriterion("OVERNIGHT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeEqualTo(String value) {
            addCriterion("OVERNIGHT_TIME =", value, "overnightTime");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeNotEqualTo(String value) {
            addCriterion("OVERNIGHT_TIME <>", value, "overnightTime");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeGreaterThan(String value) {
            addCriterion("OVERNIGHT_TIME >", value, "overnightTime");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeGreaterThanOrEqualTo(String value) {
            addCriterion("OVERNIGHT_TIME >=", value, "overnightTime");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeLessThan(String value) {
            addCriterion("OVERNIGHT_TIME <", value, "overnightTime");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeLessThanOrEqualTo(String value) {
            addCriterion("OVERNIGHT_TIME <=", value, "overnightTime");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeLike(String value) {
            addCriterion("OVERNIGHT_TIME like", value, "overnightTime");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeNotLike(String value) {
            addCriterion("OVERNIGHT_TIME not like", value, "overnightTime");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeIn(List<String> values) {
            addCriterion("OVERNIGHT_TIME in", values, "overnightTime");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeNotIn(List<String> values) {
            addCriterion("OVERNIGHT_TIME not in", values, "overnightTime");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeBetween(String value1, String value2) {
            addCriterion("OVERNIGHT_TIME between", value1, value2, "overnightTime");
            return (Criteria) this;
        }

        public Criteria andOvernightTimeNotBetween(String value1, String value2) {
            addCriterion("OVERNIGHT_TIME not between", value1, value2, "overnightTime");
            return (Criteria) this;
        }

        public Criteria andMachineauthIsNull() {
            addCriterion("MACHINEAUTH is null");
            return (Criteria) this;
        }

        public Criteria andMachineauthIsNotNull() {
            addCriterion("MACHINEAUTH is not null");
            return (Criteria) this;
        }

        public Criteria andMachineauthEqualTo(Integer value) {
            addCriterion("MACHINEAUTH =", value, "machineauth");
            return (Criteria) this;
        }

        public Criteria andMachineauthNotEqualTo(Integer value) {
            addCriterion("MACHINEAUTH <>", value, "machineauth");
            return (Criteria) this;
        }

        public Criteria andMachineauthGreaterThan(Integer value) {
            addCriterion("MACHINEAUTH >", value, "machineauth");
            return (Criteria) this;
        }

        public Criteria andMachineauthGreaterThanOrEqualTo(Integer value) {
            addCriterion("MACHINEAUTH >=", value, "machineauth");
            return (Criteria) this;
        }

        public Criteria andMachineauthLessThan(Integer value) {
            addCriterion("MACHINEAUTH <", value, "machineauth");
            return (Criteria) this;
        }

        public Criteria andMachineauthLessThanOrEqualTo(Integer value) {
            addCriterion("MACHINEAUTH <=", value, "machineauth");
            return (Criteria) this;
        }

        public Criteria andMachineauthIn(List<Integer> values) {
            addCriterion("MACHINEAUTH in", values, "machineauth");
            return (Criteria) this;
        }

        public Criteria andMachineauthNotIn(List<Integer> values) {
            addCriterion("MACHINEAUTH not in", values, "machineauth");
            return (Criteria) this;
        }

        public Criteria andMachineauthBetween(Integer value1, Integer value2) {
            addCriterion("MACHINEAUTH between", value1, value2, "machineauth");
            return (Criteria) this;
        }

        public Criteria andMachineauthNotBetween(Integer value1, Integer value2) {
            addCriterion("MACHINEAUTH not between", value1, value2, "machineauth");
            return (Criteria) this;
        }

        public Criteria andNetbarCheckIsNull() {
            addCriterion("NETBAR_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andNetbarCheckIsNotNull() {
            addCriterion("NETBAR_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andNetbarCheckEqualTo(Integer value) {
            addCriterion("NETBAR_CHECK =", value, "netbarCheck");
            return (Criteria) this;
        }

        public Criteria andNetbarCheckNotEqualTo(Integer value) {
            addCriterion("NETBAR_CHECK <>", value, "netbarCheck");
            return (Criteria) this;
        }

        public Criteria andNetbarCheckGreaterThan(Integer value) {
            addCriterion("NETBAR_CHECK >", value, "netbarCheck");
            return (Criteria) this;
        }

        public Criteria andNetbarCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("NETBAR_CHECK >=", value, "netbarCheck");
            return (Criteria) this;
        }

        public Criteria andNetbarCheckLessThan(Integer value) {
            addCriterion("NETBAR_CHECK <", value, "netbarCheck");
            return (Criteria) this;
        }

        public Criteria andNetbarCheckLessThanOrEqualTo(Integer value) {
            addCriterion("NETBAR_CHECK <=", value, "netbarCheck");
            return (Criteria) this;
        }

        public Criteria andNetbarCheckIn(List<Integer> values) {
            addCriterion("NETBAR_CHECK in", values, "netbarCheck");
            return (Criteria) this;
        }

        public Criteria andNetbarCheckNotIn(List<Integer> values) {
            addCriterion("NETBAR_CHECK not in", values, "netbarCheck");
            return (Criteria) this;
        }

        public Criteria andNetbarCheckBetween(Integer value1, Integer value2) {
            addCriterion("NETBAR_CHECK between", value1, value2, "netbarCheck");
            return (Criteria) this;
        }

        public Criteria andNetbarCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("NETBAR_CHECK not between", value1, value2, "netbarCheck");
            return (Criteria) this;
        }

        public Criteria andUploadRealNameIsNull() {
            addCriterion("UPLOAD_REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUploadRealNameIsNotNull() {
            addCriterion("UPLOAD_REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUploadRealNameEqualTo(Integer value) {
            addCriterion("UPLOAD_REAL_NAME =", value, "uploadRealName");
            return (Criteria) this;
        }

        public Criteria andUploadRealNameNotEqualTo(Integer value) {
            addCriterion("UPLOAD_REAL_NAME <>", value, "uploadRealName");
            return (Criteria) this;
        }

        public Criteria andUploadRealNameGreaterThan(Integer value) {
            addCriterion("UPLOAD_REAL_NAME >", value, "uploadRealName");
            return (Criteria) this;
        }

        public Criteria andUploadRealNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPLOAD_REAL_NAME >=", value, "uploadRealName");
            return (Criteria) this;
        }

        public Criteria andUploadRealNameLessThan(Integer value) {
            addCriterion("UPLOAD_REAL_NAME <", value, "uploadRealName");
            return (Criteria) this;
        }

        public Criteria andUploadRealNameLessThanOrEqualTo(Integer value) {
            addCriterion("UPLOAD_REAL_NAME <=", value, "uploadRealName");
            return (Criteria) this;
        }

        public Criteria andUploadRealNameIn(List<Integer> values) {
            addCriterion("UPLOAD_REAL_NAME in", values, "uploadRealName");
            return (Criteria) this;
        }

        public Criteria andUploadRealNameNotIn(List<Integer> values) {
            addCriterion("UPLOAD_REAL_NAME not in", values, "uploadRealName");
            return (Criteria) this;
        }

        public Criteria andUploadRealNameBetween(Integer value1, Integer value2) {
            addCriterion("UPLOAD_REAL_NAME between", value1, value2, "uploadRealName");
            return (Criteria) this;
        }

        public Criteria andUploadRealNameNotBetween(Integer value1, Integer value2) {
            addCriterion("UPLOAD_REAL_NAME not between", value1, value2, "uploadRealName");
            return (Criteria) this;
        }

        public Criteria andShowPhotoIsNull() {
            addCriterion("SHOW_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andShowPhotoIsNotNull() {
            addCriterion("SHOW_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andShowPhotoEqualTo(Integer value) {
            addCriterion("SHOW_PHOTO =", value, "showPhoto");
            return (Criteria) this;
        }

        public Criteria andShowPhotoNotEqualTo(Integer value) {
            addCriterion("SHOW_PHOTO <>", value, "showPhoto");
            return (Criteria) this;
        }

        public Criteria andShowPhotoGreaterThan(Integer value) {
            addCriterion("SHOW_PHOTO >", value, "showPhoto");
            return (Criteria) this;
        }

        public Criteria andShowPhotoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOW_PHOTO >=", value, "showPhoto");
            return (Criteria) this;
        }

        public Criteria andShowPhotoLessThan(Integer value) {
            addCriterion("SHOW_PHOTO <", value, "showPhoto");
            return (Criteria) this;
        }

        public Criteria andShowPhotoLessThanOrEqualTo(Integer value) {
            addCriterion("SHOW_PHOTO <=", value, "showPhoto");
            return (Criteria) this;
        }

        public Criteria andShowPhotoIn(List<Integer> values) {
            addCriterion("SHOW_PHOTO in", values, "showPhoto");
            return (Criteria) this;
        }

        public Criteria andShowPhotoNotIn(List<Integer> values) {
            addCriterion("SHOW_PHOTO not in", values, "showPhoto");
            return (Criteria) this;
        }

        public Criteria andShowPhotoBetween(Integer value1, Integer value2) {
            addCriterion("SHOW_PHOTO between", value1, value2, "showPhoto");
            return (Criteria) this;
        }

        public Criteria andShowPhotoNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOW_PHOTO not between", value1, value2, "showPhoto");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentIsNull() {
            addCriterion("TEMPUSERPERCENT is null");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentIsNotNull() {
            addCriterion("TEMPUSERPERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentEqualTo(String value) {
            addCriterion("TEMPUSERPERCENT =", value, "tempuserpercent");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentNotEqualTo(String value) {
            addCriterion("TEMPUSERPERCENT <>", value, "tempuserpercent");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentGreaterThan(String value) {
            addCriterion("TEMPUSERPERCENT >", value, "tempuserpercent");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPUSERPERCENT >=", value, "tempuserpercent");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentLessThan(String value) {
            addCriterion("TEMPUSERPERCENT <", value, "tempuserpercent");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentLessThanOrEqualTo(String value) {
            addCriterion("TEMPUSERPERCENT <=", value, "tempuserpercent");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentLike(String value) {
            addCriterion("TEMPUSERPERCENT like", value, "tempuserpercent");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentNotLike(String value) {
            addCriterion("TEMPUSERPERCENT not like", value, "tempuserpercent");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentIn(List<String> values) {
            addCriterion("TEMPUSERPERCENT in", values, "tempuserpercent");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentNotIn(List<String> values) {
            addCriterion("TEMPUSERPERCENT not in", values, "tempuserpercent");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentBetween(String value1, String value2) {
            addCriterion("TEMPUSERPERCENT between", value1, value2, "tempuserpercent");
            return (Criteria) this;
        }

        public Criteria andTempuserpercentNotBetween(String value1, String value2) {
            addCriterion("TEMPUSERPERCENT not between", value1, value2, "tempuserpercent");
            return (Criteria) this;
        }

        public Criteria andFingerExamIsNull() {
            addCriterion("FINGER_EXAM is null");
            return (Criteria) this;
        }

        public Criteria andFingerExamIsNotNull() {
            addCriterion("FINGER_EXAM is not null");
            return (Criteria) this;
        }

        public Criteria andFingerExamEqualTo(Integer value) {
            addCriterion("FINGER_EXAM =", value, "fingerExam");
            return (Criteria) this;
        }

        public Criteria andFingerExamNotEqualTo(Integer value) {
            addCriterion("FINGER_EXAM <>", value, "fingerExam");
            return (Criteria) this;
        }

        public Criteria andFingerExamGreaterThan(Integer value) {
            addCriterion("FINGER_EXAM >", value, "fingerExam");
            return (Criteria) this;
        }

        public Criteria andFingerExamGreaterThanOrEqualTo(Integer value) {
            addCriterion("FINGER_EXAM >=", value, "fingerExam");
            return (Criteria) this;
        }

        public Criteria andFingerExamLessThan(Integer value) {
            addCriterion("FINGER_EXAM <", value, "fingerExam");
            return (Criteria) this;
        }

        public Criteria andFingerExamLessThanOrEqualTo(Integer value) {
            addCriterion("FINGER_EXAM <=", value, "fingerExam");
            return (Criteria) this;
        }

        public Criteria andFingerExamIn(List<Integer> values) {
            addCriterion("FINGER_EXAM in", values, "fingerExam");
            return (Criteria) this;
        }

        public Criteria andFingerExamNotIn(List<Integer> values) {
            addCriterion("FINGER_EXAM not in", values, "fingerExam");
            return (Criteria) this;
        }

        public Criteria andFingerExamBetween(Integer value1, Integer value2) {
            addCriterion("FINGER_EXAM between", value1, value2, "fingerExam");
            return (Criteria) this;
        }

        public Criteria andFingerExamNotBetween(Integer value1, Integer value2) {
            addCriterion("FINGER_EXAM not between", value1, value2, "fingerExam");
            return (Criteria) this;
        }

        public Criteria andMemTaoCanIsNull() {
            addCriterion("MEM_TAO_CAN is null");
            return (Criteria) this;
        }

        public Criteria andMemTaoCanIsNotNull() {
            addCriterion("MEM_TAO_CAN is not null");
            return (Criteria) this;
        }

        public Criteria andMemTaoCanEqualTo(Integer value) {
            addCriterion("MEM_TAO_CAN =", value, "memTaoCan");
            return (Criteria) this;
        }

        public Criteria andMemTaoCanNotEqualTo(Integer value) {
            addCriterion("MEM_TAO_CAN <>", value, "memTaoCan");
            return (Criteria) this;
        }

        public Criteria andMemTaoCanGreaterThan(Integer value) {
            addCriterion("MEM_TAO_CAN >", value, "memTaoCan");
            return (Criteria) this;
        }

        public Criteria andMemTaoCanGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEM_TAO_CAN >=", value, "memTaoCan");
            return (Criteria) this;
        }

        public Criteria andMemTaoCanLessThan(Integer value) {
            addCriterion("MEM_TAO_CAN <", value, "memTaoCan");
            return (Criteria) this;
        }

        public Criteria andMemTaoCanLessThanOrEqualTo(Integer value) {
            addCriterion("MEM_TAO_CAN <=", value, "memTaoCan");
            return (Criteria) this;
        }

        public Criteria andMemTaoCanIn(List<Integer> values) {
            addCriterion("MEM_TAO_CAN in", values, "memTaoCan");
            return (Criteria) this;
        }

        public Criteria andMemTaoCanNotIn(List<Integer> values) {
            addCriterion("MEM_TAO_CAN not in", values, "memTaoCan");
            return (Criteria) this;
        }

        public Criteria andMemTaoCanBetween(Integer value1, Integer value2) {
            addCriterion("MEM_TAO_CAN between", value1, value2, "memTaoCan");
            return (Criteria) this;
        }

        public Criteria andMemTaoCanNotBetween(Integer value1, Integer value2) {
            addCriterion("MEM_TAO_CAN not between", value1, value2, "memTaoCan");
            return (Criteria) this;
        }

        public Criteria andMemJiDianIsNull() {
            addCriterion("MEM_JI_DIAN is null");
            return (Criteria) this;
        }

        public Criteria andMemJiDianIsNotNull() {
            addCriterion("MEM_JI_DIAN is not null");
            return (Criteria) this;
        }

        public Criteria andMemJiDianEqualTo(Integer value) {
            addCriterion("MEM_JI_DIAN =", value, "memJiDian");
            return (Criteria) this;
        }

        public Criteria andMemJiDianNotEqualTo(Integer value) {
            addCriterion("MEM_JI_DIAN <>", value, "memJiDian");
            return (Criteria) this;
        }

        public Criteria andMemJiDianGreaterThan(Integer value) {
            addCriterion("MEM_JI_DIAN >", value, "memJiDian");
            return (Criteria) this;
        }

        public Criteria andMemJiDianGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEM_JI_DIAN >=", value, "memJiDian");
            return (Criteria) this;
        }

        public Criteria andMemJiDianLessThan(Integer value) {
            addCriterion("MEM_JI_DIAN <", value, "memJiDian");
            return (Criteria) this;
        }

        public Criteria andMemJiDianLessThanOrEqualTo(Integer value) {
            addCriterion("MEM_JI_DIAN <=", value, "memJiDian");
            return (Criteria) this;
        }

        public Criteria andMemJiDianIn(List<Integer> values) {
            addCriterion("MEM_JI_DIAN in", values, "memJiDian");
            return (Criteria) this;
        }

        public Criteria andMemJiDianNotIn(List<Integer> values) {
            addCriterion("MEM_JI_DIAN not in", values, "memJiDian");
            return (Criteria) this;
        }

        public Criteria andMemJiDianBetween(Integer value1, Integer value2) {
            addCriterion("MEM_JI_DIAN between", value1, value2, "memJiDian");
            return (Criteria) this;
        }

        public Criteria andMemJiDianNotBetween(Integer value1, Integer value2) {
            addCriterion("MEM_JI_DIAN not between", value1, value2, "memJiDian");
            return (Criteria) this;
        }

        public Criteria andMemZengSongIsNull() {
            addCriterion("MEM_ZENG_SONG is null");
            return (Criteria) this;
        }

        public Criteria andMemZengSongIsNotNull() {
            addCriterion("MEM_ZENG_SONG is not null");
            return (Criteria) this;
        }

        public Criteria andMemZengSongEqualTo(Integer value) {
            addCriterion("MEM_ZENG_SONG =", value, "memZengSong");
            return (Criteria) this;
        }

        public Criteria andMemZengSongNotEqualTo(Integer value) {
            addCriterion("MEM_ZENG_SONG <>", value, "memZengSong");
            return (Criteria) this;
        }

        public Criteria andMemZengSongGreaterThan(Integer value) {
            addCriterion("MEM_ZENG_SONG >", value, "memZengSong");
            return (Criteria) this;
        }

        public Criteria andMemZengSongGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEM_ZENG_SONG >=", value, "memZengSong");
            return (Criteria) this;
        }

        public Criteria andMemZengSongLessThan(Integer value) {
            addCriterion("MEM_ZENG_SONG <", value, "memZengSong");
            return (Criteria) this;
        }

        public Criteria andMemZengSongLessThanOrEqualTo(Integer value) {
            addCriterion("MEM_ZENG_SONG <=", value, "memZengSong");
            return (Criteria) this;
        }

        public Criteria andMemZengSongIn(List<Integer> values) {
            addCriterion("MEM_ZENG_SONG in", values, "memZengSong");
            return (Criteria) this;
        }

        public Criteria andMemZengSongNotIn(List<Integer> values) {
            addCriterion("MEM_ZENG_SONG not in", values, "memZengSong");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBetween(Integer value1, Integer value2) {
            addCriterion("MEM_ZENG_SONG between", value1, value2, "memZengSong");
            return (Criteria) this;
        }

        public Criteria andMemZengSongNotBetween(Integer value1, Integer value2) {
            addCriterion("MEM_ZENG_SONG not between", value1, value2, "memZengSong");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBiLiIsNull() {
            addCriterion("MEM_ZENG_SONG_BI_LI is null");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBiLiIsNotNull() {
            addCriterion("MEM_ZENG_SONG_BI_LI is not null");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBiLiEqualTo(Integer value) {
            addCriterion("MEM_ZENG_SONG_BI_LI =", value, "memZengSongBiLi");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBiLiNotEqualTo(Integer value) {
            addCriterion("MEM_ZENG_SONG_BI_LI <>", value, "memZengSongBiLi");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBiLiGreaterThan(Integer value) {
            addCriterion("MEM_ZENG_SONG_BI_LI >", value, "memZengSongBiLi");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBiLiGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEM_ZENG_SONG_BI_LI >=", value, "memZengSongBiLi");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBiLiLessThan(Integer value) {
            addCriterion("MEM_ZENG_SONG_BI_LI <", value, "memZengSongBiLi");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBiLiLessThanOrEqualTo(Integer value) {
            addCriterion("MEM_ZENG_SONG_BI_LI <=", value, "memZengSongBiLi");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBiLiIn(List<Integer> values) {
            addCriterion("MEM_ZENG_SONG_BI_LI in", values, "memZengSongBiLi");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBiLiNotIn(List<Integer> values) {
            addCriterion("MEM_ZENG_SONG_BI_LI not in", values, "memZengSongBiLi");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBiLiBetween(Integer value1, Integer value2) {
            addCriterion("MEM_ZENG_SONG_BI_LI between", value1, value2, "memZengSongBiLi");
            return (Criteria) this;
        }

        public Criteria andMemZengSongBiLiNotBetween(Integer value1, Integer value2) {
            addCriterion("MEM_ZENG_SONG_BI_LI not between", value1, value2, "memZengSongBiLi");
            return (Criteria) this;
        }

        public Criteria andMemBindAccountIsNull() {
            addCriterion("MEM_BIND_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andMemBindAccountIsNotNull() {
            addCriterion("MEM_BIND_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMemBindAccountEqualTo(Integer value) {
            addCriterion("MEM_BIND_ACCOUNT =", value, "memBindAccount");
            return (Criteria) this;
        }

        public Criteria andMemBindAccountNotEqualTo(Integer value) {
            addCriterion("MEM_BIND_ACCOUNT <>", value, "memBindAccount");
            return (Criteria) this;
        }

        public Criteria andMemBindAccountGreaterThan(Integer value) {
            addCriterion("MEM_BIND_ACCOUNT >", value, "memBindAccount");
            return (Criteria) this;
        }

        public Criteria andMemBindAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEM_BIND_ACCOUNT >=", value, "memBindAccount");
            return (Criteria) this;
        }

        public Criteria andMemBindAccountLessThan(Integer value) {
            addCriterion("MEM_BIND_ACCOUNT <", value, "memBindAccount");
            return (Criteria) this;
        }

        public Criteria andMemBindAccountLessThanOrEqualTo(Integer value) {
            addCriterion("MEM_BIND_ACCOUNT <=", value, "memBindAccount");
            return (Criteria) this;
        }

        public Criteria andMemBindAccountIn(List<Integer> values) {
            addCriterion("MEM_BIND_ACCOUNT in", values, "memBindAccount");
            return (Criteria) this;
        }

        public Criteria andMemBindAccountNotIn(List<Integer> values) {
            addCriterion("MEM_BIND_ACCOUNT not in", values, "memBindAccount");
            return (Criteria) this;
        }

        public Criteria andMemBindAccountBetween(Integer value1, Integer value2) {
            addCriterion("MEM_BIND_ACCOUNT between", value1, value2, "memBindAccount");
            return (Criteria) this;
        }

        public Criteria andMemBindAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("MEM_BIND_ACCOUNT not between", value1, value2, "memBindAccount");
            return (Criteria) this;
        }

        public Criteria andPhoneOpenAccountIsNull() {
            addCriterion("PHONE_OPEN_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPhoneOpenAccountIsNotNull() {
            addCriterion("PHONE_OPEN_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneOpenAccountEqualTo(Integer value) {
            addCriterion("PHONE_OPEN_ACCOUNT =", value, "phoneOpenAccount");
            return (Criteria) this;
        }

        public Criteria andPhoneOpenAccountNotEqualTo(Integer value) {
            addCriterion("PHONE_OPEN_ACCOUNT <>", value, "phoneOpenAccount");
            return (Criteria) this;
        }

        public Criteria andPhoneOpenAccountGreaterThan(Integer value) {
            addCriterion("PHONE_OPEN_ACCOUNT >", value, "phoneOpenAccount");
            return (Criteria) this;
        }

        public Criteria andPhoneOpenAccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PHONE_OPEN_ACCOUNT >=", value, "phoneOpenAccount");
            return (Criteria) this;
        }

        public Criteria andPhoneOpenAccountLessThan(Integer value) {
            addCriterion("PHONE_OPEN_ACCOUNT <", value, "phoneOpenAccount");
            return (Criteria) this;
        }

        public Criteria andPhoneOpenAccountLessThanOrEqualTo(Integer value) {
            addCriterion("PHONE_OPEN_ACCOUNT <=", value, "phoneOpenAccount");
            return (Criteria) this;
        }

        public Criteria andPhoneOpenAccountIn(List<Integer> values) {
            addCriterion("PHONE_OPEN_ACCOUNT in", values, "phoneOpenAccount");
            return (Criteria) this;
        }

        public Criteria andPhoneOpenAccountNotIn(List<Integer> values) {
            addCriterion("PHONE_OPEN_ACCOUNT not in", values, "phoneOpenAccount");
            return (Criteria) this;
        }

        public Criteria andPhoneOpenAccountBetween(Integer value1, Integer value2) {
            addCriterion("PHONE_OPEN_ACCOUNT between", value1, value2, "phoneOpenAccount");
            return (Criteria) this;
        }

        public Criteria andPhoneOpenAccountNotBetween(Integer value1, Integer value2) {
            addCriterion("PHONE_OPEN_ACCOUNT not between", value1, value2, "phoneOpenAccount");
            return (Criteria) this;
        }

        public Criteria andTimeOutIsNull() {
            addCriterion("TIME_OUT is null");
            return (Criteria) this;
        }

        public Criteria andTimeOutIsNotNull() {
            addCriterion("TIME_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOutEqualTo(Integer value) {
            addCriterion("TIME_OUT =", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotEqualTo(Integer value) {
            addCriterion("TIME_OUT <>", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutGreaterThan(Integer value) {
            addCriterion("TIME_OUT >", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIME_OUT >=", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLessThan(Integer value) {
            addCriterion("TIME_OUT <", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLessThanOrEqualTo(Integer value) {
            addCriterion("TIME_OUT <=", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutIn(List<Integer> values) {
            addCriterion("TIME_OUT in", values, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotIn(List<Integer> values) {
            addCriterion("TIME_OUT not in", values, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutBetween(Integer value1, Integer value2) {
            addCriterion("TIME_OUT between", value1, value2, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotBetween(Integer value1, Integer value2) {
            addCriterion("TIME_OUT not between", value1, value2, "timeOut");
            return (Criteria) this;
        }

        public Criteria andAddMoneyIsNull() {
            addCriterion("ADD_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andAddMoneyIsNotNull() {
            addCriterion("ADD_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoneyEqualTo(Integer value) {
            addCriterion("ADD_MONEY =", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyNotEqualTo(Integer value) {
            addCriterion("ADD_MONEY <>", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyGreaterThan(Integer value) {
            addCriterion("ADD_MONEY >", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADD_MONEY >=", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyLessThan(Integer value) {
            addCriterion("ADD_MONEY <", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("ADD_MONEY <=", value, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyIn(List<Integer> values) {
            addCriterion("ADD_MONEY in", values, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyNotIn(List<Integer> values) {
            addCriterion("ADD_MONEY not in", values, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyBetween(Integer value1, Integer value2) {
            addCriterion("ADD_MONEY between", value1, value2, "addMoney");
            return (Criteria) this;
        }

        public Criteria andAddMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("ADD_MONEY not between", value1, value2, "addMoney");
            return (Criteria) this;
        }

        public Criteria andChangeUserNumberIsNull() {
            addCriterion("CHANGE_USER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andChangeUserNumberIsNotNull() {
            addCriterion("CHANGE_USER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andChangeUserNumberEqualTo(Integer value) {
            addCriterion("CHANGE_USER_NUMBER =", value, "changeUserNumber");
            return (Criteria) this;
        }

        public Criteria andChangeUserNumberNotEqualTo(Integer value) {
            addCriterion("CHANGE_USER_NUMBER <>", value, "changeUserNumber");
            return (Criteria) this;
        }

        public Criteria andChangeUserNumberGreaterThan(Integer value) {
            addCriterion("CHANGE_USER_NUMBER >", value, "changeUserNumber");
            return (Criteria) this;
        }

        public Criteria andChangeUserNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHANGE_USER_NUMBER >=", value, "changeUserNumber");
            return (Criteria) this;
        }

        public Criteria andChangeUserNumberLessThan(Integer value) {
            addCriterion("CHANGE_USER_NUMBER <", value, "changeUserNumber");
            return (Criteria) this;
        }

        public Criteria andChangeUserNumberLessThanOrEqualTo(Integer value) {
            addCriterion("CHANGE_USER_NUMBER <=", value, "changeUserNumber");
            return (Criteria) this;
        }

        public Criteria andChangeUserNumberIn(List<Integer> values) {
            addCriterion("CHANGE_USER_NUMBER in", values, "changeUserNumber");
            return (Criteria) this;
        }

        public Criteria andChangeUserNumberNotIn(List<Integer> values) {
            addCriterion("CHANGE_USER_NUMBER not in", values, "changeUserNumber");
            return (Criteria) this;
        }

        public Criteria andChangeUserNumberBetween(Integer value1, Integer value2) {
            addCriterion("CHANGE_USER_NUMBER between", value1, value2, "changeUserNumber");
            return (Criteria) this;
        }

        public Criteria andChangeUserNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("CHANGE_USER_NUMBER not between", value1, value2, "changeUserNumber");
            return (Criteria) this;
        }

        public Criteria andBindfingerenablewriteIsNull() {
            addCriterion("BINDFINGERENABLEWRITE is null");
            return (Criteria) this;
        }

        public Criteria andBindfingerenablewriteIsNotNull() {
            addCriterion("BINDFINGERENABLEWRITE is not null");
            return (Criteria) this;
        }

        public Criteria andBindfingerenablewriteEqualTo(Integer value) {
            addCriterion("BINDFINGERENABLEWRITE =", value, "bindfingerenablewrite");
            return (Criteria) this;
        }

        public Criteria andBindfingerenablewriteNotEqualTo(Integer value) {
            addCriterion("BINDFINGERENABLEWRITE <>", value, "bindfingerenablewrite");
            return (Criteria) this;
        }

        public Criteria andBindfingerenablewriteGreaterThan(Integer value) {
            addCriterion("BINDFINGERENABLEWRITE >", value, "bindfingerenablewrite");
            return (Criteria) this;
        }

        public Criteria andBindfingerenablewriteGreaterThanOrEqualTo(Integer value) {
            addCriterion("BINDFINGERENABLEWRITE >=", value, "bindfingerenablewrite");
            return (Criteria) this;
        }

        public Criteria andBindfingerenablewriteLessThan(Integer value) {
            addCriterion("BINDFINGERENABLEWRITE <", value, "bindfingerenablewrite");
            return (Criteria) this;
        }

        public Criteria andBindfingerenablewriteLessThanOrEqualTo(Integer value) {
            addCriterion("BINDFINGERENABLEWRITE <=", value, "bindfingerenablewrite");
            return (Criteria) this;
        }

        public Criteria andBindfingerenablewriteIn(List<Integer> values) {
            addCriterion("BINDFINGERENABLEWRITE in", values, "bindfingerenablewrite");
            return (Criteria) this;
        }

        public Criteria andBindfingerenablewriteNotIn(List<Integer> values) {
            addCriterion("BINDFINGERENABLEWRITE not in", values, "bindfingerenablewrite");
            return (Criteria) this;
        }

        public Criteria andBindfingerenablewriteBetween(Integer value1, Integer value2) {
            addCriterion("BINDFINGERENABLEWRITE between", value1, value2, "bindfingerenablewrite");
            return (Criteria) this;
        }

        public Criteria andBindfingerenablewriteNotBetween(Integer value1, Integer value2) {
            addCriterion("BINDFINGERENABLEWRITE not between", value1, value2, "bindfingerenablewrite");
            return (Criteria) this;
        }

        public Criteria andMobileCountIsNull() {
            addCriterion("MOBILE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andMobileCountIsNotNull() {
            addCriterion("MOBILE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMobileCountEqualTo(Integer value) {
            addCriterion("MOBILE_COUNT =", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountNotEqualTo(Integer value) {
            addCriterion("MOBILE_COUNT <>", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountGreaterThan(Integer value) {
            addCriterion("MOBILE_COUNT >", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("MOBILE_COUNT >=", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountLessThan(Integer value) {
            addCriterion("MOBILE_COUNT <", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountLessThanOrEqualTo(Integer value) {
            addCriterion("MOBILE_COUNT <=", value, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountIn(List<Integer> values) {
            addCriterion("MOBILE_COUNT in", values, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountNotIn(List<Integer> values) {
            addCriterion("MOBILE_COUNT not in", values, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountBetween(Integer value1, Integer value2) {
            addCriterion("MOBILE_COUNT between", value1, value2, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andMobileCountNotBetween(Integer value1, Integer value2) {
            addCriterion("MOBILE_COUNT not between", value1, value2, "mobileCount");
            return (Criteria) this;
        }

        public Criteria andDeductionRateIsNull() {
            addCriterion("DEDUCTION_RATE is null");
            return (Criteria) this;
        }

        public Criteria andDeductionRateIsNotNull() {
            addCriterion("DEDUCTION_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeductionRateEqualTo(Integer value) {
            addCriterion("DEDUCTION_RATE =", value, "deductionRate");
            return (Criteria) this;
        }

        public Criteria andDeductionRateNotEqualTo(Integer value) {
            addCriterion("DEDUCTION_RATE <>", value, "deductionRate");
            return (Criteria) this;
        }

        public Criteria andDeductionRateGreaterThan(Integer value) {
            addCriterion("DEDUCTION_RATE >", value, "deductionRate");
            return (Criteria) this;
        }

        public Criteria andDeductionRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEDUCTION_RATE >=", value, "deductionRate");
            return (Criteria) this;
        }

        public Criteria andDeductionRateLessThan(Integer value) {
            addCriterion("DEDUCTION_RATE <", value, "deductionRate");
            return (Criteria) this;
        }

        public Criteria andDeductionRateLessThanOrEqualTo(Integer value) {
            addCriterion("DEDUCTION_RATE <=", value, "deductionRate");
            return (Criteria) this;
        }

        public Criteria andDeductionRateIn(List<Integer> values) {
            addCriterion("DEDUCTION_RATE in", values, "deductionRate");
            return (Criteria) this;
        }

        public Criteria andDeductionRateNotIn(List<Integer> values) {
            addCriterion("DEDUCTION_RATE not in", values, "deductionRate");
            return (Criteria) this;
        }

        public Criteria andDeductionRateBetween(Integer value1, Integer value2) {
            addCriterion("DEDUCTION_RATE between", value1, value2, "deductionRate");
            return (Criteria) this;
        }

        public Criteria andDeductionRateNotBetween(Integer value1, Integer value2) {
            addCriterion("DEDUCTION_RATE not between", value1, value2, "deductionRate");
            return (Criteria) this;
        }

        public Criteria andNoMobileMaxCountIsNull() {
            addCriterion("NO_MOBILE_MAX_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andNoMobileMaxCountIsNotNull() {
            addCriterion("NO_MOBILE_MAX_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNoMobileMaxCountEqualTo(Integer value) {
            addCriterion("NO_MOBILE_MAX_COUNT =", value, "noMobileMaxCount");
            return (Criteria) this;
        }

        public Criteria andNoMobileMaxCountNotEqualTo(Integer value) {
            addCriterion("NO_MOBILE_MAX_COUNT <>", value, "noMobileMaxCount");
            return (Criteria) this;
        }

        public Criteria andNoMobileMaxCountGreaterThan(Integer value) {
            addCriterion("NO_MOBILE_MAX_COUNT >", value, "noMobileMaxCount");
            return (Criteria) this;
        }

        public Criteria andNoMobileMaxCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("NO_MOBILE_MAX_COUNT >=", value, "noMobileMaxCount");
            return (Criteria) this;
        }

        public Criteria andNoMobileMaxCountLessThan(Integer value) {
            addCriterion("NO_MOBILE_MAX_COUNT <", value, "noMobileMaxCount");
            return (Criteria) this;
        }

        public Criteria andNoMobileMaxCountLessThanOrEqualTo(Integer value) {
            addCriterion("NO_MOBILE_MAX_COUNT <=", value, "noMobileMaxCount");
            return (Criteria) this;
        }

        public Criteria andNoMobileMaxCountIn(List<Integer> values) {
            addCriterion("NO_MOBILE_MAX_COUNT in", values, "noMobileMaxCount");
            return (Criteria) this;
        }

        public Criteria andNoMobileMaxCountNotIn(List<Integer> values) {
            addCriterion("NO_MOBILE_MAX_COUNT not in", values, "noMobileMaxCount");
            return (Criteria) this;
        }

        public Criteria andNoMobileMaxCountBetween(Integer value1, Integer value2) {
            addCriterion("NO_MOBILE_MAX_COUNT between", value1, value2, "noMobileMaxCount");
            return (Criteria) this;
        }

        public Criteria andNoMobileMaxCountNotBetween(Integer value1, Integer value2) {
            addCriterion("NO_MOBILE_MAX_COUNT not between", value1, value2, "noMobileMaxCount");
            return (Criteria) this;
        }

        public Criteria andLowestTimeIsNull() {
            addCriterion("LOWEST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLowestTimeIsNotNull() {
            addCriterion("LOWEST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLowestTimeEqualTo(Integer value) {
            addCriterion("LOWEST_TIME =", value, "lowestTime");
            return (Criteria) this;
        }

        public Criteria andLowestTimeNotEqualTo(Integer value) {
            addCriterion("LOWEST_TIME <>", value, "lowestTime");
            return (Criteria) this;
        }

        public Criteria andLowestTimeGreaterThan(Integer value) {
            addCriterion("LOWEST_TIME >", value, "lowestTime");
            return (Criteria) this;
        }

        public Criteria andLowestTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOWEST_TIME >=", value, "lowestTime");
            return (Criteria) this;
        }

        public Criteria andLowestTimeLessThan(Integer value) {
            addCriterion("LOWEST_TIME <", value, "lowestTime");
            return (Criteria) this;
        }

        public Criteria andLowestTimeLessThanOrEqualTo(Integer value) {
            addCriterion("LOWEST_TIME <=", value, "lowestTime");
            return (Criteria) this;
        }

        public Criteria andLowestTimeIn(List<Integer> values) {
            addCriterion("LOWEST_TIME in", values, "lowestTime");
            return (Criteria) this;
        }

        public Criteria andLowestTimeNotIn(List<Integer> values) {
            addCriterion("LOWEST_TIME not in", values, "lowestTime");
            return (Criteria) this;
        }

        public Criteria andLowestTimeBetween(Integer value1, Integer value2) {
            addCriterion("LOWEST_TIME between", value1, value2, "lowestTime");
            return (Criteria) this;
        }

        public Criteria andLowestTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("LOWEST_TIME not between", value1, value2, "lowestTime");
            return (Criteria) this;
        }

        public Criteria andControlpaycardIsNull() {
            addCriterion("CONTROLPAYCARD is null");
            return (Criteria) this;
        }

        public Criteria andControlpaycardIsNotNull() {
            addCriterion("CONTROLPAYCARD is not null");
            return (Criteria) this;
        }

        public Criteria andControlpaycardEqualTo(Integer value) {
            addCriterion("CONTROLPAYCARD =", value, "controlpaycard");
            return (Criteria) this;
        }

        public Criteria andControlpaycardNotEqualTo(Integer value) {
            addCriterion("CONTROLPAYCARD <>", value, "controlpaycard");
            return (Criteria) this;
        }

        public Criteria andControlpaycardGreaterThan(Integer value) {
            addCriterion("CONTROLPAYCARD >", value, "controlpaycard");
            return (Criteria) this;
        }

        public Criteria andControlpaycardGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONTROLPAYCARD >=", value, "controlpaycard");
            return (Criteria) this;
        }

        public Criteria andControlpaycardLessThan(Integer value) {
            addCriterion("CONTROLPAYCARD <", value, "controlpaycard");
            return (Criteria) this;
        }

        public Criteria andControlpaycardLessThanOrEqualTo(Integer value) {
            addCriterion("CONTROLPAYCARD <=", value, "controlpaycard");
            return (Criteria) this;
        }

        public Criteria andControlpaycardIn(List<Integer> values) {
            addCriterion("CONTROLPAYCARD in", values, "controlpaycard");
            return (Criteria) this;
        }

        public Criteria andControlpaycardNotIn(List<Integer> values) {
            addCriterion("CONTROLPAYCARD not in", values, "controlpaycard");
            return (Criteria) this;
        }

        public Criteria andControlpaycardBetween(Integer value1, Integer value2) {
            addCriterion("CONTROLPAYCARD between", value1, value2, "controlpaycard");
            return (Criteria) this;
        }

        public Criteria andControlpaycardNotBetween(Integer value1, Integer value2) {
            addCriterion("CONTROLPAYCARD not between", value1, value2, "controlpaycard");
            return (Criteria) this;
        }

        public Criteria andSixfiveidcardlimitIsNull() {
            addCriterion("SIXFIVEIDCARDLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andSixfiveidcardlimitIsNotNull() {
            addCriterion("SIXFIVEIDCARDLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andSixfiveidcardlimitEqualTo(Integer value) {
            addCriterion("SIXFIVEIDCARDLIMIT =", value, "sixfiveidcardlimit");
            return (Criteria) this;
        }

        public Criteria andSixfiveidcardlimitNotEqualTo(Integer value) {
            addCriterion("SIXFIVEIDCARDLIMIT <>", value, "sixfiveidcardlimit");
            return (Criteria) this;
        }

        public Criteria andSixfiveidcardlimitGreaterThan(Integer value) {
            addCriterion("SIXFIVEIDCARDLIMIT >", value, "sixfiveidcardlimit");
            return (Criteria) this;
        }

        public Criteria andSixfiveidcardlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIXFIVEIDCARDLIMIT >=", value, "sixfiveidcardlimit");
            return (Criteria) this;
        }

        public Criteria andSixfiveidcardlimitLessThan(Integer value) {
            addCriterion("SIXFIVEIDCARDLIMIT <", value, "sixfiveidcardlimit");
            return (Criteria) this;
        }

        public Criteria andSixfiveidcardlimitLessThanOrEqualTo(Integer value) {
            addCriterion("SIXFIVEIDCARDLIMIT <=", value, "sixfiveidcardlimit");
            return (Criteria) this;
        }

        public Criteria andSixfiveidcardlimitIn(List<Integer> values) {
            addCriterion("SIXFIVEIDCARDLIMIT in", values, "sixfiveidcardlimit");
            return (Criteria) this;
        }

        public Criteria andSixfiveidcardlimitNotIn(List<Integer> values) {
            addCriterion("SIXFIVEIDCARDLIMIT not in", values, "sixfiveidcardlimit");
            return (Criteria) this;
        }

        public Criteria andSixfiveidcardlimitBetween(Integer value1, Integer value2) {
            addCriterion("SIXFIVEIDCARDLIMIT between", value1, value2, "sixfiveidcardlimit");
            return (Criteria) this;
        }

        public Criteria andSixfiveidcardlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("SIXFIVEIDCARDLIMIT not between", value1, value2, "sixfiveidcardlimit");
            return (Criteria) this;
        }

        public Criteria andAdminlimitIsNull() {
            addCriterion("ADMINLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andAdminlimitIsNotNull() {
            addCriterion("ADMINLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andAdminlimitEqualTo(String value) {
            addCriterion("ADMINLIMIT =", value, "adminlimit");
            return (Criteria) this;
        }

        public Criteria andAdminlimitNotEqualTo(String value) {
            addCriterion("ADMINLIMIT <>", value, "adminlimit");
            return (Criteria) this;
        }

        public Criteria andAdminlimitGreaterThan(String value) {
            addCriterion("ADMINLIMIT >", value, "adminlimit");
            return (Criteria) this;
        }

        public Criteria andAdminlimitGreaterThanOrEqualTo(String value) {
            addCriterion("ADMINLIMIT >=", value, "adminlimit");
            return (Criteria) this;
        }

        public Criteria andAdminlimitLessThan(String value) {
            addCriterion("ADMINLIMIT <", value, "adminlimit");
            return (Criteria) this;
        }

        public Criteria andAdminlimitLessThanOrEqualTo(String value) {
            addCriterion("ADMINLIMIT <=", value, "adminlimit");
            return (Criteria) this;
        }

        public Criteria andAdminlimitLike(String value) {
            addCriterion("ADMINLIMIT like", value, "adminlimit");
            return (Criteria) this;
        }

        public Criteria andAdminlimitNotLike(String value) {
            addCriterion("ADMINLIMIT not like", value, "adminlimit");
            return (Criteria) this;
        }

        public Criteria andAdminlimitIn(List<String> values) {
            addCriterion("ADMINLIMIT in", values, "adminlimit");
            return (Criteria) this;
        }

        public Criteria andAdminlimitNotIn(List<String> values) {
            addCriterion("ADMINLIMIT not in", values, "adminlimit");
            return (Criteria) this;
        }

        public Criteria andAdminlimitBetween(String value1, String value2) {
            addCriterion("ADMINLIMIT between", value1, value2, "adminlimit");
            return (Criteria) this;
        }

        public Criteria andAdminlimitNotBetween(String value1, String value2) {
            addCriterion("ADMINLIMIT not between", value1, value2, "adminlimit");
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