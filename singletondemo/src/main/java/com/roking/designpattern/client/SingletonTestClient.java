package com.roking.designpattern.client;

import com.roking.designpattern.hungrysingleton.HungrySingleton;
import com.roking.designpattern.iodhsingleton.IoDHSingleton;
import com.roking.designpattern.lazysingleton.LazySingleton;

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
public class SingletonTestClient {

    public static void main(String[] args) {
        ///饿汉模式
        ///HungrySingleton hungrySingleton=HungrySingleton.getHungrySingleton();
        ///hungrySingleton.setName("test hungry");
        ///hungrySingleton.sayHi();

        ///懒汉模式
        ///LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        ///lazySingleton.setName("test lazy");
        ///lazySingleton.sayHi();

        //IoDH(Initialization Demand Holder) 通过内部类的方式实现单例模式
        IoDHSingleton ioDHSingleton=IoDHSingleton.getIoDHSingleton();
        ioDHSingleton.setName("test ioDH");
        ioDHSingleton.sayHi();
    }

}
