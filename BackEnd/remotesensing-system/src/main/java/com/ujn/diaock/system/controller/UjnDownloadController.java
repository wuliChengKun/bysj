package com.ujn.diaock.system.controller;

import com.ujn.diaock.common.core.controller.BaseController;
import com.ujn.diaock.common.core.domain.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


@RestController
@RequestMapping("/system/download")
public class UjnDownloadController extends BaseController {


    public AjaxResult downloadFile(String fileName) throws IOException {

        String resourcesPath = "" + fileName;
        String targetPath = "" + fileName;

        File resourcesFile = new File(resourcesPath);
        File targetFile = new File(targetPath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        String targetName = "";
        if(resourcesFile.getName().indexOf(".")!=-1){
            targetName = resourcesFile.getName().substring(0,resourcesFile.getName().indexOf("."))+".zip";
        }else{
            targetName = resourcesFile.getName()+".zip";
        }
        FileOutputStream outputStream = new FileOutputStream(targetPath + "\\" + targetName);
        CheckedOutputStream cos = new CheckedOutputStream(outputStream, new CRC32());
        ZipOutputStream out = new ZipOutputStream(cos);
        createCompressedFile(out, resourcesFile, "");
        out.close();


        return null;
    }

    public void createCompressedFile(ZipOutputStream out,File file,String dir) throws IOException {
        if (file.isDirectory()) {
            //得到文件列表信息
            File[] files = file.listFiles();
            //将文件夹添加到下一级打包目录
            out.putNextEntry(new ZipEntry(dir + "/"));

            dir = dir.length() == 0 ? "" : dir + "/";

            //循环将文件夹中的文件打包
            for (int i = 0; i < files.length; i++) {
                createCompressedFile(out, files[i], dir + files[i].getName());         //递归处理
            }
        } else {   //当前的是文件，打包处理
            //文件输入流
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            ZipEntry entry = new ZipEntry(dir + file.getName());
            out.putNextEntry(entry);
            // out.putNextEntry(new ZipEntry(dir));
            //进行写操作
            int j = 0;
            byte[] buffer = new byte[1024];
            while ((j = bis.read(buffer)) > 0) {
                out.write(buffer, 0, j);
            }
            //关闭输入流
            bis.close();
        }
    }
}
