package com.example.demo.function;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class UZipFile {
    /**
     * 解压文件到指定目录
     */
    @SuppressWarnings("rawtypes")
    public static List<String> unZipFiles(File zipFile, String descDir) throws IOException {
        File pathFile = new File(descDir);
        if (!pathFile.exists()) {
            pathFile.mkdirs();
        }
        //解决zip文件中有中文目录或者中文文件
        ZipFile zip = new ZipFile(zipFile, Charset.forName("GBK"));
        List<String> fileName = new ArrayList<>(10);
        for (Enumeration entries = zip.entries(); entries.hasMoreElements(); ) {
            ZipEntry entry = (ZipEntry) entries.nextElement();
            String zipEntryName = entry.getName();
            InputStream in = zip.getInputStream(entry);
            System.out.println((descDir + zipEntryName).replaceAll("/","\\"));
            String outPath = (descDir + zipEntryName).replaceAll("/","\\");
            ;
            //判断路径是否存在,不存在则创建文件路径
            File file = new File(outPath.substring(0, outPath.lastIndexOf('\\')));
            if (!file.exists()) {
                file.mkdirs();
            }
            //判断文件全路径是否为文件夹,如果是上面已经上传,不需要解压
            if (new File(outPath).isDirectory()) {
                continue;
            }
            //输出文件路径信息
            fileName.add(outPath.replace(descDir, ""));
            OutputStream out = new FileOutputStream(outPath.endsWith(".tif")?outPath.replaceAll(".tif", ".png"):outPath);
            byte[] buf1 = new byte[1024];
            int len;
            while ((len = in.read(buf1)) > 0) {
                out.write(buf1, 0, len);
            }
            in.close();
            out.close();
        }
        System.out.println("******************解压完毕********************");
        return fileName;
    }

    public static void main(String[] args) throws IOException {
        File zipFile = new File("G:\\第一次审查意见通知书.zip");
        String path = "G:\\";
        List<String> res = unZipFiles(zipFile, path);
        Collections.sort(res);
        System.out.println(res);
    }
}
