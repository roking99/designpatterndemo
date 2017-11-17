package com.roking.designpattern.uilibary;

import com.roking.designpattern.uilibary.container.Panel;
import com.roking.designpattern.uilibary.widget.Button;
import com.roking.designpattern.uilibary.widget.TextInput;

/**
 * Title:安全组合模式</br>
 * <p/>
 * Description: 安全组合模式 将容器的特有方法(叶子不具有的方法)定义在容器内，
 *              这时虽然可以确保叶子和容器被调用时的安全性，但却无法针对抽象编程，不够透明</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/11/17.
 */
public class TestClient {
    public static void main(String[] args) {
        AbstractWidget aw=new Button();
        AbstractWidget textInput=new TextInput();
        Panel panel=new Panel();
        panel.addWidget(aw);
        panel.addWidget(textInput);
        panel.show();
        AbstractWidget bt=new Button();
        AbstractWidget ti=new TextInput();
        bt.show();
        ti.show();
    }
}
