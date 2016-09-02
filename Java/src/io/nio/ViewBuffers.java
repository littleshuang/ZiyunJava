package io.nio;

import java.nio.*;

import static util.OutUtil.print;

/**
 * Created by Ziyun on 2016/9/2.
 */

public class ViewBuffers {

    public static void main(String[] args) {
        final int BSIZE = 256;
        byte[] bytes = {0, 0, 0, 'a', 0, 0, 0, 'b'};


        ByteBuffer buf = ByteBuffer.wrap(bytes);
        buf.rewind();
        print("ByteBuffer");
        while (buf.hasRemaining()){
            print(buf.position() + " : " + buf.get());
        }

        buf.rewind();
        CharBuffer cbuf = buf.asCharBuffer();
        print();
        print("CharBuffer");
        while (cbuf.hasRemaining()){
            print(cbuf.position() + " : " + cbuf.get());
        }

        buf.rewind();
        IntBuffer ibuf = buf.asIntBuffer();
        print();
        print("IntBuffer");
        while (ibuf.hasRemaining()){
            print(ibuf.position() + " : " + ibuf.get());
        }

        buf.rewind();
        ShortBuffer sbuf = buf.asShortBuffer();
        print();
        print("ShortBuffer");
        while (sbuf.hasRemaining()){
            print(sbuf.position() + " : " + sbuf.get());
        }

        buf.rewind();
        FloatBuffer fbuf = buf.asFloatBuffer();
        print();
        print("FloatBuffer");
        while (fbuf.hasRemaining()){
            print(fbuf.position() + " : " + fbuf.get());
        }

        buf.rewind();
        LongBuffer lbuf = buf.asLongBuffer();
        print();
        print("LongBuffer");
        while (lbuf.hasRemaining()){
            print(lbuf.position() + " : " + lbuf.get());
        }

        buf.rewind();
        DoubleBuffer dbuf = buf.asDoubleBuffer();
        print();
        print("DoubleBuffer");
        while (dbuf.hasRemaining()){
            print(dbuf.position() + " : " + dbuf.get());
        }
    }
}
