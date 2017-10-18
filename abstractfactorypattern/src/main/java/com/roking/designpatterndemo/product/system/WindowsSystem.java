package com.roking.designpatterndemo.product.system;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/10/18.
 */
public class WindowsSystem implements GameSystem {

    public void startUp() {
        class test1{
              void test111(){
                  System.out.println(" windows inner class ");
            }
        }
      new test1().test111();
    }
}
