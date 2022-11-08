package com.example.java_oop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SpringBootApplication
public class JavaOopApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaOopApplication.class, args);
        System.out.println("Hello World!");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("이름을 입력해주세요.");
    }
}
