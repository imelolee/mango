package com.example.mango.admin.service.impl;

import com.example.mango.admin.constant.SysConstants;
import com.example.mango.admin.dao.SysMenuMapper;
import com.example.mango.admin.dao.SysRoleMapper;
import com.example.mango.admin.dao.SysRoleMenuMapper;
import com.example.mango.admin.model.SysMenu;
import com.example.mango.admin.model.SysRole;
import com.example.mango.admin.model.SysRoleMenu;
import com.example.mango.admin.service.SysRoleService;
import com.example.mango.core.page.MybatisPageHelper;
import com.example.mango.core.page.PageRequest;
import com.example.mango.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Resource
    private SysRoleMapper sysRoleMapper;
    @Resource
    private SysRoleMenuMapper sysRoleMenuMapper;
    @Resource
    private SysMenuMapper sysMenuMapper;

    public SysRoleMapper getSysRoleMapper() {
        return sysRoleMapper;
    }

    public void setSysRoleMapper(SysRoleMapper sysRoleMapper) {
        this.sysRoleMapper = sysRoleMapper;
    }


    @Override
    public List<SysRole> findAll() {
        return sysRoleMapper.findAll();
    }

    @Override
    public List<SysMenu> findRoleMenus(Long roleId) {
        SysRole sysRole = sysRoleMapper.selectByPrimaryKey(roleId);
        if (SysConstants.ADMIN.equalsIgnoreCase(sysRole.getName())){
            // 如果是超级管理员，返回全部
            return sysMenuMapper.findAll();
        }
        return sysMenuMapper.findRoleMenus(roleId);
    }

    @Override
    public int saveRoleMenus(List<SysRoleMenu> records) {
        if (records == null || records.isEmpty()){
            return 1;
        }
        Long roldId = records.get(0).getRoleId();
        sysRoleMenuMapper.deleteByRoleId(roldId);
        for(SysRoleMenu record:records) {
            sysRoleMenuMapper.insertSelective(record);
        }
        return 1;
    }

    @Override
    public List<SysRole> findByName(String name) {
        return sysRoleMapper.findByName(name);
    }

    @Override
    public int save(SysRole record) {
        if (record.getId() == null || record.getId() == 0) {
            return sysRoleMapper.insertSelective(record);
        }
        return sysRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(SysRole record) {
        return sysRoleMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysRole> records) {
        for (SysRole record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public SysRole findById(Long id) {
        return sysRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        Object label = pageRequest.getParam("name");
        if (label != null){
            return MybatisPageHelper.findPage(pageRequest, sysRoleMapper, "findPageByName", label);
        }

        return MybatisPageHelper.findPage(pageRequest, sysRoleMapper);
    }
}
