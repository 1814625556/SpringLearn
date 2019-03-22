package cn.tianyu.annotation;

import org.springframework.stereotype.Component;

@Component("customerDao")
public class CustomerDao implements ICustomerDao{
    @Override
    public void saveCustomer() {
        System.out.println("CustomerDao.saveCustomer.......");
    }
}
