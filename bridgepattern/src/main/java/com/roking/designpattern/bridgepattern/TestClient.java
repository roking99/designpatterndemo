package com.roking.designpattern.bridgepattern;

import com.roking.designpattern.bridgepattern.datasourcetype.CommonDataSource;
import com.roking.designpattern.bridgepattern.datasourcetype.MysqlDataSource;
import com.roking.designpattern.bridgepattern.datasourcetype.OracleDataSource;
import com.roking.designpattern.bridgepattern.datasourcetype.SqlServerDataSource;
import com.roking.designpattern.bridgepattern.texttype.AbstractTextConverter;
import com.roking.designpattern.bridgepattern.texttype.NormalTextConverter;
import com.roking.designpattern.bridgepattern.texttype.PdfTextConverter;
import com.roking.designpattern.bridgepattern.texttype.XmlTextConverter;

/**
 * Title:</br>
 * <p/>
 * Description: </br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2017/11/16.
 */
public class TestClient {
    public static void main(String [] args){

        //这里需要更灵活的时候可以通过配置文件的方式来处理
        //AbstractTextConverter converter=new NormalTextConverter();
        //CommonDataSource dataSource=new MysqlDataSource();
        //AbstractTextConverter converter=new PdfTextConverter();
        //CommonDataSource dataSource=new OracleDataSource();
        AbstractTextConverter converter=new XmlTextConverter();
        CommonDataSource dataSource=new SqlServerDataSource();
        converter.setDataSource(dataSource);
        converter.convertAndInstance("abc");
    }
}
