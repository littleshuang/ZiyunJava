package io;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import static util.OutUtil.print;
import static util.OutUtil.printnb;

/**
 * Created by Ziyun on 2016/9/3.
 */

public class DataInputStreamTest {
    //  Thinking in Java P541 格式化内存输入
    public static void main(String[] args)throws IOException {
        String str = "A string using for DataInputStream test!";
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(str.getBytes()));
        while (dis.available() != 0){
            printnb((char)dis.readByte());
        }
        print();
        dis.close();
    }
}
