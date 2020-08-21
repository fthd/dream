package tip.dream.dao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbUserOldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserOldExample() {
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

        public Criteria andUSER_IDIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUSER_IDIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_IDEqualTo(String value) {
            addCriterion("USER_ID =", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDGreaterThan(String value) {
            addCriterion("USER_ID >", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDLessThan(String value) {
            addCriterion("USER_ID <", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDLike(String value) {
            addCriterion("USER_ID like", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotLike(String value) {
            addCriterion("USER_ID not like", value, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDIn(List<String> values) {
            addCriterion("USER_ID in", values, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_IDNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "USER_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEEqualTo(String value) {
            addCriterion("USER_NAME =", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMELessThan(String value) {
            addCriterion("USER_NAME <", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMELessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMELike(String value) {
            addCriterion("USER_NAME like", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotLike(String value) {
            addCriterion("USER_NAME not like", value, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEIn(List<String> values) {
            addCriterion("USER_NAME in", values, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMEBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAMENotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "USER_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINIsNull() {
            addCriterion("USER_NAME_PINYIN is null");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINIsNotNull() {
            addCriterion("USER_NAME_PINYIN is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINEqualTo(String value) {
            addCriterion("USER_NAME_PINYIN =", value, "USER_NAME_PINYIN");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINNotEqualTo(String value) {
            addCriterion("USER_NAME_PINYIN <>", value, "USER_NAME_PINYIN");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINGreaterThan(String value) {
            addCriterion("USER_NAME_PINYIN >", value, "USER_NAME_PINYIN");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME_PINYIN >=", value, "USER_NAME_PINYIN");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINLessThan(String value) {
            addCriterion("USER_NAME_PINYIN <", value, "USER_NAME_PINYIN");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME_PINYIN <=", value, "USER_NAME_PINYIN");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINLike(String value) {
            addCriterion("USER_NAME_PINYIN like", value, "USER_NAME_PINYIN");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINNotLike(String value) {
            addCriterion("USER_NAME_PINYIN not like", value, "USER_NAME_PINYIN");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINIn(List<String> values) {
            addCriterion("USER_NAME_PINYIN in", values, "USER_NAME_PINYIN");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINNotIn(List<String> values) {
            addCriterion("USER_NAME_PINYIN not in", values, "USER_NAME_PINYIN");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINBetween(String value1, String value2) {
            addCriterion("USER_NAME_PINYIN between", value1, value2, "USER_NAME_PINYIN");
            return (Criteria) this;
        }

        public Criteria andUSER_NAME_PINYINNotBetween(String value1, String value2) {
            addCriterion("USER_NAME_PINYIN not between", value1, value2, "USER_NAME_PINYIN");
            return (Criteria) this;
        }

        public Criteria andIDCARD_START_TIMEIsNull() {
            addCriterion("IDCARD_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andIDCARD_START_TIMEIsNotNull() {
            addCriterion("IDCARD_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andIDCARD_START_TIMEEqualTo(Date value) {
            addCriterion("IDCARD_START_TIME =", value, "IDCARD_START_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_START_TIMENotEqualTo(Date value) {
            addCriterion("IDCARD_START_TIME <>", value, "IDCARD_START_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_START_TIMEGreaterThan(Date value) {
            addCriterion("IDCARD_START_TIME >", value, "IDCARD_START_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_START_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("IDCARD_START_TIME >=", value, "IDCARD_START_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_START_TIMELessThan(Date value) {
            addCriterion("IDCARD_START_TIME <", value, "IDCARD_START_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_START_TIMELessThanOrEqualTo(Date value) {
            addCriterion("IDCARD_START_TIME <=", value, "IDCARD_START_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_START_TIMEIn(List<Date> values) {
            addCriterion("IDCARD_START_TIME in", values, "IDCARD_START_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_START_TIMENotIn(List<Date> values) {
            addCriterion("IDCARD_START_TIME not in", values, "IDCARD_START_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_START_TIMEBetween(Date value1, Date value2) {
            addCriterion("IDCARD_START_TIME between", value1, value2, "IDCARD_START_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_START_TIMENotBetween(Date value1, Date value2) {
            addCriterion("IDCARD_START_TIME not between", value1, value2, "IDCARD_START_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_END_TIMEIsNull() {
            addCriterion("IDCARD_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andIDCARD_END_TIMEIsNotNull() {
            addCriterion("IDCARD_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andIDCARD_END_TIMEEqualTo(Date value) {
            addCriterion("IDCARD_END_TIME =", value, "IDCARD_END_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_END_TIMENotEqualTo(Date value) {
            addCriterion("IDCARD_END_TIME <>", value, "IDCARD_END_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_END_TIMEGreaterThan(Date value) {
            addCriterion("IDCARD_END_TIME >", value, "IDCARD_END_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_END_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("IDCARD_END_TIME >=", value, "IDCARD_END_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_END_TIMELessThan(Date value) {
            addCriterion("IDCARD_END_TIME <", value, "IDCARD_END_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_END_TIMELessThanOrEqualTo(Date value) {
            addCriterion("IDCARD_END_TIME <=", value, "IDCARD_END_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_END_TIMEIn(List<Date> values) {
            addCriterion("IDCARD_END_TIME in", values, "IDCARD_END_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_END_TIMENotIn(List<Date> values) {
            addCriterion("IDCARD_END_TIME not in", values, "IDCARD_END_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_END_TIMEBetween(Date value1, Date value2) {
            addCriterion("IDCARD_END_TIME between", value1, value2, "IDCARD_END_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_END_TIMENotBetween(Date value1, Date value2) {
            addCriterion("IDCARD_END_TIME not between", value1, value2, "IDCARD_END_TIME");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPEIsNull() {
            addCriterion("IDCARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPEIsNotNull() {
            addCriterion("IDCARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPEEqualTo(String value) {
            addCriterion("IDCARD_TYPE =", value, "IDCARD_TYPE");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPENotEqualTo(String value) {
            addCriterion("IDCARD_TYPE <>", value, "IDCARD_TYPE");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPEGreaterThan(String value) {
            addCriterion("IDCARD_TYPE >", value, "IDCARD_TYPE");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD_TYPE >=", value, "IDCARD_TYPE");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPELessThan(String value) {
            addCriterion("IDCARD_TYPE <", value, "IDCARD_TYPE");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPELessThanOrEqualTo(String value) {
            addCriterion("IDCARD_TYPE <=", value, "IDCARD_TYPE");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPELike(String value) {
            addCriterion("IDCARD_TYPE like", value, "IDCARD_TYPE");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPENotLike(String value) {
            addCriterion("IDCARD_TYPE not like", value, "IDCARD_TYPE");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPEIn(List<String> values) {
            addCriterion("IDCARD_TYPE in", values, "IDCARD_TYPE");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPENotIn(List<String> values) {
            addCriterion("IDCARD_TYPE not in", values, "IDCARD_TYPE");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPEBetween(String value1, String value2) {
            addCriterion("IDCARD_TYPE between", value1, value2, "IDCARD_TYPE");
            return (Criteria) this;
        }

        public Criteria andIDCARD_TYPENotBetween(String value1, String value2) {
            addCriterion("IDCARD_TYPE not between", value1, value2, "IDCARD_TYPE");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NOIsNull() {
            addCriterion("IDCARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NOIsNotNull() {
            addCriterion("IDCARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NOEqualTo(String value) {
            addCriterion("IDCARD_NO =", value, "IDCARD_NO");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NONotEqualTo(String value) {
            addCriterion("IDCARD_NO <>", value, "IDCARD_NO");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NOGreaterThan(String value) {
            addCriterion("IDCARD_NO >", value, "IDCARD_NO");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NOGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD_NO >=", value, "IDCARD_NO");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NOLessThan(String value) {
            addCriterion("IDCARD_NO <", value, "IDCARD_NO");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NOLessThanOrEqualTo(String value) {
            addCriterion("IDCARD_NO <=", value, "IDCARD_NO");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NOLike(String value) {
            addCriterion("IDCARD_NO like", value, "IDCARD_NO");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NONotLike(String value) {
            addCriterion("IDCARD_NO not like", value, "IDCARD_NO");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NOIn(List<String> values) {
            addCriterion("IDCARD_NO in", values, "IDCARD_NO");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NONotIn(List<String> values) {
            addCriterion("IDCARD_NO not in", values, "IDCARD_NO");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NOBetween(String value1, String value2) {
            addCriterion("IDCARD_NO between", value1, value2, "IDCARD_NO");
            return (Criteria) this;
        }

        public Criteria andIDCARD_NONotBetween(String value1, String value2) {
            addCriterion("IDCARD_NO not between", value1, value2, "IDCARD_NO");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHIsNull() {
            addCriterion("IDCARD_HASH is null");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHIsNotNull() {
            addCriterion("IDCARD_HASH is not null");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHEqualTo(String value) {
            addCriterion("IDCARD_HASH =", value, "IDCARD_HASH");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHNotEqualTo(String value) {
            addCriterion("IDCARD_HASH <>", value, "IDCARD_HASH");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHGreaterThan(String value) {
            addCriterion("IDCARD_HASH >", value, "IDCARD_HASH");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD_HASH >=", value, "IDCARD_HASH");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHLessThan(String value) {
            addCriterion("IDCARD_HASH <", value, "IDCARD_HASH");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHLessThanOrEqualTo(String value) {
            addCriterion("IDCARD_HASH <=", value, "IDCARD_HASH");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHLike(String value) {
            addCriterion("IDCARD_HASH like", value, "IDCARD_HASH");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHNotLike(String value) {
            addCriterion("IDCARD_HASH not like", value, "IDCARD_HASH");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHIn(List<String> values) {
            addCriterion("IDCARD_HASH in", values, "IDCARD_HASH");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHNotIn(List<String> values) {
            addCriterion("IDCARD_HASH not in", values, "IDCARD_HASH");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHBetween(String value1, String value2) {
            addCriterion("IDCARD_HASH between", value1, value2, "IDCARD_HASH");
            return (Criteria) this;
        }

        public Criteria andIDCARD_HASHNotBetween(String value1, String value2) {
            addCriterion("IDCARD_HASH not between", value1, value2, "IDCARD_HASH");
            return (Criteria) this;
        }

        public Criteria andREAL_LEVELIsNull() {
            addCriterion("REAL_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andREAL_LEVELIsNotNull() {
            addCriterion("REAL_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andREAL_LEVELEqualTo(Integer value) {
            addCriterion("REAL_LEVEL =", value, "REAL_LEVEL");
            return (Criteria) this;
        }

        public Criteria andREAL_LEVELNotEqualTo(Integer value) {
            addCriterion("REAL_LEVEL <>", value, "REAL_LEVEL");
            return (Criteria) this;
        }

        public Criteria andREAL_LEVELGreaterThan(Integer value) {
            addCriterion("REAL_LEVEL >", value, "REAL_LEVEL");
            return (Criteria) this;
        }

        public Criteria andREAL_LEVELGreaterThanOrEqualTo(Integer value) {
            addCriterion("REAL_LEVEL >=", value, "REAL_LEVEL");
            return (Criteria) this;
        }

        public Criteria andREAL_LEVELLessThan(Integer value) {
            addCriterion("REAL_LEVEL <", value, "REAL_LEVEL");
            return (Criteria) this;
        }

        public Criteria andREAL_LEVELLessThanOrEqualTo(Integer value) {
            addCriterion("REAL_LEVEL <=", value, "REAL_LEVEL");
            return (Criteria) this;
        }

        public Criteria andREAL_LEVELIn(List<Integer> values) {
            addCriterion("REAL_LEVEL in", values, "REAL_LEVEL");
            return (Criteria) this;
        }

        public Criteria andREAL_LEVELNotIn(List<Integer> values) {
            addCriterion("REAL_LEVEL not in", values, "REAL_LEVEL");
            return (Criteria) this;
        }

        public Criteria andREAL_LEVELBetween(Integer value1, Integer value2) {
            addCriterion("REAL_LEVEL between", value1, value2, "REAL_LEVEL");
            return (Criteria) this;
        }

        public Criteria andREAL_LEVELNotBetween(Integer value1, Integer value2) {
            addCriterion("REAL_LEVEL not between", value1, value2, "REAL_LEVEL");
            return (Criteria) this;
        }

        public Criteria andMOBILEIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMOBILEIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMOBILEEqualTo(String value) {
            addCriterion("MOBILE =", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEGreaterThan(String value) {
            addCriterion("MOBILE >", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELessThan(String value) {
            addCriterion("MOBILE <", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILELike(String value) {
            addCriterion("MOBILE like", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotLike(String value) {
            addCriterion("MOBILE not like", value, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEIn(List<String> values) {
            addCriterion("MOBILE in", values, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILEBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andMOBILENotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "MOBILE");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMAILEqualTo(String value) {
            addCriterion("EMAIL =", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThan(String value) {
            addCriterion("EMAIL >", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThan(String value) {
            addCriterion("EMAIL <", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLike(String value) {
            addCriterion("EMAIL like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotLike(String value) {
            addCriterion("EMAIL not like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILIn(List<String> values) {
            addCriterion("EMAIL in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPEIsNull() {
            addCriterion("AUTHENTICATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPEIsNotNull() {
            addCriterion("AUTHENTICATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPEEqualTo(String value) {
            addCriterion("AUTHENTICATE_TYPE =", value, "AUTHENTICATE_TYPE");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPENotEqualTo(String value) {
            addCriterion("AUTHENTICATE_TYPE <>", value, "AUTHENTICATE_TYPE");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPEGreaterThan(String value) {
            addCriterion("AUTHENTICATE_TYPE >", value, "AUTHENTICATE_TYPE");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHENTICATE_TYPE >=", value, "AUTHENTICATE_TYPE");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPELessThan(String value) {
            addCriterion("AUTHENTICATE_TYPE <", value, "AUTHENTICATE_TYPE");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPELessThanOrEqualTo(String value) {
            addCriterion("AUTHENTICATE_TYPE <=", value, "AUTHENTICATE_TYPE");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPELike(String value) {
            addCriterion("AUTHENTICATE_TYPE like", value, "AUTHENTICATE_TYPE");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPENotLike(String value) {
            addCriterion("AUTHENTICATE_TYPE not like", value, "AUTHENTICATE_TYPE");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPEIn(List<String> values) {
            addCriterion("AUTHENTICATE_TYPE in", values, "AUTHENTICATE_TYPE");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPENotIn(List<String> values) {
            addCriterion("AUTHENTICATE_TYPE not in", values, "AUTHENTICATE_TYPE");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPEBetween(String value1, String value2) {
            addCriterion("AUTHENTICATE_TYPE between", value1, value2, "AUTHENTICATE_TYPE");
            return (Criteria) this;
        }

        public Criteria andAUTHENTICATE_TYPENotBetween(String value1, String value2) {
            addCriterion("AUTHENTICATE_TYPE not between", value1, value2, "AUTHENTICATE_TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTYPEIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTYPEEqualTo(String value) {
            addCriterion("TYPE =", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotEqualTo(String value) {
            addCriterion("TYPE <>", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEGreaterThan(String value) {
            addCriterion("TYPE >", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELessThan(String value) {
            addCriterion("TYPE <", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELike(String value) {
            addCriterion("TYPE like", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotLike(String value) {
            addCriterion("TYPE not like", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEIn(List<String> values) {
            addCriterion("TYPE in", values, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotIn(List<String> values) {
            addCriterion("TYPE not in", values, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "TYPE");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSTATUSIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSTATUSEqualTo(Integer value) {
            addCriterion("STATUS =", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThan(Integer value) {
            addCriterion("STATUS <", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSIn(List<Integer> values) {
            addCriterion("STATUS in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andSTATUSNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "STATUS");
            return (Criteria) this;
        }

        public Criteria andREMARKIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andREMARKIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andREMARKEqualTo(String value) {
            addCriterion("REMARK =", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKGreaterThan(String value) {
            addCriterion("REMARK >", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKLessThan(String value) {
            addCriterion("REMARK <", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKLike(String value) {
            addCriterion("REMARK like", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotLike(String value) {
            addCriterion("REMARK not like", value, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKIn(List<String> values) {
            addCriterion("REMARK in", values, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "REMARK");
            return (Criteria) this;
        }

        public Criteria andREMARKNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "REMARK");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDIsNull() {
            addCriterion("USER_MAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDIsNotNull() {
            addCriterion("USER_MAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDEqualTo(String value) {
            addCriterion("USER_MAIN_ID =", value, "USER_MAIN_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDNotEqualTo(String value) {
            addCriterion("USER_MAIN_ID <>", value, "USER_MAIN_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDGreaterThan(String value) {
            addCriterion("USER_MAIN_ID >", value, "USER_MAIN_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDGreaterThanOrEqualTo(String value) {
            addCriterion("USER_MAIN_ID >=", value, "USER_MAIN_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDLessThan(String value) {
            addCriterion("USER_MAIN_ID <", value, "USER_MAIN_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDLessThanOrEqualTo(String value) {
            addCriterion("USER_MAIN_ID <=", value, "USER_MAIN_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDLike(String value) {
            addCriterion("USER_MAIN_ID like", value, "USER_MAIN_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDNotLike(String value) {
            addCriterion("USER_MAIN_ID not like", value, "USER_MAIN_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDIn(List<String> values) {
            addCriterion("USER_MAIN_ID in", values, "USER_MAIN_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDNotIn(List<String> values) {
            addCriterion("USER_MAIN_ID not in", values, "USER_MAIN_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDBetween(String value1, String value2) {
            addCriterion("USER_MAIN_ID between", value1, value2, "USER_MAIN_ID");
            return (Criteria) this;
        }

        public Criteria andUSER_MAIN_IDNotBetween(String value1, String value2) {
            addCriterion("USER_MAIN_ID not between", value1, value2, "USER_MAIN_ID");
            return (Criteria) this;
        }

        public Criteria andADD_TIMEIsNull() {
            addCriterion("ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andADD_TIMEIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andADD_TIMEEqualTo(Date value) {
            addCriterion("ADD_TIME =", value, "ADD_TIME");
            return (Criteria) this;
        }

        public Criteria andADD_TIMENotEqualTo(Date value) {
            addCriterion("ADD_TIME <>", value, "ADD_TIME");
            return (Criteria) this;
        }

        public Criteria andADD_TIMEGreaterThan(Date value) {
            addCriterion("ADD_TIME >", value, "ADD_TIME");
            return (Criteria) this;
        }

        public Criteria andADD_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME >=", value, "ADD_TIME");
            return (Criteria) this;
        }

        public Criteria andADD_TIMELessThan(Date value) {
            addCriterion("ADD_TIME <", value, "ADD_TIME");
            return (Criteria) this;
        }

        public Criteria andADD_TIMELessThanOrEqualTo(Date value) {
            addCriterion("ADD_TIME <=", value, "ADD_TIME");
            return (Criteria) this;
        }

        public Criteria andADD_TIMEIn(List<Date> values) {
            addCriterion("ADD_TIME in", values, "ADD_TIME");
            return (Criteria) this;
        }

        public Criteria andADD_TIMENotIn(List<Date> values) {
            addCriterion("ADD_TIME not in", values, "ADD_TIME");
            return (Criteria) this;
        }

        public Criteria andADD_TIMEBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME between", value1, value2, "ADD_TIME");
            return (Criteria) this;
        }

        public Criteria andADD_TIMENotBetween(Date value1, Date value2) {
            addCriterion("ADD_TIME not between", value1, value2, "ADD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMENotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMELessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMELessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMENotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMEBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TIMENotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "UPDATE_TIME");
            return (Criteria) this;
        }

        public Criteria andADD_BYIsNull() {
            addCriterion("ADD_BY is null");
            return (Criteria) this;
        }

        public Criteria andADD_BYIsNotNull() {
            addCriterion("ADD_BY is not null");
            return (Criteria) this;
        }

        public Criteria andADD_BYEqualTo(String value) {
            addCriterion("ADD_BY =", value, "ADD_BY");
            return (Criteria) this;
        }

        public Criteria andADD_BYNotEqualTo(String value) {
            addCriterion("ADD_BY <>", value, "ADD_BY");
            return (Criteria) this;
        }

        public Criteria andADD_BYGreaterThan(String value) {
            addCriterion("ADD_BY >", value, "ADD_BY");
            return (Criteria) this;
        }

        public Criteria andADD_BYGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_BY >=", value, "ADD_BY");
            return (Criteria) this;
        }

        public Criteria andADD_BYLessThan(String value) {
            addCriterion("ADD_BY <", value, "ADD_BY");
            return (Criteria) this;
        }

        public Criteria andADD_BYLessThanOrEqualTo(String value) {
            addCriterion("ADD_BY <=", value, "ADD_BY");
            return (Criteria) this;
        }

        public Criteria andADD_BYLike(String value) {
            addCriterion("ADD_BY like", value, "ADD_BY");
            return (Criteria) this;
        }

        public Criteria andADD_BYNotLike(String value) {
            addCriterion("ADD_BY not like", value, "ADD_BY");
            return (Criteria) this;
        }

        public Criteria andADD_BYIn(List<String> values) {
            addCriterion("ADD_BY in", values, "ADD_BY");
            return (Criteria) this;
        }

        public Criteria andADD_BYNotIn(List<String> values) {
            addCriterion("ADD_BY not in", values, "ADD_BY");
            return (Criteria) this;
        }

        public Criteria andADD_BYBetween(String value1, String value2) {
            addCriterion("ADD_BY between", value1, value2, "ADD_BY");
            return (Criteria) this;
        }

        public Criteria andADD_BYNotBetween(String value1, String value2) {
            addCriterion("ADD_BY not between", value1, value2, "ADD_BY");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYIsNull() {
            addCriterion("UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYIsNotNull() {
            addCriterion("UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYEqualTo(String value) {
            addCriterion("UPDATE_BY =", value, "UPDATE_BY");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYNotEqualTo(String value) {
            addCriterion("UPDATE_BY <>", value, "UPDATE_BY");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYGreaterThan(String value) {
            addCriterion("UPDATE_BY >", value, "UPDATE_BY");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY >=", value, "UPDATE_BY");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYLessThan(String value) {
            addCriterion("UPDATE_BY <", value, "UPDATE_BY");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_BY <=", value, "UPDATE_BY");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYLike(String value) {
            addCriterion("UPDATE_BY like", value, "UPDATE_BY");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYNotLike(String value) {
            addCriterion("UPDATE_BY not like", value, "UPDATE_BY");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYIn(List<String> values) {
            addCriterion("UPDATE_BY in", values, "UPDATE_BY");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYNotIn(List<String> values) {
            addCriterion("UPDATE_BY not in", values, "UPDATE_BY");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYBetween(String value1, String value2) {
            addCriterion("UPDATE_BY between", value1, value2, "UPDATE_BY");
            return (Criteria) this;
        }

        public Criteria andUPDATE_BYNotBetween(String value1, String value2) {
            addCriterion("UPDATE_BY not between", value1, value2, "UPDATE_BY");
            return (Criteria) this;
        }

        public Criteria andSEXIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSEXIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSEXEqualTo(String value) {
            addCriterion("SEX =", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXNotEqualTo(String value) {
            addCriterion("SEX <>", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXGreaterThan(String value) {
            addCriterion("SEX >", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXLessThan(String value) {
            addCriterion("SEX <", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXLike(String value) {
            addCriterion("SEX like", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXNotLike(String value) {
            addCriterion("SEX not like", value, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXIn(List<String> values) {
            addCriterion("SEX in", values, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXNotIn(List<String> values) {
            addCriterion("SEX not in", values, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "SEX");
            return (Criteria) this;
        }

        public Criteria andSEXNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "SEX");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andBIRTHDAYNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "BIRTHDAY");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYIsNull() {
            addCriterion("NATIONALITY is null");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYIsNotNull() {
            addCriterion("NATIONALITY is not null");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYEqualTo(String value) {
            addCriterion("NATIONALITY =", value, "NATIONALITY");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYNotEqualTo(String value) {
            addCriterion("NATIONALITY <>", value, "NATIONALITY");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYGreaterThan(String value) {
            addCriterion("NATIONALITY >", value, "NATIONALITY");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONALITY >=", value, "NATIONALITY");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYLessThan(String value) {
            addCriterion("NATIONALITY <", value, "NATIONALITY");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYLessThanOrEqualTo(String value) {
            addCriterion("NATIONALITY <=", value, "NATIONALITY");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYLike(String value) {
            addCriterion("NATIONALITY like", value, "NATIONALITY");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYNotLike(String value) {
            addCriterion("NATIONALITY not like", value, "NATIONALITY");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYIn(List<String> values) {
            addCriterion("NATIONALITY in", values, "NATIONALITY");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYNotIn(List<String> values) {
            addCriterion("NATIONALITY not in", values, "NATIONALITY");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYBetween(String value1, String value2) {
            addCriterion("NATIONALITY between", value1, value2, "NATIONALITY");
            return (Criteria) this;
        }

        public Criteria andNATIONALITYNotBetween(String value1, String value2) {
            addCriterion("NATIONALITY not between", value1, value2, "NATIONALITY");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACEIsNull() {
            addCriterion("BIRTH_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACEIsNotNull() {
            addCriterion("BIRTH_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACEEqualTo(String value) {
            addCriterion("BIRTH_PLACE =", value, "BIRTH_PLACE");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACENotEqualTo(String value) {
            addCriterion("BIRTH_PLACE <>", value, "BIRTH_PLACE");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACEGreaterThan(String value) {
            addCriterion("BIRTH_PLACE >", value, "BIRTH_PLACE");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACEGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTH_PLACE >=", value, "BIRTH_PLACE");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACELessThan(String value) {
            addCriterion("BIRTH_PLACE <", value, "BIRTH_PLACE");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACELessThanOrEqualTo(String value) {
            addCriterion("BIRTH_PLACE <=", value, "BIRTH_PLACE");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACELike(String value) {
            addCriterion("BIRTH_PLACE like", value, "BIRTH_PLACE");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACENotLike(String value) {
            addCriterion("BIRTH_PLACE not like", value, "BIRTH_PLACE");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACEIn(List<String> values) {
            addCriterion("BIRTH_PLACE in", values, "BIRTH_PLACE");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACENotIn(List<String> values) {
            addCriterion("BIRTH_PLACE not in", values, "BIRTH_PLACE");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACEBetween(String value1, String value2) {
            addCriterion("BIRTH_PLACE between", value1, value2, "BIRTH_PLACE");
            return (Criteria) this;
        }

        public Criteria andBIRTH_PLACENotBetween(String value1, String value2) {
            addCriterion("BIRTH_PLACE not between", value1, value2, "BIRTH_PLACE");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXIsNull() {
            addCriterion("USER_OFFICE_FAX is null");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXIsNotNull() {
            addCriterion("USER_OFFICE_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXEqualTo(String value) {
            addCriterion("USER_OFFICE_FAX =", value, "USER_OFFICE_FAX");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXNotEqualTo(String value) {
            addCriterion("USER_OFFICE_FAX <>", value, "USER_OFFICE_FAX");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXGreaterThan(String value) {
            addCriterion("USER_OFFICE_FAX >", value, "USER_OFFICE_FAX");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXGreaterThanOrEqualTo(String value) {
            addCriterion("USER_OFFICE_FAX >=", value, "USER_OFFICE_FAX");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXLessThan(String value) {
            addCriterion("USER_OFFICE_FAX <", value, "USER_OFFICE_FAX");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXLessThanOrEqualTo(String value) {
            addCriterion("USER_OFFICE_FAX <=", value, "USER_OFFICE_FAX");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXLike(String value) {
            addCriterion("USER_OFFICE_FAX like", value, "USER_OFFICE_FAX");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXNotLike(String value) {
            addCriterion("USER_OFFICE_FAX not like", value, "USER_OFFICE_FAX");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXIn(List<String> values) {
            addCriterion("USER_OFFICE_FAX in", values, "USER_OFFICE_FAX");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXNotIn(List<String> values) {
            addCriterion("USER_OFFICE_FAX not in", values, "USER_OFFICE_FAX");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXBetween(String value1, String value2) {
            addCriterion("USER_OFFICE_FAX between", value1, value2, "USER_OFFICE_FAX");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_FAXNotBetween(String value1, String value2) {
            addCriterion("USER_OFFICE_FAX not between", value1, value2, "USER_OFFICE_FAX");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONEIsNull() {
            addCriterion("USER_OFFICE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONEIsNotNull() {
            addCriterion("USER_OFFICE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONEEqualTo(String value) {
            addCriterion("USER_OFFICE_PHONE =", value, "USER_OFFICE_PHONE");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONENotEqualTo(String value) {
            addCriterion("USER_OFFICE_PHONE <>", value, "USER_OFFICE_PHONE");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONEGreaterThan(String value) {
            addCriterion("USER_OFFICE_PHONE >", value, "USER_OFFICE_PHONE");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONEGreaterThanOrEqualTo(String value) {
            addCriterion("USER_OFFICE_PHONE >=", value, "USER_OFFICE_PHONE");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONELessThan(String value) {
            addCriterion("USER_OFFICE_PHONE <", value, "USER_OFFICE_PHONE");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONELessThanOrEqualTo(String value) {
            addCriterion("USER_OFFICE_PHONE <=", value, "USER_OFFICE_PHONE");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONELike(String value) {
            addCriterion("USER_OFFICE_PHONE like", value, "USER_OFFICE_PHONE");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONENotLike(String value) {
            addCriterion("USER_OFFICE_PHONE not like", value, "USER_OFFICE_PHONE");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONEIn(List<String> values) {
            addCriterion("USER_OFFICE_PHONE in", values, "USER_OFFICE_PHONE");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONENotIn(List<String> values) {
            addCriterion("USER_OFFICE_PHONE not in", values, "USER_OFFICE_PHONE");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONEBetween(String value1, String value2) {
            addCriterion("USER_OFFICE_PHONE between", value1, value2, "USER_OFFICE_PHONE");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_PHONENotBetween(String value1, String value2) {
            addCriterion("USER_OFFICE_PHONE not between", value1, value2, "USER_OFFICE_PHONE");
            return (Criteria) this;
        }

        public Criteria andALGORITHMIsNull() {
            addCriterion("ALGORITHM is null");
            return (Criteria) this;
        }

        public Criteria andALGORITHMIsNotNull() {
            addCriterion("ALGORITHM is not null");
            return (Criteria) this;
        }

        public Criteria andALGORITHMEqualTo(String value) {
            addCriterion("ALGORITHM =", value, "ALGORITHM");
            return (Criteria) this;
        }

        public Criteria andALGORITHMNotEqualTo(String value) {
            addCriterion("ALGORITHM <>", value, "ALGORITHM");
            return (Criteria) this;
        }

        public Criteria andALGORITHMGreaterThan(String value) {
            addCriterion("ALGORITHM >", value, "ALGORITHM");
            return (Criteria) this;
        }

        public Criteria andALGORITHMGreaterThanOrEqualTo(String value) {
            addCriterion("ALGORITHM >=", value, "ALGORITHM");
            return (Criteria) this;
        }

        public Criteria andALGORITHMLessThan(String value) {
            addCriterion("ALGORITHM <", value, "ALGORITHM");
            return (Criteria) this;
        }

        public Criteria andALGORITHMLessThanOrEqualTo(String value) {
            addCriterion("ALGORITHM <=", value, "ALGORITHM");
            return (Criteria) this;
        }

        public Criteria andALGORITHMLike(String value) {
            addCriterion("ALGORITHM like", value, "ALGORITHM");
            return (Criteria) this;
        }

        public Criteria andALGORITHMNotLike(String value) {
            addCriterion("ALGORITHM not like", value, "ALGORITHM");
            return (Criteria) this;
        }

        public Criteria andALGORITHMIn(List<String> values) {
            addCriterion("ALGORITHM in", values, "ALGORITHM");
            return (Criteria) this;
        }

        public Criteria andALGORITHMNotIn(List<String> values) {
            addCriterion("ALGORITHM not in", values, "ALGORITHM");
            return (Criteria) this;
        }

        public Criteria andALGORITHMBetween(String value1, String value2) {
            addCriterion("ALGORITHM between", value1, value2, "ALGORITHM");
            return (Criteria) this;
        }

        public Criteria andALGORITHMNotBetween(String value1, String value2) {
            addCriterion("ALGORITHM not between", value1, value2, "ALGORITHM");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTIsNull() {
            addCriterion("PWD_ENCRYPT is null");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTIsNotNull() {
            addCriterion("PWD_ENCRYPT is not null");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTEqualTo(String value) {
            addCriterion("PWD_ENCRYPT =", value, "PWD_ENCRYPT");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTNotEqualTo(String value) {
            addCriterion("PWD_ENCRYPT <>", value, "PWD_ENCRYPT");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTGreaterThan(String value) {
            addCriterion("PWD_ENCRYPT >", value, "PWD_ENCRYPT");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTGreaterThanOrEqualTo(String value) {
            addCriterion("PWD_ENCRYPT >=", value, "PWD_ENCRYPT");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTLessThan(String value) {
            addCriterion("PWD_ENCRYPT <", value, "PWD_ENCRYPT");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTLessThanOrEqualTo(String value) {
            addCriterion("PWD_ENCRYPT <=", value, "PWD_ENCRYPT");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTLike(String value) {
            addCriterion("PWD_ENCRYPT like", value, "PWD_ENCRYPT");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTNotLike(String value) {
            addCriterion("PWD_ENCRYPT not like", value, "PWD_ENCRYPT");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTIn(List<String> values) {
            addCriterion("PWD_ENCRYPT in", values, "PWD_ENCRYPT");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTNotIn(List<String> values) {
            addCriterion("PWD_ENCRYPT not in", values, "PWD_ENCRYPT");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTBetween(String value1, String value2) {
            addCriterion("PWD_ENCRYPT between", value1, value2, "PWD_ENCRYPT");
            return (Criteria) this;
        }

        public Criteria andPWD_ENCRYPTNotBetween(String value1, String value2) {
            addCriterion("PWD_ENCRYPT not between", value1, value2, "PWD_ENCRYPT");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPEIsNull() {
            addCriterion("VIRTUAL_USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPEIsNotNull() {
            addCriterion("VIRTUAL_USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPEEqualTo(String value) {
            addCriterion("VIRTUAL_USER_TYPE =", value, "VIRTUAL_USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPENotEqualTo(String value) {
            addCriterion("VIRTUAL_USER_TYPE <>", value, "VIRTUAL_USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPEGreaterThan(String value) {
            addCriterion("VIRTUAL_USER_TYPE >", value, "VIRTUAL_USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("VIRTUAL_USER_TYPE >=", value, "VIRTUAL_USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPELessThan(String value) {
            addCriterion("VIRTUAL_USER_TYPE <", value, "VIRTUAL_USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPELessThanOrEqualTo(String value) {
            addCriterion("VIRTUAL_USER_TYPE <=", value, "VIRTUAL_USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPELike(String value) {
            addCriterion("VIRTUAL_USER_TYPE like", value, "VIRTUAL_USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPENotLike(String value) {
            addCriterion("VIRTUAL_USER_TYPE not like", value, "VIRTUAL_USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPEIn(List<String> values) {
            addCriterion("VIRTUAL_USER_TYPE in", values, "VIRTUAL_USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPENotIn(List<String> values) {
            addCriterion("VIRTUAL_USER_TYPE not in", values, "VIRTUAL_USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPEBetween(String value1, String value2) {
            addCriterion("VIRTUAL_USER_TYPE between", value1, value2, "VIRTUAL_USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andVIRTUAL_USER_TYPENotBetween(String value1, String value2) {
            addCriterion("VIRTUAL_USER_TYPE not between", value1, value2, "VIRTUAL_USER_TYPE");
            return (Criteria) this;
        }

        public Criteria andORG_IDIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andORG_IDIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andORG_IDEqualTo(String value) {
            addCriterion("ORG_ID =", value, "ORG_ID");
            return (Criteria) this;
        }

        public Criteria andORG_IDNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "ORG_ID");
            return (Criteria) this;
        }

        public Criteria andORG_IDGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "ORG_ID");
            return (Criteria) this;
        }

        public Criteria andORG_IDGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "ORG_ID");
            return (Criteria) this;
        }

        public Criteria andORG_IDLessThan(String value) {
            addCriterion("ORG_ID <", value, "ORG_ID");
            return (Criteria) this;
        }

        public Criteria andORG_IDLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "ORG_ID");
            return (Criteria) this;
        }

        public Criteria andORG_IDLike(String value) {
            addCriterion("ORG_ID like", value, "ORG_ID");
            return (Criteria) this;
        }

        public Criteria andORG_IDNotLike(String value) {
            addCriterion("ORG_ID not like", value, "ORG_ID");
            return (Criteria) this;
        }

        public Criteria andORG_IDIn(List<String> values) {
            addCriterion("ORG_ID in", values, "ORG_ID");
            return (Criteria) this;
        }

        public Criteria andORG_IDNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "ORG_ID");
            return (Criteria) this;
        }

        public Criteria andORG_IDBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "ORG_ID");
            return (Criteria) this;
        }

        public Criteria andORG_IDNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "ORG_ID");
            return (Criteria) this;
        }

        public Criteria andPWDIsNull() {
            addCriterion("PWD is null");
            return (Criteria) this;
        }

        public Criteria andPWDIsNotNull() {
            addCriterion("PWD is not null");
            return (Criteria) this;
        }

        public Criteria andPWDEqualTo(String value) {
            addCriterion("PWD =", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDNotEqualTo(String value) {
            addCriterion("PWD <>", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDGreaterThan(String value) {
            addCriterion("PWD >", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDGreaterThanOrEqualTo(String value) {
            addCriterion("PWD >=", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDLessThan(String value) {
            addCriterion("PWD <", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDLessThanOrEqualTo(String value) {
            addCriterion("PWD <=", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDLike(String value) {
            addCriterion("PWD like", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDNotLike(String value) {
            addCriterion("PWD not like", value, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDIn(List<String> values) {
            addCriterion("PWD in", values, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDNotIn(List<String> values) {
            addCriterion("PWD not in", values, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDBetween(String value1, String value2) {
            addCriterion("PWD between", value1, value2, "PWD");
            return (Criteria) this;
        }

        public Criteria andPWDNotBetween(String value1, String value2) {
            addCriterion("PWD not between", value1, value2, "PWD");
            return (Criteria) this;
        }

        public Criteria andSHOW_ORDERIsNull() {
            addCriterion("SHOW_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andSHOW_ORDERIsNotNull() {
            addCriterion("SHOW_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andSHOW_ORDEREqualTo(Integer value) {
            addCriterion("SHOW_ORDER =", value, "SHOW_ORDER");
            return (Criteria) this;
        }

        public Criteria andSHOW_ORDERNotEqualTo(Integer value) {
            addCriterion("SHOW_ORDER <>", value, "SHOW_ORDER");
            return (Criteria) this;
        }

        public Criteria andSHOW_ORDERGreaterThan(Integer value) {
            addCriterion("SHOW_ORDER >", value, "SHOW_ORDER");
            return (Criteria) this;
        }

        public Criteria andSHOW_ORDERGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHOW_ORDER >=", value, "SHOW_ORDER");
            return (Criteria) this;
        }

        public Criteria andSHOW_ORDERLessThan(Integer value) {
            addCriterion("SHOW_ORDER <", value, "SHOW_ORDER");
            return (Criteria) this;
        }

        public Criteria andSHOW_ORDERLessThanOrEqualTo(Integer value) {
            addCriterion("SHOW_ORDER <=", value, "SHOW_ORDER");
            return (Criteria) this;
        }

        public Criteria andSHOW_ORDERIn(List<Integer> values) {
            addCriterion("SHOW_ORDER in", values, "SHOW_ORDER");
            return (Criteria) this;
        }

        public Criteria andSHOW_ORDERNotIn(List<Integer> values) {
            addCriterion("SHOW_ORDER not in", values, "SHOW_ORDER");
            return (Criteria) this;
        }

        public Criteria andSHOW_ORDERBetween(Integer value1, Integer value2) {
            addCriterion("SHOW_ORDER between", value1, value2, "SHOW_ORDER");
            return (Criteria) this;
        }

        public Criteria andSHOW_ORDERNotBetween(Integer value1, Integer value2) {
            addCriterion("SHOW_ORDER not between", value1, value2, "SHOW_ORDER");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTIsNull() {
            addCriterion("USER_POST is null");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTIsNotNull() {
            addCriterion("USER_POST is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTEqualTo(String value) {
            addCriterion("USER_POST =", value, "USER_POST");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTNotEqualTo(String value) {
            addCriterion("USER_POST <>", value, "USER_POST");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTGreaterThan(String value) {
            addCriterion("USER_POST >", value, "USER_POST");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTGreaterThanOrEqualTo(String value) {
            addCriterion("USER_POST >=", value, "USER_POST");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTLessThan(String value) {
            addCriterion("USER_POST <", value, "USER_POST");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTLessThanOrEqualTo(String value) {
            addCriterion("USER_POST <=", value, "USER_POST");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTLike(String value) {
            addCriterion("USER_POST like", value, "USER_POST");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTNotLike(String value) {
            addCriterion("USER_POST not like", value, "USER_POST");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTIn(List<String> values) {
            addCriterion("USER_POST in", values, "USER_POST");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTNotIn(List<String> values) {
            addCriterion("USER_POST not in", values, "USER_POST");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTBetween(String value1, String value2) {
            addCriterion("USER_POST between", value1, value2, "USER_POST");
            return (Criteria) this;
        }

        public Criteria andUSER_POSTNotBetween(String value1, String value2) {
            addCriterion("USER_POST not between", value1, value2, "USER_POST");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSIsNull() {
            addCriterion("USER_OFFICE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSIsNotNull() {
            addCriterion("USER_OFFICE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSEqualTo(String value) {
            addCriterion("USER_OFFICE_ADDRESS =", value, "USER_OFFICE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSNotEqualTo(String value) {
            addCriterion("USER_OFFICE_ADDRESS <>", value, "USER_OFFICE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSGreaterThan(String value) {
            addCriterion("USER_OFFICE_ADDRESS >", value, "USER_OFFICE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("USER_OFFICE_ADDRESS >=", value, "USER_OFFICE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSLessThan(String value) {
            addCriterion("USER_OFFICE_ADDRESS <", value, "USER_OFFICE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSLessThanOrEqualTo(String value) {
            addCriterion("USER_OFFICE_ADDRESS <=", value, "USER_OFFICE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSLike(String value) {
            addCriterion("USER_OFFICE_ADDRESS like", value, "USER_OFFICE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSNotLike(String value) {
            addCriterion("USER_OFFICE_ADDRESS not like", value, "USER_OFFICE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSIn(List<String> values) {
            addCriterion("USER_OFFICE_ADDRESS in", values, "USER_OFFICE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSNotIn(List<String> values) {
            addCriterion("USER_OFFICE_ADDRESS not in", values, "USER_OFFICE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSBetween(String value1, String value2) {
            addCriterion("USER_OFFICE_ADDRESS between", value1, value2, "USER_OFFICE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSER_OFFICE_ADDRESSNotBetween(String value1, String value2) {
            addCriterion("USER_OFFICE_ADDRESS not between", value1, value2, "USER_OFFICE_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLEIsNull() {
            addCriterion("USER_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLEIsNotNull() {
            addCriterion("USER_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLEEqualTo(String value) {
            addCriterion("USER_TITLE =", value, "USER_TITLE");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLENotEqualTo(String value) {
            addCriterion("USER_TITLE <>", value, "USER_TITLE");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLEGreaterThan(String value) {
            addCriterion("USER_TITLE >", value, "USER_TITLE");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLEGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TITLE >=", value, "USER_TITLE");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLELessThan(String value) {
            addCriterion("USER_TITLE <", value, "USER_TITLE");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLELessThanOrEqualTo(String value) {
            addCriterion("USER_TITLE <=", value, "USER_TITLE");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLELike(String value) {
            addCriterion("USER_TITLE like", value, "USER_TITLE");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLENotLike(String value) {
            addCriterion("USER_TITLE not like", value, "USER_TITLE");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLEIn(List<String> values) {
            addCriterion("USER_TITLE in", values, "USER_TITLE");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLENotIn(List<String> values) {
            addCriterion("USER_TITLE not in", values, "USER_TITLE");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLEBetween(String value1, String value2) {
            addCriterion("USER_TITLE between", value1, value2, "USER_TITLE");
            return (Criteria) this;
        }

        public Criteria andUSER_TITLENotBetween(String value1, String value2) {
            addCriterion("USER_TITLE not between", value1, value2, "USER_TITLE");
            return (Criteria) this;
        }

        public Criteria andCA_IDIsNull() {
            addCriterion("CA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCA_IDIsNotNull() {
            addCriterion("CA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCA_IDEqualTo(String value) {
            addCriterion("CA_ID =", value, "CA_ID");
            return (Criteria) this;
        }

        public Criteria andCA_IDNotEqualTo(String value) {
            addCriterion("CA_ID <>", value, "CA_ID");
            return (Criteria) this;
        }

        public Criteria andCA_IDGreaterThan(String value) {
            addCriterion("CA_ID >", value, "CA_ID");
            return (Criteria) this;
        }

        public Criteria andCA_IDGreaterThanOrEqualTo(String value) {
            addCriterion("CA_ID >=", value, "CA_ID");
            return (Criteria) this;
        }

        public Criteria andCA_IDLessThan(String value) {
            addCriterion("CA_ID <", value, "CA_ID");
            return (Criteria) this;
        }

        public Criteria andCA_IDLessThanOrEqualTo(String value) {
            addCriterion("CA_ID <=", value, "CA_ID");
            return (Criteria) this;
        }

        public Criteria andCA_IDLike(String value) {
            addCriterion("CA_ID like", value, "CA_ID");
            return (Criteria) this;
        }

        public Criteria andCA_IDNotLike(String value) {
            addCriterion("CA_ID not like", value, "CA_ID");
            return (Criteria) this;
        }

        public Criteria andCA_IDIn(List<String> values) {
            addCriterion("CA_ID in", values, "CA_ID");
            return (Criteria) this;
        }

        public Criteria andCA_IDNotIn(List<String> values) {
            addCriterion("CA_ID not in", values, "CA_ID");
            return (Criteria) this;
        }

        public Criteria andCA_IDBetween(String value1, String value2) {
            addCriterion("CA_ID between", value1, value2, "CA_ID");
            return (Criteria) this;
        }

        public Criteria andCA_IDNotBetween(String value1, String value2) {
            addCriterion("CA_ID not between", value1, value2, "CA_ID");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPEIsNull() {
            addCriterion("CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPEIsNotNull() {
            addCriterion("CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPEEqualTo(String value) {
            addCriterion("CERT_TYPE =", value, "CERT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPENotEqualTo(String value) {
            addCriterion("CERT_TYPE <>", value, "CERT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPEGreaterThan(String value) {
            addCriterion("CERT_TYPE >", value, "CERT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_TYPE >=", value, "CERT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPELessThan(String value) {
            addCriterion("CERT_TYPE <", value, "CERT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPELessThanOrEqualTo(String value) {
            addCriterion("CERT_TYPE <=", value, "CERT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPELike(String value) {
            addCriterion("CERT_TYPE like", value, "CERT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPENotLike(String value) {
            addCriterion("CERT_TYPE not like", value, "CERT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPEIn(List<String> values) {
            addCriterion("CERT_TYPE in", values, "CERT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPENotIn(List<String> values) {
            addCriterion("CERT_TYPE not in", values, "CERT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPEBetween(String value1, String value2) {
            addCriterion("CERT_TYPE between", value1, value2, "CERT_TYPE");
            return (Criteria) this;
        }

        public Criteria andCERT_TYPENotBetween(String value1, String value2) {
            addCriterion("CERT_TYPE not between", value1, value2, "CERT_TYPE");
            return (Criteria) this;
        }

        public Criteria andPINIsNull() {
            addCriterion("PIN is null");
            return (Criteria) this;
        }

        public Criteria andPINIsNotNull() {
            addCriterion("PIN is not null");
            return (Criteria) this;
        }

        public Criteria andPINEqualTo(String value) {
            addCriterion("PIN =", value, "PIN");
            return (Criteria) this;
        }

        public Criteria andPINNotEqualTo(String value) {
            addCriterion("PIN <>", value, "PIN");
            return (Criteria) this;
        }

        public Criteria andPINGreaterThan(String value) {
            addCriterion("PIN >", value, "PIN");
            return (Criteria) this;
        }

        public Criteria andPINGreaterThanOrEqualTo(String value) {
            addCriterion("PIN >=", value, "PIN");
            return (Criteria) this;
        }

        public Criteria andPINLessThan(String value) {
            addCriterion("PIN <", value, "PIN");
            return (Criteria) this;
        }

        public Criteria andPINLessThanOrEqualTo(String value) {
            addCriterion("PIN <=", value, "PIN");
            return (Criteria) this;
        }

        public Criteria andPINLike(String value) {
            addCriterion("PIN like", value, "PIN");
            return (Criteria) this;
        }

        public Criteria andPINNotLike(String value) {
            addCriterion("PIN not like", value, "PIN");
            return (Criteria) this;
        }

        public Criteria andPINIn(List<String> values) {
            addCriterion("PIN in", values, "PIN");
            return (Criteria) this;
        }

        public Criteria andPINNotIn(List<String> values) {
            addCriterion("PIN not in", values, "PIN");
            return (Criteria) this;
        }

        public Criteria andPINBetween(String value1, String value2) {
            addCriterion("PIN between", value1, value2, "PIN");
            return (Criteria) this;
        }

        public Criteria andPINNotBetween(String value1, String value2) {
            addCriterion("PIN not between", value1, value2, "PIN");
            return (Criteria) this;
        }

        public Criteria andIS_ACTIVEIsNull() {
            addCriterion("IS_ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIS_ACTIVEIsNotNull() {
            addCriterion("IS_ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIS_ACTIVEEqualTo(Integer value) {
            addCriterion("IS_ACTIVE =", value, "IS_ACTIVE");
            return (Criteria) this;
        }

        public Criteria andIS_ACTIVENotEqualTo(Integer value) {
            addCriterion("IS_ACTIVE <>", value, "IS_ACTIVE");
            return (Criteria) this;
        }

        public Criteria andIS_ACTIVEGreaterThan(Integer value) {
            addCriterion("IS_ACTIVE >", value, "IS_ACTIVE");
            return (Criteria) this;
        }

        public Criteria andIS_ACTIVEGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ACTIVE >=", value, "IS_ACTIVE");
            return (Criteria) this;
        }

        public Criteria andIS_ACTIVELessThan(Integer value) {
            addCriterion("IS_ACTIVE <", value, "IS_ACTIVE");
            return (Criteria) this;
        }

        public Criteria andIS_ACTIVELessThanOrEqualTo(Integer value) {
            addCriterion("IS_ACTIVE <=", value, "IS_ACTIVE");
            return (Criteria) this;
        }

        public Criteria andIS_ACTIVEIn(List<Integer> values) {
            addCriterion("IS_ACTIVE in", values, "IS_ACTIVE");
            return (Criteria) this;
        }

        public Criteria andIS_ACTIVENotIn(List<Integer> values) {
            addCriterion("IS_ACTIVE not in", values, "IS_ACTIVE");
            return (Criteria) this;
        }

        public Criteria andIS_ACTIVEBetween(Integer value1, Integer value2) {
            addCriterion("IS_ACTIVE between", value1, value2, "IS_ACTIVE");
            return (Criteria) this;
        }

        public Criteria andIS_ACTIVENotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ACTIVE not between", value1, value2, "IS_ACTIVE");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLEIsNull() {
            addCriterion("JOB_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLEIsNotNull() {
            addCriterion("JOB_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLEEqualTo(String value) {
            addCriterion("JOB_TITLE =", value, "JOB_TITLE");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLENotEqualTo(String value) {
            addCriterion("JOB_TITLE <>", value, "JOB_TITLE");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLEGreaterThan(String value) {
            addCriterion("JOB_TITLE >", value, "JOB_TITLE");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLEGreaterThanOrEqualTo(String value) {
            addCriterion("JOB_TITLE >=", value, "JOB_TITLE");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLELessThan(String value) {
            addCriterion("JOB_TITLE <", value, "JOB_TITLE");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLELessThanOrEqualTo(String value) {
            addCriterion("JOB_TITLE <=", value, "JOB_TITLE");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLELike(String value) {
            addCriterion("JOB_TITLE like", value, "JOB_TITLE");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLENotLike(String value) {
            addCriterion("JOB_TITLE not like", value, "JOB_TITLE");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLEIn(List<String> values) {
            addCriterion("JOB_TITLE in", values, "JOB_TITLE");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLENotIn(List<String> values) {
            addCriterion("JOB_TITLE not in", values, "JOB_TITLE");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLEBetween(String value1, String value2) {
            addCriterion("JOB_TITLE between", value1, value2, "JOB_TITLE");
            return (Criteria) this;
        }

        public Criteria andJOB_TITLENotBetween(String value1, String value2) {
            addCriterion("JOB_TITLE not between", value1, value2, "JOB_TITLE");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMENotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMELessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMELessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMELike(String value) {
            addCriterion("LOGIN_NAME like", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMENotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMENotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMEBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andLOGIN_NAMENotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "LOGIN_NAME");
            return (Criteria) this;
        }

        public Criteria andUSER_NOIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUSER_NOIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_NOEqualTo(String value) {
            addCriterion("USER_NO =", value, "USER_NO");
            return (Criteria) this;
        }

        public Criteria andUSER_NONotEqualTo(String value) {
            addCriterion("USER_NO <>", value, "USER_NO");
            return (Criteria) this;
        }

        public Criteria andUSER_NOGreaterThan(String value) {
            addCriterion("USER_NO >", value, "USER_NO");
            return (Criteria) this;
        }

        public Criteria andUSER_NOGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NO >=", value, "USER_NO");
            return (Criteria) this;
        }

        public Criteria andUSER_NOLessThan(String value) {
            addCriterion("USER_NO <", value, "USER_NO");
            return (Criteria) this;
        }

        public Criteria andUSER_NOLessThanOrEqualTo(String value) {
            addCriterion("USER_NO <=", value, "USER_NO");
            return (Criteria) this;
        }

        public Criteria andUSER_NOLike(String value) {
            addCriterion("USER_NO like", value, "USER_NO");
            return (Criteria) this;
        }

        public Criteria andUSER_NONotLike(String value) {
            addCriterion("USER_NO not like", value, "USER_NO");
            return (Criteria) this;
        }

        public Criteria andUSER_NOIn(List<String> values) {
            addCriterion("USER_NO in", values, "USER_NO");
            return (Criteria) this;
        }

        public Criteria andUSER_NONotIn(List<String> values) {
            addCriterion("USER_NO not in", values, "USER_NO");
            return (Criteria) this;
        }

        public Criteria andUSER_NOBetween(String value1, String value2) {
            addCriterion("USER_NO between", value1, value2, "USER_NO");
            return (Criteria) this;
        }

        public Criteria andUSER_NONotBetween(String value1, String value2) {
            addCriterion("USER_NO not between", value1, value2, "USER_NO");
            return (Criteria) this;
        }

        public Criteria andEXTINFOIsNull() {
            addCriterion("EXTINFO is null");
            return (Criteria) this;
        }

        public Criteria andEXTINFOIsNotNull() {
            addCriterion("EXTINFO is not null");
            return (Criteria) this;
        }

        public Criteria andEXTINFOEqualTo(String value) {
            addCriterion("EXTINFO =", value, "EXTINFO");
            return (Criteria) this;
        }

        public Criteria andEXTINFONotEqualTo(String value) {
            addCriterion("EXTINFO <>", value, "EXTINFO");
            return (Criteria) this;
        }

        public Criteria andEXTINFOGreaterThan(String value) {
            addCriterion("EXTINFO >", value, "EXTINFO");
            return (Criteria) this;
        }

        public Criteria andEXTINFOGreaterThanOrEqualTo(String value) {
            addCriterion("EXTINFO >=", value, "EXTINFO");
            return (Criteria) this;
        }

        public Criteria andEXTINFOLessThan(String value) {
            addCriterion("EXTINFO <", value, "EXTINFO");
            return (Criteria) this;
        }

        public Criteria andEXTINFOLessThanOrEqualTo(String value) {
            addCriterion("EXTINFO <=", value, "EXTINFO");
            return (Criteria) this;
        }

        public Criteria andEXTINFOLike(String value) {
            addCriterion("EXTINFO like", value, "EXTINFO");
            return (Criteria) this;
        }

        public Criteria andEXTINFONotLike(String value) {
            addCriterion("EXTINFO not like", value, "EXTINFO");
            return (Criteria) this;
        }

        public Criteria andEXTINFOIn(List<String> values) {
            addCriterion("EXTINFO in", values, "EXTINFO");
            return (Criteria) this;
        }

        public Criteria andEXTINFONotIn(List<String> values) {
            addCriterion("EXTINFO not in", values, "EXTINFO");
            return (Criteria) this;
        }

        public Criteria andEXTINFOBetween(String value1, String value2) {
            addCriterion("EXTINFO between", value1, value2, "EXTINFO");
            return (Criteria) this;
        }

        public Criteria andEXTINFONotBetween(String value1, String value2) {
            addCriterion("EXTINFO not between", value1, value2, "EXTINFO");
            return (Criteria) this;
        }

        public Criteria andNUSER_HIREDATEIsNull() {
            addCriterion("NUSER_HIREDATE is null");
            return (Criteria) this;
        }

        public Criteria andNUSER_HIREDATEIsNotNull() {
            addCriterion("NUSER_HIREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andNUSER_HIREDATEEqualTo(Date value) {
            addCriterion("NUSER_HIREDATE =", value, "NUSER_HIREDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_HIREDATENotEqualTo(Date value) {
            addCriterion("NUSER_HIREDATE <>", value, "NUSER_HIREDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_HIREDATEGreaterThan(Date value) {
            addCriterion("NUSER_HIREDATE >", value, "NUSER_HIREDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_HIREDATEGreaterThanOrEqualTo(Date value) {
            addCriterion("NUSER_HIREDATE >=", value, "NUSER_HIREDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_HIREDATELessThan(Date value) {
            addCriterion("NUSER_HIREDATE <", value, "NUSER_HIREDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_HIREDATELessThanOrEqualTo(Date value) {
            addCriterion("NUSER_HIREDATE <=", value, "NUSER_HIREDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_HIREDATEIn(List<Date> values) {
            addCriterion("NUSER_HIREDATE in", values, "NUSER_HIREDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_HIREDATENotIn(List<Date> values) {
            addCriterion("NUSER_HIREDATE not in", values, "NUSER_HIREDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_HIREDATEBetween(Date value1, Date value2) {
            addCriterion("NUSER_HIREDATE between", value1, value2, "NUSER_HIREDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_HIREDATENotBetween(Date value1, Date value2) {
            addCriterion("NUSER_HIREDATE not between", value1, value2, "NUSER_HIREDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_LEAVEDATEIsNull() {
            addCriterion("NUSER_LEAVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andNUSER_LEAVEDATEIsNotNull() {
            addCriterion("NUSER_LEAVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andNUSER_LEAVEDATEEqualTo(Date value) {
            addCriterion("NUSER_LEAVEDATE =", value, "NUSER_LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_LEAVEDATENotEqualTo(Date value) {
            addCriterion("NUSER_LEAVEDATE <>", value, "NUSER_LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_LEAVEDATEGreaterThan(Date value) {
            addCriterion("NUSER_LEAVEDATE >", value, "NUSER_LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_LEAVEDATEGreaterThanOrEqualTo(Date value) {
            addCriterion("NUSER_LEAVEDATE >=", value, "NUSER_LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_LEAVEDATELessThan(Date value) {
            addCriterion("NUSER_LEAVEDATE <", value, "NUSER_LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_LEAVEDATELessThanOrEqualTo(Date value) {
            addCriterion("NUSER_LEAVEDATE <=", value, "NUSER_LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_LEAVEDATEIn(List<Date> values) {
            addCriterion("NUSER_LEAVEDATE in", values, "NUSER_LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_LEAVEDATENotIn(List<Date> values) {
            addCriterion("NUSER_LEAVEDATE not in", values, "NUSER_LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_LEAVEDATEBetween(Date value1, Date value2) {
            addCriterion("NUSER_LEAVEDATE between", value1, value2, "NUSER_LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andNUSER_LEAVEDATENotBetween(Date value1, Date value2) {
            addCriterion("NUSER_LEAVEDATE not between", value1, value2, "NUSER_LEAVEDATE");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONIsNull() {
            addCriterion("LEAVE_REASON is null");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONIsNotNull() {
            addCriterion("LEAVE_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONEqualTo(String value) {
            addCriterion("LEAVE_REASON =", value, "LEAVE_REASON");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONNotEqualTo(String value) {
            addCriterion("LEAVE_REASON <>", value, "LEAVE_REASON");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONGreaterThan(String value) {
            addCriterion("LEAVE_REASON >", value, "LEAVE_REASON");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_REASON >=", value, "LEAVE_REASON");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONLessThan(String value) {
            addCriterion("LEAVE_REASON <", value, "LEAVE_REASON");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_REASON <=", value, "LEAVE_REASON");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONLike(String value) {
            addCriterion("LEAVE_REASON like", value, "LEAVE_REASON");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONNotLike(String value) {
            addCriterion("LEAVE_REASON not like", value, "LEAVE_REASON");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONIn(List<String> values) {
            addCriterion("LEAVE_REASON in", values, "LEAVE_REASON");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONNotIn(List<String> values) {
            addCriterion("LEAVE_REASON not in", values, "LEAVE_REASON");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONBetween(String value1, String value2) {
            addCriterion("LEAVE_REASON between", value1, value2, "LEAVE_REASON");
            return (Criteria) this;
        }

        public Criteria andLEAVE_REASONNotBetween(String value1, String value2) {
            addCriterion("LEAVE_REASON not between", value1, value2, "LEAVE_REASON");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYEqualTo(String value) {
            addCriterion("COUNTRY =", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYLessThan(String value) {
            addCriterion("COUNTRY <", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYLike(String value) {
            addCriterion("COUNTRY like", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYNotLike(String value) {
            addCriterion("COUNTRY not like", value, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYIn(List<String> values) {
            addCriterion("COUNTRY in", values, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andCOUNTRYNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "COUNTRY");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELIsNull() {
            addCriterion("PRIVACY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELIsNotNull() {
            addCriterion("PRIVACY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELEqualTo(String value) {
            addCriterion("PRIVACY_LEVEL =", value, "PRIVACY_LEVEL");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELNotEqualTo(String value) {
            addCriterion("PRIVACY_LEVEL <>", value, "PRIVACY_LEVEL");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELGreaterThan(String value) {
            addCriterion("PRIVACY_LEVEL >", value, "PRIVACY_LEVEL");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVACY_LEVEL >=", value, "PRIVACY_LEVEL");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELLessThan(String value) {
            addCriterion("PRIVACY_LEVEL <", value, "PRIVACY_LEVEL");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELLessThanOrEqualTo(String value) {
            addCriterion("PRIVACY_LEVEL <=", value, "PRIVACY_LEVEL");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELLike(String value) {
            addCriterion("PRIVACY_LEVEL like", value, "PRIVACY_LEVEL");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELNotLike(String value) {
            addCriterion("PRIVACY_LEVEL not like", value, "PRIVACY_LEVEL");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELIn(List<String> values) {
            addCriterion("PRIVACY_LEVEL in", values, "PRIVACY_LEVEL");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELNotIn(List<String> values) {
            addCriterion("PRIVACY_LEVEL not in", values, "PRIVACY_LEVEL");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELBetween(String value1, String value2) {
            addCriterion("PRIVACY_LEVEL between", value1, value2, "PRIVACY_LEVEL");
            return (Criteria) this;
        }

        public Criteria andPRIVACY_LEVELNotBetween(String value1, String value2) {
            addCriterion("PRIVACY_LEVEL not between", value1, value2, "PRIVACY_LEVEL");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDLessThan(String value) {
            addCriterion("TENANT_ID <", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDLike(String value) {
            addCriterion("TENANT_ID like", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andTENANT_IDNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "TENANT_ID");
            return (Criteria) this;
        }

        public Criteria andEXTIsNull() {
            addCriterion("EXT is null");
            return (Criteria) this;
        }

        public Criteria andEXTIsNotNull() {
            addCriterion("EXT is not null");
            return (Criteria) this;
        }

        public Criteria andEXTEqualTo(String value) {
            addCriterion("EXT =", value, "EXT");
            return (Criteria) this;
        }

        public Criteria andEXTNotEqualTo(String value) {
            addCriterion("EXT <>", value, "EXT");
            return (Criteria) this;
        }

        public Criteria andEXTGreaterThan(String value) {
            addCriterion("EXT >", value, "EXT");
            return (Criteria) this;
        }

        public Criteria andEXTGreaterThanOrEqualTo(String value) {
            addCriterion("EXT >=", value, "EXT");
            return (Criteria) this;
        }

        public Criteria andEXTLessThan(String value) {
            addCriterion("EXT <", value, "EXT");
            return (Criteria) this;
        }

        public Criteria andEXTLessThanOrEqualTo(String value) {
            addCriterion("EXT <=", value, "EXT");
            return (Criteria) this;
        }

        public Criteria andEXTLike(String value) {
            addCriterion("EXT like", value, "EXT");
            return (Criteria) this;
        }

        public Criteria andEXTNotLike(String value) {
            addCriterion("EXT not like", value, "EXT");
            return (Criteria) this;
        }

        public Criteria andEXTIn(List<String> values) {
            addCriterion("EXT in", values, "EXT");
            return (Criteria) this;
        }

        public Criteria andEXTNotIn(List<String> values) {
            addCriterion("EXT not in", values, "EXT");
            return (Criteria) this;
        }

        public Criteria andEXTBetween(String value1, String value2) {
            addCriterion("EXT between", value1, value2, "EXT");
            return (Criteria) this;
        }

        public Criteria andEXTNotBetween(String value1, String value2) {
            addCriterion("EXT not between", value1, value2, "EXT");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMEIsNull() {
            addCriterion("USER_SANAME is null");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMEIsNotNull() {
            addCriterion("USER_SANAME is not null");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMEEqualTo(String value) {
            addCriterion("USER_SANAME =", value, "USER_SANAME");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMENotEqualTo(String value) {
            addCriterion("USER_SANAME <>", value, "USER_SANAME");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMEGreaterThan(String value) {
            addCriterion("USER_SANAME >", value, "USER_SANAME");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMEGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SANAME >=", value, "USER_SANAME");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMELessThan(String value) {
            addCriterion("USER_SANAME <", value, "USER_SANAME");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMELessThanOrEqualTo(String value) {
            addCriterion("USER_SANAME <=", value, "USER_SANAME");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMELike(String value) {
            addCriterion("USER_SANAME like", value, "USER_SANAME");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMENotLike(String value) {
            addCriterion("USER_SANAME not like", value, "USER_SANAME");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMEIn(List<String> values) {
            addCriterion("USER_SANAME in", values, "USER_SANAME");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMENotIn(List<String> values) {
            addCriterion("USER_SANAME not in", values, "USER_SANAME");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMEBetween(String value1, String value2) {
            addCriterion("USER_SANAME between", value1, value2, "USER_SANAME");
            return (Criteria) this;
        }

        public Criteria andUSER_SANAMENotBetween(String value1, String value2) {
            addCriterion("USER_SANAME not between", value1, value2, "USER_SANAME");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGIsNull() {
            addCriterion("IS_MAIN_JOB_ORG is null");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGIsNotNull() {
            addCriterion("IS_MAIN_JOB_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGEqualTo(String value) {
            addCriterion("IS_MAIN_JOB_ORG =", value, "IS_MAIN_JOB_ORG");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGNotEqualTo(String value) {
            addCriterion("IS_MAIN_JOB_ORG <>", value, "IS_MAIN_JOB_ORG");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGGreaterThan(String value) {
            addCriterion("IS_MAIN_JOB_ORG >", value, "IS_MAIN_JOB_ORG");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGGreaterThanOrEqualTo(String value) {
            addCriterion("IS_MAIN_JOB_ORG >=", value, "IS_MAIN_JOB_ORG");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGLessThan(String value) {
            addCriterion("IS_MAIN_JOB_ORG <", value, "IS_MAIN_JOB_ORG");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGLessThanOrEqualTo(String value) {
            addCriterion("IS_MAIN_JOB_ORG <=", value, "IS_MAIN_JOB_ORG");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGLike(String value) {
            addCriterion("IS_MAIN_JOB_ORG like", value, "IS_MAIN_JOB_ORG");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGNotLike(String value) {
            addCriterion("IS_MAIN_JOB_ORG not like", value, "IS_MAIN_JOB_ORG");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGIn(List<String> values) {
            addCriterion("IS_MAIN_JOB_ORG in", values, "IS_MAIN_JOB_ORG");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGNotIn(List<String> values) {
            addCriterion("IS_MAIN_JOB_ORG not in", values, "IS_MAIN_JOB_ORG");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGBetween(String value1, String value2) {
            addCriterion("IS_MAIN_JOB_ORG between", value1, value2, "IS_MAIN_JOB_ORG");
            return (Criteria) this;
        }

        public Criteria andIS_MAIN_JOB_ORGNotBetween(String value1, String value2) {
            addCriterion("IS_MAIN_JOB_ORG not between", value1, value2, "IS_MAIN_JOB_ORG");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYIsNull() {
            addCriterion("GROUP_JOB_DUTY is null");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYIsNotNull() {
            addCriterion("GROUP_JOB_DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYEqualTo(String value) {
            addCriterion("GROUP_JOB_DUTY =", value, "GROUP_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYNotEqualTo(String value) {
            addCriterion("GROUP_JOB_DUTY <>", value, "GROUP_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYGreaterThan(String value) {
            addCriterion("GROUP_JOB_DUTY >", value, "GROUP_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_JOB_DUTY >=", value, "GROUP_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYLessThan(String value) {
            addCriterion("GROUP_JOB_DUTY <", value, "GROUP_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYLessThanOrEqualTo(String value) {
            addCriterion("GROUP_JOB_DUTY <=", value, "GROUP_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYLike(String value) {
            addCriterion("GROUP_JOB_DUTY like", value, "GROUP_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYNotLike(String value) {
            addCriterion("GROUP_JOB_DUTY not like", value, "GROUP_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYIn(List<String> values) {
            addCriterion("GROUP_JOB_DUTY in", values, "GROUP_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYNotIn(List<String> values) {
            addCriterion("GROUP_JOB_DUTY not in", values, "GROUP_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYBetween(String value1, String value2) {
            addCriterion("GROUP_JOB_DUTY between", value1, value2, "GROUP_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andGROUP_JOB_DUTYNotBetween(String value1, String value2) {
            addCriterion("GROUP_JOB_DUTY not between", value1, value2, "GROUP_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMEIsNull() {
            addCriterion("ORG_FULL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMEIsNotNull() {
            addCriterion("ORG_FULL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMEEqualTo(String value) {
            addCriterion("ORG_FULL_NAME =", value, "ORG_FULL_NAME");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMENotEqualTo(String value) {
            addCriterion("ORG_FULL_NAME <>", value, "ORG_FULL_NAME");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMEGreaterThan(String value) {
            addCriterion("ORG_FULL_NAME >", value, "ORG_FULL_NAME");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_FULL_NAME >=", value, "ORG_FULL_NAME");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMELessThan(String value) {
            addCriterion("ORG_FULL_NAME <", value, "ORG_FULL_NAME");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMELessThanOrEqualTo(String value) {
            addCriterion("ORG_FULL_NAME <=", value, "ORG_FULL_NAME");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMELike(String value) {
            addCriterion("ORG_FULL_NAME like", value, "ORG_FULL_NAME");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMENotLike(String value) {
            addCriterion("ORG_FULL_NAME not like", value, "ORG_FULL_NAME");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMEIn(List<String> values) {
            addCriterion("ORG_FULL_NAME in", values, "ORG_FULL_NAME");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMENotIn(List<String> values) {
            addCriterion("ORG_FULL_NAME not in", values, "ORG_FULL_NAME");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMEBetween(String value1, String value2) {
            addCriterion("ORG_FULL_NAME between", value1, value2, "ORG_FULL_NAME");
            return (Criteria) this;
        }

        public Criteria andORG_FULL_NAMENotBetween(String value1, String value2) {
            addCriterion("ORG_FULL_NAME not between", value1, value2, "ORG_FULL_NAME");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYIsNull() {
            addCriterion("ORG_JOB_DUTY is null");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYIsNotNull() {
            addCriterion("ORG_JOB_DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYEqualTo(String value) {
            addCriterion("ORG_JOB_DUTY =", value, "ORG_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYNotEqualTo(String value) {
            addCriterion("ORG_JOB_DUTY <>", value, "ORG_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYGreaterThan(String value) {
            addCriterion("ORG_JOB_DUTY >", value, "ORG_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_JOB_DUTY >=", value, "ORG_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYLessThan(String value) {
            addCriterion("ORG_JOB_DUTY <", value, "ORG_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYLessThanOrEqualTo(String value) {
            addCriterion("ORG_JOB_DUTY <=", value, "ORG_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYLike(String value) {
            addCriterion("ORG_JOB_DUTY like", value, "ORG_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYNotLike(String value) {
            addCriterion("ORG_JOB_DUTY not like", value, "ORG_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYIn(List<String> values) {
            addCriterion("ORG_JOB_DUTY in", values, "ORG_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYNotIn(List<String> values) {
            addCriterion("ORG_JOB_DUTY not in", values, "ORG_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYBetween(String value1, String value2) {
            addCriterion("ORG_JOB_DUTY between", value1, value2, "ORG_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andORG_JOB_DUTYNotBetween(String value1, String value2) {
            addCriterion("ORG_JOB_DUTY not between", value1, value2, "ORG_JOB_DUTY");
            return (Criteria) this;
        }

        public Criteria andNODE_IDIsNull() {
            addCriterion("NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNODE_IDIsNotNull() {
            addCriterion("NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNODE_IDEqualTo(String value) {
            addCriterion("NODE_ID =", value, "NODE_ID");
            return (Criteria) this;
        }

        public Criteria andNODE_IDNotEqualTo(String value) {
            addCriterion("NODE_ID <>", value, "NODE_ID");
            return (Criteria) this;
        }

        public Criteria andNODE_IDGreaterThan(String value) {
            addCriterion("NODE_ID >", value, "NODE_ID");
            return (Criteria) this;
        }

        public Criteria andNODE_IDGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_ID >=", value, "NODE_ID");
            return (Criteria) this;
        }

        public Criteria andNODE_IDLessThan(String value) {
            addCriterion("NODE_ID <", value, "NODE_ID");
            return (Criteria) this;
        }

        public Criteria andNODE_IDLessThanOrEqualTo(String value) {
            addCriterion("NODE_ID <=", value, "NODE_ID");
            return (Criteria) this;
        }

        public Criteria andNODE_IDLike(String value) {
            addCriterion("NODE_ID like", value, "NODE_ID");
            return (Criteria) this;
        }

        public Criteria andNODE_IDNotLike(String value) {
            addCriterion("NODE_ID not like", value, "NODE_ID");
            return (Criteria) this;
        }

        public Criteria andNODE_IDIn(List<String> values) {
            addCriterion("NODE_ID in", values, "NODE_ID");
            return (Criteria) this;
        }

        public Criteria andNODE_IDNotIn(List<String> values) {
            addCriterion("NODE_ID not in", values, "NODE_ID");
            return (Criteria) this;
        }

        public Criteria andNODE_IDBetween(String value1, String value2) {
            addCriterion("NODE_ID between", value1, value2, "NODE_ID");
            return (Criteria) this;
        }

        public Criteria andNODE_IDNotBetween(String value1, String value2) {
            addCriterion("NODE_ID not between", value1, value2, "NODE_ID");
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