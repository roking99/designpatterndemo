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
public class ThirdEncryption<T>  {

    protected String aesEncrypt(T t){
        return "aes encrypt"+t.toString();
    }

    protected String desEncrypt(T t){
        return "des"+t.toString();
    }

    protected String rsaEncrypt(T t){
        return "rsa"+t.toString();
    }

}
