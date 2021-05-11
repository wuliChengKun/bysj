package com.ujn.diaock.system.mapper;

import java.util.List;
import com.ujn.diaock.system.domain.UjnOrder;
import org.springframework.stereotype.Repository;

/**
 * 订单Mapper接口
 *
 * @author diaock
 * @date 2021-05-05
 */
@Repository
public interface UjnOrderMapper
{
    /**
     * 查询订单
     *
     * @param orderId 订单ID
     * @return 订单
     */
    public UjnOrder selectUjnOrderById(Long orderId);

    /**
     * 查询订单列表
     *
     * @param ujnOrder 订单
     * @return 订单集合
     */
    public List<UjnOrder> selectUjnOrderList(UjnOrder ujnOrder);

    /**
     * 新增订单
     *
     * @param ujnOrder 订单
     * @return 结果
     */
    public int insertUjnOrder(UjnOrder ujnOrder);

    /**
     * 修改订单
     *
     * @param ujnOrder 订单
     * @return 结果
     */
    public int updateUjnOrder(UjnOrder ujnOrder);

    /**
     * 删除订单
     *
     * @param orderId 订单ID
     * @return 结果
     */
    public int deleteUjnOrderById(Long orderId);

    /**
     * 批量删除订单
     *
     * @param orderIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUjnOrderByIds(Long[] orderIds);

    /**
     * 通过用户Id查询订单
     * @param userId 用户ID
     * @return
     */
    public List<UjnOrder> selectUjnOrderListByUserId(Long userId);
}
