package com.roking.designpattern.decorator;

import com.roking.designpattern.composite.EncryptData;

/**
 * Title:具体装饰类</br>
 * <p/>
 * Description:根据业务需求，对具体构件进行装饰增强 </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/12/5.
 */
public class InverseEncryptDecotrator extends AbstractAlgorithmDecorator {

    public InverseEncryptDecotrator(EncryptData encryptData) {
        super(encryptData);
    }

    @Override
    public void showData() {
        this.doSimpleEncrypt();
        super.showData();
    }

    public void doSimpleEncrypt(){
        System.out.println("进行逆向输出加密");
    }
}
