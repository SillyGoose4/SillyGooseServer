package com.SillyGoose.bean;

import java.util.ArrayList;
import java.util.List;

public class GooseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GooseExample() {
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

        public Criteria andGooseEnyIsNull() {
            addCriterion("goose_eny is null");
            return (Criteria) this;
        }

        public Criteria andGooseEnyIsNotNull() {
            addCriterion("goose_eny is not null");
            return (Criteria) this;
        }

        public Criteria andGooseEnyEqualTo(Integer value) {
            addCriterion("goose_eny =", value, "gooseEny");
            return (Criteria) this;
        }

        public Criteria andGooseEnyNotEqualTo(Integer value) {
            addCriterion("goose_eny <>", value, "gooseEny");
            return (Criteria) this;
        }

        public Criteria andGooseEnyGreaterThan(Integer value) {
            addCriterion("goose_eny >", value, "gooseEny");
            return (Criteria) this;
        }

        public Criteria andGooseEnyGreaterThanOrEqualTo(Integer value) {
            addCriterion("goose_eny >=", value, "gooseEny");
            return (Criteria) this;
        }

        public Criteria andGooseEnyLessThan(Integer value) {
            addCriterion("goose_eny <", value, "gooseEny");
            return (Criteria) this;
        }

        public Criteria andGooseEnyLessThanOrEqualTo(Integer value) {
            addCriterion("goose_eny <=", value, "gooseEny");
            return (Criteria) this;
        }

        public Criteria andGooseEnyIn(List<Integer> values) {
            addCriterion("goose_eny in", values, "gooseEny");
            return (Criteria) this;
        }

        public Criteria andGooseEnyNotIn(List<Integer> values) {
            addCriterion("goose_eny not in", values, "gooseEny");
            return (Criteria) this;
        }

        public Criteria andGooseEnyBetween(Integer value1, Integer value2) {
            addCriterion("goose_eny between", value1, value2, "gooseEny");
            return (Criteria) this;
        }

        public Criteria andGooseEnyNotBetween(Integer value1, Integer value2) {
            addCriterion("goose_eny not between", value1, value2, "gooseEny");
            return (Criteria) this;
        }

        public Criteria andGooseMapIsNull() {
            addCriterion("goose_map is null");
            return (Criteria) this;
        }

        public Criteria andGooseMapIsNotNull() {
            addCriterion("goose_map is not null");
            return (Criteria) this;
        }

        public Criteria andGooseMapEqualTo(Integer value) {
            addCriterion("goose_map =", value, "gooseMap");
            return (Criteria) this;
        }

        public Criteria andGooseMapNotEqualTo(Integer value) {
            addCriterion("goose_map <>", value, "gooseMap");
            return (Criteria) this;
        }

        public Criteria andGooseMapGreaterThan(Integer value) {
            addCriterion("goose_map >", value, "gooseMap");
            return (Criteria) this;
        }

        public Criteria andGooseMapGreaterThanOrEqualTo(Integer value) {
            addCriterion("goose_map >=", value, "gooseMap");
            return (Criteria) this;
        }

        public Criteria andGooseMapLessThan(Integer value) {
            addCriterion("goose_map <", value, "gooseMap");
            return (Criteria) this;
        }

        public Criteria andGooseMapLessThanOrEqualTo(Integer value) {
            addCriterion("goose_map <=", value, "gooseMap");
            return (Criteria) this;
        }

        public Criteria andGooseMapIn(List<Integer> values) {
            addCriterion("goose_map in", values, "gooseMap");
            return (Criteria) this;
        }

        public Criteria andGooseMapNotIn(List<Integer> values) {
            addCriterion("goose_map not in", values, "gooseMap");
            return (Criteria) this;
        }

        public Criteria andGooseMapBetween(Integer value1, Integer value2) {
            addCriterion("goose_map between", value1, value2, "gooseMap");
            return (Criteria) this;
        }

        public Criteria andGooseMapNotBetween(Integer value1, Integer value2) {
            addCriterion("goose_map not between", value1, value2, "gooseMap");
            return (Criteria) this;
        }

        public Criteria andGooseSunIsNull() {
            addCriterion("goose_sun is null");
            return (Criteria) this;
        }

        public Criteria andGooseSunIsNotNull() {
            addCriterion("goose_sun is not null");
            return (Criteria) this;
        }

        public Criteria andGooseSunEqualTo(Integer value) {
            addCriterion("goose_sun =", value, "gooseSun");
            return (Criteria) this;
        }

        public Criteria andGooseSunNotEqualTo(Integer value) {
            addCriterion("goose_sun <>", value, "gooseSun");
            return (Criteria) this;
        }

        public Criteria andGooseSunGreaterThan(Integer value) {
            addCriterion("goose_sun >", value, "gooseSun");
            return (Criteria) this;
        }

        public Criteria andGooseSunGreaterThanOrEqualTo(Integer value) {
            addCriterion("goose_sun >=", value, "gooseSun");
            return (Criteria) this;
        }

        public Criteria andGooseSunLessThan(Integer value) {
            addCriterion("goose_sun <", value, "gooseSun");
            return (Criteria) this;
        }

        public Criteria andGooseSunLessThanOrEqualTo(Integer value) {
            addCriterion("goose_sun <=", value, "gooseSun");
            return (Criteria) this;
        }

        public Criteria andGooseSunIn(List<Integer> values) {
            addCriterion("goose_sun in", values, "gooseSun");
            return (Criteria) this;
        }

        public Criteria andGooseSunNotIn(List<Integer> values) {
            addCriterion("goose_sun not in", values, "gooseSun");
            return (Criteria) this;
        }

        public Criteria andGooseSunBetween(Integer value1, Integer value2) {
            addCriterion("goose_sun between", value1, value2, "gooseSun");
            return (Criteria) this;
        }

        public Criteria andGooseSunNotBetween(Integer value1, Integer value2) {
            addCriterion("goose_sun not between", value1, value2, "gooseSun");
            return (Criteria) this;
        }

        public Criteria andGooseSnowIsNull() {
            addCriterion("goose_snow is null");
            return (Criteria) this;
        }

        public Criteria andGooseSnowIsNotNull() {
            addCriterion("goose_snow is not null");
            return (Criteria) this;
        }

        public Criteria andGooseSnowEqualTo(Integer value) {
            addCriterion("goose_snow =", value, "gooseSnow");
            return (Criteria) this;
        }

        public Criteria andGooseSnowNotEqualTo(Integer value) {
            addCriterion("goose_snow <>", value, "gooseSnow");
            return (Criteria) this;
        }

        public Criteria andGooseSnowGreaterThan(Integer value) {
            addCriterion("goose_snow >", value, "gooseSnow");
            return (Criteria) this;
        }

        public Criteria andGooseSnowGreaterThanOrEqualTo(Integer value) {
            addCriterion("goose_snow >=", value, "gooseSnow");
            return (Criteria) this;
        }

        public Criteria andGooseSnowLessThan(Integer value) {
            addCriterion("goose_snow <", value, "gooseSnow");
            return (Criteria) this;
        }

        public Criteria andGooseSnowLessThanOrEqualTo(Integer value) {
            addCriterion("goose_snow <=", value, "gooseSnow");
            return (Criteria) this;
        }

        public Criteria andGooseSnowIn(List<Integer> values) {
            addCriterion("goose_snow in", values, "gooseSnow");
            return (Criteria) this;
        }

        public Criteria andGooseSnowNotIn(List<Integer> values) {
            addCriterion("goose_snow not in", values, "gooseSnow");
            return (Criteria) this;
        }

        public Criteria andGooseSnowBetween(Integer value1, Integer value2) {
            addCriterion("goose_snow between", value1, value2, "gooseSnow");
            return (Criteria) this;
        }

        public Criteria andGooseSnowNotBetween(Integer value1, Integer value2) {
            addCriterion("goose_snow not between", value1, value2, "gooseSnow");
            return (Criteria) this;
        }

        public Criteria andGooseStarIsNull() {
            addCriterion("goose_star is null");
            return (Criteria) this;
        }

        public Criteria andGooseStarIsNotNull() {
            addCriterion("goose_star is not null");
            return (Criteria) this;
        }

        public Criteria andGooseStarEqualTo(Integer value) {
            addCriterion("goose_star =", value, "gooseStar");
            return (Criteria) this;
        }

        public Criteria andGooseStarNotEqualTo(Integer value) {
            addCriterion("goose_star <>", value, "gooseStar");
            return (Criteria) this;
        }

        public Criteria andGooseStarGreaterThan(Integer value) {
            addCriterion("goose_star >", value, "gooseStar");
            return (Criteria) this;
        }

        public Criteria andGooseStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("goose_star >=", value, "gooseStar");
            return (Criteria) this;
        }

        public Criteria andGooseStarLessThan(Integer value) {
            addCriterion("goose_star <", value, "gooseStar");
            return (Criteria) this;
        }

        public Criteria andGooseStarLessThanOrEqualTo(Integer value) {
            addCriterion("goose_star <=", value, "gooseStar");
            return (Criteria) this;
        }

        public Criteria andGooseStarIn(List<Integer> values) {
            addCriterion("goose_star in", values, "gooseStar");
            return (Criteria) this;
        }

        public Criteria andGooseStarNotIn(List<Integer> values) {
            addCriterion("goose_star not in", values, "gooseStar");
            return (Criteria) this;
        }

        public Criteria andGooseStarBetween(Integer value1, Integer value2) {
            addCriterion("goose_star between", value1, value2, "gooseStar");
            return (Criteria) this;
        }

        public Criteria andGooseStarNotBetween(Integer value1, Integer value2) {
            addCriterion("goose_star not between", value1, value2, "gooseStar");
            return (Criteria) this;
        }

        public Criteria andGooseWindIsNull() {
            addCriterion("goose_wind is null");
            return (Criteria) this;
        }

        public Criteria andGooseWindIsNotNull() {
            addCriterion("goose_wind is not null");
            return (Criteria) this;
        }

        public Criteria andGooseWindEqualTo(Integer value) {
            addCriterion("goose_wind =", value, "gooseWind");
            return (Criteria) this;
        }

        public Criteria andGooseWindNotEqualTo(Integer value) {
            addCriterion("goose_wind <>", value, "gooseWind");
            return (Criteria) this;
        }

        public Criteria andGooseWindGreaterThan(Integer value) {
            addCriterion("goose_wind >", value, "gooseWind");
            return (Criteria) this;
        }

        public Criteria andGooseWindGreaterThanOrEqualTo(Integer value) {
            addCriterion("goose_wind >=", value, "gooseWind");
            return (Criteria) this;
        }

        public Criteria andGooseWindLessThan(Integer value) {
            addCriterion("goose_wind <", value, "gooseWind");
            return (Criteria) this;
        }

        public Criteria andGooseWindLessThanOrEqualTo(Integer value) {
            addCriterion("goose_wind <=", value, "gooseWind");
            return (Criteria) this;
        }

        public Criteria andGooseWindIn(List<Integer> values) {
            addCriterion("goose_wind in", values, "gooseWind");
            return (Criteria) this;
        }

        public Criteria andGooseWindNotIn(List<Integer> values) {
            addCriterion("goose_wind not in", values, "gooseWind");
            return (Criteria) this;
        }

        public Criteria andGooseWindBetween(Integer value1, Integer value2) {
            addCriterion("goose_wind between", value1, value2, "gooseWind");
            return (Criteria) this;
        }

        public Criteria andGooseWindNotBetween(Integer value1, Integer value2) {
            addCriterion("goose_wind not between", value1, value2, "gooseWind");
            return (Criteria) this;
        }

        public Criteria andGooseRainIsNull() {
            addCriterion("goose_rain is null");
            return (Criteria) this;
        }

        public Criteria andGooseRainIsNotNull() {
            addCriterion("goose_rain is not null");
            return (Criteria) this;
        }

        public Criteria andGooseRainEqualTo(Integer value) {
            addCriterion("goose_rain =", value, "gooseRain");
            return (Criteria) this;
        }

        public Criteria andGooseRainNotEqualTo(Integer value) {
            addCriterion("goose_rain <>", value, "gooseRain");
            return (Criteria) this;
        }

        public Criteria andGooseRainGreaterThan(Integer value) {
            addCriterion("goose_rain >", value, "gooseRain");
            return (Criteria) this;
        }

        public Criteria andGooseRainGreaterThanOrEqualTo(Integer value) {
            addCriterion("goose_rain >=", value, "gooseRain");
            return (Criteria) this;
        }

        public Criteria andGooseRainLessThan(Integer value) {
            addCriterion("goose_rain <", value, "gooseRain");
            return (Criteria) this;
        }

        public Criteria andGooseRainLessThanOrEqualTo(Integer value) {
            addCriterion("goose_rain <=", value, "gooseRain");
            return (Criteria) this;
        }

        public Criteria andGooseRainIn(List<Integer> values) {
            addCriterion("goose_rain in", values, "gooseRain");
            return (Criteria) this;
        }

        public Criteria andGooseRainNotIn(List<Integer> values) {
            addCriterion("goose_rain not in", values, "gooseRain");
            return (Criteria) this;
        }

        public Criteria andGooseRainBetween(Integer value1, Integer value2) {
            addCriterion("goose_rain between", value1, value2, "gooseRain");
            return (Criteria) this;
        }

        public Criteria andGooseRainNotBetween(Integer value1, Integer value2) {
            addCriterion("goose_rain not between", value1, value2, "gooseRain");
            return (Criteria) this;
        }

        public Criteria andGooseDevilIsNull() {
            addCriterion("goose_devil is null");
            return (Criteria) this;
        }

        public Criteria andGooseDevilIsNotNull() {
            addCriterion("goose_devil is not null");
            return (Criteria) this;
        }

        public Criteria andGooseDevilEqualTo(Integer value) {
            addCriterion("goose_devil =", value, "gooseDevil");
            return (Criteria) this;
        }

        public Criteria andGooseDevilNotEqualTo(Integer value) {
            addCriterion("goose_devil <>", value, "gooseDevil");
            return (Criteria) this;
        }

        public Criteria andGooseDevilGreaterThan(Integer value) {
            addCriterion("goose_devil >", value, "gooseDevil");
            return (Criteria) this;
        }

        public Criteria andGooseDevilGreaterThanOrEqualTo(Integer value) {
            addCriterion("goose_devil >=", value, "gooseDevil");
            return (Criteria) this;
        }

        public Criteria andGooseDevilLessThan(Integer value) {
            addCriterion("goose_devil <", value, "gooseDevil");
            return (Criteria) this;
        }

        public Criteria andGooseDevilLessThanOrEqualTo(Integer value) {
            addCriterion("goose_devil <=", value, "gooseDevil");
            return (Criteria) this;
        }

        public Criteria andGooseDevilIn(List<Integer> values) {
            addCriterion("goose_devil in", values, "gooseDevil");
            return (Criteria) this;
        }

        public Criteria andGooseDevilNotIn(List<Integer> values) {
            addCriterion("goose_devil not in", values, "gooseDevil");
            return (Criteria) this;
        }

        public Criteria andGooseDevilBetween(Integer value1, Integer value2) {
            addCriterion("goose_devil between", value1, value2, "gooseDevil");
            return (Criteria) this;
        }

        public Criteria andGooseDevilNotBetween(Integer value1, Integer value2) {
            addCriterion("goose_devil not between", value1, value2, "gooseDevil");
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