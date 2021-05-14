package com.ujn.diaock.system.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ujn.diaock.common.annotation.Log;
import com.ujn.diaock.common.core.controller.BaseController;
import com.ujn.diaock.common.core.domain.AjaxResult;
import com.ujn.diaock.common.enums.BusinessType;
import com.ujn.diaock.system.domain.UjnFile;
import com.ujn.diaock.system.service.IUjnFileService;
import com.ujn.diaock.common.utils.poi.ExcelUtil;
import com.ujn.diaock.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 上传文件Controller
 *
 * @author diaock
 * @date 2021-05-05
 */
@RestController
@RequestMapping("/system/file")
public class UjnFileController extends BaseController
{
    @Autowired
    private IUjnFileService ujnFileService;

    @Autowired
    private UjnFile ujnFile;


    /**
     * 普通用户上传
     */
    @PostMapping(value = "/upload")
    public AjaxResult uploadFile(@RequestParam("files") MultipartFile[] files) throws IOException {
        List<UjnFile> list = new ArrayList<>();
        // 1. 用数组MultipartFile[]来表示多文件,所以遍历数组,对其中的文件进行逐一操作
        for (MultipartFile file : files) {
            // 2. 通过一顿file.getXXX()的操作,获取文件信息。
            // 2.1 这里用文件名举个栗子
            String filename = file.getOriginalFilename();
            // 3. 接下来调用方法来保存文件到本地磁盘,返回的是保存后的文件路径
            String filePath = savaFileByNio((FileInputStream) file.getInputStream(), filename);
            // 4. 保存文件信息到数据库
            // 4.1 搞个实体类，把你需要的文件信息保存到实体类中
            ujnFile.setFileName(file.getName());
            ujnFile.setFilePath(filePath);
            ujnFile.setFileSize(file.getSize());
            ujnFile.setFileUploadDate(new Date());
            // 4.2 调用Service层或者Dao层，保存数据库即可。
            list.add(ujnFile);
        }
        int flag = 1;
        for(UjnFile ujnFile1 : list){
            flag = ujnFileService.insertUjnFile(ujnFile1);
            if(flag < 1){
                break;
            }
        }
        return toAjax(flag);
    }

    /**
     * 该方法是用来将文件写入到磁盘中
     * @param fis
     * @param fileName
     * @return path 路径
     */
    public static String savaFileByNio(FileInputStream fis, String fileName) {
        // 这个路径最后是在: 你的项目路径/FileSpace  也就是和src同级
        String fileSpace = System.getProperty("user.dir") + File.separator + "FileSpace";
        String path = fileSpace + File.separator + fileName;
        // 判断父文件夹是否存在
        File file = new File(path);
        if (file.getParentFile() != null || !file.getParentFile().isDirectory()) {
            file.getParentFile().mkdirs();
        }
        // 通过NIO保存文件到本地磁盘
        try {
            FileOutputStream fos = new FileOutputStream(path);
            FileChannel inChannel = fis.getChannel();
            FileChannel outChannel = fos.getChannel();
            inChannel.transferTo(0, inChannel.size(), outChannel);
            inChannel.close();
            outChannel.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return path;
    }



    /**
     * 查询上传文件列表
     */
    @PreAuthorize("@ss.hasPermi('system:file:list')")
    @GetMapping("/list")
    public TableDataInfo list(UjnFile ujnFile)
    {
        startPage();
        List<UjnFile> list = ujnFileService.selectUjnFileList(ujnFile);
        return getDataTable(list);
    }

    /**
     * 导出上传文件列表
     */
    @PreAuthorize("@ss.hasPermi('system:file:export')")
    @Log(title = "上传文件", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UjnFile ujnFile)
    {
        List<UjnFile> list = ujnFileService.selectUjnFileList(ujnFile);
        ExcelUtil<UjnFile> util = new ExcelUtil<UjnFile>(UjnFile.class);
        return util.exportExcel(list, "上传文件数据");
    }

    /**
     * 获取上传文件详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:file:query')")
    @GetMapping(value = "/{fileId}")
    public AjaxResult getInfo(@PathVariable("fileId") Long fileId)
    {
        return AjaxResult.success(ujnFileService.selectUjnFileById(fileId));
    }

    /**
     * 新增上传文件
     */
    @PreAuthorize("@ss.hasPermi('system:file:add')")
    @Log(title = "上传文件", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UjnFile ujnFile)
    {
        return toAjax(ujnFileService.insertUjnFile(ujnFile));
    }

    /**
     * 修改上传文件
     */
    @PreAuthorize("@ss.hasPermi('system:file:edit')")
    @Log(title = "上传文件", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UjnFile ujnFile)
    {
        return toAjax(ujnFileService.updateUjnFile(ujnFile));
    }

    /**
     * 删除上传文件
     */
    @PreAuthorize("@ss.hasPermi('system:file:remove')")
    @Log(title = "上传文件", businessType = BusinessType.DELETE)
	@DeleteMapping("/{fileIds}")
    public AjaxResult remove(@PathVariable Long[] fileIds)
    {
        return toAjax(ujnFileService.deleteUjnFileByIds(fileIds));
    }
}
