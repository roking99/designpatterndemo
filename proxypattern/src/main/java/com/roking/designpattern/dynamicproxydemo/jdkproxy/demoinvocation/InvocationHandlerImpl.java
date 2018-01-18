package com.roking.designpattern.dynamicproxydemo.jdkproxy.demoinvocation;

import com.roking.designpattern.dynamicproxydemo.jdkproxy.realsubject.FlyCar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/18.
 */
public class InvocationHandlerImpl implements InvocationHandler {
    /**
     *     引入真实对象
     */
    private FlyCar flyCar;

    public InvocationHandlerImpl(FlyCar flyCar) {
        this.flyCar = flyCar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行方法："+method.getName());
        method.invoke(flyCar);
        System.out.println("方法："+method.getName()+"执行完成");
        return null;
    }
}
