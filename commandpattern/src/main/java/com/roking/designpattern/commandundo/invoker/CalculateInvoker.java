package com.roking.designpattern.commandundo.invoker;


import com.roking.designpattern.commandundo.command.AbsCommand;

/**
 * Title:</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/3/2 下午3:59
 */
public class CalculateInvoker {

    private AbsCommand abstractCommand;

    public int  call(int value){
        return this.abstractCommand.execute(value);
    }
    public int  undo( ){
        return this.abstractCommand.undo();
    }

    public AbsCommand getAbstractCommand() {
        return abstractCommand;
    }

    public void setAbstractCommand(AbsCommand abstractCommand) {
        this.abstractCommand = abstractCommand;
    }
}
