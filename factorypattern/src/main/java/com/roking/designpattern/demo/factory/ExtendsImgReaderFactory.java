package com.roking.designpattern.demo.factory;

import com.roking.designpattern.demo.product.AbstractImgReader;
import com.roking.designpattern.demo.product.ExtendsImgReader;

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
public class ExtendsImgReaderFactory extends AbstractReaderFactory {
    @Override
    public AbstractImgReader createImgReader() {
        //需要扩展时,得增加这个具体工厂类和具体的产品类
        return new ExtendsImgReader();
    }

    @Override
    public AbstractImgReader createImgReader(String args) {
        ExtendsImgReader extendsImgReader=new ExtendsImgReader();
        //args 可以是创建解析器需要的各种客户端传来的参数
        extendsImgReader.setUserName("abc");
        extendsImgReader.setPassWord("123");
        return extendsImgReader;
    }

    @Override
    public AbstractImgReader createImgReader(Object obj) {
        ExtendsImgReader extendsImgReader=new ExtendsImgReader();
        //obj 可以是创建解析器需要的各种客户端传来的参数
        extendsImgReader.setUserName("def");
        extendsImgReader.setPassWord("456");
        return extendsImgReader;
    }
}
