package com.example.mango.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class SysDict implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.value
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.label
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String label;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.type
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.description
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.sort
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Long sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.create_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.create_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.last_update_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.last_update_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Date lastUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.remarks
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dict.del_flag
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private Byte delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_dict
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.id
     *
     * @return the value of sys_dict.id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.id
     *
     * @param id the value for sys_dict.id
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.value
     *
     * @return the value of sys_dict.value
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.value
     *
     * @param value the value for sys_dict.value
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.label
     *
     * @return the value of sys_dict.label
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.label
     *
     * @param label the value for sys_dict.label
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.type
     *
     * @return the value of sys_dict.type
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.type
     *
     * @param type the value for sys_dict.type
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.description
     *
     * @return the value of sys_dict.description
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.description
     *
     * @param description the value for sys_dict.description
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.sort
     *
     * @return the value of sys_dict.sort
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Long getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.sort
     *
     * @param sort the value for sys_dict.sort
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setSort(Long sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.create_by
     *
     * @return the value of sys_dict.create_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.create_by
     *
     * @param createBy the value for sys_dict.create_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.create_time
     *
     * @return the value of sys_dict.create_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.create_time
     *
     * @param createTime the value for sys_dict.create_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.last_update_by
     *
     * @return the value of sys_dict.last_update_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.last_update_by
     *
     * @param lastUpdateBy the value for sys_dict.last_update_by
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.last_update_time
     *
     * @return the value of sys_dict.last_update_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.last_update_time
     *
     * @param lastUpdateTime the value for sys_dict.last_update_time
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.remarks
     *
     * @return the value of sys_dict.remarks
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.remarks
     *
     * @param remarks the value for sys_dict.remarks
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dict.del_flag
     *
     * @return the value of sys_dict.del_flag
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dict.del_flag
     *
     * @param delFlag the value for sys_dict.del_flag
     *
     * @mbggenerated Fri Jun 23 10:27:57 CST 2023
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dict
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
        sb.append(", value=").append(value);
        sb.append(", label=").append(label);
        sb.append(", type=").append(type);
        sb.append(", description=").append(description);
        sb.append(", sort=").append(sort);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastUpdateBy=").append(lastUpdateBy);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", remarks=").append(remarks);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}