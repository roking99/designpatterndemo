package com.roking.designpattern.builder.impl;

import com.roking.designpattern.builder.AbstractBuilder;

/**
 * Title: 网络模式建造者<br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public class NetWorkPatternBuilder extends AbstractBuilder{
    @Override
    public void buildPattern() {
        player.setPattern("网络模式");
    }

    @Override
    public void buildMenu() {
        player.setMenu("菜单");
    }

    @Override
    public void buildProgramList() {
        player.setProgramList("播放列表");
    }

    @Override
    public void buildMainWindow() {
        player.setMainWindow("主窗口");
    }

    @Override
    public void buildControlBar() {
        player.setControlBar("控制条");
    }

    @Override
    public void buildCollectList() {
        player.setCollectList("收藏列表");
    }

    @Override
    public boolean isShowProgramList() {
        return false;
    }

    @Override
    public boolean isShowCollectList() {
        return true;
    }

    @Override
    public boolean isShowMenu() {
        return false;
    }
}
