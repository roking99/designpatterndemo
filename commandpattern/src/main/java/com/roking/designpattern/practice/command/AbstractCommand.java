package com.roking.designpattern.practice.command;

import java.io.Serializable;

/**
 * Title:抽象命令类</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/2/27 上午10:00
 */
public abstract class AbstractCommand implements Serializable {

    private static final long serialVersionUID = -7112672695131856098L;

    public abstract void execute();
}
