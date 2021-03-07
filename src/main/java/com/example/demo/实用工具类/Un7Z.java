package com.example.demo.实用工具类;

import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.jdom2.JDOMException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
  * 解压7z压缩包
  *
  * @author: qinjie
 **/
public class Un7Z {
    /**
     * 解压缩7z文件
     * @param file 压缩包文件
     * @param targetPath 目标文件夹
     * @param delete 解压后是否删除原压缩包文件
     */
    public static List<File> decompress7Z(File file, String targetPath,  boolean delete){
        List<File>files = new ArrayList<File>(20);
        SevenZFile sevenZFile = null;
        OutputStream outputStream;
        try {
            sevenZFile = new SevenZFile(file);
            // 创建输出目录
            createDirectory(targetPath, null);
            SevenZArchiveEntry entry;

            while((entry = sevenZFile.getNextEntry()) != null){
                if(entry.isDirectory()){
                    createDirectory(targetPath, entry.getName()); // 创建子目录
                }else{
                    //创建目录
                    String fileName = entry.getName().substring(entry.getName().lastIndexOf("/") + 1);
                    File filePath = new File((targetPath + File.separator + entry.getName()).replaceAll(fileName, ""));
                    filePath.mkdirs();
                    //文件输出
                    File f = new File((targetPath + File.separator + entry.getName()));
                    files.add(f);
                    outputStream = new FileOutputStream(f);
                    int len = 0;
                    byte[] b = new byte[2048];
                    while((len = sevenZFile.read(b)) != -1){
                        outputStream.write(b, 0, len);
                    }
                    outputStream.flush();
                    outputStream.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(sevenZFile != null){
                    sevenZFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if(delete){
                file.delete();
            }
        }
        return files;
    }

    /**
     *  构建目录
     * @param outputDir 输出目录
     * @param subDir 子目录
     */
    private static void createDirectory(String outputDir, String subDir){
        File file = new File(outputDir);
        if(!(subDir == null || subDir.trim().equals(""))) {//子目录不为空
            file = new File(outputDir + File.separator + subDir);
        }
        if(!file.exists()){
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            file.mkdirs();
        }
    }



    public static void main(String arg[]) throws ParseException, IOException, JDOMException {
        List<File> files = decompress7Z(new File("F:\\专利数据.7z"), "F:\\专利数据", false);
        for(int i = 0; i < files.size(); i++){
            System.out.println((files.get(i).getAbsolutePath()));
//            System.out.println(new MyXMLReader2JDOM().getPatentFromFile(files.get(i)));
        }
        File file = new File("F:\\专利数据");
        file.delete();
    }
}
