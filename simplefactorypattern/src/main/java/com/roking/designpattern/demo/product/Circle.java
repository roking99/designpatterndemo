package com.roking.designpattern.demo.product;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/10/9.
 */
public class Circle extends AbstractAngular {
    @Override
    public void draw() {
        System.out.println("画圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}
