package com.roking.designpattern.companyoa.composite;

import com.roking.designpattern.companyoa.AbstractOrganization;

import java.util.*;

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
public class ShangHaiCompany implements AbstractOrganization {
    private String name;

    public ShangHaiCompany(String name) {
        this.name = name;
    }

    private List<AbstractOrganization> departmentList = new ArrayList<>();

    @Override
    public void notice(String noticeContent) {
        System.out.println("通知："+name+"--------");
        for (AbstractOrganization ao :departmentList) {
            ao.notice(noticeContent);
        }
    }

    @Override
    public AbstractOrganization getDepartment(int i) {
        return departmentList.get(i);
    }

    @Override
    public void addDepartment(AbstractOrganization abstractOrganization) {
        departmentList.add(abstractOrganization);
    }
}
