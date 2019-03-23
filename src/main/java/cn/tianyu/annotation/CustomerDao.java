package cn.tianyu.annotation;

import cn.tianyu.annotation.domain.Customer;
import cn.tianyu.annotation.utils.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@Component("customerDao")
public class CustomerDao implements ICustomerDao{
    @Override
    public void saveCustomer() {
        System.out.println("CustomerDao.saveCustomer.......");
    }

//    private QueryRunner runner = new QueryRunner(C3P0Util.getDataSource());

//    通过注入的方式
    @Resource(name="runner")
    private QueryRunner runner;

    @Override
    public List<Customer> findAllCustomer() {
        try {
            return runner.query("select * from cst_customer",new BeanListHandler<Customer>(Customer.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveCustomer(Customer customer) {
        try {
            runner.update("insert into cst_customer(cust_name,cust_source,cust_industry,cust_level," +
                            "cust_address,cust_phone)values(?,?,?,?,?,?)",
                    customer.getCust_name(),customer.getCust_source(),customer.getCust_industry(),
                    customer.getCust_level(),customer.getCust_address(),customer.getCust_phone());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateCustomer(Customer customer) {
        try {
            runner.update("update cst_customer set cust_name=?,cust_source=?,cust_industry=?,cust_level=?,cust_address=?,cust_phone=?  where cust_id=?",
                    customer.getCust_name(),customer.getCust_source(),customer.getCust_industry(),
                    customer.getCust_level(),customer.getCust_address(),customer.getCust_phone(),customer.getCust_id());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteCustomer(Long custId) {
        try {
            runner.update("delete from cst_customer where cust_id = ? ",custId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Customer findCustomerById(Long custId) {
        try {
            return runner.query("select * from cst_customer where cust_id = ? ",new BeanHandler<Customer>(Customer.class),custId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
