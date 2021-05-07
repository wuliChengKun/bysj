package com.ujn.diaock.system.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ujn.diaock.common.annotation.Log;
import com.ujn.diaock.common.core.controller.BaseController;
import com.ujn.diaock.common.core.domain.AjaxResult;
import com.ujn.diaock.common.enums.BusinessType;
import com.ujn.diaock.system.domain.UjnFile;
import com.ujn.diaock.system.service.IUjnFileService;
import com.ujn.diaock.common.utils.poi.ExcelUtil;
import com.ujn.diaock.common.core.page.TableDataInfo;

/**
 * 上传文件Controller
 *
 * @author diaock
 * @date 2021-05-05
 */
@RestController
@RequestMapping("/system/file")
public class UjnFileController extends BaseController
{
    @Autowired
    private IUjnFileService ujnFileService;

    /**
     * 查询上传文件列表
     */
    @PreAuthorize("@ss.hasPermi('system:file:list')")
    @GetMapping("/list")
    public TableDataInfo list(UjnFile ujnFile)
    {
        startPage();
        List<UjnFile> list = ujnFileService.selectUjnFileList(ujnFile);
        return getDataTable(list);
    }

    /**
     * 导出上传文件列表
     */
    @PreAuthorize("@ss.hasPermi('system:file:export')")
    @Log(title = "上传文件", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UjnFile ujnFile)
    {
        List<UjnFile> list = ujnFileService.selectUjnFileList(ujnFile);
        ExcelUtil<UjnFile> util = new ExcelUtil<UjnFile>(UjnFile.class);
        return util.exportExcel(list, "上传文件数据");
    }

    /**
     * 获取上传文件详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:file:query')")
    @GetMapping(value = "/{fileId}")
    public AjaxResult getInfo(@PathVariable("fileId") Long fileId)
    {
        return AjaxResult.success(ujnFileService.selectUjnFileById(fileId));
    }

    /**
     * 新增上传文件
     */
    @PreAuthorize("@ss.hasPermi('system:file:add')")
    @Log(title = "上传文件", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UjnFile ujnFile)
    {
        return toAjax(ujnFileService.insertUjnFile(ujnFile));
    }

    /**
     * 修改上传文件
     */
    @PreAuthorize("@ss.hasPermi('system:file:edit')")
    @Log(title = "上传文件", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UjnFile ujnFile)
    {
        return toAjax(ujnFileService.updateUjnFile(ujnFile));
    }

    /**
     * 删除上传文件
     */
    @PreAuthorize("@ss.hasPermi('system:file:remove')")
    @Log(title = "上传文件", businessType = BusinessType.DELETE)
	@DeleteMapping("/{fileIds}")
    public AjaxResult remove(@PathVariable Long[] fileIds)
    {
        return toAjax(ujnFileService.deleteUjnFileByIds(fileIds));
    }
}
