package com.example.mango.admin.service;

import com.example.mango.admin.model.SysDict;
import com.example.mango.core.service.CurdService;

import java.util.List;

public interface SysDictService extends CurdService<SysDict> {
    /**
     * 根据名称查询
     */
    List<SysDict> findByLabel(String label);
}
