package com.example.springboothelloworld.entity;

import org.junit.jupiter.api.Test;

public class UserTest {
    User user = new User();
    @Test
    public void test_User(){
        user.get("Bo");
    }
}
