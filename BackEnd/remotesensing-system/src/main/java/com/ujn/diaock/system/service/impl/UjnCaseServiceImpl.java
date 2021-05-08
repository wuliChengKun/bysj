package com.ujn.diaock.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ujn.diaock.system.mapper.UjnCaseMapper;
import com.ujn.diaock.system.domain.UjnCase;
import com.ujn.diaock.system.service.IUjnCaseService;

/**
 * 遥感案例Service业务层处理
 *
 * @author diaock
 * @date 2021-05-08
 */
@Service
public class UjnCaseServiceImpl implements IUjnCaseService
{
    @Autowired
    private UjnCaseMapper ujnCaseMapper;

    /**
     * 查询遥感案例
     *
     * @param caseId 遥感案例ID
     * @return 遥感案例
     */
    @Override
    public UjnCase selectUjnCaseById(Long caseId)
    {
        return ujnCaseMapper.selectUjnCaseById(caseId);
    }

    /**
     * 查询遥感案例列表
     *
     * @param ujnCase 遥感案例
     * @return 遥感案例
     */
    @Override
    public List<UjnCase> selectUjnCaseList(UjnCase ujnCase)
    {
        return ujnCaseMapper.selectUjnCaseList(ujnCase);
    }

    /**
     * 新增遥感案例
     *
     * @param ujnCase 遥感案例
     * @return 结果
     */
    @Override
    public int insertUjnCase(UjnCase ujnCase)
    {
        return ujnCaseMapper.insertUjnCase(ujnCase);
    }

    /**
     * 修改遥感案例
     *
     * @param ujnCase 遥感案例
     * @return 结果
     */
    @Override
    public int updateUjnCase(UjnCase ujnCase)
    {
        return ujnCaseMapper.updateUjnCase(ujnCase);
    }

    /**
     * 批量删除遥感案例
     *
     * @param caseIds 需要删除的遥感案例ID
     * @return 结果
     */
    @Override
    public int deleteUjnCaseByIds(Long[] caseIds)
    {
        return ujnCaseMapper.deleteUjnCaseByIds(caseIds);
    }

    /**
     * 删除遥感案例信息
     *
     * @param caseId 遥感案例ID
     * @return 结果
     */
    @Override
    public int deleteUjnCaseById(Long caseId)
    {
        return ujnCaseMapper.deleteUjnCaseById(caseId);
    }
}
