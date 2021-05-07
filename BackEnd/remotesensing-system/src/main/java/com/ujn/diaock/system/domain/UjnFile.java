package com.ujn.diaock.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ujn.diaock.common.annotation.Excel;
import com.ujn.diaock.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 上传文件对象 ujn_file
 *
 * @author diaock
 * @date 2021-05-05
 */
public class UjnFile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 文件ID */
    private Long fileId;

    /** 文件Name */
    @Excel(name = "文件Name")
    private String fileName;

    /** 文件Path */
    @Excel(name = "文件Path")
    private String filePath;

    /** 文件Size */
    @Excel(name = "文件Size")
    private Long fileSize;

    /** 文件上传Date */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "文件上传Date", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fileUploadDate;

    public void setFileId(Long fileId)
    {
        this.fileId = fileId;
    }

    public Long getFileId()
    {
        return fileId;
    }
    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public String getFileName()
    {
        return fileName;
    }
    public void setFilePath(String filePath)
    {
        this.filePath = filePath;
    }

    public String getFilePath()
    {
        return filePath;
    }
    public void setFileSize(Long fileSize)
    {
        this.fileSize = fileSize;
    }

    public Long getFileSize()
    {
        return fileSize;
    }
    public void setFileUploadDate(Date fileUploadDate)
    {
        this.fileUploadDate = fileUploadDate;
    }

    public Date getFileUploadDate()
    {
        return fileUploadDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("fileId", getFileId())
            .append("fileName", getFileName())
            .append("filePath", getFilePath())
            .append("fileSize", getFileSize())
            .append("fileUploadDate", getFileUploadDate())
            .toString();
    }
}
