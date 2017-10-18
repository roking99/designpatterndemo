package com.roking.designpatterndemo.util;

import com.roking.designpatterndemo.factory.GameFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

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
public class XmlUtil {

    public static GameFactory getBean() throws Exception {
        DocumentBuilderFactory docBuilderFactory=DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document doc = docBuilder.parse("abstractfactorypattern/src/main/java/com/roking/designpatterndemo/config" +
                "/config.xml");
        NodeList nodeList = doc.getElementsByTagName("className");
        Node node = nodeList.item(0);
        String className = node.getFirstChild().getNodeValue();
        return (GameFactory) Class.forName(className).newInstance();
    }
}
