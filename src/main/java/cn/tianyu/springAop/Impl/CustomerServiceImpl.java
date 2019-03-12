package cn.tianyu.springAop.Impl;

import cn.tianyu.springAop.ICustomerService;

/**
 * 模拟客户业务层的实现类
 * @author zhy
 *
 */
public class CustomerServiceImpl implements ICustomerService {

    @Override
    public void saveCustomer() {
        System.out.println("保存了客户");
    }

    @Override
    public void updateCustomer(int i) {
        System.out.println("更新了客户。。。"+i);
    }

    @Override
    public int deleteCustomer() {
        System.out.println("删除了客户");
        return 0;
    }

}
