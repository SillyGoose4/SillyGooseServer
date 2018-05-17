package com.SillyGoose.bean;

import java.util.ArrayList;
import java.util.List;

public class PicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicExample() {
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

        public Criteria andPicIdIsNull() {
            addCriterion("pic_id is null");
            return (Criteria) this;
        }

        public Criteria andPicIdIsNotNull() {
            addCriterion("pic_id is not null");
            return (Criteria) this;
        }

        public Criteria andPicIdEqualTo(Integer value) {
            addCriterion("pic_id =", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotEqualTo(Integer value) {
            addCriterion("pic_id <>", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThan(Integer value) {
            addCriterion("pic_id >", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_id >=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThan(Integer value) {
            addCriterion("pic_id <", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThanOrEqualTo(Integer value) {
            addCriterion("pic_id <=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdIn(List<Integer> values) {
            addCriterion("pic_id in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotIn(List<Integer> values) {
            addCriterion("pic_id not in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdBetween(Integer value1, Integer value2) {
            addCriterion("pic_id between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_id not between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicBelongIsNull() {
            addCriterion("pic_belong is null");
            return (Criteria) this;
        }

        public Criteria andPicBelongIsNotNull() {
            addCriterion("pic_belong is not null");
            return (Criteria) this;
        }

        public Criteria andPicBelongEqualTo(Integer value) {
            addCriterion("pic_belong =", value, "picBelong");
            return (Criteria) this;
        }

        public Criteria andPicBelongNotEqualTo(Integer value) {
            addCriterion("pic_belong <>", value, "picBelong");
            return (Criteria) this;
        }

        public Criteria andPicBelongGreaterThan(Integer value) {
            addCriterion("pic_belong >", value, "picBelong");
            return (Criteria) this;
        }

        public Criteria andPicBelongGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_belong >=", value, "picBelong");
            return (Criteria) this;
        }

        public Criteria andPicBelongLessThan(Integer value) {
            addCriterion("pic_belong <", value, "picBelong");
            return (Criteria) this;
        }

        public Criteria andPicBelongLessThanOrEqualTo(Integer value) {
            addCriterion("pic_belong <=", value, "picBelong");
            return (Criteria) this;
        }

        public Criteria andPicBelongIn(List<Integer> values) {
            addCriterion("pic_belong in", values, "picBelong");
            return (Criteria) this;
        }

        public Criteria andPicBelongNotIn(List<Integer> values) {
            addCriterion("pic_belong not in", values, "picBelong");
            return (Criteria) this;
        }

        public Criteria andPicBelongBetween(Integer value1, Integer value2) {
            addCriterion("pic_belong between", value1, value2, "picBelong");
            return (Criteria) this;
        }

        public Criteria andPicBelongNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_belong not between", value1, value2, "picBelong");
            return (Criteria) this;
        }

        public Criteria andPicLevelIsNull() {
            addCriterion("pic_level is null");
            return (Criteria) this;
        }

        public Criteria andPicLevelIsNotNull() {
            addCriterion("pic_level is not null");
            return (Criteria) this;
        }

        public Criteria andPicLevelEqualTo(Integer value) {
            addCriterion("pic_level =", value, "picLevel");
            return (Criteria) this;
        }

        public Criteria andPicLevelNotEqualTo(Integer value) {
            addCriterion("pic_level <>", value, "picLevel");
            return (Criteria) this;
        }

        public Criteria andPicLevelGreaterThan(Integer value) {
            addCriterion("pic_level >", value, "picLevel");
            return (Criteria) this;
        }

        public Criteria andPicLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("pic_level >=", value, "picLevel");
            return (Criteria) this;
        }

        public Criteria andPicLevelLessThan(Integer value) {
            addCriterion("pic_level <", value, "picLevel");
            return (Criteria) this;
        }

        public Criteria andPicLevelLessThanOrEqualTo(Integer value) {
            addCriterion("pic_level <=", value, "picLevel");
            return (Criteria) this;
        }

        public Criteria andPicLevelIn(List<Integer> values) {
            addCriterion("pic_level in", values, "picLevel");
            return (Criteria) this;
        }

        public Criteria andPicLevelNotIn(List<Integer> values) {
            addCriterion("pic_level not in", values, "picLevel");
            return (Criteria) this;
        }

        public Criteria andPicLevelBetween(Integer value1, Integer value2) {
            addCriterion("pic_level between", value1, value2, "picLevel");
            return (Criteria) this;
        }

        public Criteria andPicLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("pic_level not between", value1, value2, "picLevel");
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