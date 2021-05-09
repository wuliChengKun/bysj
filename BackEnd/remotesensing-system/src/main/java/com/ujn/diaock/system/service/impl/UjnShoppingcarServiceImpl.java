package com.ujn.diaock.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ujn.diaock.system.mapper.UjnShoppingcarMapper;
import com.ujn.diaock.system.domain.UjnShoppingcar;
import com.ujn.diaock.system.service.IUjnShoppingcarService;

/**
 * 购物车Service业务层处理
 *
 * @author diaock
 * @date 2021-05-05
 */
@Service
public class UjnShoppingcarServiceImpl implements IUjnShoppingcarService
{
    @Autowired
    private UjnShoppingcarMapper ujnShoppingcarMapper;

    /**
     * 查询购物车
     *
     * @param shoppingcarId 购物车ID
     * @return 购物车
     */
    @Override
    public UjnShoppingcar selectUjnShoppingcarById(Long shoppingcarId)
    {
        return ujnShoppingcarMapper.selectUjnShoppingcarById(shoppingcarId);
    }

    /**
     * 按照userId查询购物车
     * @param userId 用户ID
     * @return
     */
    @Override
    public UjnShoppingcar selectUjnShoppingcarByUserId(Long userId) {
        return ujnShoppingcarMapper.selectUjnShoppingcarByUserId(userId);
    }

    /**
     * 查询购物车列表
     *
     * @param ujnShoppingcar 购物车
     * @return 购物车
     */
    @Override
    public List<UjnShoppingcar> selectUjnShoppingcarList(UjnShoppingcar ujnShoppingcar)
    {
        return ujnShoppingcarMapper.selectUjnShoppingcarList(ujnShoppingcar);
    }

    /**
     * 新增购物车
     *
     * @param ujnShoppingcar 购物车
     * @return 结果
     */
    @Override
    public int insertUjnShoppingcar(UjnShoppingcar ujnShoppingcar)
    {
        return ujnShoppingcarMapper.insertUjnShoppingcar(ujnShoppingcar);
    }

    /**
     * 修改购物车
     *
     * @param ujnShoppingcar 购物车
     * @return 结果
     */
    @Override
    public int updateUjnShoppingcar(UjnShoppingcar ujnShoppingcar)
    {
        return ujnShoppingcarMapper.updateUjnShoppingcar(ujnShoppingcar);
    }

    /**
     * 批量删除购物车
     *
     * @param shoppingcarIds 需要删除的购物车ID
     * @return 结果
     */
    @Override
    public int deleteUjnShoppingcarByIds(Long[] shoppingcarIds)
    {
        return ujnShoppingcarMapper.deleteUjnShoppingcarByIds(shoppingcarIds);
    }

    /**
     * 删除购物车信息
     *
     * @param shoppingcarId 购物车ID
     * @return 结果
     */
    @Override
    public int deleteUjnShoppingcarById(Long shoppingcarId)
    {
        return ujnShoppingcarMapper.deleteUjnShoppingcarById(shoppingcarId);
    }
}
