package com.roking.designpattern.factory;

import com.roking.designpattern.product.operation.OperationController;
import com.roking.designpattern.product.operation.WindowsOperation;
import com.roking.designpattern.product.system.GameSystem;
import com.roking.designpattern.product.system.WindowsSystem;
import com.roking.designpattern.product.userinterface.InterfaceController;
import com.roking.designpattern.product.userinterface.WindowsUIControl;

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
public class WindowsGameFactory implements GameFactory {
    public GameSystem customSystem() {
        return new WindowsSystem();
    }

    public InterfaceController customUI() {
        return new WindowsUIControl();
    }

    public OperationController customOperate() {
        return new WindowsOperation();
    }
}
