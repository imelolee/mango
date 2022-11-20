package com.example.mango.admin.service;

import com.example.mango.admin.model.SysDept;
import com.example.mango.core.service.CurdService;

import java.util.List;

/**
 * 机构管理
 */
public interface SysDeptService extends CurdService<SysDept> {
    /**
     * 查询机构树
     */
    List<SysDept> findTree();
}
