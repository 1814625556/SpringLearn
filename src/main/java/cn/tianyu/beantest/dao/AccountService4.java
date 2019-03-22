package cn.tianyu.beantest.dao;

public class AccountService4 implements IAccountService{
    @Override
    public void findOne() {
        System.out.println("AccountService4.findOne");

    }

    @Override
    public void findAll() {
        System.out.println("AccountService4.findAll");

    }

    @Override
    public void update() {
        System.out.println("AccountService4.update");
        
    }
}
