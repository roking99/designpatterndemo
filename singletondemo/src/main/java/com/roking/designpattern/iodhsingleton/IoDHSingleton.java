package com.roking.designpattern.iodhsingleton;

/**
 * Title:</br>
 * <p/>
 * Description: 通过内部类实现单例模式</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/10/22.
 */
public class IoDHSingleton {
    /**
     * 不允许外部创建
     */
    private IoDHSingleton(){
        System.out.println("通过内部类的方式,实现了延迟加载及唯一性确保");
    }
    /**
     * 内部类完成单例类的实例化
     */
    private static class IoDhSingletonWoker{
        private static final  IoDHSingleton IODH_SINGLETON=new IoDHSingleton();
    }
    /**
     * 公共访问方法
     */
    public static IoDHSingleton getIoDHSingleton(){
        return IoDhSingletonWoker.IODH_SINGLETON;
    }

    private String name;
    public void sayHi(){
        System.out.println("this is IoDHSingleton,my name is:"+getIoDHSingleton().getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
