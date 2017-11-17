package com.roking.designpattern.companyoa.composite;

import com.roking.designpattern.companyoa.AbstractOrganization;

import java.util.ArrayList;
import java.util.List;

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
public class GuangZhouCompany implements AbstractOrganization {
    private String name;

    public GuangZhouCompany(String name) {
        this.name = name;
    }

    private List<AbstractOrganization> departmentList = new ArrayList<>();
    @Override
    public void notice(String noticeContent) {
        System.out.println("通知："+name+"--------");
        for (AbstractOrganization ao :departmentList) {
            System.out.print("\t");ao.notice(noticeContent);
        }
    }

    @Override
    public AbstractOrganization getDepartment(int i) {
        return departmentList.get(i);
    }

    @Override
    public void addDepartment(AbstractOrganization ao) {
        departmentList.add(ao);
    }
}
