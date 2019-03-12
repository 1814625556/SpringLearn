package cn.tianyu.springAopWithoutxml.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("cn.tianyu.springAopWithoutxml.config")
@EnableAspectJAutoProxy
public class SpringConfiguration {

}

