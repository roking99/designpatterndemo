package com.roking.designpattern.practice.command;

import com.roking.designpattern.practice.receiver.BoardScreen;

/**
 * Title:</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/2/27 上午10:39
 */
public class CreateCommand extends AbstractCommand{
    private static final long serialVersionUID = -7310373852166746921L;
    private BoardScreen receiver=new BoardScreen();

    @Override
    public void execute() {
        receiver.callCreate();
    }
}
