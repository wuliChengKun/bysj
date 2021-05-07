package com.ujn.diaock.system.domain;

import com.ujn.diaock.common.annotation.Excel;
import com.ujn.diaock.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 购物车对象 ujn_shoppingcar
 *
 * @author diaock
 * @date 2021-05-05
 */
public class UjnShoppingcar extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 购物车ID */
    private Long shoppingcarId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    public void setShoppingcarId(Long shoppingcarId)
    {
        this.shoppingcarId = shoppingcarId;
    }

    public Long getShoppingcarId()
    {
        return shoppingcarId;
    }
    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("shoppingcarId", getShoppingcarId())
            .append("userId", getUserId())
            .toString();
    }
}
