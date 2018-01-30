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
public class Manager extends AbstractHandler {

    public Manager(String handlerName) {
        super(handlerName);
    }

    @Override
    public void processRequest(ChainRequest req) {
        Integer restDays = req.getRestDays();
        if (restDays != null && restDays < 10 && restDays >= 3) {
            System.out.println("请假："+restDays+"天，经理审批通过，请求处理完成");
        }else{
            this.nextHandler.processRequest(req);
        }
    }
}
