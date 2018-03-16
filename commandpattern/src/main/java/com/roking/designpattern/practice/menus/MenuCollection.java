package com.roking.designpattern.practice.menus;

import java.util.ArrayList;
import java.util.List;

/**
 * Title:主菜单(Menu)</br>
 * <p/>
 * Description: 在主菜单中包含了一些菜单项(MenuItem)，可以通过Menu类的addMenuItem()方法增加菜单项</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/2/27 上午10:46
 */
public class MenuCollection {

    private List<MenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(MenuItem mi) {
        menuItems.add(mi);
    }

    public void showMenu() {
        System.out.println("菜单：");
        for (MenuItem mi : menuItems) {
            System.out.println("\t" + mi.getName() + ":" + mi.getDesc());
        }
    }

    public MenuItem getMenuItem(int index) {
        if (menuItems == null || menuItems.size() == 0) {
            throw new RuntimeException("没有菜单项");
        }
        return menuItems.get(index);
    }
}
