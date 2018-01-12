package com.roking.designpatterndemo.factory;

import com.roking.designpatterndemo.abstractflyweight.AbstractFlyweight;
import com.roking.designpatterndemo.concreteflyweight.ConcreteFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Title:享元工厂类</br>
 * 需要提供一个享元池 用来完成享元对象的创建<p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/11.
 */
public class FlyweightFactory {

    private static volatile FlyweightFactory flyweightFactory=null;

    private  FlyweightFactory() {
    }

    public FlyweightFactory getFlyweightFactory(){
        if(flyweightFactory==null){
            synchronized(FlyweightFactory.class){
                if(flyweightFactory==null){
                    flyweightFactory=new FlyweightFactory();
                }
            }
        }
        return flyweightFactory;
    }

    /**
     *享元池
     */
    private static Map flyWeightPool=new HashMap();

    public AbstractFlyweight geFlyWeight(String key) {
        if(flyWeightPool.containsKey(key)){
            return (AbstractFlyweight) flyWeightPool.get(key);
        }else{
            AbstractFlyweight flyweight=new ConcreteFlyweight("通用内部状态");
            flyWeightPool.put(key,flyweight);
            return flyweight;
        }
    }
}
