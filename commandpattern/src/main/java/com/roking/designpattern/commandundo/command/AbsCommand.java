package com.roking.designpattern.commandundo.command;

import java.io.Serializable;

/**
 * Title:具有撤销功能的抽象命令类</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/3/2 下午3:43
 */
public abstract class AbsCommand implements Serializable{
    private static final long serialVersionUID = 8590400875636837500L;

    public abstract int execute(int value);

    public abstract int undo();

}
