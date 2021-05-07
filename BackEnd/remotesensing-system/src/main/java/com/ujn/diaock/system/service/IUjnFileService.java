package com.ujn.diaock.system.service;

import java.util.List;
import com.ujn.diaock.system.domain.UjnFile;

/**
 * 上传文件Service接口
 * 
 * @author diaock
 * @date 2021-05-05
 */
public interface IUjnFileService 
{
    /**
     * 查询上传文件
     * 
     * @param fileId 上传文件ID
     * @return 上传文件
     */
    public UjnFile selectUjnFileById(Long fileId);

    /**
     * 查询上传文件列表
     * 
     * @param ujnFile 上传文件
     * @return 上传文件集合
     */
    public List<UjnFile> selectUjnFileList(UjnFile ujnFile);

    /**
     * 新增上传文件
     * 
     * @param ujnFile 上传文件
     * @return 结果
     */
    public int insertUjnFile(UjnFile ujnFile);

    /**
     * 修改上传文件
     * 
     * @param ujnFile 上传文件
     * @return 结果
     */
    public int updateUjnFile(UjnFile ujnFile);

    /**
     * 批量删除上传文件
     * 
     * @param fileIds 需要删除的上传文件ID
     * @return 结果
     */
    public int deleteUjnFileByIds(Long[] fileIds);

    /**
     * 删除上传文件信息
     * 
     * @param fileId 上传文件ID
     * @return 结果
     */
    public int deleteUjnFileById(Long fileId);
}
