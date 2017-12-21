package org.galsang.admin.base.model;

import java.io.Serializable;
import java.util.Date;

public class AuthUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_user.id
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_user.username
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_user.password
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_user.loginPhone
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private String loginPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_user.loginEmail
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private String loginEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_user.status
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_user.isSuperAdmin
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private Byte isSuperAdmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_user.deptId
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private String deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_user.createdTime
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column auth_user.updatedTime
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private Date updatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table auth_user
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_user.id
     *
     * @return the value of auth_user.id
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_user.id
     *
     * @param id the value for auth_user.id
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_user.username
     *
     * @return the value of auth_user.username
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_user.username
     *
     * @param username the value for auth_user.username
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_user.password
     *
     * @return the value of auth_user.password
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_user.password
     *
     * @param password the value for auth_user.password
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_user.loginPhone
     *
     * @return the value of auth_user.loginPhone
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public String getLoginPhone() {
        return loginPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_user.loginPhone
     *
     * @param loginPhone the value for auth_user.loginPhone
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setLoginPhone(String loginPhone) {
        this.loginPhone = loginPhone == null ? null : loginPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_user.loginEmail
     *
     * @return the value of auth_user.loginEmail
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public String getLoginEmail() {
        return loginEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_user.loginEmail
     *
     * @param loginEmail the value for auth_user.loginEmail
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail == null ? null : loginEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_user.status
     *
     * @return the value of auth_user.status
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_user.status
     *
     * @param status the value for auth_user.status
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_user.isSuperAdmin
     *
     * @return the value of auth_user.isSuperAdmin
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public Byte getIsSuperAdmin() {
        return isSuperAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_user.isSuperAdmin
     *
     * @param isSuperAdmin the value for auth_user.isSuperAdmin
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setIsSuperAdmin(Byte isSuperAdmin) {
        this.isSuperAdmin = isSuperAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_user.deptId
     *
     * @return the value of auth_user.deptId
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_user.deptId
     *
     * @param deptId the value for auth_user.deptId
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_user.createdTime
     *
     * @return the value of auth_user.createdTime
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_user.createdTime
     *
     * @param createdTime the value for auth_user.createdTime
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column auth_user.updatedTime
     *
     * @return the value of auth_user.updatedTime
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column auth_user.updatedTime
     *
     * @param updatedTime the value for auth_user.updatedTime
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
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
        AuthUser other = (AuthUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getLoginPhone() == null ? other.getLoginPhone() == null : this.getLoginPhone().equals(other.getLoginPhone()))
            && (this.getLoginEmail() == null ? other.getLoginEmail() == null : this.getLoginEmail().equals(other.getLoginEmail()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIsSuperAdmin() == null ? other.getIsSuperAdmin() == null : this.getIsSuperAdmin().equals(other.getIsSuperAdmin()))
            && (this.getDeptId() == null ? other.getDeptId() == null : this.getDeptId().equals(other.getDeptId()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated Thu Dec 21 11:56:56 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getLoginPhone() == null) ? 0 : getLoginPhone().hashCode());
        result = prime * result + ((getLoginEmail() == null) ? 0 : getLoginEmail().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIsSuperAdmin() == null) ? 0 : getIsSuperAdmin().hashCode());
        result = prime * result + ((getDeptId() == null) ? 0 : getDeptId().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", loginPhone=").append(loginPhone);
        sb.append(", loginEmail=").append(loginEmail);
        sb.append(", status=").append(status);
        sb.append(", isSuperAdmin=").append(isSuperAdmin);
        sb.append(", deptId=").append(deptId);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}