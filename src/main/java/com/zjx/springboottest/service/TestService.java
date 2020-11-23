package com.zjx.springboottest.service;

import com.zjx.springboottest.Entity.Test;

import java.util.List;

public interface TestService {
    /**
     * 测试
     * @return 成功码
     */
    String test();


    String insert();

    List<Test> list();
}
