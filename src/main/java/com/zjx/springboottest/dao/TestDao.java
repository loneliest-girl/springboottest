package com.zjx.springboottest.dao;

import com.zjx.springboottest.Entity.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestDao {
    private final JdbcTemplate jdbcTemplate;

    public TestDao(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public String test(){
        return "dao";
    }

    public String insert(){
        String sql = "insert into test (id,name) values (?,?)";
        jdbcTemplate.update(sql, 1, "zjx");
        return "ok";
    }

    public List<Test> list(){
        String sql = "select * from test";
        List<Test> query = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Test.class));
        return query;
    }
}
