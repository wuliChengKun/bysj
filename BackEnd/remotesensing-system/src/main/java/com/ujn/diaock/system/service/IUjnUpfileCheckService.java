package com.ujn.diaock.system.service;

import java.util.List;
import com.ujn.diaock.system.domain.UjnUpfileCheck;

/**
 * 上传文件审核Service接口
 * 
 * @author diaock
 * @date 2021-05-05
 */
public interface IUjnUpfileCheckService 
{
    /**
     * 查询上传文件审核
     * 
     * @param fileCheckId 上传文件审核ID
     * @return 上传文件审核
     */
    public UjnUpfileCheck selectUjnUpfileCheckById(Long fileCheckId);

    /**
     * 查询上传文件审核列表
     * 
     * @param ujnUpfileCheck 上传文件审核
     * @return 上传文件审核集合
     */
    public List<UjnUpfileCheck> selectUjnUpfileCheckList(UjnUpfileCheck ujnUpfileCheck);

    /**
     * 新增上传文件审核
     * 
     * @param ujnUpfileCheck 上传文件审核
     * @return 结果
     */
    public int insertUjnUpfileCheck(UjnUpfileCheck ujnUpfileCheck);

    /**
     * 修改上传文件审核
     * 
     * @param ujnUpfileCheck 上传文件审核
     * @return 结果
     */
    public int updateUjnUpfileCheck(UjnUpfileCheck ujnUpfileCheck);

    /**
     * 批量删除上传文件审核
     * 
     * @param fileCheckIds 需要删除的上传文件审核ID
     * @return 结果
     */
    public int deleteUjnUpfileCheckByIds(Long[] fileCheckIds);

    /**
     * 删除上传文件审核信息
     * 
     * @param fileCheckId 上传文件审核ID
     * @return 结果
     */
    public int deleteUjnUpfileCheckById(Long fileCheckId);
}
