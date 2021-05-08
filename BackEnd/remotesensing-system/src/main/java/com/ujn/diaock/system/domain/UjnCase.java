package com.ujn.diaock.system.domain;

import java.math.BigDecimal;
import com.ujn.diaock.common.annotation.Excel;
import com.ujn.diaock.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 遥感案例对象 ujn_case
 *
 * @author diaock
 * @date 2021-05-08
 */
public class UjnCase extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 案例ID */
    private Long caseId;

    /** 分类ID */
    @Excel(name = "分类ID")
    private Long groupId;

    /** 案例Price */
    @Excel(name = "案例Price")
    private BigDecimal casePrice;

    /** 案例拇指图 */
    @Excel(name = "案例拇指图")
    private String caseThumb;

    /** 生产时间 */
    @Excel(name = "生产时间")
    private String producetime;

    /** 有文件 */
    @Excel(name = "有文件")
    private String havefile;

    /** 地域 */
    @Excel(name = "地域")
    private String area;

    /** 部门 */
    @Excel(name = "部门")
    private String department;

    /** 数据名称 */
    @Excel(name = "数据名称")
    private String dataname;

    /** 数据格式 */
    @Excel(name = "数据格式")
    private String dataformat;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 解析度 */
    @Excel(name = "解析度")
    private String resolution;

    /** 左上纬度 */
    @Excel(name = "左上纬度")
    private Long topleftlatitude;

    /** 左上经度 */
    @Excel(name = "左上经度")
    private Long topleftlongitude;

    /** 左下纬度 */
    @Excel(name = "左下纬度")
    private Long bottomleftlatitude;

    /** 左下经度 */
    @Excel(name = "左下经度")
    private Long bottomleftlongitude;

    /** 右上纬度 */
    @Excel(name = "右上纬度")
    private Long toprightlatitude;

    /** 右上经度 */
    @Excel(name = "右上经度")
    private Long toprightlongitude;

    /** 右下纬度 */
    @Excel(name = "右下纬度")
    private Long bottomrightlatitude;

    /** 右下经度 */
    @Excel(name = "右下经度")
    private Long bottomrightlongitude;

    /** 中心纬度 */
    @Excel(name = "中心纬度")
    private Long centerlatitude;

    /** 中心经度 */
    @Excel(name = "中心经度")
    private Long centerlongitude;

    public void setCaseId(Long caseId)
    {
        this.caseId = caseId;
    }

    public Long getCaseId()
    {
        return caseId;
    }
    public void setGroupId(Long groupId)
    {
        this.groupId = groupId;
    }

    public Long getGroupId()
    {
        return groupId;
    }
    public void setCasePrice(BigDecimal casePrice)
    {
        this.casePrice = casePrice;
    }

    public BigDecimal getCasePrice()
    {
        return casePrice;
    }
    public void setCaseThumb(String caseThumb)
    {
        this.caseThumb = caseThumb;
    }

    public String getCaseThumb()
    {
        return caseThumb;
    }
    public void setProducetime(String producetime)
    {
        this.producetime = producetime;
    }

    public String getProducetime()
    {
        return producetime;
    }
    public void setHavefile(String havefile)
    {
        this.havefile = havefile;
    }

    public String getHavefile()
    {
        return havefile;
    }
    public void setArea(String area)
    {
        this.area = area;
    }

    public String getArea()
    {
        return area;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getDepartment()
    {
        return department;
    }
    public void setDataname(String dataname)
    {
        this.dataname = dataname;
    }

    public String getDataname()
    {
        return dataname;
    }
    public void setDataformat(String dataformat)
    {
        this.dataformat = dataformat;
    }

    public String getDataformat()
    {
        return dataformat;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
    public void setResolution(String resolution)
    {
        this.resolution = resolution;
    }

    public String getResolution()
    {
        return resolution;
    }
    public void setTopleftlatitude(Long topleftlatitude)
    {
        this.topleftlatitude = topleftlatitude;
    }

    public Long getTopleftlatitude()
    {
        return topleftlatitude;
    }
    public void setTopleftlongitude(Long topleftlongitude)
    {
        this.topleftlongitude = topleftlongitude;
    }

    public Long getTopleftlongitude()
    {
        return topleftlongitude;
    }
    public void setBottomleftlatitude(Long bottomleftlatitude)
    {
        this.bottomleftlatitude = bottomleftlatitude;
    }

    public Long getBottomleftlatitude()
    {
        return bottomleftlatitude;
    }
    public void setBottomleftlongitude(Long bottomleftlongitude)
    {
        this.bottomleftlongitude = bottomleftlongitude;
    }

    public Long getBottomleftlongitude()
    {
        return bottomleftlongitude;
    }
    public void setToprightlatitude(Long toprightlatitude)
    {
        this.toprightlatitude = toprightlatitude;
    }

    public Long getToprightlatitude()
    {
        return toprightlatitude;
    }
    public void setToprightlongitude(Long toprightlongitude)
    {
        this.toprightlongitude = toprightlongitude;
    }

    public Long getToprightlongitude()
    {
        return toprightlongitude;
    }
    public void setBottomrightlatitude(Long bottomrightlatitude)
    {
        this.bottomrightlatitude = bottomrightlatitude;
    }

    public Long getBottomrightlatitude()
    {
        return bottomrightlatitude;
    }
    public void setBottomrightlongitude(Long bottomrightlongitude)
    {
        this.bottomrightlongitude = bottomrightlongitude;
    }

    public Long getBottomrightlongitude()
    {
        return bottomrightlongitude;
    }
    public void setCenterlatitude(Long centerlatitude)
    {
        this.centerlatitude = centerlatitude;
    }

    public Long getCenterlatitude()
    {
        return centerlatitude;
    }
    public void setCenterlongitude(Long centerlongitude)
    {
        this.centerlongitude = centerlongitude;
    }

    public Long getCenterlongitude()
    {
        return centerlongitude;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("caseId", getCaseId())
            .append("groupId", getGroupId())
            .append("casePrice", getCasePrice())
            .append("caseThumb", getCaseThumb())
            .append("producetime", getProducetime())
            .append("havefile", getHavefile())
            .append("area", getArea())
            .append("department", getDepartment())
            .append("dataname", getDataname())
            .append("dataformat", getDataformat())
            .append("description", getDescription())
            .append("resolution", getResolution())
            .append("topleftlatitude", getTopleftlatitude())
            .append("topleftlongitude", getTopleftlongitude())
            .append("bottomleftlatitude", getBottomleftlatitude())
            .append("bottomleftlongitude", getBottomleftlongitude())
            .append("toprightlatitude", getToprightlatitude())
            .append("toprightlongitude", getToprightlongitude())
            .append("bottomrightlatitude", getBottomrightlatitude())
            .append("bottomrightlongitude", getBottomrightlongitude())
            .append("centerlatitude", getCenterlatitude())
            .append("centerlongitude", getCenterlongitude())
            .toString();
    }
}
