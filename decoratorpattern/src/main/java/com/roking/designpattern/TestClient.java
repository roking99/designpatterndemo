package com.roking.designpattern;

import com.roking.designpattern.composite.EncryptData;
import com.roking.designpattern.composite.StringData;
import com.roking.designpattern.decorator.AbstractAlgorithmDecorator;
import com.roking.designpattern.decorator.InverseEncryptDecotrator;
import com.roking.designpattern.decorator.RSAEncryptDecorator;
import com.roking.designpattern.decorator.SimpleEncryptDecorator;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/12/5.
 */
public class TestClient {

    public static void main(String[] args) {
        AbstractAlgorithmDecorator sd=new SimpleEncryptDecorator(new StringData());
        ///sd.showData(); 单次加密
        AbstractAlgorithmDecorator rsaData=new RSAEncryptDecorator(sd);
        AbstractAlgorithmDecorator inverseData=new InverseEncryptDecotrator(rsaData);
        inverseData.showData();//多次加密
    }
}
