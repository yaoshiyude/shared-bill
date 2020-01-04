package com.xiluoyuannanli.sharedbill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SharedBillApplication {
    public static void main(String[] args) {
        System.out.println("shared-bill开始启动");
        SpringApplication.run(SharedBillApplication.class, args);
        System.out.println("shared-bill启动成功");

    }

}
