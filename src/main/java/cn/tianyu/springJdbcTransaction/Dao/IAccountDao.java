package cn.tianyu.springJdbcTransaction.Dao;

import cn.tianyu.springJdbcTransaction.Account;

/**
 * 账户的持久层接口
 */
public interface IAccountDao {

    /**
     * 根据id查询账户信息
     * @param id
     * @return
     */
    Account findAccountById(Integer id);

    /**
     * 根据名称查询账户信息
     * @return
     */
    Account findAccountByName(String name);

    /**
     * 更新账户信息
     * @param account
     */
    void updateAccount(Account account);
}
