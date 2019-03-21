package cn.tianyu.springJdbcTransaction.Dao;

import cn.tianyu.springJdbcTransaction.Account;
import cn.tianyu.springJdbcTransaction.AccountRowMapper;
import cn.tianyu.springJdbcTransaction.JdbcDaoSupport;

import java.util.List;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao{
    public Account findAccountById(Integer id) {
        List<Account> list = getJdbcTemplate().query("select * from account where id = ? ",
                new AccountRowMapper(),id);
        return list.isEmpty()?null:list.get(0);
    }

    @Override
    public Account findAccountByName(String name) {
        List<Account> list =  getJdbcTemplate().query("select * from account where name = ? ",
                new AccountRowMapper(),name);
        if(list.isEmpty()){
            return null;
        }
        if(list.size()>1){
            throw new RuntimeException("结果集不唯一，不是只有一个账户对象");
        }
        return list.get(0);
    }

    @Override
    public void updateAccount(Account account) {
        getJdbcTemplate().update("update account set money = ? where id = ? ",
                account.getMoney(),account.getId());
    }
}
