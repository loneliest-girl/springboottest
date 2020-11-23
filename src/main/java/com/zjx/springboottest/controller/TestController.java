package com.zjx.springboottest.controller;

import com.alibaba.fastjson.JSON;
import com.zjx.springboottest.Entity.Test;
import com.zjx.springboottest.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhujingxing
 */
@RestController
@Api(tags = "一键加油在线订单")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping(path = "/test")
    public String test() {
        testService.test();
        return "ok";
    }

    @ApiOperation("查询待处理单据(线上订单)")
    @PostMapping("/insert")
    public String insert() {
        testService.insert();
        return "ok";
    }

    @GetMapping("/list")
    public List<Test> list(){
        return testService.list();
    }
}
