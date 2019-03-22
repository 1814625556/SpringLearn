package cn.tianyu.beantest.dao;


/*
* 静态工厂模式
* */
public class StaticFactory {
    public static IAccountService createCustomerService()
    {
        return new AccountService3();
    }
}
