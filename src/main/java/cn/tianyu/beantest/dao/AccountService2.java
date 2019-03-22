package cn.tianyu.beantest.dao;

public class AccountService2 implements IAccountService{

    public void set_accountDao(IAccountDao _accountDao) {
        this._accountDao = _accountDao;
    }

    private IAccountDao _accountDao;


    @Override
    public void findOne() {
        System.out.println("AccountService2.findOne");
        _accountDao.findOne();
    }

    @Override
    public void findAll() {
        System.out.println("AccountService2.findAll");
        _accountDao.findAll();
    }

    @Override
    public void update() {
        System.out.println("AccountService2.update");
        _accountDao.update();
    }
}