package com.lxt.ms.push.mapper;

import com.lxt.ms.push.model.DictionaryType;
import com.lxt.ms.push.model.DictionaryTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictionaryTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary_type
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    int countByExample(DictionaryTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary_type
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    int deleteByExample(DictionaryTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary_type
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    int deleteByPrimaryKey(Integer type);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary_type
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    int insert(DictionaryType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary_type
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    int insertSelective(DictionaryType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary_type
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    List<DictionaryType> selectByExample(DictionaryTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary_type
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    DictionaryType selectByPrimaryKey(Integer type);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary_type
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") DictionaryType record, @Param("example") DictionaryTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary_type
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    int updateByExample(@Param("record") DictionaryType record, @Param("example") DictionaryTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary_type
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    int updateByPrimaryKeySelective(DictionaryType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_dictionary_type
     *
     * @mbggenerated Thu Apr 04 15:26:54 CST 2019
     */
    int updateByPrimaryKey(DictionaryType record);
}