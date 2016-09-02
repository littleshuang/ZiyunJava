package io.exerscise;

import util.OutUtil;

import java.io.*;

import static util.OutUtil.print;
import static util.OutUtil.printnb;

/**
 * Created by Ziyun on 2016/9/1.
 */

public class E15_StoringAndRecoveringAll {

    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream("exercise15.txt")));
        out.writeBoolean(true);
        out.writeByte(22);
        out.writeByte(225);
        out.writeChar('a');
        out.writeDouble(34.56);
        out.writeFloat(12.678f);
        out.writeInt(34);
        out.writeLong(56789000L);
        out.writeShort(56);
        out.writeShort(65535);
        out.writeUTF("writeUTF");
        out.writeBytes("bytes");        // 实际上是以字节数组的形式进行存储的
        out.close();

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("exercise15.txt")));
        print(in.readBoolean());
        print(in.readByte());
        print(in.readUnsignedByte());
        print(in.readChar());
        print(in.readDouble());
        print(in.readFloat());
        print(in.readInt());
        print(in.readLong());
        print(in.readShort());
        print(in.readUnsignedShort());
        print(in.readUTF());
        byte[] bytes = new byte[12];
        in.read(bytes);
        for (int i = 0; i < bytes.length; ++i){
            printnb((char)bytes[i]);
        }
        in.close();

    }
}
