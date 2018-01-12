package com.roking.designpatterndemo.concreteflyweight;

import com.roking.designpatterndemo.abstractflyweight.AbstractFlyweight;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/11.
 */
public class ConcreteFlyweight implements AbstractFlyweight {
    /**
     * 通常内部状态作为享元类的成员变量
     * @param intrinsicState
     * @return
     */
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public String getIntrinsicState() {
        return intrinsicState;
    }

    @Override
    public void setExtrinsicState(String extrinsicState) {
        System.out.println("这是外部状态: "+extrinsicState);
    }
}
