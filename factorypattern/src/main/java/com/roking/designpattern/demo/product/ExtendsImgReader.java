package com.roking.designpattern.demo.product;

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
public class ExtendsImgReader extends AbstractImgReader {
    private String userName;
    private String passWord;

    @Override
    public void readImg() {
        //需要扩展时,得增加这个具体工厂类和具体的产品类
        System.out.println("扩展类型");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
