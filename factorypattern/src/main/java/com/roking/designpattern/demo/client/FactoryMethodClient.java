package com.roking.designpattern.demo.client;

import com.roking.designpattern.demo.factory.AbstractReaderFactory;
import com.roking.designpattern.demo.util.XMLUtil;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/10/10.
 */
public class FactoryMethodClient {

    public static void main(String[] args) throws Exception {
        //AbstractReaderFactory readerFactory=new JpgImgReaderFactory();
        // 可以通过配置文件与反射机制提高灵活性
        //AbstractReaderFactory readerFactory= XMLUtil.getBean("JpgImgReaderFactory");
        //AbstractReaderFactory readerFactory= XMLUtil.getBean("PngImgReaderFactory");
        //AbstractReaderFactory readerFactory= XMLUtil.getBean("ExtendsImgReaderFactory");
        AbstractReaderFactory readerFactory= XMLUtil.getBean();
        readerFactory.readImg();
    }
}
