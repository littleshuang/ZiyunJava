package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * Created by Ziyun on 2016/9/3.
 */

public class PrintWriterTest {

    public static void main(String[] args) throws IOException{
        // 向文件中输入数据
        PrintWriter out = new PrintWriter("char");
        String name = "Hellen";
        int age = 8;
        float weitht = 25.34f;
        char sex = '女';

        out.write("A string in class PrintWriterTest!");
        out.println();
        out.printf("name: %s;  age: %d; sex: %c; weight: %5.2f;", name, age, sex, weitht);
        out.println();
        out.close();
    }
}
