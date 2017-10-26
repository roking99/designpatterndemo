package com.roking.designpattern.director;

import com.roking.designpattern.builder.AbstractBuilder;
import com.roking.designpattern.product.Player;

/**
 * Title: 指挥者<br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public class ShowDirector {
    public Player constructPlayer(AbstractBuilder builder){
        Player player;
        builder.buildPattern();
        builder.buildMainWindow();
        builder.buildControlBar();
        if(builder.isShowCollectList()){
            builder.buildCollectList();
        }
        if(builder.isShowMenu()){
            builder.buildMenu();
        }
        if(builder.isShowProgramList()){
            builder.buildProgramList();
        }
        player=builder.getPlayer();
        return player;
    }
}
