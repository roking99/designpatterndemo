package com.roking.designpattern.makelog.client;

import com.roking.designpattern.makelog.BusinessInt;
import com.roking.designpattern.makelog.proxysubject.LogProxy;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/15.
 */
public class TestMakeLog {
    public static void main(String[] args) {
        BusinessInt bi = new LogProxy();
        bi.processBusiness();
    }
}
