package com.roking.designpattern.commandqueue.command;

import java.io.Serializable;

/**
 * Title:</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/3/2 下午3:29
 */
public abstract class AbCommand implements Serializable{

    private static final long serialVersionUID = 8127571574697554044L;

    public abstract void execute();
}
