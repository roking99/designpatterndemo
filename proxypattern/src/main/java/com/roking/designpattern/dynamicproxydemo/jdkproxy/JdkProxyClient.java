package com.roking.designpattern.dynamicproxydemo.jdkproxy;

import com.roking.designpattern.dynamicproxydemo.jdkproxy.demoinvocation.InvocationHandlerImpl;
import com.roking.designpattern.dynamicproxydemo.jdkproxy.realsubject.FlyCar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Title:jdk动态代理 </br>
 * jdk动态代理通过反射生成代理类，代理类与实现类实现相同的接口，通过invocationhandler来以完成功能调用
 * 1、生成打代理类中所有方法都是final修饰的 <p/>
 * 2、除了接口中的方法之外，还有object中的equals(),hashCode(),toString()
 * 3、生成的代理类继承了Proxy 类
 * 4、代理类中的所有方法都是通过invocation handler 的invoke()方法来完成具体执行
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/18.
 */
public class JdkProxyClient {

    public static void main(String[] args) {
        FlyCar flyCar = new FlyCar();
        //反射创建代理类
        ClassLoader classLoader = flyCar.getClass().getClassLoader();
        InvocationHandler handler = new InvocationHandlerImpl(flyCar);
        //代理对象
        Object o = Proxy.newProxyInstance(classLoader, flyCar.getClass().getInterfaces(), handler);
        //强转成相应接口类型
        Car o1 = (Car) o;
        o1.drive();
        Plane o2 = (Plane) o;
        o2.fly();
        ProxyUtil.generateClassFile(flyCar.getClass(),"$flyCar");
    }
}
