package com.example.mango.admin.service;

import com.example.mango.admin.model.SysUser;
import com.example.mango.core.service.CurdService;

import java.util.List;


public interface SysUserService extends CurdService<SysUser> {
    /**
     * 查询全部用户
     * @return
     */
    List<SysUser> findAll();
}
