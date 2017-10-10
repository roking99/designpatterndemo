package com.roking.designpattern.demo.client;

import com.roking.designpattern.demo.factory.AngularFactory;
import com.roking.designpattern.demo.product.AbstractAngular;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/10/10.
 */
public class SimpleFactoryClient {

    public static void main(String[] args) {
        //AbstractAngular angular = AngularFactory.createAngular(0);
        //AbstractAngular angular = AngularFactory.createAngular(3);
        AbstractAngular angular = AngularFactory.createAngular(4);
        angular.draw();
        angular.erase();
    }

}
