package io.exerscise;

import com.sun.xml.internal.fastinfoset.util.StringArray;
import util.IOUtils;
import util.OutUtil;

import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

import static io.exerscise.E07_FileToList.read;

/**
 * Created by Ziyun on 2016/9/1.
 */

public class E09_ToUpperCase {
    public static void main(String[] args) throws IOException{
        String readFilename = IOUtils.getCurPath() + "\\fruit";
        List<String> content = read(readFilename);
        ListIterator<String> it = content.listIterator(content.size());
        while (it.hasPrevious()){
            OutUtil.print(it.previous().toUpperCase());
        }
    }
}
