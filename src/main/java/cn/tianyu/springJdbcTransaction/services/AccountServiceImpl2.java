package cn.tianyu.springJdbcTransaction.services;

import cn.tianyu.springJdbcTransaction.Account;
import cn.tianyu.springJdbcTransaction.Dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 账户的业务层实现类
 */
@Service("accountService")
@Transactional(propagation= Propagation.REQUIRED,readOnly=false)//读写型
public class AccountServiceImpl2 implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

//    public void setAccountDao(IAccountDao accountDao) {
//        this.accountDao = accountDao;
//    }

    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }

    @Override
    public void transfer(String sourceName, String targeName, Float money) {
        //1.根据名称查询两个账户
        Account source = accountDao.findAccountByName(sourceName);
        Account target = accountDao.findAccountByName(targeName);
        //2.修改两个账户的金额
        source.setMoney(source.getMoney() - money);//转出账户减钱
        target.setMoney(target.getMoney() + money);//转入账户加钱
        //3.更新两个账户
        accountDao.updateAccount(source);
//        int i = 1 / 0;
        accountDao.updateAccount(target);
    }
}
