package com.roking.designpatterndemo.factory;

import com.roking.designpatterndemo.product.operation.OperationController;
import com.roking.designpatterndemo.product.system.GameSystem;
import com.roking.designpatterndemo.product.userinterface.InterfaceController;

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
public interface GameFactory {
    GameSystem customSystem();
    InterfaceController customUI();
    OperationController customOperate();
}
