package com.dcr.secondkill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Luna
 * @Date 2022/3/20 下午 07:40
 * @Description
 */
@MapperScan(basePackages = "com.dcr.secondkill.mapper")
@SpringBootApplication
public class SecondKillApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondKillApplication.class, args);
    }

}
