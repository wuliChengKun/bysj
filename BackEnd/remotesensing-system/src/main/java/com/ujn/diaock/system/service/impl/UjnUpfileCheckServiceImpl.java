package com.ujn.diaock.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ujn.diaock.system.mapper.UjnUpfileCheckMapper;
import com.ujn.diaock.system.domain.UjnUpfileCheck;
import com.ujn.diaock.system.service.IUjnUpfileCheckService;

/**
 * 上传文件审核Service业务层处理
 *
 * @author diaock
 * @date 2021-05-05
 */
@Service
public class UjnUpfileCheckServiceImpl implements IUjnUpfileCheckService
{
    @Autowired
    private UjnUpfileCheckMapper ujnUpfileCheckMapper;

    /**
     * 查询上传文件审核
     *
     * @param fileCheckId 上传文件审核ID
     * @return 上传文件审核
     */
    @Override
    public UjnUpfileCheck selectUjnUpfileCheckById(Long fileCheckId)
    {
        return ujnUpfileCheckMapper.selectUjnUpfileCheckById(fileCheckId);
    }

    /**
     * 查询上传文件审核列表
     *
     * @param ujnUpfileCheck 上传文件审核
     * @return 上传文件审核
     */
    @Override
    public List<UjnUpfileCheck> selectUjnUpfileCheckList(UjnUpfileCheck ujnUpfileCheck)
    {
        return ujnUpfileCheckMapper.selectUjnUpfileCheckList(ujnUpfileCheck);
    }

    /**
     * 新增上传文件审核
     *
     * @param ujnUpfileCheck 上传文件审核
     * @return 结果
     */
    @Override
    public int insertUjnUpfileCheck(UjnUpfileCheck ujnUpfileCheck)
    {
        return ujnUpfileCheckMapper.insertUjnUpfileCheck(ujnUpfileCheck);
    }

    /**
     * 修改上传文件审核
     *
     * @param ujnUpfileCheck 上传文件审核
     * @return 结果
     */
    @Override
    public int updateUjnUpfileCheck(UjnUpfileCheck ujnUpfileCheck)
    {
        return ujnUpfileCheckMapper.updateUjnUpfileCheck(ujnUpfileCheck);
    }

    /**
     * 批量删除上传文件审核
     *
     * @param fileCheckIds 需要删除的上传文件审核ID
     * @return 结果
     */
    @Override
    public int deleteUjnUpfileCheckByIds(Long[] fileCheckIds)
    {
        return ujnUpfileCheckMapper.deleteUjnUpfileCheckByIds(fileCheckIds);
    }

    /**
     * 删除上传文件审核信息
     *
     * @param fileCheckId 上传文件审核ID
     * @return 结果
     */
    @Override
    public int deleteUjnUpfileCheckById(Long fileCheckId)
    {
        return ujnUpfileCheckMapper.deleteUjnUpfileCheckById(fileCheckId);
    }
}
