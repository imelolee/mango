package com.example.mango.admin.service.impl;

import com.example.mango.admin.dao.SysUserMapper;
import com.example.mango.admin.model.SysUser;
import com.example.mango.admin.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
