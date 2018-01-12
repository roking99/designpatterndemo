package com.roking.designpatterndemo.abstractflyweight;

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
public interface AbstractFlyweight {
    /**
     * 提供内部态方法
     * @return
     */
    String getIntrinsicState();
    /**
     * 注入外部态方法
     */
    public void setExtrinsicState(String extrinsicState);
}
