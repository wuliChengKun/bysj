package com.ujn.diaock.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ujn.diaock.common.annotation.Excel;
import com.ujn.diaock.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 上传文件审核对象 ujn_upfile_check
 *
 * @author diaock
 * @date 2021-05-05
 */
public class UjnUpfileCheck extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 上传审核ID */
    private Long fileCheckId;

    /** 文件ID */
    @Excel(name = "文件ID")
    private Long fileId;

    /** 文件审核员ID */
    @Excel(name = "文件审核员ID")
    private Long upfileAuditorId;

    /** 上传审核Date */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "上传审核Date", width = 30, dateFormat = "yyyy-MM-dd")
    private Date checkDate;

    public void setFileCheckId(Long fileCheckId)
    {
        this.fileCheckId = fileCheckId;
    }

    public Long getFileCheckId()
    {
        return fileCheckId;
    }
    public void setFileId(Long fileId)
    {
        this.fileId = fileId;
    }

    public Long getFileId()
    {
        return fileId;
    }
    public void setUpfileAuditorId(Long upfileAuditorId)
    {
        this.upfileAuditorId = upfileAuditorId;
    }

    public Long getUpfileAuditorId()
    {
        return upfileAuditorId;
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
            .append("fileCheckId", getFileCheckId())
            .append("fileId", getFileId())
            .append("upfileAuditorId", getUpfileAuditorId())
            .append("checkDate", getCheckDate())
            .toString();
    }
}
