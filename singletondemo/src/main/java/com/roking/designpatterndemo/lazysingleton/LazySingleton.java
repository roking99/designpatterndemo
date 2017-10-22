package com.roking.designpatterndemo.lazysingleton;

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
public class LazySingleton {
    /**
     * 不允许外部创建,所以私有构造函数
     */
    private LazySingleton() {
        System.out.println("懒汉模式延迟加载,使用实例时才创建");
    }
    /**
     * 延迟加载
     * volatile 关键字确保多线程间数据同步 配合双重校验使用
     */
    private static volatile  LazySingleton lazySingleton=null;
    /**
     * 共有访问方法
     * 双重校验确保实例唯一性
     */
    public static LazySingleton getLazySingleton(){
        //一次校验
        if(lazySingleton==null){
            //加线程锁
            synchronized(LazySingleton.class){
                //二次校验
                if(lazySingleton==null){
                    lazySingleton=new LazySingleton();
                }
            }
        }
        return  lazySingleton;
    }

    /**
     * 若不使用双重校验 还可以这样
     * 但这种方式在高并发时会影响系统性能
     * @return
     */
    synchronized public static LazySingleton getSynMethodLazySingleton(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }

    private String name;

    public void sayHi(){
        System.out.println(" this is lazySingleton; my name is:"+lazySingleton.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
