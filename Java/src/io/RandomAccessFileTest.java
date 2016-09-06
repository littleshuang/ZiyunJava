package io;

import java.io.IOException;
import java.io.RandomAccessFile;

import static util.OutUtil.print;
import static util.OutUtil.printnb;

/**
 * Created by Ziyun on 2016/9/3.
 */

public class RandomAccessFileTest {
    static void display(RandomAccessFile read) throws IOException {
        byte[] bytes = new byte[16];
        read.seek(0);
        read.read(bytes);
        for (int j = 0; j < bytes.length; j++) {
            printnb((char) bytes[j]);
        }
        print();
        print(read.readBoolean());
        print(read.readInt());
        print(read.readUTF());
    }

    public static void main(String[] args) throws IOException {
        String filename = "raf";
        RandomAccessFile read = new RandomAccessFile(filename, "r");
        RandomAccessFile write = new RandomAccessFile(filename, "rw");

        write.seek(0);
        write.writeBytes("RandomAccessFile");
        write.writeBoolean(true);
        write.writeInt(123);
        write.writeUTF("End writing");

        display(read);
        write.seek(2);
        write.writeChar('k');
        display(read);
        read.close();
        write.close();
    }
}
