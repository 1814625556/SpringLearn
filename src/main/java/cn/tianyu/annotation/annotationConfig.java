package cn.tianyu.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//它就是把当前类看成是spring的配置类
@ComponentScan({"cn.tianyu.annotation"})
public class annotationConfig {

}
