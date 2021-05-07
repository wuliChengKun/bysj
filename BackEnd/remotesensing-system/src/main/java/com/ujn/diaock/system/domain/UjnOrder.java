package com.ujn.diaock.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ujn.diaock.common.annotation.Excel;
import com.ujn.diaock.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 订单对象 ujn_order
 *
 * @author diaock
 * @date 2021-05-05
 */
public class UjnOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单ID */
    private Long orderId;

    /** 购物车ID */
    @Excel(name = "购物车ID")
    private Long shoppingcarId;

    /** 用户ID */
    @Excel(name = "用户ID")
    private Long userId;

    /** 订单创建Date */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "订单创建Date", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdDate;

    public void setOrderId(Long orderId)
    {
        this.orderId = orderId;
    }

    public Long getOrderId()
    {
        return orderId;
    }
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
    public void setCreatedDate(Date createdDate)
    {
        this.createdDate = createdDate;
    }

    public Date getCreatedDate()
    {
        return createdDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("orderId", getOrderId())
            .append("shoppingcarId", getShoppingcarId())
            .append("userId", getUserId())
            .append("createdDate", getCreatedDate())
            .toString();
    }
}
