package io.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Pipe;

import static util.OutUtil.print;

/**
 * Created by Ziyun on 2016/9/2.
 * 
 * 通过管道传输数据
 */

public class PipeTest {
    private static final int BSIZE = 256;

    public static void main(String[] args) throws IOException {
        ByteBuffer buf = ByteBuffer.allocate(BSIZE);
        buf.clear();
        Pipe pipe = Pipe.open();
        Pipe.SinkChannel sink = pipe.sink();        // 通过sink向管道中输入数据
        Pipe.SourceChannel source = pipe.source();  // 通过source从管道中获取数据

        String str = "Transfer data by pipe!";      // 待传输的数据
        buf.put(str.getBytes());
        buf.flip();
        sink.write(buf);        // 将buf中的数据写入sink
        buf.clear();
        source.read(buf);       // 从source中读取数据写入buf

        RandomAccessFile file = new RandomAccessFile("pipe", "rw");     // 将buf中的数据写入文件以验证是否正确使用pipe
        FileChannel in = file.getChannel();
        buf.flip();
        while (buf.hasRemaining()){
            in.write(buf);
        }

        sink.close();
        source.close();
        in.close();
        file.close();
    }
}
