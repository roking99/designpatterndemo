package com.roking.designpattern.companyoa;

import com.roking.designpattern.companyoa.composite.GuangZhouCompany;
import com.roking.designpattern.companyoa.leaf.DevelopDepartment;
import com.roking.designpattern.companyoa.leaf.FinanceDepartment;
import com.roking.designpattern.companyoa.leaf.HrDepartment;

/**
 * Title:透明组合模式</br>
 * <p/>
 * Description:客户端一致调用即可。但是不安全，比如调用部门对象的addDepartment和getDepartment方法时会抛异常</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/11/16.
 */
public class TestClient {
    public static void main(String[] args) {
        AbstractOrganization aod=new DevelopDepartment("总部研发部");
        aod.notice("使劲儿干活");
        AbstractOrganization ao=new GuangZhouCompany("广州分公司");
        ao.addDepartment(new DevelopDepartment("研发部"));
        ao.addDepartment(new FinanceDepartment("财务部"));
        ao.addDepartment(new HrDepartment("人力资源部"));
        ao.notice("干活");
    }
}
