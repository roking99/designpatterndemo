package com.roking.designpattern.bridgepattern.texttype;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/11/15.
 */
public class XmlTextConverter extends AbstractTextConverter {
    @Override
    public void convertAndInstance(String data){
        System.out.println("  convert to xml"+data);
        dataSource.create(data);
    }
}
