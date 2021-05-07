package com.ujn.diaock.system.mapper;

import java.util.List;
import com.ujn.diaock.system.domain.UjnUpfileCheck;
import org.springframework.stereotype.Repository;

/**
 * 上传文件审核Mapper接口
 *
 * @author diaock
 * @date 2021-05-05
 */
@Repository
public interface UjnUpfileCheckMapper
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
     * 删除上传文件审核
     *
     * @param fileCheckId 上传文件审核ID
     * @return 结果
     */
    public int deleteUjnUpfileCheckById(Long fileCheckId);

    /**
     * 批量删除上传文件审核
     *
     * @param fileCheckIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUjnUpfileCheckByIds(Long[] fileCheckIds);
}
