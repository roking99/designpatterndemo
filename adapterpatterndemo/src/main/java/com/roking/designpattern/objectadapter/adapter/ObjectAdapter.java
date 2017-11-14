package com.roking.designpattern.objectadapter.adapter;


import com.roking.designpattern.objectadapter.adapee.DataSourceOperate;
import com.roking.designpattern.objectadapter.adapee.ThirdEncryption;
import com.roking.designpattern.objectadapter.target.TargetInterface;

/**
 * Title:对象适配器 <br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public class ObjectAdapter implements TargetInterface {
    /**
     * 定义数据库操作类
     */
    DataSourceOperate dso=new DataSourceOperate();
    /**
     * 定义加密操作类
     */
    ThirdEncryption te =new ThirdEncryption();

    @Override
    public void encryptAndSave(Object o) {
        dso.save(te.encrypt(o));
    }
}
