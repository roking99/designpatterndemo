package com.roking.designpattern.client;

import com.roking.designpattern.builder.AbstractBuilder;
import com.roking.designpattern.builder.impl.FullPatternBuilder;
import com.roking.designpattern.builder.impl.NetWorkPatternBuilder;
import com.roking.designpattern.builder.impl.SimplePatternBuilder;
import com.roking.designpattern.director.ShowDirector;
import com.roking.designpattern.product.Player;

/**
 * Title: <br>
 * <p/>
 * Description: <br>
 * <p/>
 * Company: <a href=www.jd.com>京东</a><br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 */
public class BuilderClient {

    public static void main(String[] args) {
        ShowDirector sd=new ShowDirector();
        //这里可以通过配置文件的方式getBean 具体见工厂模式中的xmlUtil
//        AbstractBuilder builder=new FullPatternBuilder();
        AbstractBuilder builder=new SimplePatternBuilder();
//        AbstractBuilder builder=new NetWorkPatternBuilder();
        Player player = sd.constructPlayer(builder);
        System.out.println(player.toString());
    }
}
