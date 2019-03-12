package cn.tianyu.aop.proxy.staticProxy;

/**
 * 目标对象实现类
 * @author jiyukai
 */
public class Bussiness implements BussinessInterface{

    @Override
    public void execute() {
        System.out.println("执行业务逻辑...");
    }
}
