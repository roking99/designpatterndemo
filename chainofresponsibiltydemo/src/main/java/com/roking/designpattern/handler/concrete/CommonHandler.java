package com.roking.designpattern.handler.concrete;

import com.roking.designpattern.handler.AbstractHandler;
import com.roking.designpattern.request.ChainRequest;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/30.
 */
public class CommonHandler extends AbstractHandler {
    public CommonHandler(String handlerName) {
        super(handlerName);
    }

    @Override
    public void processRequest(ChainRequest req) {
        Integer restDays = req.getRestDays();
        if(restDays==null||restDays<=0){
            System.out.println("没有输入正确的请假天数，请填写介于【0-30】之间的整数");
            return;
        }
        if(restDays>=30){
            System.out.println("请假天数超过30天，需提交线下书面申请，线上只能审批不超过30天的假期");
        }
    }
}
