package com.ujn.diaock.system.mapper;

import java.util.List;
import com.ujn.diaock.system.domain.UjnShoppingcar;
import org.springframework.stereotype.Repository;

/**
 * 购物车Mapper接口
 *
 * @author diaock
 * @date 2021-05-05
 */
@Repository
public interface UjnShoppingcarMapper
{
    /**
     * 查询购物车
     *
     * @param shoppingcarId 购物车ID
     * @return 购物车
     */
    public UjnShoppingcar selectUjnShoppingcarById(Long shoppingcarId);

    /**
     * 查询购物车列表
     *
     * @param ujnShoppingcar 购物车
     * @return 购物车集合
     */
    public List<UjnShoppingcar> selectUjnShoppingcarList(UjnShoppingcar ujnShoppingcar);

    /**
     * 新增购物车
     *
     * @param ujnShoppingcar 购物车
     * @return 结果
     */
    public int insertUjnShoppingcar(UjnShoppingcar ujnShoppingcar);

    /**
     * 修改购物车
     *
     * @param ujnShoppingcar 购物车
     * @return 结果
     */
    public int updateUjnShoppingcar(UjnShoppingcar ujnShoppingcar);

    /**
     * 删除购物车
     *
     * @param shoppingcarId 购物车ID
     * @return 结果
     */
    public int deleteUjnShoppingcarById(Long shoppingcarId);

    /**
     * 批量删除购物车
     *
     * @param shoppingcarIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteUjnShoppingcarByIds(Long[] shoppingcarIds);
}
