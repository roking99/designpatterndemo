package com.roking.designpattern.classadapter.adapter;

import com.roking.designpattern.classadapter.adapee.DataSourceOperate;
import com.roking.designpattern.classadapter.adapee.ThirdEncryption;
import com.roking.designpattern.classadapter.target.TargetInterface;

/**
 * Title: 类适配器模式<br>
 * <p/>
 * Description: java 单继承，所以类适配器模式只能继承一个适配者<br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public class ClazzAdapter extends ThirdEncryption implements DataSourceOperate,TargetInterface {

    @Override
    public void save(Object o) {
      System.out.println(" 保存"+o.toString());
    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public void select(Object o) {

    }

    @Override
    public void modify(Object o) {

    }

    @Override
    public void aesEncryptAndSave(Object o) {
        String s = aesEncrypt(o);
        this.save(s);
    }

    @Override
    public void desEncryptAndSave(Object o) {
        String s = desEncrypt(o);
        this.save(s);
    }

    @Override
    public void rsaEncryptAndSave(Object o) {
        String s = rsaEncrypt(o);
        this.save(s);
    }
}
