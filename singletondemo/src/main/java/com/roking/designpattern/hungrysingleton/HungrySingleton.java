package com.roking.designpattern.hungrysingleton;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/10/22.
 */
public class HungrySingleton {
    /**
     * 1、只允许自身实例化,所以私有化构造函数
     */
    private HungrySingleton() {
        System.out.println("类加载时完成饿汉单例类实例化");
    }
    /**
     * 2、确保唯一性,在类加载时完成单例对象的创建
     */
    private static final HungrySingleton HUNGRY_SINGLETON=new HungrySingleton();
    /**
     * 3、提供获取单例对象的全局访问方法
     */
    public static HungrySingleton getHungrySingleton(){
        return HUNGRY_SINGLETON;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHi(){
        System.out.println("hello this is hungry singleton,My name is :"+HUNGRY_SINGLETON.getName());
    }

}
