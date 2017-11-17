package com.roking.designpattern.companyoa.leaf;

import com.roking.designpattern.companyoa.AbstractOrganization;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/11/16.
 */
public class FinanceDepartment implements AbstractOrganization {
    private String name;

    public FinanceDepartment(String name) {
        this.name = name;
    }

    @Override
    public void notice(String noticeContent) {
        System.out.println("通知"+name+":"+noticeContent);
    }

    @Override
    public AbstractOrganization getDepartment(int i) {
        throw new RuntimeException(" not support method !! ");
    }

    @Override
    public void addDepartment(AbstractOrganization abstractOrganization) {
        throw new RuntimeException(" not support method !! ");
    }
}
