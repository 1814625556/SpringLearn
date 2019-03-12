package cn.tianyu.aop.proxy.staticProxy;

/**
 * 代理类，通过实现与目标对象相同的接口
 * 并维护一个代理对象，通过构造器传入实际目标对象并赋值
 * 执行代理对象实现的接口方法，实现对目标对象实现的干预
 * @author jiyukai
 */
public class BussinessProxy implements BussinessInterface{

    private BussinessInterface bussinessImpl;

    public BussinessProxy(BussinessInterface bussinessImpl) {
        this.bussinessImpl = bussinessImpl;
    }

    @Override
    public void execute() {
        System.out.println("前拦截...");
        bussinessImpl.execute();
        System.out.println("后拦截...");
    }
}