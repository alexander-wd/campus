package com.xajh.campus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CampusApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CampusApplication.class, args);
    }

    /**
     * 需要把web项目打成war包部署到外部tomcat运行时需要改变启动方式
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CampusApplication.class);
    }

}
