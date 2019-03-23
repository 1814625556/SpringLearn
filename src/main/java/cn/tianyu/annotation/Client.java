package cn.tianyu.annotation;

import cn.tianyu.annotation.domain.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args)
    {
        c3p0test();
    }

    static void c3p0test()
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(annotationConfig.class);
        ICustomerService cs = (ICustomerService)ac.getBean("customerService");
        Customer csEntity = new Customer();
        csEntity.setCust_name("chenchang");
        csEntity.setCust_address("shanghai");
        csEntity.setCust_level("9");
        cs.saveCustomer(csEntity);
    }
    /*
    * 没有配置文件的注解使用
    * */
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
