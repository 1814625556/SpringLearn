package cn.tianyu.annotation;

import cn.tianyu.annotation.domain.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("customerService")
public class CustomerService implements ICustomerService {

    @Resource(name = "customerDao")
    private ICustomerDao customerDao;

    @Value("chenchang is a good man...")
    private String name;

    @Override
    public void saveCustomer() {
        System.out.println("CustomerService.saveCustomer......"+name);
        customerDao.saveCustomer();
    }

    @Override
    public List<Customer> findAllCustomer() {
        return customerDao.findAllCustomer();
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerDao.saveCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Long custId) {
        customerDao.deleteCustomer(custId);
    }

    @Override
    public Customer findCustomerById(Long custId) {
        return customerDao.findCustomerById(custId);
    }
}
