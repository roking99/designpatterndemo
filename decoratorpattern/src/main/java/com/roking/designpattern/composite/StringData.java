package com.roking.designpattern.composite;

/**
 * Title:具体构件</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/12/5.
 */
public class StringData implements EncryptData {
    @Override
    public void showData() {
        System.out.println("展示字符串信息");
    }
}
