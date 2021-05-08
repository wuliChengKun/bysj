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
import com.ujn.diaock.system.domain.UjnCase;
import com.ujn.diaock.system.service.IUjnCaseService;
import com.ujn.diaock.common.utils.poi.ExcelUtil;
import com.ujn.diaock.common.core.page.TableDataInfo;

/**
 * 遥感案例Controller
 *
 * @author diaock
 * @date 2021-05-08
 */
@RestController
@RequestMapping("/system/case")
public class UjnCaseController extends BaseController
{
    @Autowired
    private IUjnCaseService ujnCaseService;

    /**
     * 查询遥感案例列表
     */
    @PreAuthorize("@ss.hasPermi('system:case:list')")
    @GetMapping("/list")
    public TableDataInfo list(UjnCase ujnCase)
    {
        startPage();
        List<UjnCase> list = ujnCaseService.selectUjnCaseList(ujnCase);
        return getDataTable(list);
    }

    /**
     * 导出遥感案例列表
     */
    @PreAuthorize("@ss.hasPermi('system:case:export')")
    @Log(title = "遥感案例", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UjnCase ujnCase)
    {
        List<UjnCase> list = ujnCaseService.selectUjnCaseList(ujnCase);
        ExcelUtil<UjnCase> util = new ExcelUtil<UjnCase>(UjnCase.class);
        return util.exportExcel(list, "遥感案例数据");
    }

    /**
     * 获取遥感案例详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:case:query')")
    @GetMapping(value = "/{caseId}")
    public AjaxResult getInfo(@PathVariable("caseId") Long caseId)
    {
        return AjaxResult.success(ujnCaseService.selectUjnCaseById(caseId));
    }

    /**
     * 新增遥感案例
     */
    @PreAuthorize("@ss.hasPermi('system:case:add')")
    @Log(title = "遥感案例", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UjnCase ujnCase)
    {
        return toAjax(ujnCaseService.insertUjnCase(ujnCase));
    }

    /**
     * 修改遥感案例
     */
    @PreAuthorize("@ss.hasPermi('system:case:edit')")
    @Log(title = "遥感案例", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UjnCase ujnCase)
    {
        return toAjax(ujnCaseService.updateUjnCase(ujnCase));
    }

    /**
     * 删除遥感案例
     */
    @PreAuthorize("@ss.hasPermi('system:case:remove')")
    @Log(title = "遥感案例", businessType = BusinessType.DELETE)
	@DeleteMapping("/{caseIds}")
    public AjaxResult remove(@PathVariable Long[] caseIds)
    {
        return toAjax(ujnCaseService.deleteUjnCaseByIds(caseIds));
    }
}
