package com.ujn.diaock.system.mapper;

import java.util.List;
import com.ujn.diaock.system.domain.UjnGroup;
import org.springframework.stereotype.Repository;

/**
 * 分类信息Mapper接口
 *
 * @author diaock
 * @date 2021-05-05
 */
@Repository
public interface UjnGroupMapper
{
    /**
     * 查询分类信息
     *
     * @param groupId 分类信息ID
     * @return 分类信息
     */
    public UjnGroup selectUjnGroupById(Long groupId);

    /**
     * 查询分类信息列表
     *
     * @param ujnGroup 分类信息
     * @return 分类信息集合
     */
    public List<UjnGroup> selectUjnGroupList(UjnGroup ujnGroup);

    /**
     * 新增分类信息
     *
     * @param ujnGroup 分类信息
     * @return 结果
     */
    public int insertUjnGroup(UjnGroup ujnGroup);

    /**
     * 修改分类信息
     *
     * @param ujnGroup 分类信息
     * @return 结果
     */
    public int updateUjnGroup(UjnGroup ujnGroup);

    /**
     * 删除分类信息
     *
     * @param groupId 分类信息ID
     * @return 结果
     */
    public int deleteUjnGroupById(Long groupId);

    /**
     * 批量删除分类信息
     *
     * @param groupIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUjnGroupByIds(Long[] groupIds);
}
