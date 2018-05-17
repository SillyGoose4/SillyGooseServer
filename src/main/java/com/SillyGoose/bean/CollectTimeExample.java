package com.SillyGoose.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectTimeExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSunLasttimeIsNull() {
            addCriterion("sun_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andSunLasttimeIsNotNull() {
            addCriterion("sun_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andSunLasttimeEqualTo(Date value) {
            addCriterion("sun_lasttime =", value, "sunLasttime");
            return (Criteria) this;
        }

        public Criteria andSunLasttimeNotEqualTo(Date value) {
            addCriterion("sun_lasttime <>", value, "sunLasttime");
            return (Criteria) this;
        }

        public Criteria andSunLasttimeGreaterThan(Date value) {
            addCriterion("sun_lasttime >", value, "sunLasttime");
            return (Criteria) this;
        }

        public Criteria andSunLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sun_lasttime >=", value, "sunLasttime");
            return (Criteria) this;
        }

        public Criteria andSunLasttimeLessThan(Date value) {
            addCriterion("sun_lasttime <", value, "sunLasttime");
            return (Criteria) this;
        }

        public Criteria andSunLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("sun_lasttime <=", value, "sunLasttime");
            return (Criteria) this;
        }

        public Criteria andSunLasttimeIn(List<Date> values) {
            addCriterion("sun_lasttime in", values, "sunLasttime");
            return (Criteria) this;
        }

        public Criteria andSunLasttimeNotIn(List<Date> values) {
            addCriterion("sun_lasttime not in", values, "sunLasttime");
            return (Criteria) this;
        }

        public Criteria andSunLasttimeBetween(Date value1, Date value2) {
            addCriterion("sun_lasttime between", value1, value2, "sunLasttime");
            return (Criteria) this;
        }

        public Criteria andSunLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("sun_lasttime not between", value1, value2, "sunLasttime");
            return (Criteria) this;
        }

        public Criteria andSnowLasttimeIsNull() {
            addCriterion("snow_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andSnowLasttimeIsNotNull() {
            addCriterion("snow_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andSnowLasttimeEqualTo(Date value) {
            addCriterion("snow_lasttime =", value, "snowLasttime");
            return (Criteria) this;
        }

        public Criteria andSnowLasttimeNotEqualTo(Date value) {
            addCriterion("snow_lasttime <>", value, "snowLasttime");
            return (Criteria) this;
        }

        public Criteria andSnowLasttimeGreaterThan(Date value) {
            addCriterion("snow_lasttime >", value, "snowLasttime");
            return (Criteria) this;
        }

        public Criteria andSnowLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("snow_lasttime >=", value, "snowLasttime");
            return (Criteria) this;
        }

        public Criteria andSnowLasttimeLessThan(Date value) {
            addCriterion("snow_lasttime <", value, "snowLasttime");
            return (Criteria) this;
        }

        public Criteria andSnowLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("snow_lasttime <=", value, "snowLasttime");
            return (Criteria) this;
        }

        public Criteria andSnowLasttimeIn(List<Date> values) {
            addCriterion("snow_lasttime in", values, "snowLasttime");
            return (Criteria) this;
        }

        public Criteria andSnowLasttimeNotIn(List<Date> values) {
            addCriterion("snow_lasttime not in", values, "snowLasttime");
            return (Criteria) this;
        }

        public Criteria andSnowLasttimeBetween(Date value1, Date value2) {
            addCriterion("snow_lasttime between", value1, value2, "snowLasttime");
            return (Criteria) this;
        }

        public Criteria andSnowLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("snow_lasttime not between", value1, value2, "snowLasttime");
            return (Criteria) this;
        }

        public Criteria andRainLasttimeIsNull() {
            addCriterion("rain_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andRainLasttimeIsNotNull() {
            addCriterion("rain_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andRainLasttimeEqualTo(Date value) {
            addCriterion("rain_lasttime =", value, "rainLasttime");
            return (Criteria) this;
        }

        public Criteria andRainLasttimeNotEqualTo(Date value) {
            addCriterion("rain_lasttime <>", value, "rainLasttime");
            return (Criteria) this;
        }

        public Criteria andRainLasttimeGreaterThan(Date value) {
            addCriterion("rain_lasttime >", value, "rainLasttime");
            return (Criteria) this;
        }

        public Criteria andRainLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("rain_lasttime >=", value, "rainLasttime");
            return (Criteria) this;
        }

        public Criteria andRainLasttimeLessThan(Date value) {
            addCriterion("rain_lasttime <", value, "rainLasttime");
            return (Criteria) this;
        }

        public Criteria andRainLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("rain_lasttime <=", value, "rainLasttime");
            return (Criteria) this;
        }

        public Criteria andRainLasttimeIn(List<Date> values) {
            addCriterion("rain_lasttime in", values, "rainLasttime");
            return (Criteria) this;
        }

        public Criteria andRainLasttimeNotIn(List<Date> values) {
            addCriterion("rain_lasttime not in", values, "rainLasttime");
            return (Criteria) this;
        }

        public Criteria andRainLasttimeBetween(Date value1, Date value2) {
            addCriterion("rain_lasttime between", value1, value2, "rainLasttime");
            return (Criteria) this;
        }

        public Criteria andRainLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("rain_lasttime not between", value1, value2, "rainLasttime");
            return (Criteria) this;
        }

        public Criteria andDevilLasttimeIsNull() {
            addCriterion("devil_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andDevilLasttimeIsNotNull() {
            addCriterion("devil_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andDevilLasttimeEqualTo(Date value) {
            addCriterion("devil_lasttime =", value, "devilLasttime");
            return (Criteria) this;
        }

        public Criteria andDevilLasttimeNotEqualTo(Date value) {
            addCriterion("devil_lasttime <>", value, "devilLasttime");
            return (Criteria) this;
        }

        public Criteria andDevilLasttimeGreaterThan(Date value) {
            addCriterion("devil_lasttime >", value, "devilLasttime");
            return (Criteria) this;
        }

        public Criteria andDevilLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("devil_lasttime >=", value, "devilLasttime");
            return (Criteria) this;
        }

        public Criteria andDevilLasttimeLessThan(Date value) {
            addCriterion("devil_lasttime <", value, "devilLasttime");
            return (Criteria) this;
        }

        public Criteria andDevilLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("devil_lasttime <=", value, "devilLasttime");
            return (Criteria) this;
        }

        public Criteria andDevilLasttimeIn(List<Date> values) {
            addCriterion("devil_lasttime in", values, "devilLasttime");
            return (Criteria) this;
        }

        public Criteria andDevilLasttimeNotIn(List<Date> values) {
            addCriterion("devil_lasttime not in", values, "devilLasttime");
            return (Criteria) this;
        }

        public Criteria andDevilLasttimeBetween(Date value1, Date value2) {
            addCriterion("devil_lasttime between", value1, value2, "devilLasttime");
            return (Criteria) this;
        }

        public Criteria andDevilLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("devil_lasttime not between", value1, value2, "devilLasttime");
            return (Criteria) this;
        }

        public Criteria andWindLasttimeIsNull() {
            addCriterion("wind_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andWindLasttimeIsNotNull() {
            addCriterion("wind_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andWindLasttimeEqualTo(Date value) {
            addCriterion("wind_lasttime =", value, "windLasttime");
            return (Criteria) this;
        }

        public Criteria andWindLasttimeNotEqualTo(Date value) {
            addCriterion("wind_lasttime <>", value, "windLasttime");
            return (Criteria) this;
        }

        public Criteria andWindLasttimeGreaterThan(Date value) {
            addCriterion("wind_lasttime >", value, "windLasttime");
            return (Criteria) this;
        }

        public Criteria andWindLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("wind_lasttime >=", value, "windLasttime");
            return (Criteria) this;
        }

        public Criteria andWindLasttimeLessThan(Date value) {
            addCriterion("wind_lasttime <", value, "windLasttime");
            return (Criteria) this;
        }

        public Criteria andWindLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("wind_lasttime <=", value, "windLasttime");
            return (Criteria) this;
        }

        public Criteria andWindLasttimeIn(List<Date> values) {
            addCriterion("wind_lasttime in", values, "windLasttime");
            return (Criteria) this;
        }

        public Criteria andWindLasttimeNotIn(List<Date> values) {
            addCriterion("wind_lasttime not in", values, "windLasttime");
            return (Criteria) this;
        }

        public Criteria andWindLasttimeBetween(Date value1, Date value2) {
            addCriterion("wind_lasttime between", value1, value2, "windLasttime");
            return (Criteria) this;
        }

        public Criteria andWindLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("wind_lasttime not between", value1, value2, "windLasttime");
            return (Criteria) this;
        }

        public Criteria andStarLasttimeIsNull() {
            addCriterion("star_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andStarLasttimeIsNotNull() {
            addCriterion("star_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarLasttimeEqualTo(Date value) {
            addCriterion("star_lasttime =", value, "starLasttime");
            return (Criteria) this;
        }

        public Criteria andStarLasttimeNotEqualTo(Date value) {
            addCriterion("star_lasttime <>", value, "starLasttime");
            return (Criteria) this;
        }

        public Criteria andStarLasttimeGreaterThan(Date value) {
            addCriterion("star_lasttime >", value, "starLasttime");
            return (Criteria) this;
        }

        public Criteria andStarLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("star_lasttime >=", value, "starLasttime");
            return (Criteria) this;
        }

        public Criteria andStarLasttimeLessThan(Date value) {
            addCriterion("star_lasttime <", value, "starLasttime");
            return (Criteria) this;
        }

        public Criteria andStarLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("star_lasttime <=", value, "starLasttime");
            return (Criteria) this;
        }

        public Criteria andStarLasttimeIn(List<Date> values) {
            addCriterion("star_lasttime in", values, "starLasttime");
            return (Criteria) this;
        }

        public Criteria andStarLasttimeNotIn(List<Date> values) {
            addCriterion("star_lasttime not in", values, "starLasttime");
            return (Criteria) this;
        }

        public Criteria andStarLasttimeBetween(Date value1, Date value2) {
            addCriterion("star_lasttime between", value1, value2, "starLasttime");
            return (Criteria) this;
        }

        public Criteria andStarLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("star_lasttime not between", value1, value2, "starLasttime");
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