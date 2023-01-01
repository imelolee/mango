package com.example.mango.admin.controller;


import com.example.mango.admin.model.SysDict;
import com.example.mango.admin.service.SysDictService;
import com.example.mango.core.http.HttpResult;
import com.example.mango.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 字典控制器
 * @author genleel
 */
@RestController
@RequestMapping("dict")
public class SysDictController {

    @Autowired(required = false)
    private SysDictService sysDictService;

    @PostMapping(value="/save")
    public HttpResult save(@RequestBody SysDict record) {
        return HttpResult.ok(sysDictService.save(record));
    }

    @PostMapping(value="/delete")
    public HttpResult delete(@RequestBody List<SysDict> records) {
        return HttpResult.ok(sysDictService.delete(records));
    }

    @PostMapping(value="/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysDictService.findPage(pageRequest));
    }

    @GetMapping(value="/findByLable")
    public HttpResult findByLable(@RequestParam String label) {
        return HttpResult.ok(sysDictService.findByLabel(label));
    }
}