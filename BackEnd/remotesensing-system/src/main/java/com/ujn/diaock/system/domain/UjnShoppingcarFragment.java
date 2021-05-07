package com.ujn.diaock.system.domain;

import com.ujn.diaock.common.annotation.Excel;
import com.ujn.diaock.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 购物车分片对象 ujn_shoppingcar_fragment
 *
 * @author diaock
 * @date 2021-05-05
 */
public class UjnShoppingcarFragment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 购物车分片ID */
    private Long shoppingcarFragmentId;

    /** 购物车ID */
    @Excel(name = "购物车ID")
    private Long shoppingcarId;

    /** 案例ID */
    @Excel(name = "案例ID")
    private Long caseId;

    public void setShoppingcarFragmentId(Long shoppingcarFragmentId)
    {
        this.shoppingcarFragmentId = shoppingcarFragmentId;
    }

    public Long getShoppingcarFragmentId()
    {
        return shoppingcarFragmentId;
    }
    public void setShoppingcarId(Long shoppingcarId)
    {
        this.shoppingcarId = shoppingcarId;
    }

    public Long getShoppingcarId()
    {
        return shoppingcarId;
    }
    public void setCaseId(Long caseId)
    {
        this.caseId = caseId;
    }

    public Long getCaseId()
    {
        return caseId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("shoppingcarFragmentId", getShoppingcarFragmentId())
            .append("shoppingcarId", getShoppingcarId())
            .append("caseId", getCaseId())
            .toString();
    }
}
