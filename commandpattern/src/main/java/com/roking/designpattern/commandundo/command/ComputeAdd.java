package com.roking.designpattern.commandundo.command;

import com.roking.designpattern.commandundo.receiver.Adder;

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
public class ComputeAdd extends AbsCommand{
    private static final long serialVersionUID = -5695007011994220039L;

    private int value;

    private Adder adder=new Adder();

    @Override
    public int execute(int value) {
        this.value=value;
        return adder.add(value);

    }

    @Override
    public int undo() {
        return adder.add(-value);

    }
}
