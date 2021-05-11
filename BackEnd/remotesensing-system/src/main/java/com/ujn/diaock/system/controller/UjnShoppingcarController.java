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
import com.ujn.diaock.system.domain.UjnShoppingcar;
import com.ujn.diaock.system.service.IUjnShoppingcarService;
import com.ujn.diaock.common.utils.poi.ExcelUtil;
import com.ujn.diaock.common.core.page.TableDataInfo;

/**
 * 购物车Controller
 *
 * @author diaock
 * @date 2021-05-05
 */
@RestController
@RequestMapping("/system/shoppingcar")
public class UjnShoppingcarController extends BaseController
{
    @Autowired
    private IUjnShoppingcarService ujnShoppingcarService;

    /**
     * 查询购物车列表
     */
    @PreAuthorize("@ss.hasPermi('system:shoppingcar:list')")
    @GetMapping("/list")
    public TableDataInfo list(UjnShoppingcar ujnShoppingcar)
    {
        startPage();
        List<UjnShoppingcar> list = ujnShoppingcarService.selectUjnShoppingcarList(ujnShoppingcar);
        //List<UjnShoppingcar> list1 = (List<UjnShoppingcar>) ujnShoppingcarService.selectUjnShoppingcarByUserId(ujnShoppingcar.getUserId());
        return getDataTable(list);
    }

    /**
     * 导出购物车列表
     */
    @PreAuthorize("@ss.hasPermi('system:shoppingcar:export')")
    @Log(title = "购物车", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UjnShoppingcar ujnShoppingcar)
    {
        List<UjnShoppingcar> list = ujnShoppingcarService.selectUjnShoppingcarList(ujnShoppingcar);
        ExcelUtil<UjnShoppingcar> util = new ExcelUtil<UjnShoppingcar>(UjnShoppingcar.class);
        return util.exportExcel(list, "购物车数据");
    }

    /**
     * 获取购物车详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:shoppingcar:query')")
    @GetMapping(value = "/{shoppingcarId}")
    public AjaxResult getInfo(@PathVariable("shoppingcarId") Long shoppingcarId)
    {
        return AjaxResult.success(ujnShoppingcarService.selectUjnShoppingcarById(shoppingcarId));
    }

    /**
     * 新增购物车
     */
    @PreAuthorize("@ss.hasPermi('system:shoppingcar:add')")
    @Log(title = "购物车", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UjnShoppingcar ujnShoppingcar)
    {
        return toAjax(ujnShoppingcarService.insertUjnShoppingcar(ujnShoppingcar));
    }

    /**
     * 修改购物车
     */
    @PreAuthorize("@ss.hasPermi('system:shoppingcar:edit')")
    @Log(title = "购物车", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UjnShoppingcar ujnShoppingcar)
    {
        return toAjax(ujnShoppingcarService.updateUjnShoppingcar(ujnShoppingcar));
    }

    /**
     * 删除购物车
     */
    @PreAuthorize("@ss.hasPermi('system:shoppingcar:remove')")
    @Log(title = "购物车", businessType = BusinessType.DELETE)
	@DeleteMapping("/{shoppingcarIds}")
    public AjaxResult remove(@PathVariable Long[] shoppingcarIds)
    {
        return toAjax(ujnShoppingcarService.deleteUjnShoppingcarByIds(shoppingcarIds));
    }
}
