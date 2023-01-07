package com.example.mango.admin.controller;


import com.example.mango.admin.model.SysLoginLog;
import com.example.mango.admin.service.SysLoginLogService;
import com.example.mango.core.http.HttpResult;
import com.example.mango.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 登录日志控制器
 * @author genleel
 */
@RestController
@RequestMapping("loginlog")
public class SysLoginLogController {

    @Autowired(required = false)
    private SysLoginLogService sysLoginLogService;

    @PreAuthorize("hasAuthority('sys:loginlog:view')")
    @PostMapping(value="/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysLoginLogService.findPage(pageRequest));
    }

    @PreAuthorize("hasAuthority('sys:loginlog:delete')")
    @PostMapping(value="/delete")
    public HttpResult delete(@RequestBody List<SysLoginLog> records) {
        return HttpResult.ok(sysLoginLogService.delete(records));
    }
}
