package com.example.mango.admin.service.impl;

import com.example.mango.admin.model.SysMenu;
import com.example.mango.admin.service.SysMenuService;
import com.example.mango.core.page.PageRequest;
import com.example.mango.core.page.PageResult;

import java.util.List;

public class SysMenuServiceImpl implements SysMenuService {
    @Override
    public List<SysMenu> findTree(String userName, int menuType) {
        return null;
    }

    @Override
    public List<SysMenu> findByUser(String userName) {
        return null;
    }

    @Override
    public int save(SysMenu record) {
        return 0;
    }

    @Override
    public int delete(SysMenu record) {
        return 0;
    }

    @Override
    public int delete(List<SysMenu> records) {
        return 0;
    }

    @Override
    public SysMenu findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
