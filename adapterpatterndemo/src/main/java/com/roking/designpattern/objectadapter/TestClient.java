package com.roking.designpattern.objectadapter;


import com.roking.designpattern.objectadapter.adapter.ObjectAdapter;

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
        ObjectAdapter oa=new ObjectAdapter();
        oa.encryptAndSave("测试数据");
    }
}
