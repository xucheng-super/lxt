package com.lxt.chenjia.manage.mapper;

import com.lxt.chenjia.manage.model.Organization;
import com.lxt.chenjia.manage.model.OrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int countByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int deleteByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int deleteByPrimaryKey(String orgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int insert(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int insertSelective(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    List<Organization> selectByExample(OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    Organization selectByPrimaryKey(String orgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") Organization record, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByPrimaryKeySelective(Organization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lxt_organization
     *
     * @mbggenerated Tue Aug 07 15:10:59 CST 2018
     */
    int updateByPrimaryKey(Organization record);
}