package com.example.springbootjpaexamples.example01;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    @Column(length = 16)
    private UUID id;
    private String name;
    private LocalDate birthday;
//    将datetime类型送入数据库时默认用当前时间时间戳类型，同时关闭插入和更新，
//    禁止业务逻辑层对其进行更改
    @Column(columnDefinition = "timestamp default current_timestamp",
    insertable = false,
    updatable = false)
    private LocalDateTime insertTime;
    @Column(columnDefinition = "timestamp default current_timestamp " +
            "on update current_timestamp",
            insertable = false,
            updatable = false)
    private LocalDateTime updateTime;
}
