package com.roking.designpattern.handler;

import com.roking.designpattern.request.ChainRequest;

/**
 * Title:抽象处理者</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/30.
 */
public abstract class AbstractHandler {
    /**
     * 维护一个抽象处理者类型的对象，以便具体处理者建立链接
     */
    protected AbstractHandler nextHandler;

    private String handlerName;

    public AbstractHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    public abstract void processRequest(ChainRequest req);

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }
}
