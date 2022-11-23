package com.example.mango.admin.service.impl;

import com.example.mango.admin.model.SysLog;
import com.example.mango.admin.service.SysLogService;
import com.example.mango.core.page.PageRequest;
import com.example.mango.core.page.PageResult;

import java.util.List;

public class SysLogServiceImpl implements SysLogService {
    @Override
    public int save(SysLog record) {
        return 0;
    }

    @Override
    public int delete(SysLog record) {
        return 0;
    }

    @Override
    public int delete(List<SysLog> records) {
        return 0;
    }

    @Override
    public SysLog findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return null;
    }
}
