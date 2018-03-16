package com.roking.designpattern.commandundo.command;

import com.roking.designpattern.commandundo.receiver.MInuser;

/**
 * Title:</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/3/2 下午3:44
 */
public class ComputeMinu extends AbsCommand{
    private static final long serialVersionUID = -4885050676108799930L;
    private int value;

    private MInuser minuser=new MInuser();

    @Override
    public int execute(int value) {
        this.value=value;
        return minuser.minus(value);
    }


    @Override
    public int undo() {
        return minuser.minus(-value);
    }
}
