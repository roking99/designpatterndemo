package com.roking.designpattern.demo.factory;

import com.roking.designpattern.demo.product.AbstractImgReader;
import com.roking.designpattern.demo.product.PngImgReader;

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
public class PngImgReaderFactory extends AbstractReaderFactory {
    public AbstractImgReader createImgReader() {
        return new PngImgReader();
    }

    @Override
    public AbstractImgReader createImgReader(String args) {
        return null;
    }

    @Override
    public AbstractImgReader createImgReader(Object obj) {
        return null;
    }
}
