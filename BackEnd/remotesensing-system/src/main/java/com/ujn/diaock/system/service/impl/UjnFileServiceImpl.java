package com.ujn.diaock.system.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ujn.diaock.system.domain.UjnCase;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ujn.diaock.system.mapper.UjnFileMapper;
import com.ujn.diaock.system.domain.UjnFile;
import com.ujn.diaock.system.service.IUjnFileService;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.Attr;

/**
 * 上传文件Service业务层处理
 *
 * @author diaock
 * @date 2021-05-05
 */
@Service
public class UjnFileServiceImpl implements IUjnFileService
{
    @Autowired
    private UjnFileMapper ujnFileMapper;

    /**
     * 查询上传文件
     *
     * @param fileId 上传文件ID
     * @return 上传文件
     */
    @Override
    public UjnFile selectUjnFileById(Long fileId)
    {
        return ujnFileMapper.selectUjnFileById(fileId);
    }

    /**
     * 查询上传文件列表
     *
     * @param ujnFile 上传文件
     * @return 上传文件
     */
    @Override
    public List<UjnFile> selectUjnFileList(UjnFile ujnFile)
    {
        return ujnFileMapper.selectUjnFileList(ujnFile);
    }

    /**
     * 新增上传文件
     *
     * @param ujnFile 上传文件
     * @return 结果
     */
    @Override
    public int insertUjnFile(UjnFile ujnFile)
    {
        return ujnFileMapper.insertUjnFile(ujnFile);
    }

    /**
     * 修改上传文件
     *
     * @param ujnFile 上传文件
     * @return 结果
     */
    @Override
    public int updateUjnFile(UjnFile ujnFile)
    {
        return ujnFileMapper.updateUjnFile(ujnFile);
    }

    /**
     * 批量删除上传文件
     *
     * @param fileIds 需要删除的上传文件ID
     * @return 结果
     */
    @Override
    public int deleteUjnFileByIds(Long[] fileIds)
    {
        return ujnFileMapper.deleteUjnFileByIds(fileIds);
    }

    /**
     * 删除上传文件信息
     *
     * @param fileId 上传文件ID
     * @return 结果
     */
    @Override
    public int deleteUjnFileById(Long fileId)
    {
        return ujnFileMapper.deleteUjnFileById(fileId);
    }


    /**
     * DOM4J方法解析XML
     * @param file
     * @return 各种属性构成的List
     */
    public List<Object> AnalyzeXML(File file){
        List Attributes = new ArrayList<>();

        SAXReader reader = new SAXReader();
        try{
            Document document = reader.read(file);
            Element InterfaceFile = document.getRootElement();//获取<InterfaceFile>节点，也就是父节点
            Element FileBody = InterfaceFile.element("FileBody");//获取<FileBody>节点
            Iterator attributes = FileBody.elementIterator();//获取<FileBody>节点的孩子节点，也就是所有属性节点

            while (attributes.hasNext()){
                Element attribute = (Element) attributes.next();
                String nodeName = attribute.getName();
                if(nodeName.equals("ProduceTime")){
                    String ProduceTime = attribute.getStringValue();
                    Attributes.add(ProduceTime);
                }else if(nodeName.equals("haveFile")){
                    String haveFile = attribute.getStringValue();
                    Attributes.add(haveFile);
                }else if (nodeName.equals("Area")){
                    String Area = attribute.getStringValue();
                    Attributes.add(Area);
                }else if(nodeName.equals("Department")){
                    String Department = attribute.getStringValue();
                    Attributes.add(Department);
                }else if(nodeName.equals("DataName")){
                    String DataName = attribute.getStringValue();
                    Attributes.add(DataName);
                }else if(nodeName.equals("DataFormat")){
                    String DataFormat = attribute.getStringValue();
                    Attributes.add(DataFormat);
                }else if(nodeName.equals("Description")){
                    String Description = attribute.getStringValue();
                    Attributes.add(Description);
                }else if(nodeName.equals("Resolution")){
                    String Resolution = attribute.getStringValue();
                    Attributes.add(Resolution);
                }else if(nodeName.equals("TopLeftLatitude")){
                    String TopLeftLatitude = attribute.getStringValue();
                    if(!TopLeftLatitude.equals("")){
                        BigDecimal TopLeftLatitude1 = new BigDecimal(TopLeftLatitude);
                        Attributes.add(TopLeftLatitude1);
                    }else
                        Attributes.add("");
                }else if(nodeName.equals("TopLeftLongitude")){
                    String TopLeftLongitude = attribute.getStringValue();
                    if(!TopLeftLongitude.equals("")){
                        BigDecimal TopLeftLongitude1 = new BigDecimal(TopLeftLongitude);
                        Attributes.add(TopLeftLongitude1);
                    }else
                        Attributes.add("");
                }else if (nodeName.equals("BottomLeftLatitude")){
                    String BottomLeftLatitude = attribute.getStringValue();
                    if(!BottomLeftLatitude.equals("")){
                        BigDecimal BottomLeftLatitude1 = new BigDecimal(BottomLeftLatitude);
                        Attributes.add(BottomLeftLatitude1);
                    }else
                        Attributes.add("");
                }else if(nodeName.equals("BottomLeftLongitude")){
                    String BottomLeftLongitude = attribute.getStringValue();
                    if(!BottomLeftLongitude.equals("")){
                        BigDecimal BottomLeftLongitude1 = new BigDecimal(BottomLeftLongitude);
                        Attributes.add(BottomLeftLongitude1);
                    }else
                        Attributes.add("");
                }else if (nodeName.equals("TopRightLatitude")){
                    String TopRightLatitude = attribute.getStringValue();
                    if(!TopRightLatitude.equals("")){
                        BigDecimal TopRightLatitude1 = new BigDecimal(TopRightLatitude);
                        Attributes.add(TopRightLatitude1);
                    }else
                        Attributes.add("");
                }else if (nodeName.equals("TopRightLongitude")){
                    String TopRightLongitude = attribute.getStringValue();
                    if(!TopRightLongitude.equals("")){
                        BigDecimal TopRightLongitude1 = new BigDecimal(TopRightLongitude);
                        Attributes.add(TopRightLongitude1);
                    }else
                        Attributes.add("");
                }else if (nodeName.equals("BottomRightLatitude")){
                    String BottomRightLatitude = attribute.getStringValue();
                    if(!BottomRightLatitude.equals("")){
                        BigDecimal BottomRightLatitude1 = new BigDecimal(BottomRightLatitude);
                        Attributes.add(BottomRightLatitude1);
                    }else
                        Attributes.add("");
                }else if(nodeName.equals("BottomRightLongitude")){
                    String BottomRightLongitude = attribute.getStringValue();
                    if(!BottomRightLongitude.equals("")){
                        BigDecimal BottomRightLongitude1 = new BigDecimal(BottomRightLongitude);
                        Attributes.add(BottomRightLongitude1);
                    }else
                        Attributes.add("");
                }else if(nodeName.equals("CenterLatitude")){
                    String CenterLatitude = attribute.getStringValue();
                    if(!CenterLatitude.equals("")){
                        BigDecimal CenterLatitude1 = new BigDecimal(CenterLatitude);
                        Attributes.add(CenterLatitude1);
                    }else
                        Attributes.add("");
                }else if(nodeName.equals("CenterLongitude")){
                    String CenterLongitude = attribute.getStringValue();
                    if(!CenterLongitude.equals("")){
                        BigDecimal CenterLongitude1 = new BigDecimal(CenterLongitude);
                        Attributes.add(CenterLongitude1);
                    }else
                        Attributes.add("");
                }
            }
            System.out.println(Attributes.toString());
        }catch (DocumentException e){
            System.out.println("erro!!");
            e.printStackTrace();
        }
        return Attributes;
    }

    /**
     * Multipartfile 转 File
     * @param multipartFile
     * @return File
     */
    public File multipartFileToFile(MultipartFile multipartFile) throws Exception {
        File file = null;
        InputStream ins = null;
        ins = multipartFile.getInputStream();
        file = new File(multipartFile.getOriginalFilename());
        inputStreamToFile(ins, file);
        ins.close();
        return file;
    }

    /**
     * 工具方法
     * @param ins
     * @param file
     */
    public static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
