package com.example.springboothelloworld.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtilsTest {
    //真实存在目录
    Path path = Paths.get("D://data.txt");
    //虚拟目录
    Path path1 = Paths.get("D://data1.txt");

    @Test
    @DisplayName("文件目录中已新建该路径下文件，文件大小0，应输出9，预计通过")
    public void test_FileUtils(){
        Assertions.assertEquals(9, FileUtils.getSize(path));
    }

    @Test
    @DisplayName("文件目录中已新建该路径下文件，文件大小0，应输出9，预计失败")
    public void test_FileUtils1(){
        Assertions.assertEquals(0, FileUtils.getSize(path));
    }

    @Test
    @DisplayName("文件目录中无该文件，预计抛出RuntimeException，预计通过测试")
    public void test_FileUtils2(){
        Assertions.assertThrows(RuntimeException.class, ()->{
            FileUtils.getSize(path1);
        });
    }
}
