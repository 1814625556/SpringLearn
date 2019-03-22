package cn.tianyu.springJdbcTransaction.Dao;

import cn.tianyu.springJdbcTransaction.Account;
import cn.tianyu.springJdbcTransaction.AccountRowMapper;
import cn.tianyu.springJdbcTransaction.JdbcDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public class AccountDaoImpl2  implements IAccountDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Account findAccountById(Integer id) {
        List<Account> list = jdbcTemplate.query("select * from account where id = ? ",
                new AccountRowMapper(),id);
        return list.isEmpty()?null:list.get(0);
    }

    @Override
    public Account findAccountByName(String name) {
        List<Account> list =  jdbcTemplate.query("select * from account where name = ? ",
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
        jdbcTemplate.update("update account set money = ? where id = ? ",
                account.getMoney(),account.getId());
    }
}
