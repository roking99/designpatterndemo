package com.roking.designpattern.practice.receiver;

/**
 * Title:充当命令接收者</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/2/27 上午9:53
 */
public class BoardScreen {

    public void callOpen() {
        System.out.println("-----open--------");
    }

    public void callCreate() {
        System.out.println("-----create--------");
    }

    public void callEdit() {
        System.out.println("-----edit--------");
    }
}
