package com.ujn.diaock.system.service.impl;

import java.util.Date;
import java.util.List;

import com.ujn.diaock.common.core.domain.model.LoginUser;
import com.ujn.diaock.system.mapper.UjnShoppingcarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import com.ujn.diaock.system.mapper.UjnOrderMapper;
import com.ujn.diaock.system.domain.UjnOrder;
import com.ujn.diaock.system.service.IUjnOrderService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 订单Service业务层处理
 *
 * @author diaock
 * @date 2021-05-05
 */
@Service
@Transactional
public class UjnOrderServiceImpl implements IUjnOrderService
{
    @Autowired
    private UjnOrderMapper ujnOrderMapper;

    @Autowired
    private UjnShoppingcarMapper ujnShoppingcarMapper;

    /**
     * 查询订单
     *
     * @param orderId 订单ID
     * @return 订单
     */
    @Override
    public UjnOrder selectUjnOrderById(Long orderId)
    {
        return ujnOrderMapper.selectUjnOrderById(orderId);
    }

    /**
     * 查询订单列表
     *
     * @param ujnOrder 订单
     * @return 订单
     */
    @Override
    public List<UjnOrder> selectUjnOrderList(UjnOrder ujnOrder)
    {
        return ujnOrderMapper.selectUjnOrderList(ujnOrder);
    }

    /**
     * 新增订单
     *
     * @param ujnOrder 订单
     * @return 结果
     */
    @Override
    public int insertUjnOrder(UjnOrder ujnOrder)
    {
        return ujnOrderMapper.insertUjnOrder(ujnOrder);
    }

    /**
     * 修改订单
     *
     * @param ujnOrder 订单
     * @return 结果
     */
    @Override
    public int updateUjnOrder(UjnOrder ujnOrder)
    {
        return ujnOrderMapper.updateUjnOrder(ujnOrder);
    }

    /**
     * 批量删除订单
     *
     * @param orderIds 需要删除的订单ID
     * @return 结果
     */
    @Override
    public int deleteUjnOrderByIds(Long[] orderIds)
    {
        return ujnOrderMapper.deleteUjnOrderByIds(orderIds);
    }

    /**
     * 删除订单信息
     *
     * @param orderId 订单ID
     * @return 结果
     */
    @Override
    public int deleteUjnOrderById(Long orderId)
    {
        return ujnOrderMapper.deleteUjnOrderById(orderId);
    }

    /**
     * 用户下单
     * @param fragmentIds
     * @return
     */
    @Override
    public int addOrderFragment(Long[] fragmentIds) {
        int flag = 1;
        //获取用户ID
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Long userId = ((LoginUser) authentication.getPrincipal()).getUser().getUserId();

        for(int i = 0;i < fragmentIds.length; i++){
            UjnOrder ujnOrder = new UjnOrder();
            ujnOrder.setUserId(userId);
            ujnOrder.setCreatedDate(new Date());
            ujnOrder.setShoppingcarId(ujnShoppingcarMapper.selectUjnShoppingcarByUserId(userId).getShoppingcarId());
            flag = ujnOrderMapper.insertUjnOrder(ujnOrder);
            if(flag < 1){
                break;
            }
        }
        return flag;
    }
}
