package com.lxt.chenjia.manage.model;

public class ChatGroupUserKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_group_user.GROUP_ID
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    private String groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lxt_chat_group_user.USER_ID
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_group_user.GROUP_ID
     *
     * @return the value of lxt_chat_group_user.GROUP_ID
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_group_user.GROUP_ID
     *
     * @param groupId the value for lxt_chat_group_user.GROUP_ID
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lxt_chat_group_user.USER_ID
     *
     * @return the value of lxt_chat_group_user.USER_ID
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lxt_chat_group_user.USER_ID
     *
     * @param userId the value for lxt_chat_group_user.USER_ID
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}