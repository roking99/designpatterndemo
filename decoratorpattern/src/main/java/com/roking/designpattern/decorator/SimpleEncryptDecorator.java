package com.roking.designpattern.decorator;

import com.roking.designpattern.composite.EncryptData;

/**
 * Title:具体装饰类</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/12/5.
 */
public class SimpleEncryptDecorator extends AbstractAlgorithmDecorator {
    public SimpleEncryptDecorator(EncryptData encryptData) {
        super(encryptData);
    }

    @Override
    public void showData() {
        this.doSimpleEncrypt();
        super.showData();
    }

    public void doSimpleEncrypt(){
        System.out.println("进行简单加密");
    }
}
