package com.roking.designpattern.client;

import com.roking.designpattern.handler.AbstractHandler;
import com.roking.designpattern.handler.concrete.CommonHandler;
import com.roking.designpattern.handler.concrete.Director;
import com.roking.designpattern.handler.concrete.GeneralManager;
import com.roking.designpattern.handler.concrete.Manager;
import com.roking.designpattern.request.ChainRequest;

/**
 * Title:职责链客户端</br>
 * <p/>
 * Description:职责链由客户端建立维护</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/30.
 */
public class ChainClient {

    public static void main(String[] args) {
        Director director = new Director("主任");
        Manager manger = new Manager("经理");
        GeneralManager gm = new GeneralManager("总经理");
        CommonHandler ch = new CommonHandler("通用处理");

        ///建立职责链
        director.setNextHandler(manger);
        manger.setNextHandler(gm);
        gm.setNextHandler(ch);

        ///发送请求
        ChainRequest cr = new ChainRequest(2);
        director.processRequest(cr);
        ChainRequest cr1 = new ChainRequest(4);
        director.processRequest(cr1);
        ChainRequest cr2 = new ChainRequest(12);
        director.processRequest(cr2);
        ChainRequest cr3 = new ChainRequest(30);
        director.processRequest(cr3);
        ChainRequest cr4 = new ChainRequest(-1);
        director.processRequest(cr4);
        ChainRequest cr5 = new ChainRequest(0);
        director.processRequest(cr5);
    }
}
