package com.roking.designpattern.bridgepattern.datasourcetype;

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
public class SqlServerDataSource implements CommonDataSource {
    @Override
    public void create(String data) {
        System.out.println(" sqlserver create"+data);
    }

    @Override
    public void retrieve(String data) {
        System.out.println(" sqlserver retrieve"+data);
    }

    @Override
    public void update(String data) {
        System.out.println(" sqlserver update"+data);
    }

    @Override
    public void delete(String data) {
        System.out.println(" sqlserver delete"+data);
    }
}
