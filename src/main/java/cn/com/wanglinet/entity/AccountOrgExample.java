package cn.com.wanglinet.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccountOrgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccountOrgExample() {
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
            addCriterion("accountorg.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("accountorg.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("accountorg.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("accountorg.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("accountorg.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("accountorg.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("accountorg.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("accountorg.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("accountorg.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("accountorg.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("accountorg.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("accountorg.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("accountorg.name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("accountorg.name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("accountorg.name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("accountorg.name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("accountorg.name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("accountorg.name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("accountorg.name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("accountorg.name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("accountorg.name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("accountorg.name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("accountorg.name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("accountorg.name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("accountorg.name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("accountorg.name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("accountorg.parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("accountorg.parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("accountorg.parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("accountorg.parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("accountorg.parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("accountorg.parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("accountorg.parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("accountorg.parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("accountorg.parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("accountorg.parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("accountorg.parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("accountorg.parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdsIsNull() {
            addCriterion("accountorg.parent_ids is null");
            return (Criteria) this;
        }

        public Criteria andParentIdsIsNotNull() {
            addCriterion("accountorg.parent_ids is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdsEqualTo(String value) {
            addCriterion("accountorg.parent_ids =", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsNotEqualTo(String value) {
            addCriterion("accountorg.parent_ids <>", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsGreaterThan(String value) {
            addCriterion("accountorg.parent_ids >", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("accountorg.parent_ids >=", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsLessThan(String value) {
            addCriterion("accountorg.parent_ids <", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsLessThanOrEqualTo(String value) {
            addCriterion("accountorg.parent_ids <=", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsLike(String value) {
            addCriterion("accountorg.parent_ids like", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsNotLike(String value) {
            addCriterion("accountorg.parent_ids not like", value, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsIn(List<String> values) {
            addCriterion("accountorg.parent_ids in", values, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsNotIn(List<String> values) {
            addCriterion("accountorg.parent_ids not in", values, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsBetween(String value1, String value2) {
            addCriterion("accountorg.parent_ids between", value1, value2, "parentIds");
            return (Criteria) this;
        }

        public Criteria andParentIdsNotBetween(String value1, String value2) {
            addCriterion("accountorg.parent_ids not between", value1, value2, "parentIds");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("accountorg.enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("accountorg.enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(Boolean value) {
            addCriterion("accountorg.enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(Boolean value) {
            addCriterion("accountorg.enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(Boolean value) {
            addCriterion("accountorg.enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(Boolean value) {
            addCriterion("accountorg.enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(Boolean value) {
            addCriterion("accountorg.enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(Boolean value) {
            addCriterion("accountorg.enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<Boolean> values) {
            addCriterion("accountorg.enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<Boolean> values) {
            addCriterion("accountorg.enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(Boolean value1, Boolean value2) {
            addCriterion("accountorg.enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(Boolean value1, Boolean value2) {
            addCriterion("accountorg.enable not between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdIsNull() {
            addCriterion("accountorg.create_person_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdIsNotNull() {
            addCriterion("accountorg.create_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdEqualTo(Long value) {
            addCriterion("accountorg.create_person_id =", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdNotEqualTo(Long value) {
            addCriterion("accountorg.create_person_id <>", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdGreaterThan(Long value) {
            addCriterion("accountorg.create_person_id >", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("accountorg.create_person_id >=", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdLessThan(Long value) {
            addCriterion("accountorg.create_person_id <", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdLessThanOrEqualTo(Long value) {
            addCriterion("accountorg.create_person_id <=", value, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdIn(List<Long> values) {
            addCriterion("accountorg.create_person_id in", values, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdNotIn(List<Long> values) {
            addCriterion("accountorg.create_person_id not in", values, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdBetween(Long value1, Long value2) {
            addCriterion("accountorg.create_person_id between", value1, value2, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreatePersonIdNotBetween(Long value1, Long value2) {
            addCriterion("accountorg.create_person_id not between", value1, value2, "createPersonId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("accountorg.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("accountorg.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("accountorg.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("accountorg.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("accountorg.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("accountorg.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("accountorg.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("accountorg.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("accountorg.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("accountorg.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("accountorg.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("accountorg.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdIsNull() {
            addCriterion("accountorg.update_person_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdIsNotNull() {
            addCriterion("accountorg.update_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdEqualTo(Long value) {
            addCriterion("accountorg.update_person_id =", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdNotEqualTo(Long value) {
            addCriterion("accountorg.update_person_id <>", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdGreaterThan(Long value) {
            addCriterion("accountorg.update_person_id >", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdGreaterThanOrEqualTo(Long value) {
            addCriterion("accountorg.update_person_id >=", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdLessThan(Long value) {
            addCriterion("accountorg.update_person_id <", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdLessThanOrEqualTo(Long value) {
            addCriterion("accountorg.update_person_id <=", value, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdIn(List<Long> values) {
            addCriterion("accountorg.update_person_id in", values, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdNotIn(List<Long> values) {
            addCriterion("accountorg.update_person_id not in", values, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdBetween(Long value1, Long value2) {
            addCriterion("accountorg.update_person_id between", value1, value2, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdatePersonIdNotBetween(Long value1, Long value2) {
            addCriterion("accountorg.update_person_id not between", value1, value2, "updatePersonId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("accountorg.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("accountorg.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("accountorg.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("accountorg.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("accountorg.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("accountorg.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("accountorg.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("accountorg.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("accountorg.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("accountorg.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("accountorg.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("accountorg.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("accountorg.type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("accountorg.type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("accountorg.type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("accountorg.type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("accountorg.type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("accountorg.type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("accountorg.type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("accountorg.type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("accountorg.type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("accountorg.type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("accountorg.type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("accountorg.type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStopCauseIsNull() {
            addCriterion("accountorg.stop_cause is null");
            return (Criteria) this;
        }

        public Criteria andStopCauseIsNotNull() {
            addCriterion("accountorg.stop_cause is not null");
            return (Criteria) this;
        }

        public Criteria andStopCauseEqualTo(String value) {
            addCriterion("accountorg.stop_cause =", value, "stopCause");
            return (Criteria) this;
        }

        public Criteria andStopCauseNotEqualTo(String value) {
            addCriterion("accountorg.stop_cause <>", value, "stopCause");
            return (Criteria) this;
        }

        public Criteria andStopCauseGreaterThan(String value) {
            addCriterion("accountorg.stop_cause >", value, "stopCause");
            return (Criteria) this;
        }

        public Criteria andStopCauseGreaterThanOrEqualTo(String value) {
            addCriterion("accountorg.stop_cause >=", value, "stopCause");
            return (Criteria) this;
        }

        public Criteria andStopCauseLessThan(String value) {
            addCriterion("accountorg.stop_cause <", value, "stopCause");
            return (Criteria) this;
        }

        public Criteria andStopCauseLessThanOrEqualTo(String value) {
            addCriterion("accountorg.stop_cause <=", value, "stopCause");
            return (Criteria) this;
        }

        public Criteria andStopCauseLike(String value) {
            addCriterion("accountorg.stop_cause like", value, "stopCause");
            return (Criteria) this;
        }

        public Criteria andStopCauseNotLike(String value) {
            addCriterion("accountorg.stop_cause not like", value, "stopCause");
            return (Criteria) this;
        }

        public Criteria andStopCauseIn(List<String> values) {
            addCriterion("accountorg.stop_cause in", values, "stopCause");
            return (Criteria) this;
        }

        public Criteria andStopCauseNotIn(List<String> values) {
            addCriterion("accountorg.stop_cause not in", values, "stopCause");
            return (Criteria) this;
        }

        public Criteria andStopCauseBetween(String value1, String value2) {
            addCriterion("accountorg.stop_cause between", value1, value2, "stopCause");
            return (Criteria) this;
        }

        public Criteria andStopCauseNotBetween(String value1, String value2) {
            addCriterion("accountorg.stop_cause not between", value1, value2, "stopCause");
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