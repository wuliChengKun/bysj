package com.ujn.diaock.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ujn.diaock.system.mapper.UjnGroupMapper;
import com.ujn.diaock.system.domain.UjnGroup;
import com.ujn.diaock.system.service.IUjnGroupService;

/**
 * 分类信息Service业务层处理
 *
 * @author diaock
 * @date 2021-05-05
 */
@Service
public class UjnGroupServiceImpl implements IUjnGroupService
{
    @Autowired
    private UjnGroupMapper ujnGroupMapper;

    /**
     * 查询分类信息
     *
     * @param groupId 分类信息ID
     * @return 分类信息
     */
    @Override
    public UjnGroup selectUjnGroupById(Long groupId)
    {
        return ujnGroupMapper.selectUjnGroupById(groupId);
    }

    /**
     * 查询分类信息列表
     *
     * @param ujnGroup 分类信息
     * @return 分类信息
     */
    @Override
    public List<UjnGroup> selectUjnGroupList(UjnGroup ujnGroup)
    {
        return ujnGroupMapper.selectUjnGroupList(ujnGroup);
    }

    /**
     * 新增分类信息
     *
     * @param ujnGroup 分类信息
     * @return 结果
     */
    @Override
    public int insertUjnGroup(UjnGroup ujnGroup)
    {
        return ujnGroupMapper.insertUjnGroup(ujnGroup);
    }

    /**
     * 修改分类信息
     *
     * @param ujnGroup 分类信息
     * @return 结果
     */
    @Override
    public int updateUjnGroup(UjnGroup ujnGroup)
    {
        return ujnGroupMapper.updateUjnGroup(ujnGroup);
    }

    /**
     * 批量删除分类信息
     *
     * @param groupIds 需要删除的分类信息ID
     * @return 结果
     */
    @Override
    public int deleteUjnGroupByIds(Long[] groupIds)
    {
        return ujnGroupMapper.deleteUjnGroupByIds(groupIds);
    }

    /**
     * 删除分类信息信息
     *
     * @param groupId 分类信息ID
     * @return 结果
     */
    @Override
    public int deleteUjnGroupById(Long groupId)
    {
        return ujnGroupMapper.deleteUjnGroupById(groupId);
    }
}
