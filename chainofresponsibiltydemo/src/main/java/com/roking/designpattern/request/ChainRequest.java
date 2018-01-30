package com.roking.designpattern.request;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/1/30.
 */
public class ChainRequest {

    public ChainRequest(){}

    public ChainRequest(Integer restDays) {
        this.restDays = restDays;
    }

    private Integer restDays;

    public Integer getRestDays() {
        return restDays;
    }

    public void setRestDays(Integer restDays) {
        this.restDays = restDays;
    }
}
