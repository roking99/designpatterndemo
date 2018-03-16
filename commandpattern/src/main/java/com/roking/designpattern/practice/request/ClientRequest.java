package com.roking.designpattern.practice.request;

import com.roking.designpattern.practice.command.AbstractCommand;
import com.roking.designpattern.practice.command.CreateCommand;
import com.roking.designpattern.practice.command.EditCommand;
import com.roking.designpattern.practice.command.OpenCommand;
import com.roking.designpattern.practice.menus.MenuCollection;
import com.roking.designpattern.practice.menus.MenuItem;

/**
 * Title:</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/2/27 上午11:00
 */
public class ClientRequest {
    private static  AbstractCommand openCommand = new OpenCommand();
    private static  AbstractCommand editCommand = new EditCommand();
    private static  AbstractCommand createCommand = new CreateCommand();

    public static void main(String[] args) {

        MenuItem mi1 = new MenuItem("打开", "打开窗口", openCommand);
        MenuItem mi2 = new MenuItem("创建", "创建窗口", editCommand);
        MenuItem mi3 = new MenuItem("编辑", "编辑窗口", createCommand);

        MenuCollection mc = new MenuCollection();
        mc.addMenuItem(mi1);
        mc.addMenuItem(mi2);
        mc.addMenuItem(mi3);
        mc.showMenu();

        System.out.println("\n -----do function-------\n");

        mc.getMenuItem(0).click();
        mc.getMenuItem(1).click();
        mc.getMenuItem(2).click();
    }
}
