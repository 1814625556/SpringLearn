package cn.tianyu.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        DaoUsing();
    }

    static void DaoUsing()
    {
        //1.获取Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("springjdbc.xml");
        IAccountDao dao = (IAccountDao) ac.getBean("accountDaoImpl2");
        Account act = dao.findAccountByName("aaa");
        System.out.println(act);
    }

    static void Insert()
    {
        //1.获取Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("springjdbc.xml");
        //2.根据id获取bean对象
        JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
        //3.执行操作
        //保存
        jt.update("insert into account(name,money)values(?,?)","eee",5000);
    }
    static void SearchAll()
    {
        //1.获取Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("springjdbc.xml");
        //2.根据id获取bean对象
        JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
        //3.执行操作
        //查询所有
        List<Account> accounts = jt.query("select * from account where money > ? ",
                new AccountRowMapper(), 500);
        for(Account o : accounts){
            System.out.println(o);
        }
    }
    static void SearchOne()
    {
        //1.获取Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("springjdbc.xml");
        //2.根据id获取bean对象
        JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
        //3.执行操作
        //查询一个
        List<Account> as = jt.query("select * from account where id = ? ",
                new AccountRowMapper(), 2);
        System.out.println(as.isEmpty()?"没有结果":as.get(0));
    }

}
