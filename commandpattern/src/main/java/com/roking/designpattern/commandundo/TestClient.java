package com.roking.designpattern.commandundo;

import com.roking.designpattern.commandundo.command.AbsCommand;
import com.roking.designpattern.commandundo.command.ComputeAdd;
import com.roking.designpattern.commandundo.command.ComputeMinu;
import com.roking.designpattern.commandundo.invoker.CalculateInvoker;

/**
 * Title:</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/3/2 下午3:42
 */
public class TestClient {
    public static void main(String[] args) {
        CalculateInvoker caculateInvoker=new CalculateInvoker();
//        AbsCommand addCommand=new ComputeAdd();
        AbsCommand minCommand=new ComputeMinu();
        caculateInvoker.setAbstractCommand(minCommand);
        System.out.println(caculateInvoker.call(10));
//        System.out.println(caculateInvoker.undo());
        System.out.println(caculateInvoker.call(12));
        System.out.println(caculateInvoker.undo());

    }
}
