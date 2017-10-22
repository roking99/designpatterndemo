package com.roking.designpattern.demo.client;

import com.roking.designpattern.demo.deepclone.DeepCustomer;
import com.roking.designpattern.demo.deepclone.DeepCustomerAddress;

/**
 * Title: <br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public class DeepCloneTestClient {
    public static void main(String[] args) {
        DeepCustomer dc=new DeepCustomer();
        dc.setName("ls");
        DeepCustomerAddress addr=new DeepCustomerAddress();
        addr.setStreetName("科创街");
        addr.setStreetNo(21);
        dc.setAddr(addr);
        dc.setAge(10);
        DeepCustomer dClone = (DeepCustomer) dc.clone();
        System.out.println(dc==dClone);
        System.out.println(dc.equals(dClone));
        System.out.println(dc.getAge()==dClone.getAge());
        System.out.println(dc.getName()==dClone.getName());
        System.out.println(dc.getName().equals(dClone.getName()));
        System.out.println(dc.getAddr()==dClone.getAddr());
        System.out.println(dc.getAddr().equals(dClone.getAddr()));
        System.out.println("dc:"+dc.toString());
        System.out.println("dClone:"+dClone.toString());
        //结论：深克隆 只复制了对象、对象引用属性的值，但是无论对象还是对象引用的属性的地址都使用新的地址;
    }
}
