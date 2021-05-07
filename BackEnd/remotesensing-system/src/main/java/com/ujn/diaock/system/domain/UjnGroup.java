package com.ujn.diaock.system.domain;

import com.ujn.diaock.common.annotation.Excel;
import com.ujn.diaock.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 分类信息对象 ujn_group
 *
 * @author diaock
 * @date 2021-05-05
 */
public class UjnGroup extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 分类ID */
    private Long groupId;

    /** 分类Name */
    @Excel(name = "分类Name")
    private String groupName;

    public void setGroupId(Long groupId)
    {
        this.groupId = groupId;
    }

    public Long getGroupId()
    {
        return groupId;
    }
    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }

    public String getGroupName()
    {
        return groupName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("groupId", getGroupId())
            .append("groupName", getGroupName())
            .toString();
    }
}
