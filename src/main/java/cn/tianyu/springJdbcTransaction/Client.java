package cn.tianyu.springJdbcTransaction;

import cn.tianyu.springJdbcTransaction.config.SpringConfiguration;
import cn.tianyu.springJdbcTransaction.services.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        testAllAnnotation();
    }
    /*
    *
    * 全部基于注解的方式
    *
    * */
    static void testAllAnnotation()
    {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService accountService = (IAccountService) ac.getBean("accountService");
//		Account account = accountService.findAccountById(1);
//		System.out.println(account);
        accountService.transfer("aaa", "bbb", 100f);
    }
    /*
    *
    * 基于注解的方式
    *
    * */
    static void testAnnotationTransaction()
    {
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("springJdbcTransactionAnnotation.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountService");
//		Account account = accountService.findAccountById(1);
//		System.out.println(account);
        accountService.transfer("aaa", "bbb", 100f);
    }
    /*
    *
    * spring配置文件事务
    *
    * */
    static void testTransaction()
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("springJdbcTransaction.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountService");
//		Account account = accountService.findAccountById(1);
//		System.out.println(account);
        accountService.transfer("aaa", "bbb", 100f);
    }
}
