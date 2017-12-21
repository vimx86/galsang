package org.galsang.admin.base.model;

import java.io.Serializable;
import java.util.Date;

public class AuthAssign implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_assign.id
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_assign.userId
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_assign.roleId
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private String roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_assign.deleted
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private Byte deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_assign.createdTime
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_assign.updatedTime
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private Date updatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table auth_assign
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_assign.id
     *
     * @return the value of auth_assign.id
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_assign.id
     *
     * @param id the value for auth_assign.id
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_assign.userId
     *
     * @return the value of auth_assign.userId
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_assign.userId
     *
     * @param userId the value for auth_assign.userId
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_assign.roleId
     *
     * @return the value of auth_assign.roleId
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_assign.roleId
     *
     * @param roleId the value for auth_assign.roleId
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_assign.deleted
     *
     * @return the value of auth_assign.deleted
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_assign.deleted
     *
     * @param deleted the value for auth_assign.deleted
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_assign.createdTime
     *
     * @return the value of auth_assign.createdTime
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_assign.createdTime
     *
     * @param createdTime the value for auth_assign.createdTime
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_assign.updatedTime
     *
     * @return the value of auth_assign.updatedTime
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_assign.updatedTime
     *
     * @param updatedTime the value for auth_assign.updatedTime
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_assign
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AuthAssign other = (AuthAssign) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_assign
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_assign
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", deleted=").append(deleted);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}