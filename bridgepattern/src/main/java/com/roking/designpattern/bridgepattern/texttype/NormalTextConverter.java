package com.roking.designpattern.bridgepattern.texttype;

/**
 * Title:扩充抽象类</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/11/15.
 */
public class NormalTextConverter extends AbstractTextConverter {

    @Override
    public void convertAndInstance(String data) {
        System.out.println("convert to text "+data);
        dataSource.create(data);
    }
}
