package com.roking.designpattern.demo.factory;

import com.roking.designpattern.demo.constants.AngularSides;
import com.roking.designpattern.demo.product.AbstractAngular;
import com.roking.designpattern.demo.product.Circle;
import com.roking.designpattern.demo.product.Quadrangle;
import com.roking.designpattern.demo.product.Triangle;

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
