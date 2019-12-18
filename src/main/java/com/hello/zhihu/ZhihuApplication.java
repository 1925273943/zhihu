package com.hello.zhihu;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZhihuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhihuApplication.class, args);
        System.out.println();
    }

}
