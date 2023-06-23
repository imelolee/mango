package com.example.mango.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class SysRoleDept implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.role_id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.dept_id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Long deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.create_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.create_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.last_update_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.last_update_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Date lastUpdateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.id
     *
     * @return the value of sys_role_dept.id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.id
     *
     * @param id the value for sys_role_dept.id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.role_id
     *
     * @return the value of sys_role_dept.role_id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.role_id
     *
     * @param roleId the value for sys_role_dept.role_id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.dept_id
     *
     * @return the value of sys_role_dept.dept_id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.dept_id
     *
     * @param deptId the value for sys_role_dept.dept_id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.create_by
     *
     * @return the value of sys_role_dept.create_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.create_by
     *
     * @param createBy the value for sys_role_dept.create_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.create_time
     *
     * @return the value of sys_role_dept.create_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.create_time
     *
     * @param createTime the value for sys_role_dept.create_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.last_update_by
     *
     * @return the value of sys_role_dept.last_update_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.last_update_by
     *
     * @param lastUpdateBy the value for sys_role_dept.last_update_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.last_update_time
     *
     * @return the value of sys_role_dept.last_update_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.last_update_time
     *
     * @param lastUpdateTime the value for sys_role_dept.last_update_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", deptId=").append(deptId);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}