package com.example.mango.admin.service;

import com.example.mango.admin.model.SysUser;

import java.util.List;


public interface SysUserService {
    /**
     * 查询全部用户
     * @return
     */
    List<SysUser> findAll();

}
