package cn.tianyu.beantest.dao;

import cn.tianyu.beantest.dao.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args)
    {
        scopeTestDemo();
    }
    /*
    * 单例多例测试
    * */
    static void scopeTestDemo()
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beanXmlTest2.xml");
        ScopeTest cmp1 = (ScopeTest)ac.getBean("scopedemo");
        ScopeTest cmp2 = (ScopeTest)ac.getBean("scopedemo");
        System.out.println(cmp1==cmp2);
    }
    /*复杂类型测试*/
    static void complexDemo2()
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beanXmlTest2.xml");
        ComplexTest cmp = (ComplexTest)ac.getBean("complex2");
        cmp.saveComplex();
        cmp.saveCustomer();
    }
    /*
    * p标签的注入
    * */
    static void complexDemo()
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beanXmlTest2.xml");
        ComplexTest cmp = (ComplexTest)ac.getBean("complextest");
        cmp.saveComplex();
    }

    /*
    * 实例工厂注入方式
    * */
    static void instanceFactory()
    {
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("beanxmltest.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountService4");
        accountService.findAll();
    }
    /*
    * 静态工厂的方式
    * */
    static void staticFactoryTest()
    {
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("beanxmltest.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountService3");
        accountService.findAll();
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
