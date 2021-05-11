package com.ujn.diaock.system.service;

import java.util.List;
import com.ujn.diaock.system.domain.UjnOrderCheck;

/**
 * 订单审核Service接口
 *
 * @author diaock
 * @date 2021-05-05
 */
public interface IUjnOrderCheckService
{
    /**
     * 查询订单审核
     *
     * @param orderCheckId 订单审核ID
     * @return 订单审核
     */
    public UjnOrderCheck selectUjnOrderCheckById(Long orderCheckId);

    /**
     * 查询订单审核列表
     *
     * @param ujnOrderCheck 订单审核
     * @return 订单审核集合
     */
    public List<UjnOrderCheck> selectUjnOrderCheckList(UjnOrderCheck ujnOrderCheck);

    /**
     * 新增订单审核
     *
     * @param ujnOrderCheck 订单审核
     * @return 结果
     */
    public int insertUjnOrderCheck(UjnOrderCheck ujnOrderCheck);

    /**
     * 修改订单审核
     *
     * @param ujnOrderCheck 订单审核
     * @return 结果
     */
    public int updateUjnOrderCheck(UjnOrderCheck ujnOrderCheck);

    /**
     * 批量删除订单审核
     *
     * @param orderCheckIds 需要删除的订单审核ID
     * @return 结果
     */
    public int deleteUjnOrderCheckByIds(Long[] orderCheckIds);

    /**
     * 删除订单审核信息
     *
     * @param orderCheckId 订单审核ID
     * @return 结果
     */
    public int deleteUjnOrderCheckById(Long orderCheckId);

    /**
     * 管理员审核订单
     *
     * @param orderIds 订单ID
     * @return 结果
     */
    public int addOrderCheck(Long[] orderIds);
}
