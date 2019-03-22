package cn.tianyu.beantest.dao;

public class AccountService implements IAccountService{

    private IAccountDao _accountDao;

    public AccountService(IAccountDao accountDao)
    {
        _accountDao = accountDao;
    }

    @Override
    public void findOne() {
        System.out.println("AccountService.findOne");
        _accountDao.findOne();
    }

    @Override
    public void findAll() {
        System.out.println("AccountService.findAll");
        _accountDao.findAll();
    }

    @Override
    public void update() {
        System.out.println("AccountService.update");
        _accountDao.update();
    }
}
