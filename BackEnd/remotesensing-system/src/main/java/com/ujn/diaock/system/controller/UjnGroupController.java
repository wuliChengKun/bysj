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
import com.ujn.diaock.system.domain.UjnGroup;
import com.ujn.diaock.system.service.IUjnGroupService;
import com.ujn.diaock.common.utils.poi.ExcelUtil;
import com.ujn.diaock.common.core.page.TableDataInfo;

/**
 * 分类信息Controller
 *
 * @author diaock
 * @date 2021-05-05
 */
@RestController
@RequestMapping("/system/group")
public class UjnGroupController extends BaseController
{
    @Autowired
    private IUjnGroupService ujnGroupService;

    /**
     * 查询分类信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:group:list')")
    @GetMapping("/list")
    public TableDataInfo list(UjnGroup ujnGroup)
    {
        startPage();
        List<UjnGroup> list = ujnGroupService.selectUjnGroupList(ujnGroup);
        return getDataTable(list);
    }

    /**
     * 导出分类信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:group:export')")
    @Log(title = "分类信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UjnGroup ujnGroup)
    {
        List<UjnGroup> list = ujnGroupService.selectUjnGroupList(ujnGroup);
        ExcelUtil<UjnGroup> util = new ExcelUtil<UjnGroup>(UjnGroup.class);
        return util.exportExcel(list, "分类信息数据");
    }

    /**
     * 获取分类信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:group:query')")
    @GetMapping(value = "/{groupId}")
    public AjaxResult getInfo(@PathVariable("groupId") Long groupId)
    {
        return AjaxResult.success(ujnGroupService.selectUjnGroupById(groupId));
    }

    /**
     * 新增分类信息
     */
    @PreAuthorize("@ss.hasPermi('system:group:add')")
    @Log(title = "分类信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UjnGroup ujnGroup)
    {
        return toAjax(ujnGroupService.insertUjnGroup(ujnGroup));
    }

    /**
     * 修改分类信息
     */
    @PreAuthorize("@ss.hasPermi('system:group:edit')")
    @Log(title = "分类信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UjnGroup ujnGroup)
    {
        return toAjax(ujnGroupService.updateUjnGroup(ujnGroup));
    }

    /**
     * 删除分类信息
     */
    @PreAuthorize("@ss.hasPermi('system:group:remove')")
    @Log(title = "分类信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{groupIds}")
    public AjaxResult remove(@PathVariable Long[] groupIds)
    {
        return toAjax(ujnGroupService.deleteUjnGroupByIds(groupIds));
    }
}
