package cn.tianyu.beantest.dao;

public class InstanceFactory {
    public IAccountService createAccountService()
    {
        return new AccountService4();
    }
}
