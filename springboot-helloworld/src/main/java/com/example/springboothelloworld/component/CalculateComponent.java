package com.example.springboothelloworld.component;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CalculateComponent {
    public int add(int x,int y){
        return x+y;
    }
}
