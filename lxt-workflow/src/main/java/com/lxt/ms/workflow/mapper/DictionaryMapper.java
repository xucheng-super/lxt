package com.lxt.ms.workflow.mapper;

import com.lxt.ms.workflow.model.Dictionary;
import com.lxt.ms.workflow.model.DictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int countByExample(DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int deleteByExample(DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int insert(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int insertSelective(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    List<Dictionary> selectByExample(DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    Dictionary selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int updateByExampleSelective(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int updateByExample(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int updateByPrimaryKeySelective(Dictionary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary
     *
     * @mbggenerated Thu Feb 14 11:30:52 CST 2019
     */
    int updateByPrimaryKey(Dictionary record);
}