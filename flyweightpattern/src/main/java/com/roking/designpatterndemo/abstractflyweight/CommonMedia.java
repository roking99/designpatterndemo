package com.roking.designpatterndemo.abstractflyweight;

import com.roking.designpatterndemo.common.FacadeProp;

/**
 * Title:抽象享元类</br>
 * <p/>
 * Description: 定义公共方法</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/12.
 */
public interface CommonMedia {
    /**
     * 对外提供内部状态方法
     */
    String mediaName();
    /**
     * 设置外部状态方法
     */
    void mediaDisplay(FacadeProp fp);

}
