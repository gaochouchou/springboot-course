package com.example.springbootjpaexamples.example01;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
}
