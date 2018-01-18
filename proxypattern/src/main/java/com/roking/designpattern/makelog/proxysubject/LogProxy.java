package com.roking.designpattern.makelog.proxysubject;

import com.roking.designpattern.makelog.BusinessInt;
import com.roking.designpattern.makelog.realsubject.BusinessProcessor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Title:代理主题角色--处理业务时记录日志</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/15.
 */
public class LogProxy implements BusinessInt {
    /**
     * 维护一个真实主题角色
     */
    private BusinessProcessor bp = new BusinessProcessor();


    @Override
    public void processBusiness() {
        System.out.println("代理主题处理业务...");
        try {
            bp.processBusiness();
            makeLog();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("调用processBusiness()方法失败");
        }

    }

    public void makeLog() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:SSS");
        System.out.println("代理类记录当前时间：" + sdf.format(new Date()));
        System.out.println("代理类记录日志");
    }
}
