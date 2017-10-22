package com.roking.designpattern.demo.shallowclone;

/**
 * Title: <br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public class Customer implements Cloneable{
    private String name;
    private String age;
    private CustomerAddress addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public CustomerAddress getAddr() {
        return addr;
    }

    public void setAddr(CustomerAddress addr) {
        this.addr = addr;
    }


    @Override
    public Object clone() {
        Object co =null;
        try {
            co = (Customer)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(" not support clone ");
        }
        return co;
    }
}
