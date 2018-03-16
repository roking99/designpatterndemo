package com.roking.designpattern.reuqestlog.util;

import com.roking.designpattern.reuqestlog.command.AbsCommand;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Title:</br>
 * <p/>
 * Description:</br>
 * <p/>
 * Company: <a href="www.jd.com">京东</a></br>
 *
 * @author <a href=mailto:luojin1@jd.com>罗金</a>
 * @date 2018/3/7 下午3:30
 */
public class FileUtil {

    public static void writeFile(List<AbsCommand> commands, File file) throws IOException {
        FileOutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(outputStream));

        objectOutputStream.writeObject(commands);
        objectOutputStream.flush();
        objectOutputStream.close();
    }

    public static List<AbsCommand> readFile(File file) throws IOException, ClassNotFoundException {

        List<AbsCommand> resList = new ArrayList<>();


        ObjectInputStream objin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file) ));

        return (List<AbsCommand>) objin.readObject();
    }
}
