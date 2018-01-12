package com.roking.designpatterndemo.concreteflyweight;

import com.roking.designpatterndemo.abstractflyweight.CommonMedia;
import com.roking.designpatterndemo.common.FacadeProp;

/**
 * Title:具体享元类--图片类</br>
 * <p/>
 * Description:对外提供的内部态，一般被定义为成员变量 </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/12.
 */
public class ImgMedia implements CommonMedia {
    @Override
    public String mediaName() {
        System.out.println("这是图片");
        return "这是图片";
    }

    @Override
    public void mediaDisplay(FacadeProp fp) {
        System.out.println("大小："+fp.getSize()+"\t"+"坐标："+fp.getCoordinates());
    }
}
