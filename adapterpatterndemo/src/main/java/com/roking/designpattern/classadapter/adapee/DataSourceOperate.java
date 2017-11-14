package com.roking.designpattern.classadapter.adapee;

/**
 * Title: <br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public interface DataSourceOperate<T> {
    void save(T t);
    void remove(T t);
    void select(T t);
    void modify(T t);
}
