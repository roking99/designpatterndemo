package com.roking.designpattern.practice.menus;

import com.roking.designpattern.practice.command.AbstractCommand;

/**
 * Title:菜单项--充当调用者</br>
 * <p/>
 * Description:菜单项的主要方法是click()</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/2/27 上午10:47
 */
public class MenuItem {
    private String name;
    private String desc;

    private AbstractCommand command;

    public MenuItem(String name, String desc, AbstractCommand command) {
        this.name = name;
        this.desc = desc;
        this.command = command;
    }

    public void click() {

        System.out.println("菜单项：" + this.getName() + ",功能是：" + this.getDesc() + "    <<<开始点击>>>");
        this.command.execute();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
