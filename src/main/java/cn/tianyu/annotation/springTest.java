package cn.tianyu.annotation;

import cn.tianyu.annotation.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={annotationConfig.class})
public class springTest {
    @Autowired
    private ICustomerService cs = null;

    @Test
    public void testFindAllCustomer() {
        List<Customer> list = cs.findAllCustomer();
        for(Customer c : list){
            System.out.println(c);
        }
    }

    @Test
    public void testSaveCustomer() {
        Customer c = new Customer();
        c.setCust_name("dbutils customer annotation");
        cs.saveCustomer(c);
    }

    @Test
    public void testUpdateCustomer() {
        Customer c = cs.findCustomerById(94L);
        c.setCust_address("北京市顺义区");
        cs.updateCustomer(c);
    }

    @Test
    public void testDeleteCustomer() {
        cs.deleteCustomer(95L);
    }

    @Test
    public void testFindCustomerById() {
        Customer c = cs.findCustomerById(94L);
        System.out.println(c);
    }
}
