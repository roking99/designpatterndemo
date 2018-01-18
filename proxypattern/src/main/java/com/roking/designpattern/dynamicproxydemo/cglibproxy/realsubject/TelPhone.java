package com.roking.designpattern.dynamicproxydemo.cglibproxy.realsubject;

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
public class TelPhone {

    public void call() {
        System.out.println("real subject call ");
    }

    /**
     * 不会被代理
     */
    public final void playMusic() {
        System.out.println("real subject final playMusic ");
    }


}
