package com.roking.designpattern.product;

/**
 * Title: <br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public class Player {
    private String pattern;
    private String menu;
    private String programList;
    private String mainWindow;
    private String controlBar;
    private String collectList;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getProgramList() {
        return programList;
    }

    public void setProgramList(String programList) {
        this.programList = programList;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }

    public String getCollectList() {
        return collectList;
    }

    public void setCollectList(String collectList) {
        this.collectList = collectList;
    }

    @Override
    public String toString() {
        return  pattern + "\n"
                + "具有以下功能：\n"
                + '\''+ (menu==null?"":menu) + '\n'
                + '\''+ (programList==null?"":programList) + '\n'
                + '\''+ (mainWindow==null?"":mainWindow) + '\n'
                + '\''+ (controlBar==null?"":controlBar) + '\n'
                + '\''+ (collectList==null?"":collectList) + '\n' ;

    }
}
