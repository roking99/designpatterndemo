package com.roking.designpattern.bridgepattern.datasourcetype;

/**
 * Title:具体实现类，这里实现了实现类接口定义的方法，并增加了自己的业务方法
 * 在程序运行时，由于 多态 的存在可以将该子类对象返回</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/11/15.
 */
public class MysqlDataSource implements CommonDataSource {
    @Override
    public void create(String data) {
        System.out.println("mysql create"+data);
    }

    @Override
    public void retrieve(String data) {
        System.out.println("mysql retrieve"+data);
    }

    @Override
    public void update(String data) {
        System.out.println("mysql update"+data);
    }

    @Override
    public void delete(String data) {
        System.out.println("mysql delete"+data);
    }

}
