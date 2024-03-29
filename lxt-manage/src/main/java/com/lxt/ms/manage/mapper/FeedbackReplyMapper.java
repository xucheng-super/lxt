package com.lxt.ms.manage.mapper;

import com.lxt.ms.manage.model.FeedbackReply;
import com.lxt.ms.manage.model.FeedbackReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeedbackReplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_feedback_reply
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int countByExample(FeedbackReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_feedback_reply
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int deleteByExample(FeedbackReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_feedback_reply
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_feedback_reply
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int insert(FeedbackReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_feedback_reply
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int insertSelective(FeedbackReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_feedback_reply
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    List<FeedbackReply> selectByExample(FeedbackReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_feedback_reply
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    FeedbackReply selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_feedback_reply
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") FeedbackReply record, @Param("example") FeedbackReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_feedback_reply
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int updateByExample(@Param("record") FeedbackReply record, @Param("example") FeedbackReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_feedback_reply
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int updateByPrimaryKeySelective(FeedbackReply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_feedback_reply
     *
     * @mbggenerated Wed May 22 11:23:04 CST 2019
     */
    int updateByPrimaryKey(FeedbackReply record);
}