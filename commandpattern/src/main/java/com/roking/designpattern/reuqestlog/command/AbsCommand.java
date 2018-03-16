package com.roking.designpattern.reuqestlog.command;

/**
 * Title:</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/3/7 下午3:56
 */
public abstract class AbsCommand {

    public abstract void exceute();

    public abstract void exceute(String args);
}
