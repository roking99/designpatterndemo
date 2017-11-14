package com.roking.designpattern.classadapter;

import com.roking.designpattern.classadapter.adapter.ClazzAdapter;

/**
 * Title: <br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public class TestClient {
    public static void main(String[] args) {
        ClazzAdapter ca=new ClazzAdapter();
        ca.aesEncryptAndSave("test aes");
        ca.rsaEncryptAndSave("test rsa");
        ca.desEncryptAndSave("test des");
    }
}
