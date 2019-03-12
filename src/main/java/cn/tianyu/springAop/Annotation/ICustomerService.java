package cn.tianyu.springAop.Annotation;

public interface ICustomerService {
    /**
     * 保存客户
     */
    void saveCustomer();

    /**
     * 更新客户
     * @param i
     */
    void updateCustomer(int i);

    /**
     * 删除客户
     * @return
     */
    int deleteCustomer();
}
