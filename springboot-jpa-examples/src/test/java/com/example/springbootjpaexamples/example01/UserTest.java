package com.example.springbootjpaexamples.example01;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.time.LocalDate;

//需要使用事务插入数据
// 默认测试下是会自动回滚，防止污染生产环境
@SpringBootTest
@Slf4j
@Transactional
@Rollback(value = false)
public class UserTest {
//    需要使用springboot的自动注入来进行测试
    @Autowired
    private EntityManager manager;
    @Test
    public void test_addUser(){
        User user = new User();
        user.setName("JIE");
        user.setBirthday(LocalDate.of(1990, 8, 8));
//        插入数据，后期还会讲
        manager.persist(user);
        log.debug("{}", user.getId());
    }
}
