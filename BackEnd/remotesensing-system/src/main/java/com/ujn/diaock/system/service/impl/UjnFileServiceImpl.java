package com.ujn.diaock.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ujn.diaock.system.mapper.UjnFileMapper;
import com.ujn.diaock.system.domain.UjnFile;
import com.ujn.diaock.system.service.IUjnFileService;

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
}
