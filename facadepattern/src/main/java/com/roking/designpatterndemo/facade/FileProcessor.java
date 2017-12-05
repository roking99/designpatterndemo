package com.roking.designpatterndemo.facade;

/**
 * Title:外观角色</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/12/5.
 */
public  class FileProcessor {

    private FileReader fileReader;
    private FileEncrypter fileEncrypter;

    public FileProcessor() {
        this.fileReader = new FileReader();
        this.fileEncrypter = new FileEncrypter();
    }
    public void processFile(String fileName){
        String readData = fileReader.readFile(fileName);
        fileEncrypter.encryptData(readData);
    }
}
