package com.roking.designpattern.demo.util;

import com.roking.designpattern.demo.exception.UnSupporteTypeException;
import com.roking.designpattern.demo.factory.AbstractReaderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


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
public class XMLUtil {

    //模拟一下读取配置文件的方式
    //public static AbstractReaderFactory getBean(String name) throws IllegalAccessException, InstantiationException, UnSupporteTypeException {
    //    AbstractReaderFactory factory;
    //    Class<?> aClass = null;
    //    try {
    //        aClass = Class.forName( fixName(name));
    //        factory  = (AbstractReaderFactory)aClass.newInstance();
    //        return factory;
    //    } catch (ClassNotFoundException e) {
    //       throw new UnSupporteTypeException("only support jpg/png");
    //    }
    //}
    //
    //private static String fixName(String name) {
    //    return "com.roking.designpattern.demo.factory."+name;
    //}

    //读取配置文件更灵活
    public static AbstractReaderFactory getBean() throws Exception {
        AbstractReaderFactory factory;
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = dFactory.newDocumentBuilder();
        Document doc = documentBuilder.parse("factorypattern/src/main/java/com/roking/designpattern/demo/config" +
                "/config.xml");
        NodeList nodeList = doc.getElementsByTagName("className");
        Node classNameNode = nodeList.item(0).getFirstChild();
        Class<?> aClass = null;
        try {
            aClass = Class.forName(classNameNode.getNodeValue());
            factory  = (AbstractReaderFactory)aClass.newInstance();
            return factory;
        } catch (ClassNotFoundException e) {
           throw new UnSupporteTypeException("only support jpg/png");
        }
    }
}
