package com.roking.designpattern.decorator;

import com.roking.designpattern.composite.EncryptData;

/**
 * Title:抽象装饰类</br>
 * <p/>
 * Description: 维护一个抽象构件对象</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/12/5.
 */
public abstract class AbstractAlgorithmDecorator implements EncryptData {

    protected  EncryptData encryptData;

    public AbstractAlgorithmDecorator(EncryptData encryptData) {
        this.encryptData = encryptData;
    }

    @Override
    public void showData() {
        encryptData.showData();
    }
}
