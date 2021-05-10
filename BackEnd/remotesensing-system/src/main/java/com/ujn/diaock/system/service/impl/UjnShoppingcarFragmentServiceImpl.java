package com.ujn.diaock.system.service.impl;

import java.util.List;

import com.ujn.diaock.common.core.domain.model.LoginUser;
import com.ujn.diaock.system.domain.UjnShoppingcar;
import com.ujn.diaock.system.mapper.UjnShoppingcarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import com.ujn.diaock.system.mapper.UjnShoppingcarFragmentMapper;
import com.ujn.diaock.system.domain.UjnShoppingcarFragment;
import com.ujn.diaock.system.service.IUjnShoppingcarFragmentService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 购物车分片Service业务层处理
 *
 * @author diaock
 * @date 2021-05-05
 */
@Service
@Transactional
public class UjnShoppingcarFragmentServiceImpl implements IUjnShoppingcarFragmentService
{
    @Autowired
    private UjnShoppingcarFragmentMapper ujnShoppingcarFragmentMapper;

    @Autowired
    private UjnShoppingcarMapper ujnShoppingcarMapper;

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
     *通过购物车Id查询购物车分片
     * @param shoppingcarId 购物车ID
     * @return
     */
    @Override
    public List<UjnShoppingcarFragment> selectUjnShoppingcarFragmentListByShoppingcarId(Long shoppingcarId) {
        return ujnShoppingcarFragmentMapper.selectUjnShoppingcarFragmentListByShoppingcarId(shoppingcarId);
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

    @Override
    public int addShoppingcarFragment(Long[] caseIds) {
        int flag = 1;
        //获得userId
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Long userId = ((LoginUser) authentication.getPrincipal()).getUser().getUserId();

        //看看用户有没有购物车，有的话插入一个分片，没有的话新建一个购物车
        UjnShoppingcar example = ujnShoppingcarMapper.selectUjnShoppingcarByUserId(userId);
        if(example == null){
            UjnShoppingcar ujnShoppingcar = new UjnShoppingcar();
            ujnShoppingcar.setUserId(userId);
            ujnShoppingcarMapper.insertUjnShoppingcar(ujnShoppingcar);
        }
        else{
            System.out.println("用户已有购物车......");
        }

        for(int i = 0;i < caseIds.length;i++){
            UjnShoppingcarFragment ujnShoppingcarFragment = new UjnShoppingcarFragment();
            ujnShoppingcarFragment.setCaseId(caseIds[i]);
            ujnShoppingcarFragment.setShoppingcarId(ujnShoppingcarMapper.selectUjnShoppingcarByUserId(userId).getShoppingcarId());
            flag=ujnShoppingcarFragmentMapper.insertUjnShoppingcarFragment(ujnShoppingcarFragment);
            if(flag<1){
                break;
            }
        }
        return flag;
    }
}
