package com.roking.designpattern.makelog.realsubject;

import com.roking.designpattern.makelog.BusinessInt;

/**
 * Title:真实主题角色--业务处理类</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/15.
 */
public class BusinessProcessor implements BusinessInt {
    @Override
    public void processBusiness() {
        System.out.println("真实主题处理业务....");
    }
}
