package com.roking.designpattern.dynamicproxydemo.jdkproxy.realsubject;

import com.roking.designpattern.dynamicproxydemo.jdkproxy.Car;
import com.roking.designpattern.dynamicproxydemo.jdkproxy.Plane;

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
public class FlyCar implements Car,Plane {
    @Override
    public void drive() {
        System.out.println("real subject drive");
    }

    @Override
    public void fly() {
        System.out.println("real subject fly");
    }
}
