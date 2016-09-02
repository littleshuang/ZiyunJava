package util;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ziyun on 2016/9/1.
 */

public class IOUtils {

    public static String getCurPath(){
        return getCurPath("");      // 默认设定为当前文件夹
    }

    public static String getCurPath(String filename){
        String path = null;
        try {
            path = new File(filename).getCanonicalPath();
        } catch (IOException e) {
            System.out.println("Meet IOException when get current path!");
            e.printStackTrace();
        }
        return path;
    }
}
