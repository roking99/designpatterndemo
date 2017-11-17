package com.roking.designpattern.uilibary.container;

import com.roking.designpattern.uilibary.AbstractWidget;

import java.util.ArrayList;
import java.util.List;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/11/17.
 */
public class Panel implements AbstractWidget {
    private List<AbstractWidget> widgetList = new ArrayList<>();

    @Override
    public void show() {
        System.out.println("show panel");
        for (AbstractWidget aw : widgetList) {
            System.out.print("\t"); aw.show();
        }
    }

    public void addWidget(AbstractWidget aw) {
        widgetList.add(aw);
    }
}
