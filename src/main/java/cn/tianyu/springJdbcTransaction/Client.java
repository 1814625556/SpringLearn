package cn.tianyu.springJdbcTransaction;

import cn.tianyu.springJdbcTransaction.services.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

    }
    /*
    *
    * spring配置文件事务
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
