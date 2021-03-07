package com.example.demo.实用工具类.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;

import java.io.FileSystem;
import java.io.IOException;
import java.net.URI;

/**
  * @Description TODO Hadoop上传文件
  * @author: qinjie
  * @date: 2020/1/17
 **/
public class UploadFile {
    public static void main(String args[]){
        try {
                Configuration conf = new Configuration();
            conf.set("dfs.client.use.datanode.hostname", "true");//添加此配置信息即可
                FileSystem fs = FileSystem.get(URI.create("hdfs://139.9.87.17:9000"), conf, "dr.who");

                Path srcPath = new Path("F://11.txt");
                Path dstPath = new Path("/");

            fs.copyFromLocalFile(true, true, srcPath, dstPath);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
