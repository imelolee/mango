package com.example.mango.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class SysRole implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.name
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.remark
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.create_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.create_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.last_update_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.last_update_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Date lastUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.del_flag
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Byte delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_role
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.id
     *
     * @return the value of sys_role.id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.id
     *
     * @param id the value for sys_role.id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.name
     *
     * @return the value of sys_role.name
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.name
     *
     * @param name the value for sys_role.name
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.remark
     *
     * @return the value of sys_role.remark
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.remark
     *
     * @param remark the value for sys_role.remark
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.create_by
     *
     * @return the value of sys_role.create_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.create_by
     *
     * @param createBy the value for sys_role.create_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.create_time
     *
     * @return the value of sys_role.create_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.create_time
     *
     * @param createTime the value for sys_role.create_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.last_update_by
     *
     * @return the value of sys_role.last_update_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.last_update_by
     *
     * @param lastUpdateBy the value for sys_role.last_update_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.last_update_time
     *
     * @return the value of sys_role.last_update_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.last_update_time
     *
     * @param lastUpdateTime the value for sys_role.last_update_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.del_flag
     *
     * @return the value of sys_role.del_flag
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.del_flag
     *
     * @param delFlag the value for sys_role.del_flag
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role
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
        sb.append(", name=").append(name);
        sb.append(", remark=").append(remark);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}