package com.roking.designpattern.companyoa;

import com.roking.designpattern.companyoa.composite.GuangZhouCompany;
import com.roking.designpattern.companyoa.leaf.DevelopDepartment;
import com.roking.designpattern.companyoa.leaf.FinanceDepartment;
import com.roking.designpattern.companyoa.leaf.HrDepartment;

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
public class TestClient {
    public static void main(String[] args) {
        AbstractOrganization ao=new GuangZhouCompany();
        ao.addDepartment(new DevelopDepartment());
        ao.addDepartment(new FinanceDepartment());
        ao.addDepartment(new HrDepartment());
        AbstractOrganization aod=new DevelopDepartment();
        ao.notice("");
        AbstractOrganization department = ao.getDepartment(1);
        department.notice("");
    }
}
