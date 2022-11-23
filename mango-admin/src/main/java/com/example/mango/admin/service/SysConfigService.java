package com.example.mango.admin.service;

import com.example.mango.admin.model.SysConfig;
import com.example.mango.core.page.PageRequest;
import com.example.mango.core.page.PageResult;
import com.example.mango.core.service.CurdService;

import java.util.List;

public interface SysConfigService extends CurdService<SysConfig> {
    /**
     * 根据名称查询
     * @param label
     * @return
     */
    List<SysConfig> findByLabel(String label);

}
