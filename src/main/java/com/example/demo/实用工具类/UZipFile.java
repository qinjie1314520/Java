package com.example.demo.实用工具类;

import org.jdom2.JDOMException;

import java.io.*;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * zip解压
 *
 * @author: qinjie
 **/
public class UZipFile {
    /**
     * 解压文件到指定目录
     */
    @SuppressWarnings("rawtypes")
    public static List<File> unZipFiles(File zipFile, String descDir, boolean delete) throws IOException {
        File pathFile = new File(descDir);
        if (!pathFile.exists()) {
            pathFile.mkdirs();
        }
        //解决zip文件中有中文目录或者中文文件
        ZipFile zip = new ZipFile(zipFile, Charset.forName("GBK"));
        List<File> files = new ArrayList<>(10);
        for (Enumeration entries = zip.entries(); entries.hasMoreElements(); ) {
            ZipEntry entry = (ZipEntry) entries.nextElement();
            String zipEntryName = entry.getName();
            InputStream in = zip.getInputStream(entry);
            String outPath = (descDir + "/" + zipEntryName.replaceAll("\\\\", "//"));
            //判断路径是否存在,不存在则创建文件路径
            File file = new File(outPath.substring(0, outPath.lastIndexOf('/')));
            if (!file.exists()) {
                file.mkdirs();
            }
            //判断文件全路径是否为文件夹,如果是上面已经上传,不需要解压
            if (new File(outPath).isDirectory()) {
                continue;
            }
            //输出文件
            OutputStream out = new FileOutputStream(outPath);
            byte[] buf1 = new byte[1024];
            int len;
            while ((len = in.read(buf1)) > 0) {
                out.write(buf1, 0, len);
            }
            in.close();
            out.close();
            File f = new File(outPath);
            if(f.isFile()){
                files.add(f);
            }
        }
        System.out.println("******************解压完毕********************");
        if(delete){
            zip.close();
            zipFile.delete();
        }
        return files;
    }


    public static void main(String[] args) throws IOException, JDOMException, ParseException {
        File zipFile = new File("F:\\法律数据.zip");
        String path = "F:\\法律数据";
        List<File> files = unZipFiles(zipFile, path, false);
        for (int i = 0; i < files.size(); i++) {
            System.out.println((files.get(i).getAbsolutePath()));
//            if(files.get(i).getName().startsWith("FMSWGB") || files.get(i).getName().startsWith("XXSWGB") || files.get(i).getName().startsWith("WGSWGB")){
//            }else if(files.get(i).getName().startsWith("WGGZSW") || files.get(i).getName().startsWith("XXGZSW") || files.get(i).getName().startsWith("FMGZSW")){
//                System.out.println(new MyXMLReader2JDOM().getPatentLawFromFileWhenChange(files.get(i)));
//            }else{
//                System.out.println(new MyXMLReader2JDOM().getPatentLawFromFile(files.get(i)));
//            }
        }
    }
}
