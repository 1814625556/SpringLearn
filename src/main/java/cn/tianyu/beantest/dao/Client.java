package cn.tianyu.beantest.dao;

import cn.tianyu.beantest.dao.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args)
    {
        propertyTest();
    }
    /*
    * 配置文件方式构造函数注入
    * */
    static void Constructtest()
    {
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("beanxmltest.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountService");
        accountService.findAll();
    }
    /*
    * 配置文件方式属性注入
    * */
    static void propertyTest()
    {
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("beanxmltest.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountService2");
        accountService.findAll();
    }
}
