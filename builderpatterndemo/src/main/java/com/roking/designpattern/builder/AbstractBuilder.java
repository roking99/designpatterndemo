package com.roking.designpattern.builder;

import com.roking.designpattern.product.Player;

/**
 * Title: 抽象建造者<br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public abstract class AbstractBuilder {
    /**
     * 要构造的对象
     */
    protected Player player = new Player();

    /**
     * 构造播放器模式
     */
    public abstract void buildPattern();

    /**
     * 构造播放菜单
     */
    public abstract void buildMenu();

    /**
     * 构造播放列表
     */
    public abstract void buildProgramList();

    /**
     * 构造主窗口
     */
    public abstract void buildMainWindow();

    /**
     * 构造控制条
     */
    public abstract void buildControlBar();

    /**
     * 构造收藏列表
     */
    public abstract void buildCollectList();

    /**
     * 返回构建的对象
     *
     * @return
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * 钩子方法--是否显示播放列表
     */
    public boolean isShowProgramList() {
        return false;
    }

    /**
     * 钩子方法--是否显示收藏列表
     */
    public boolean isShowCollectList() {
        return false;
    }

    /**
     * 钩子方法--是否显示菜单
     */
    public boolean isShowMenu() {
        return false;
    }
}
