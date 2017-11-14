package com.roking.designpattern.classadapter.target;

/**
 * Title: <br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public interface TargetInterface<T > {
    void aesEncryptAndSave(T t);
    void desEncryptAndSave(T t);
    void rsaEncryptAndSave(T t);
}
