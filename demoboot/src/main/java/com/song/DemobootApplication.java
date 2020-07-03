package com.song;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ServletComponentScan   //在springboot启动时会扫描webservlet，并将该类实例化
@SpringBootApplication
@MapperScan("com.song.mapper")   //告诉boot在整合mybatis时，用于扫描Mybatis的mapper接口
public class DemobootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemobootApplication.class, args);
    }

/*    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServletServlet());
        bean.addUrlMappings("/second");
        return bean;
    }

    @Bean
    public ServletRegistrationBean getServletRegistrationBean2(){
        ServletRegistrationBean bean2 = new ServletRegistrationBean(new FirstServlet());
        bean2.addUrlMappings("/first");
        return bean2;
    }*/

}
