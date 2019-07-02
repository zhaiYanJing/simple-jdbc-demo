package com.zyj.simplejdbcdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
/**
 * DAO 层注解
 */
@Repository
public class FooDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertData() {

        Arrays.asList("a", "b").forEach(bar -> {
            jdbcTemplate.update("insert into foo(bar) values(?)", bar);
        });
    }


    public void listData() {

        log.info("Count: {}", jdbcTemplate.queryForObject("SELECT COUNT(*) FROM FOO", Long.class));

        List<String> list = jdbcTemplate.queryForList("SELECT BAR FROM FOO", String.class);

        list.forEach(s -> log.info("Bar: {}", s));
    }


    public static void main(String[] args) {

        // 数组转换成 List
        String[] myArray = {"a", "b", "c", "d", "e"};

        List<String> myList = new ArrayList<>();

        for (String str : myArray) {
            myList.add(str);
            myList.add(str);
        }

        System.out.println(myList.size());

    }
}
