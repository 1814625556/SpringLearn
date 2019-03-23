package cn.tianyu.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration//它就是把当前类看成是spring的配置类
@ComponentScan({"cn.tianyu.annotation"})
@Import({JdbcConfig.class})//导入其他配置类
@PropertySource("classpath:JdbcConfig.properties")
public class annotationConfig {

}
