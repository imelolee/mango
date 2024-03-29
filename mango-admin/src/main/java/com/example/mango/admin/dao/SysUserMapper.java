package com.example.mango.admin.dao;

import java.util.List;

import com.example.mango.admin.model.SysRole;
import com.example.mango.admin.model.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    /**
     * 查询全部
     * @return
     */
    List<SysUser> findAll();

    /**
     * 分页查询
     * @return
     */
    List<SysUser> findPage();

    SysUser findByName(@Param(value="name") String name);

    List<SysRole> findPageByName(@Param(value="name") String name);

    List<SysUser> findPageByNameAndEmail(@Param(value="name") String name, @Param(value="email") String email);

}