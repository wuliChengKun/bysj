package com.ujn.diaock.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ujn.diaock.system.mapper.UjnShoppingcarFragmentMapper;
import com.ujn.diaock.system.domain.UjnShoppingcarFragment;
import com.ujn.diaock.system.service.IUjnShoppingcarFragmentService;

/**
 * 购物车分片Service业务层处理
 *
 * @author diaock
 * @date 2021-05-05
 */
@Service
public class UjnShoppingcarFragmentServiceImpl implements IUjnShoppingcarFragmentService
{
    @Autowired
    private UjnShoppingcarFragmentMapper ujnShoppingcarFragmentMapper;

    /**
     * 查询购物车分片
     *
     * @param shoppingcarFragmentId 购物车分片ID
     * @return 购物车分片
     */
    @Override
    public UjnShoppingcarFragment selectUjnShoppingcarFragmentById(Long shoppingcarFragmentId)
    {
        return ujnShoppingcarFragmentMapper.selectUjnShoppingcarFragmentById(shoppingcarFragmentId);
    }

    /**
     * 查询购物车分片列表
     *
     * @param ujnShoppingcarFragment 购物车分片
     * @return 购物车分片
     */
    @Override
    public List<UjnShoppingcarFragment> selectUjnShoppingcarFragmentList(UjnShoppingcarFragment ujnShoppingcarFragment)
    {
        return ujnShoppingcarFragmentMapper.selectUjnShoppingcarFragmentList(ujnShoppingcarFragment);
    }

    /**
     * 新增购物车分片
     *
     * @param ujnShoppingcarFragment 购物车分片
     * @return 结果
     */
    @Override
    public int insertUjnShoppingcarFragment(UjnShoppingcarFragment ujnShoppingcarFragment)
    {
        return ujnShoppingcarFragmentMapper.insertUjnShoppingcarFragment(ujnShoppingcarFragment);
    }

    /**
     * 修改购物车分片
     *
     * @param ujnShoppingcarFragment 购物车分片
     * @return 结果
     */
    @Override
    public int updateUjnShoppingcarFragment(UjnShoppingcarFragment ujnShoppingcarFragment)
    {
        return ujnShoppingcarFragmentMapper.updateUjnShoppingcarFragment(ujnShoppingcarFragment);
    }

    /**
     * 批量删除购物车分片
     *
     * @param shoppingcarFragmentIds 需要删除的购物车分片ID
     * @return 结果
     */
    @Override
    public int deleteUjnShoppingcarFragmentByIds(Long[] shoppingcarFragmentIds)
    {
        return ujnShoppingcarFragmentMapper.deleteUjnShoppingcarFragmentByIds(shoppingcarFragmentIds);
    }

    /**
     * 删除购物车分片信息
     *
     * @param shoppingcarFragmentId 购物车分片ID
     * @return 结果
     */
    @Override
    public int deleteUjnShoppingcarFragmentById(Long shoppingcarFragmentId)
    {
        return ujnShoppingcarFragmentMapper.deleteUjnShoppingcarFragmentById(shoppingcarFragmentId);
    }
}
