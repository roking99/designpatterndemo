package com.roking.designpattern.practice.command;

import com.roking.designpattern.practice.receiver.BoardScreen;

/**
 * Title:具体命令类--打开命令</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/2/27 上午10:07
 */
public class OpenCommand extends AbstractCommand {
    private static final long serialVersionUID = -226195017203162965L;

    private BoardScreen receiver=new BoardScreen();

    @Override
    public void execute() {
        receiver.callEdit();
    }
}
