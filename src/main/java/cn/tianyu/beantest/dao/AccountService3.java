package cn.tianyu.beantest.dao;

public class AccountService3 implements IAccountService{
    @Override
    public void findOne() {
        System.out.println("AccountService3.findOne");

    }

    @Override
    public void findAll() {
        System.out.println("AccountService3.findAll");

    }

    @Override
    public void update() {
        System.out.println("AccountService3.update");

    }
}
