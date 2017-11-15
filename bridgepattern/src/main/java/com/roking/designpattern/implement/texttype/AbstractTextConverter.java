package com.roking.designpattern.implement.texttype;

import com.roking.designpattern.implement.datasourcetype.CommonDataSource;

/**
 * Title: 抽象类</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/11/15.
 */
public abstract class AbstractTextConverter {
    protected CommonDataSource commonDataSource;

    public void setCommonDataSource(CommonDataSource commonDataSource) {
        this.commonDataSource = commonDataSource;
    }
}
