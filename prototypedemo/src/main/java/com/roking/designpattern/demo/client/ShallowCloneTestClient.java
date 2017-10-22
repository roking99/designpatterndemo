package com.roking.designpattern.demo.client;

import com.roking.designpattern.demo.shallowclone.Customer;
import com.roking.designpattern.demo.shallowclone.CustomerAddress;

/**
 * Title: <br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public class ShallowCloneTestClient {

    public static void main(String[] args) {
        Customer co = new Customer();
        co.setName("zs");
        co.setAge("10");
        CustomerAddress addr = new CustomerAddress();
        addr.setStreetName("经海路");
        addr.setStreetNo(18);
        co.setAddr(addr);
        Customer cc = (Customer) co.clone();
        System.out.println(co == cc);
        System.out.println(co.equals(cc));//这里重写equals方法可以使结果返回true
        //浅克隆在克隆对象时;对于引用属性的复制的是其引用地址
        System.out.println(co.getAddr() == cc.getAddr());
    }
}
