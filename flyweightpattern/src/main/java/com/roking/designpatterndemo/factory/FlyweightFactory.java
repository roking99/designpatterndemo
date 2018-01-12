package com.roking.designpatterndemo.factory;

import com.roking.designpatterndemo.abstractflyweight.CommonMedia;
import com.roking.designpatterndemo.concreteflyweight.AnimMedia;
import com.roking.designpatterndemo.concreteflyweight.ImgMedia;
import com.roking.designpatterndemo.concreteflyweight.VideoMedia;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Title:享元工厂</br>
 * <p/>
 * Description:使用饿汗单例模式设计该工厂，对外提供相同的享元对象 </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/12.
 */
public class FlyweightFactory {

    private static final String IMG_MEDIA = "img";
    private static final String VIDEO_MEDIA = "video";
    private static final String ANIMATION_MEDIA = "animation";

    private static FlyweightFactory flyweightFactory = new FlyweightFactory();

    private FlyweightFactory() {
    }

    public static FlyweightFactory buildInstance() {
        return flyweightFactory;
    }

    /**
     * 享元池
     */
    private static ConcurrentHashMap<String, CommonMedia> flyweightPool = new ConcurrentHashMap<String, CommonMedia>();

    /**
     * 存在直接返回，否则copy on write
     *
     * @param mediaType 多媒体类型
     * @return CommonMedia
     */
    public  CommonMedia getMedia(String mediaType) {
        if (flyweightPool.containsKey(mediaType)) {
            return flyweightPool.get(mediaType);
        }
        if (IMG_MEDIA.equalsIgnoreCase(mediaType)) {
            CommonMedia media = new ImgMedia();
            flyweightPool.put(mediaType, media);
            return media;
        }
        if (VIDEO_MEDIA.equalsIgnoreCase(mediaType)) {
            CommonMedia media = new VideoMedia();
            flyweightPool.put(mediaType, media);
            return media;
        }
        if (ANIMATION_MEDIA.equalsIgnoreCase(mediaType)) {
            CommonMedia media = new AnimMedia();
            flyweightPool.put(mediaType, media);
            return media;
        }
        throw new RuntimeException("not support media type,only allow: img/video/animation");
    }

}
