package com.example.mango.admin.service;

import com.example.mango.admin.model.SysUser;
import com.example.mango.admin.model.SysUserRole;
import com.example.mango.core.page.PageRequest;
import com.example.mango.core.service.CurdService;

import java.io.File;
import java.util.List;
import java.util.Set;


public interface SysUserService extends CurdService<SysUser> {
    /**
     * 查询全部用户
     * @return
     */
    List<SysUser> findAll();

    SysUser findByName(String username);

    /**
     * 查找用户的菜单权限标识集合
     * @param userName
     * @return
     */
    Set<String> findPermissions(String userName);

    /**
     * 查找用户的角色集合
     * @param userId
     * @return
     */
    List<SysUserRole> findUserRoles(Long userId);

    /**
     * 生成用户信息Excel文件
     * @param pageRequest 要导出的分页查询参数
     * @return
     */
    File createUserExcelFile(PageRequest pageRequest);

}
