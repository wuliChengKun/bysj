package com.ujn.diaock.system.mapper;

import java.util.List;
import com.ujn.diaock.system.domain.UjnCase;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 遥感案例Mapper接口
 *
 * @author diaock
 * @date 2021-05-08
 */
@Repository
public interface UjnCaseMapper
{
    /**
     * 查询遥感案例
     *
     * @param caseId 遥感案例ID
     * @return 遥感案例
     */
    public UjnCase selectUjnCaseById(Long caseId);

    /**
     * 查询遥感案例列表
     *
     * @param ujnCase 遥感案例
     * @return 遥感案例集合
     */
    public List<UjnCase> selectUjnCaseList(UjnCase ujnCase);

    /**
     * 新增遥感案例
     *
     * @param ujnCase 遥感案例
     * @return 结果
     */
    public int insertUjnCase(UjnCase ujnCase);

    /**
     * 修改遥感案例
     *
     * @param ujnCase 遥感案例
     * @return 结果
     */
    public int updateUjnCase(UjnCase ujnCase);

    /**
     * 删除遥感案例
     *
     * @param caseId 遥感案例ID
     * @return 结果
     */
    public int deleteUjnCaseById(Long caseId);

    /**
     * 批量删除遥感案例
     *
     * @param caseIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUjnCaseByIds(Long[] caseIds);
}
