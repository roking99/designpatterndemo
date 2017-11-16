package com.roking.designpattern.bridgepattern.texttype;

import com.roking.designpattern.bridgepattern.datasourcetype.CommonDataSource;

/**
 * Title: 抽象类</br>
 * 这里通过引入并管理实现类接口对象 来将两个独立的维度进行桥接<p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/11/15.
 */
public abstract class AbstractTextConverter {
    protected CommonDataSource dataSource;

    public CommonDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(CommonDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public abstract void convertAndInstance(String data);
}
