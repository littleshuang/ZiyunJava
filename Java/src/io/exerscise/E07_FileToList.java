package io.exerscise;

import util.IOUtils;
import util.OutUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Ziyun on 2016/9/1.
 */

public class E07_FileToList {

    public static List<String> read(String filename) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String str;
        List<String> list = new LinkedList<>();
        while ((str = in.readLine()) != null){
            list.add(str);
        }
        in.close();
        return list;
    }

    public static void main(String[] args) throws IOException{
        String readFilename = IOUtils.getCurPath() + "\\fruit";
        if (args.length == 1){      // 练习8，通过命令行读取文件名
            readFilename = args[0];
        }
        List<String> content = read(readFilename);
        ListIterator<String> it = content.listIterator(content.size());
        while (it.hasPrevious()){
            OutUtil.print(it.previous());
        }
    }
}
