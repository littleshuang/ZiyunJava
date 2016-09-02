package io.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Ziyun on 2016/9/2.
 *
 * 通过FileChannel在两个文件间传递数据
 * 注意flip()和clear()方法的调用
 */

public class FileChannelTest {
    private static final int BSIZE = 256;

    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("fruit", "r");
        FileChannel inChannel = raf.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        RandomAccessFile raf1 = new RandomAccessFile("nfruit", "rw");
        FileChannel outChannel = raf1.getChannel();



        int readsize = inChannel.read(buffer);
        while (readsize != -1) {
            buffer.flip();
            outChannel.write(buffer);
            buffer.clear();     // 如果未调用该方法，则会导致无限循环，一直不停地写，最终写文件会超级大
            readsize = inChannel.read(buffer);
        }
        inChannel.close();
        outChannel.close();
        raf.close();
        raf1.close();
    }
}
