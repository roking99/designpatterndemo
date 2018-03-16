package com.roking.designpattern.commandqueue;

import com.roking.designpattern.commandqueue.command.AbCommand;
import com.roking.designpattern.commandqueue.command.FirstCommand;
import com.roking.designpattern.commandqueue.command.SecondCommand;
import com.roking.designpattern.commandqueue.command.ThirdCommand;
import com.roking.designpattern.commandqueue.invoker.CommandInvoker;
import sun.security.provider.SHA;

/**
 * Title:</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/3/2 下午3:31
 */
public class TestClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        CommandInvoker ci=new CommandInvoker();
        AbCommand fc=new FirstCommand();
        AbCommand sc=new SecondCommand();
        AbCommand tc=new ThirdCommand();
        ci.addCommand(fc);
        ci.addCommand(sc);
        ci.addCommand(tc);

        ci.call();

    }
}
