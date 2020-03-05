package com.example.springboothelloworld.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculateComponentTest {
    @Autowired
    private CalculateComponent calculateComponent;

    @Test
    @DisplayName("输入1+1，预计输入2")
    public void test_add(){
        Assertions.assertEquals(2, calculateComponent.add(1, 1));
    }
}
