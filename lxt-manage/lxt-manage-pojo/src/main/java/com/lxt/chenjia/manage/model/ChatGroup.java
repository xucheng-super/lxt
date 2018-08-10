package com.lxt.chenjia.manage.model;

import java.util.Date;

public class ChatGroup {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_group.GROUP_ID
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    private String groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_group.USER_ID
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_group.GROUP_NAME
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_group.SORT_SEQ
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    private Integer sortSeq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_group.INSERT_TIME
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    private Date insertTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_group.UPDATE_TIME
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_group.GROUP_ID
     *
     * @return the value of lxt_chat_group.GROUP_ID
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_group.GROUP_ID
     *
     * @param groupId the value for lxt_chat_group.GROUP_ID
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_group.USER_ID
     *
     * @return the value of lxt_chat_group.USER_ID
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_group.USER_ID
     *
     * @param userId the value for lxt_chat_group.USER_ID
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_group.GROUP_NAME
     *
     * @return the value of lxt_chat_group.GROUP_NAME
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_group.GROUP_NAME
     *
     * @param groupName the value for lxt_chat_group.GROUP_NAME
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_group.SORT_SEQ
     *
     * @return the value of lxt_chat_group.SORT_SEQ
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public Integer getSortSeq() {
        return sortSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_group.SORT_SEQ
     *
     * @param sortSeq the value for lxt_chat_group.SORT_SEQ
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public void setSortSeq(Integer sortSeq) {
        this.sortSeq = sortSeq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_group.INSERT_TIME
     *
     * @return the value of lxt_chat_group.INSERT_TIME
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_group.INSERT_TIME
     *
     * @param insertTime the value for lxt_chat_group.INSERT_TIME
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_group.UPDATE_TIME
     *
     * @return the value of lxt_chat_group.UPDATE_TIME
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_group.UPDATE_TIME
     *
     * @param updateTime the value for lxt_chat_group.UPDATE_TIME
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}