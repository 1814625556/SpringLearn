package cn.tianyu.springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        testAdviceType();
    }
    /*
    *
    * aop测试
    *
    * */
    public static void testAop()
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ICustomerService cs = (ICustomerService) ac.getBean("customerService");
        cs.saveCustomer();
        cs.updateCustomer(19);
        cs.deleteCustomer();
    }
    /*
    *
    * 周期测试
    *
    * */
    public static void testAdviceType()
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean1.xml");
        ICustomerService cs = (ICustomerService) ac.getBean("customerService");
        cs.saveCustomer();
    }
}
