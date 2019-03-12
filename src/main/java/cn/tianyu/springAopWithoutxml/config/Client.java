package cn.tianyu.springAopWithoutxml.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ICustomerService cs = (ICustomerService) ac.getBean("customerService");
        cs.saveCustomer();

    }
}
