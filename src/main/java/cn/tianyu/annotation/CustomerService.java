package cn.tianyu.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
}
