package com.lxt.chenjia.manage.mapper;

import com.lxt.chenjia.manage.model.ChatFriend;
import com.lxt.chenjia.manage.model.ChatFriendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatFriendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int countByExample(ChatFriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int deleteByExample(ChatFriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int insert(ChatFriend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int insertSelective(ChatFriend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    List<ChatFriend> selectByExample(ChatFriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    ChatFriend selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") ChatFriend record, @Param("example") ChatFriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByExample(@Param("record") ChatFriend record, @Param("example") ChatFriendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByPrimaryKeySelective(ChatFriend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_chat_friend
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByPrimaryKey(ChatFriend record);
}