package org.galsang.admin.base.dao;

import org.galsang.admin.base.model.AuthAssign;

public interface AuthAssignMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_assign
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_assign
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    int insert(AuthAssign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_assign
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    int insertSelective(AuthAssign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_assign
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    AuthAssign selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_assign
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    int updateByPrimaryKeySelective(AuthAssign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_assign
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    int updateByPrimaryKey(AuthAssign record);
}