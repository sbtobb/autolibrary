package com.cyouguang.autolibrary.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

public class BookTagExample {
    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public BookTagExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setPageInfo(Integer currentPage, Integer pageSize) {
        if(pageSize<1) throw new IllegalArgumentException("页大小不能小于1！");
        this.limit=pageSize;
        if(currentPage<1) throw new IllegalArgumentException("页数不能小于1！");
        this.offset=(currentPage-1)*pageSize;
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
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

        public Criteria andBook_tag_idIsNull() {
            addCriterion("book_tag_id is null");
            return (Criteria) this;
        }

        public Criteria andBook_tag_idIsNotNull() {
            addCriterion("book_tag_id is not null");
            return (Criteria) this;
        }

        public Criteria andBook_tag_idEqualTo(Integer value) {
            addCriterion("book_tag_id =", value, "book_tag_id");
            return (Criteria) this;
        }

        public Criteria andBook_tag_idNotEqualTo(Integer value) {
            addCriterion("book_tag_id <>", value, "book_tag_id");
            return (Criteria) this;
        }

        public Criteria andBook_tag_idGreaterThan(Integer value) {
            addCriterion("book_tag_id >", value, "book_tag_id");
            return (Criteria) this;
        }

        public Criteria andBook_tag_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_tag_id >=", value, "book_tag_id");
            return (Criteria) this;
        }

        public Criteria andBook_tag_idLessThan(Integer value) {
            addCriterion("book_tag_id <", value, "book_tag_id");
            return (Criteria) this;
        }

        public Criteria andBook_tag_idLessThanOrEqualTo(Integer value) {
            addCriterion("book_tag_id <=", value, "book_tag_id");
            return (Criteria) this;
        }

        public Criteria andBook_tag_idIn(List<Integer> values) {
            addCriterion("book_tag_id in", values, "book_tag_id");
            return (Criteria) this;
        }

        public Criteria andBook_tag_idNotIn(List<Integer> values) {
            addCriterion("book_tag_id not in", values, "book_tag_id");
            return (Criteria) this;
        }

        public Criteria andBook_tag_idBetween(Integer value1, Integer value2) {
            addCriterion("book_tag_id between", value1, value2, "book_tag_id");
            return (Criteria) this;
        }

        public Criteria andBook_tag_idNotBetween(Integer value1, Integer value2) {
            addCriterion("book_tag_id not between", value1, value2, "book_tag_id");
            return (Criteria) this;
        }

        public Criteria andBook_info_idIsNull() {
            addCriterion("book_info_id is null");
            return (Criteria) this;
        }

        public Criteria andBook_info_idIsNotNull() {
            addCriterion("book_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andBook_info_idEqualTo(Integer value) {
            addCriterion("book_info_id =", value, "book_info_id");
            return (Criteria) this;
        }

        public Criteria andBook_info_idNotEqualTo(Integer value) {
            addCriterion("book_info_id <>", value, "book_info_id");
            return (Criteria) this;
        }

        public Criteria andBook_info_idGreaterThan(Integer value) {
            addCriterion("book_info_id >", value, "book_info_id");
            return (Criteria) this;
        }

        public Criteria andBook_info_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_info_id >=", value, "book_info_id");
            return (Criteria) this;
        }

        public Criteria andBook_info_idLessThan(Integer value) {
            addCriterion("book_info_id <", value, "book_info_id");
            return (Criteria) this;
        }

        public Criteria andBook_info_idLessThanOrEqualTo(Integer value) {
            addCriterion("book_info_id <=", value, "book_info_id");
            return (Criteria) this;
        }

        public Criteria andBook_info_idIn(List<Integer> values) {
            addCriterion("book_info_id in", values, "book_info_id");
            return (Criteria) this;
        }

        public Criteria andBook_info_idNotIn(List<Integer> values) {
            addCriterion("book_info_id not in", values, "book_info_id");
            return (Criteria) this;
        }

        public Criteria andBook_info_idBetween(Integer value1, Integer value2) {
            addCriterion("book_info_id between", value1, value2, "book_info_id");
            return (Criteria) this;
        }

        public Criteria andBook_info_idNotBetween(Integer value1, Integer value2) {
            addCriterion("book_info_id not between", value1, value2, "book_info_id");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTagLikeInsensitive(String value) {
            addCriterion("upper(tag) like", value.toUpperCase(), "tag");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Tue Sep 18 08:11:50 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Tue Sep 18 08:11:50 CST 2018
     */
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