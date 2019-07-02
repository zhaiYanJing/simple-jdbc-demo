package com.zyj.simplejdbcdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SimpleJdbcDemoApplication implements CommandLineRunner {

    @Autowired
    private FooDao fooDao;

    public static void main(String[] args) {
        SpringApplication.run(SimpleJdbcDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        fooDao.insertData();

        fooDao.listData();

    }
}
