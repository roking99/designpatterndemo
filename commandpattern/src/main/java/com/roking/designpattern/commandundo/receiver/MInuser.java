package com.roking.designpattern.commandundo.receiver;

/**
 * Title:</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/3/2 下午3:48
 */
public class MInuser {

    private int value=0;

    public int minus(int minValue){
        return value-=minValue;
    }
}
