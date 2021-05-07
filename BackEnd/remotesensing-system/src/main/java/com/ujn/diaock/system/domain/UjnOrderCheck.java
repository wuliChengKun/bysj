package com.ujn.diaock.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ujn.diaock.common.annotation.Excel;
import com.ujn.diaock.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 订单审核对象 ujn_order_check
 *
 * @author diaock
 * @date 2021-05-05
 */
public class UjnOrderCheck extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单审核ID */
    private Long orderCheckId;

    /** 订单ID */
    @Excel(name = "订单ID")
    private Long orderId;

    /** 订单审核员ID */
    @Excel(name = "订单审核员ID")
    private Long orderAuditorId;

    /** 订单审核Date */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "订单审核Date", width = 30, dateFormat = "yyyy-MM-dd")
    private Date checkDate;

    public void setOrderCheckId(Long orderCheckId)
    {
        this.orderCheckId = orderCheckId;
    }

    public Long getOrderCheckId()
    {
        return orderCheckId;
    }
    public void setOrderId(Long orderId)
    {
        this.orderId = orderId;
    }

    public Long getOrderId()
    {
        return orderId;
    }
    public void setOrderAuditorId(Long orderAuditorId)
    {
        this.orderAuditorId = orderAuditorId;
    }

    public Long getOrderAuditorId()
    {
        return orderAuditorId;
    }
    public void setCheckDate(Date checkDate)
    {
        this.checkDate = checkDate;
    }

    public Date getCheckDate()
    {
        return checkDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("orderCheckId", getOrderCheckId())
            .append("orderId", getOrderId())
            .append("orderAuditorId", getOrderAuditorId())
            .append("checkDate", getCheckDate())
            .toString();
    }
}
