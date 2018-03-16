package com.roking.designpattern.commandqueue.invoker;

import com.roking.designpattern.commandqueue.command.AbCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Title:命令执行者</br>
 * <p/>
 * Description:维护一个集合对象，存储要执行的命令，然后批量执行</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/3/2 下午3:37
 */
public class CommandInvoker {
    private List<AbCommand> commandList = new ArrayList<>();

    public void addCommand(AbCommand abCommand) {
        commandList.add(abCommand);
    }

    public void call() {
        if(commandList.size()==0){
            throw new RuntimeException("需要先添加命令");
        }


        for (AbCommand ac : commandList) {
            ac.execute();
        }
    }
}
