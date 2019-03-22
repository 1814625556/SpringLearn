package cn.tianyu.beantest.dao;

import java.util.Date;

public class AccountDao implements IAccountDao {
    private String name;
    private int age;
    private Date dt;
    public AccountDao(String name,int age,Date dt)
    {
        this.name=name;
        this.age=age;
        this.dt=dt;
    }
    @Override
    public void findOne() {
        System.out.println("AccountDao.findOne");
        System.out.println(toString());
    }

    @Override
    public void findAll() {
        System.out.println("AccountDao.findAll");
        System.out.println(toString());
    }

    @Override
    public void update() {
        System.out.println("AccountDao.update");
        System.out.println(toString());
    }

    @Override
    public String toString()
    {
        return "Name:"+name
                +"  Age:"+age+" Birth:"+dt;
    }
}
