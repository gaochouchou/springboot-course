package com.example.springboothelloworld.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {
    public static long getSize(Path path){
        try {
            return Files.size(path);
        }catch (IOException e){
            throw new RuntimeException("操作错误！无法对指定文件操作");
        }
    }
}
