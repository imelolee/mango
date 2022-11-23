package com.example.mango.admin.service.impl;

import com.example.mango.admin.model.SysMenu;
import com.example.mango.admin.model.SysRole;
import com.example.mango.admin.model.SysRoleMenu;
import com.example.mango.admin.service.SysRoleService;
import com.example.mango.core.page.PageRequest;
import com.example.mango.core.page.PageResult;

import java.util.List;

public class SysRoleServiceImpl implements SysRoleService {
    @Override
    public List<SysRole> findAll() {
        return null;
    }

    @Override
    public List<SysMenu> findRoleMenus(Long roleId) {
        return null;
    }

    @Override
    public int saveRoleMenus(List<SysRoleMenu> records) {
        return 0;
    }

    @Override
    public List<SysRole> findByName(String name) {
        return null;
    }

    @Override
    public int save(SysRole record) {
        return 0;
    }

    @Override
    public int delete(SysRole record) {
        return 0;
    }

    @Override
    public int delete(List<SysRole> records) {
        return 0;
    }

    @Override
    public SysRole findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
