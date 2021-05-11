package com.ujn.diaock.system.service.impl;

import java.util.Date;
import java.util.List;

import com.ujn.diaock.common.core.domain.model.LoginUser;
import com.ujn.diaock.system.mapper.UjnOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import com.ujn.diaock.system.mapper.UjnOrderCheckMapper;
import com.ujn.diaock.system.domain.UjnOrderCheck;
import com.ujn.diaock.system.service.IUjnOrderCheckService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 订单审核Service业务层处理
 *
 * @author diaock
 * @date 2021-05-05
 */
@Service
@Transactional
public class UjnOrderCheckServiceImpl implements IUjnOrderCheckService
{
    @Autowired
    private UjnOrderCheckMapper ujnOrderCheckMapper;

    @Autowired
    private UjnOrderMapper ujnOrderMapper;

    /**
     * 查询订单审核
     *
     * @param orderCheckId 订单审核ID
     * @return 订单审核
     */
    @Override
    public UjnOrderCheck selectUjnOrderCheckById(Long orderCheckId)
    {
        return ujnOrderCheckMapper.selectUjnOrderCheckById(orderCheckId);
    }

    /**
     * 查询订单审核列表
     *
     * @param ujnOrderCheck 订单审核
     * @return 订单审核
     */
    @Override
    public List<UjnOrderCheck> selectUjnOrderCheckList(UjnOrderCheck ujnOrderCheck)
    {
        return ujnOrderCheckMapper.selectUjnOrderCheckList(ujnOrderCheck);
    }

    /**
     * 新增订单审核
     *
     * @param ujnOrderCheck 订单审核
     * @return 结果
     */
    @Override
    public int insertUjnOrderCheck(UjnOrderCheck ujnOrderCheck)
    {
        return ujnOrderCheckMapper.insertUjnOrderCheck(ujnOrderCheck);
    }

    /**
     * 修改订单审核
     *
     * @param ujnOrderCheck 订单审核
     * @return 结果
     */
    @Override
    public int updateUjnOrderCheck(UjnOrderCheck ujnOrderCheck)
    {
        return ujnOrderCheckMapper.updateUjnOrderCheck(ujnOrderCheck);
    }

    /**
     * 批量删除订单审核
     *
     * @param orderCheckIds 需要删除的订单审核ID
     * @return 结果
     */
    @Override
    public int deleteUjnOrderCheckByIds(Long[] orderCheckIds)
    {
        return ujnOrderCheckMapper.deleteUjnOrderCheckByIds(orderCheckIds);
    }

    /**
     * 删除订单审核信息
     *
     * @param orderCheckId 订单审核ID
     * @return 结果
     */
    @Override
    public int deleteUjnOrderCheckById(Long orderCheckId)
    {
        return ujnOrderCheckMapper.deleteUjnOrderCheckById(orderCheckId);
    }

    /**
     * 管理员审核订单
     * @param orderIds 订单ID
     * @return
     */
    @Override
    public int addOrderCheck(Long[] orderIds) {
        int flag = 1;
        //获得userId
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Long userId = ((LoginUser) authentication.getPrincipal()).getUser().getUserId();

        for(int i = 0;i < orderIds.length;i++){
            UjnOrderCheck ujnOrderCheck = new UjnOrderCheck();
            ujnOrderCheck.setOrderId(orderIds[i]);
            ujnOrderCheck.setOrderAuditorId(userId);
            ujnOrderCheck.setCheckDate(new Date());
            flag = ujnOrderCheckMapper.insertUjnOrderCheck(ujnOrderCheck);
            if(flag < 1){
                break;
            }
        }

        return flag;
    }
}
