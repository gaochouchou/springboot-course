package com.example.springboothelloworld.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class User {
    private String name;
    private String address;
    public void get(String name) {
        int length = 5;
        if (name.length() <= length) {
            log.debug("输入：{}，长度小于5", name);
        }

    }
}
