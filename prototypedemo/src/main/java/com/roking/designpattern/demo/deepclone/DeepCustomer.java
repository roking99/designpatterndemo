package com.roking.designpattern.demo.deepclone;

import java.io.*;

/**
 * Title: <br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public class DeepCustomer implements Serializable,Cloneable{
    private String name;
    private int age;
    private DeepCustomerAddress addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCustomerAddress getAddr() {
        return addr;
    }

    public void setAddr(DeepCustomerAddress addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "DeepCustomer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr=" + addr +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 深克隆需要通过序列化的方式完成对象的克隆
     * @return
     */
    @Override
    public Object clone(){
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        ObjectOutputStream oos= null;
        try {
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            ByteArrayInputStream bais =new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois=new ObjectInputStream(bais);
            return ois.readObject();
        } catch (IOException e) {
            System.out.printf(" io exception "+e);
        } catch (ClassNotFoundException e) {
            System.out.println("class not found "+e);
        }
        return null;
    }

}
