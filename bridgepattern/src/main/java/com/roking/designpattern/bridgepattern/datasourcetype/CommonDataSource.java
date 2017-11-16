package com.roking.designpattern.bridgepattern.datasourcetype;

/**
 * Title:实现类接口</br>
 *  这里一般只定义一些基本操作方法<p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/11/15.
 */
public interface CommonDataSource {
    void create(String data);
    void retrieve(String data);
    void update(String data);
    void delete(String data);
}
