package com.roking.designpatterndemo.concreteflyweight;

import com.roking.designpatterndemo.abstractflyweight.CommonMedia;
import com.roking.designpatterndemo.common.FacadeProp;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/12.
 */
public class AnimMedia implements CommonMedia {
    @Override
    public String mediaName() {
        System.out.println("这是动画");
        return "这是动画";
    }

    @Override
    public void mediaDisplay(FacadeProp fp) {
        System.out.println("大小："+fp.getSize()+"\t"+"坐标："+fp.getCoordinates());
    }
}
