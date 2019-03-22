package cn.tianyu.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args)
    {
        withoutXml();
    }
    static void withoutXml()
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(annotationConfig.class);
        ICustomerService cs = (ICustomerService)ac.getBean("customerService");
        cs.saveCustomer();
    }
    /*
    * 使用配置文件的注解方式
    * */
    static void withXmlAnnotationTest()
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("annotationTest.xml");
        ICustomerService cs = (ICustomerService) ac.getBean("customerService");
        cs.saveCustomer();
    }

}
