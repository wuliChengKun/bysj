package com.ujn.diaock.system.mapper;

import java.util.List;
import com.ujn.diaock.system.domain.UjnShoppingcarFragment;
import org.springframework.stereotype.Repository;

/**
 * 购物车分片Mapper接口
 *
 * @author diaock
 * @date 2021-05-05
 */
@Repository
public interface UjnShoppingcarFragmentMapper
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
     * 删除购物车分片
     *
     * @param shoppingcarFragmentId 购物车分片ID
     * @return 结果
     */
    public int deleteUjnShoppingcarFragmentById(Long shoppingcarFragmentId);

    /**
     * 批量删除购物车分片
     *
     * @param shoppingcarFragmentIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUjnShoppingcarFragmentByIds(Long[] shoppingcarFragmentIds);
}
