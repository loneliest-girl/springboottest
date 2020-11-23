package com.zjx.springboottest.service.impl;

import com.zjx.springboottest.Entity.Test;
import com.zjx.springboottest.dao.TestDao;
import com.zjx.springboottest.service.TestService;
import okhttp3.OkHttp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private final TestDao testDao;

    @Autowired
    public TestServiceImpl(TestDao testDao) {
        this.testDao = testDao;
        String test = testDao.test();
        System.out.println("+++++++++++" + test);
    }


    @Override
    public String test() {
        return "service";
    }

    @Override
    public String insert() {
        testDao.insert();
        return "ok";
    }

    @Override
    public List<Test> list() {
        List<Test> list = testDao.list();
        return list;
    }
}
