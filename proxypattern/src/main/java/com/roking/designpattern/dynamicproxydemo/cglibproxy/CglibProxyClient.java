package com.roking.designpattern.dynamicproxydemo.cglibproxy;

import com.roking.designpattern.dynamicproxydemo.cglibproxy.realsubject.TelPhone;
import com.roking.designpattern.dynamicproxydemo.jdkproxy.ProxyUtil;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;

/**
 * Title:cglib 动态代理
 *  </br>
 *  cglib 是通过生成真实对象的子类配合methodInterceptor来完成代理功能的， 因此真实对象中的final方法是不能被代理的</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/18.
 */
public class CglibProxyClient {

    public static void main(String[] args) {
        MethodIntercetperImpl tel=new MethodIntercetperImpl();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(TelPhone.class);
        enhancer.setCallback(tel);
        TelPhone o = (TelPhone)enhancer.create();
        o.call();
        o.playMusic();
        ProxyUtil.generateClassFile(o.getClass(),"$telPhone");
    }
}
