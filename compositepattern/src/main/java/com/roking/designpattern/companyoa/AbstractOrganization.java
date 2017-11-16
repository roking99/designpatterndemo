package com.roking.designpattern.companyoa;

/**
 * Title:抽象构件,定义了叶子和容器对象的公共行为</br>
 * <p/>
 * Description: 这个demo采用透明组合模式，透明组合模式可以让客户端针对抽象(接口)编程，</br>
 * 但是由于叶子对象也含有组合对象的方法，因此不够安全
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/11/16.
 */
public interface AbstractOrganization {
    /**
     * 通知
     * @param department
     */
    void notice(String department);

    /**
     * 获取部门
     * @return
     */
    AbstractOrganization getDepartment(int i);

    /**
     * 增加部门
     * @param abstractOrganization
     */
    void addDepartment(AbstractOrganization abstractOrganization);
}
