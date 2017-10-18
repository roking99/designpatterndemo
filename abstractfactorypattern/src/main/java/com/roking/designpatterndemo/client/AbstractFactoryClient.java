package com.roking.designpatterndemo.client;

import com.roking.designpatterndemo.factory.GameFactory;
import com.roking.designpatterndemo.factory.WindowsGameFactory;
import com.roking.designpatterndemo.product.operation.OperationController;
import com.roking.designpatterndemo.product.system.GameSystem;
import com.roking.designpatterndemo.product.userinterface.InterfaceController;
import com.roking.designpatterndemo.util.XmlUtil;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/10/18.
 */
public class AbstractFactoryClient {

    public static void main(String[] args) throws Exception {
        GameFactory gameFactory= XmlUtil.getBean();
        GameSystem gameSystem = gameFactory.customSystem();
        InterfaceController interfaceController = gameFactory.customUI();
        OperationController operationController = gameFactory.customOperate();
        gameSystem.startUp();
        interfaceController.displayUI();
        operationController.doOperate();
    }
}
