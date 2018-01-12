package com.roking.designpatterndemo.client;

import com.roking.designpatterndemo.abstractflyweight.CommonMedia;
import com.roking.designpatterndemo.common.FacadeProp;
import com.roking.designpatterndemo.factory.FlyweightFactory;

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
public class TestClient {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory=FlyweightFactory.buildInstance();
        CommonMedia img = flyweightFactory.getMedia("img");
        CommonMedia video = flyweightFactory.getMedia("video");
        CommonMedia animation = flyweightFactory.getMedia("animation");

        video.mediaName();
        animation.mediaName();
        img.mediaName();
        img.mediaDisplay(new FacadeProp("2,3","18"));
        video.mediaDisplay(new FacadeProp("4,5","20"));
        animation.mediaDisplay(new FacadeProp("6,7","22"));
    }
}
