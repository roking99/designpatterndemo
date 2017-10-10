package com.roking.designpattern.demo.factory;

import com.roking.designpattern.demo.constants.AngularSides;
import com.roking.designpattern.demo.product.AbstractAngular;
import com.roking.designpattern.demo.product.Circle;
import com.roking.designpattern.demo.product.Quadrangle;
import com.roking.designpattern.demo.product.Triangle;

/**
 * Title:工厂类</br>
 * <p/>
 * Description:  使用简单工厂模式设计一个可以创建不同几何形状（如圆形、方形和三角形等） 的绘图
 *               工具，每个几何图形都具有绘制draw()和擦除erase()两个方法，要求在绘制不支持的几何
 *               图形时，提示一个UnSupportedShapeException。</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/10/9.
 */
public class AngularFactory {


    public static AbstractAngular createAngular(int sides){
        AbstractAngular angular=null;

        if(sides== AngularSides.TRIANGLE){
            angular = new Triangle();
        }else if(sides== AngularSides.CIRCLE){
            angular =  new Circle();
        }else if(sides== AngularSides.QUADRANGLE){
            angular =  new Quadrangle();
        }else{
            throw new UnsupportedOperationException("only support circle/triangle/quadrangle");
        }
        return angular;
    }
}
