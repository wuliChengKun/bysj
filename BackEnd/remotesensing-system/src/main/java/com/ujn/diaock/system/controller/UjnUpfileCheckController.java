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
import com.ujn.diaock.system.domain.UjnUpfileCheck;
import com.ujn.diaock.system.service.IUjnUpfileCheckService;
import com.ujn.diaock.common.utils.poi.ExcelUtil;
import com.ujn.diaock.common.core.page.TableDataInfo;

/**
 * 上传文件审核Controller
 *
 * @author diaock
 * @date 2021-05-05
 */
@RestController
@RequestMapping("/system/filecheck")
public class UjnUpfileCheckController extends BaseController
{
    @Autowired
    private IUjnUpfileCheckService ujnUpfileCheckService;

    /**
     * 查询上传文件审核列表
     */
    @PreAuthorize("@ss.hasPermi('system:filecheck:list')")
    @GetMapping("/list")
    public TableDataInfo list(UjnUpfileCheck ujnUpfileCheck)
    {
        startPage();
        List<UjnUpfileCheck> list = ujnUpfileCheckService.selectUjnUpfileCheckList(ujnUpfileCheck);
        return getDataTable(list);
    }

    /**
     * 导出上传文件审核列表
     */
    @PreAuthorize("@ss.hasPermi('system:filecheck:export')")
    @Log(title = "上传文件审核", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UjnUpfileCheck ujnUpfileCheck)
    {
        List<UjnUpfileCheck> list = ujnUpfileCheckService.selectUjnUpfileCheckList(ujnUpfileCheck);
        ExcelUtil<UjnUpfileCheck> util = new ExcelUtil<UjnUpfileCheck>(UjnUpfileCheck.class);
        return util.exportExcel(list, "上传文件审核数据");
    }

    /**
     * 获取上传文件审核详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:filecheck:query')")
    @GetMapping(value = "/{fileCheckId}")
    public AjaxResult getInfo(@PathVariable("fileCheckId") Long fileCheckId)
    {
        return AjaxResult.success(ujnUpfileCheckService.selectUjnUpfileCheckById(fileCheckId));
    }

    /**
     * 新增上传文件审核
     */
    @PreAuthorize("@ss.hasPermi('system:filecheck:add')")
    @Log(title = "上传文件审核", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UjnUpfileCheck ujnUpfileCheck)
    {
        return toAjax(ujnUpfileCheckService.insertUjnUpfileCheck(ujnUpfileCheck));
    }

    /**
     * 修改上传文件审核
     */
    @PreAuthorize("@ss.hasPermi('system:filecheck:edit')")
    @Log(title = "上传文件审核", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UjnUpfileCheck ujnUpfileCheck)
    {
        return toAjax(ujnUpfileCheckService.updateUjnUpfileCheck(ujnUpfileCheck));
    }

    /**
     * 删除上传文件审核
     */
    @PreAuthorize("@ss.hasPermi('system:filecheck:remove')")
    @Log(title = "上传文件审核", businessType = BusinessType.DELETE)
	@DeleteMapping("/{fileCheckIds}")
    public AjaxResult remove(@PathVariable Long[] fileCheckIds)
    {
        return toAjax(ujnUpfileCheckService.deleteUjnUpfileCheckByIds(fileCheckIds));
    }
}
