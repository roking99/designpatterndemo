package com.roking.designpattern.makelog;

/**
 * Title:为了实现代理而抽取出来的抽象主题</br>
 * <p/>
 * Description:客户端面向该抽象主题编程即可 </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/15.
 */
public interface BusinessInt {
    /**
     * 业务处理方法
     */
    void processBusiness();
}
