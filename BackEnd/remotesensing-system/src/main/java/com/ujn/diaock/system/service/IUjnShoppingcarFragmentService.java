package com.ujn.diaock.system.service;

import java.util.List;
import com.ujn.diaock.system.domain.UjnShoppingcarFragment;
import org.springframework.stereotype.Repository;

/**
 * 购物车分片Service接口
 *
 * @author diaock
 * @date 2021-05-05
 */
public interface IUjnShoppingcarFragmentService
{
    /**
     * 查询购物车分片
     *
     * @param shoppingcarFragmentId 购物车分片ID
     * @return 购物车分片
     */
    public UjnShoppingcarFragment selectUjnShoppingcarFragmentById(Long shoppingcarFragmentId);

    /**
     * 查询购物车分片列表
     *
     * @param ujnShoppingcarFragment 购物车分片
     * @return 购物车分片集合
     */
    public List<UjnShoppingcarFragment> selectUjnShoppingcarFragmentList(UjnShoppingcarFragment ujnShoppingcarFragment);

    /**
     *通过购物车Id查询购物车分片Id
     *
     * @param shoppingcarId 购物车ID
     * @return 购物车分片集合
     */
    public List<UjnShoppingcarFragment> selectUjnShoppingcarFragmentListByShoppingcarId(Long shoppingcarId);

    /**
     * 新增购物车分片
     *
     * @param ujnShoppingcarFragment 购物车分片
     * @return 结果
     */
    public int insertUjnShoppingcarFragment(UjnShoppingcarFragment ujnShoppingcarFragment);

    /**
     * 修改购物车分片
     *
     * @param ujnShoppingcarFragment 购物车分片
     * @return 结果
     */
    public int updateUjnShoppingcarFragment(UjnShoppingcarFragment ujnShoppingcarFragment);

    /**
     * 批量删除购物车分片
     *
     * @param shoppingcarFragmentIds 需要删除的购物车分片ID
     * @return 结果
     */
    public int deleteUjnShoppingcarFragmentByIds(Long[] shoppingcarFragmentIds);

    /**
     * 删除购物车分片信息
     *
     * @param shoppingcarFragmentId 购物车分片ID
     * @return 结果
     */
    public int deleteUjnShoppingcarFragmentById(Long shoppingcarFragmentId);

    /**
     * 用户将案例加入购物车分片中
     */
    public int addShoppingcarFragment(Long[] caseIds);
}
