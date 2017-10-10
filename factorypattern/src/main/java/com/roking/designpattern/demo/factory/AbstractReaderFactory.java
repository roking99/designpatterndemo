package com.roking.designpattern.demo.factory;

import com.roking.designpattern.demo.product.AbstractImgReader;

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
public abstract class AbstractReaderFactory {

    public abstract AbstractImgReader createImgReader();

    public void readImg(){
        AbstractImgReader imgReader = this.createImgReader();
        imgReader.readImg();
    }
}
