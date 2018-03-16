package com.roking.designpattern.commandqueue.command;

import com.roking.designpattern.commandqueue.receiver.CommandReceiver;

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
public class ThirdCommand extends AbCommand {

    private static final long serialVersionUID = -6265933735422459086L;


    private CommandReceiver commandReceiver = new CommandReceiver();

    @Override
    public void execute() {
        commandReceiver.do3rd();
    }
}
