package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static util.OutUtil.print;

/**
 * Created by Ziyun on 2016/9/3.
 */

public class BufferedInputFile {
    // Thinking in Java P540 从缓存输入
    public static void main(String[] args)throws IOException {
        String filename = "fruit";
        String content = read(filename);
        print(content);
    }

    static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        StringBuilder sb = new StringBuilder();
        String line = in.readLine();
        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = in.readLine();
        }
        in.close();
        return sb.toString();
    }
}
