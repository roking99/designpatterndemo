package com.roking.designpatterndemo;

import com.roking.designpatterndemo.facade.FileProcessor;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/12/5.
 */
public class TestClient {

    public static void main(String[] args) {
        FileProcessor fileProcessor=new FileProcessor();
        fileProcessor.processFile("testFile");
    }
}
