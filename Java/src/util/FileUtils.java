package util;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by Ziyun on 2016/9/1.
 */

public class FileUtils extends ArrayList<String> {
    public static String read(String filename) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()));
            try {
                String str;
                while ((str = reader.readLine()) != null) {
                    sb.append(str);
                    sb.append("\n");
                }
            } finally {
                reader.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public static void write(String filename, String content){
        try {
            PrintWriter writer = new PrintWriter(new File(filename).getAbsoluteFile());
            try {
                writer.println(content);
            }finally {
                writer.close();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public FileUtils(String filename, String splitter) {
        super(Arrays.asList(read(filename).split(splitter)));       // 将文件内容保存为列表
        // split()经常会在起始位置放置一个空格
        if (get(0).equals("")) remove(0);
    }

    // 默认情况下，使用换行符作为分隔符
    public FileUtils(String filename){
        this(filename, "\n");
    }

    // 当前类中保存了创建时传过来的文件中的数据
    // 通过下面的write方法可以将当前类中保存的数据写出
    public void write(String fn){
        try {
            PrintWriter out = new PrintWriter(new File(fn).getAbsoluteFile());
            try{
                for (String item : this){
                    out.println(item);
                }
            }finally {
                out.close();
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String file = read("fruit");
        write("test.txt", file);
        FileUtils text = new FileUtils("test.txt");
        text.write("test2.txt");
        // Break into unique sorted list of words:
        TreeSet<String> words = new TreeSet<String>(
                new FileUtils("fruit", "\\W+"));
        // Display the capitalized words:
        System.out.println(words.headSet("a"));
    }
}
