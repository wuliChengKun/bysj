package com.ujn.diaock.system.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
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
import com.ujn.diaock.system.domain.UjnOrderCheck;
import com.ujn.diaock.system.service.IUjnOrderCheckService;
import com.ujn.diaock.common.utils.poi.ExcelUtil;
import com.ujn.diaock.common.core.page.TableDataInfo;

/**
 * 订单审核Controller
 *
 * @author diaock
 * @date 2021-05-05
 */
@RestController
@RequestMapping("/system/check")
public class UjnOrderCheckController extends BaseController
{
    @Autowired
    private IUjnOrderCheckService ujnOrderCheckService;

    /**
     * 查询订单审核列表
     */
    @PreAuthorize("@ss.hasPermi('system:check:list')")
    @GetMapping("/list")
    public TableDataInfo list(UjnOrderCheck ujnOrderCheck)
    {
        startPage();
        List<UjnOrderCheck> list = ujnOrderCheckService.selectUjnOrderCheckList(ujnOrderCheck);
        return getDataTable(list);
    }

    /**
     * 导出订单审核列表
     */
    @PreAuthorize("@ss.hasPermi('system:check:export')")
    @Log(title = "订单审核", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UjnOrderCheck ujnOrderCheck)
    {
        List<UjnOrderCheck> list = ujnOrderCheckService.selectUjnOrderCheckList(ujnOrderCheck);
        ExcelUtil<UjnOrderCheck> util = new ExcelUtil<UjnOrderCheck>(UjnOrderCheck.class);
        return util.exportExcel(list, "订单审核数据");
    }

    /**
     * 获取订单审核详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:check:query')")
    @GetMapping(value = "/{orderCheckId}")
    public AjaxResult getInfo(@PathVariable("orderCheckId") Long orderCheckId)
    {
        return AjaxResult.success(ujnOrderCheckService.selectUjnOrderCheckById(orderCheckId));
    }

    /**
     * 新增订单审核
     */
    @PreAuthorize("@ss.hasPermi('system:check:add')")
    @Log(title = "订单审核", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UjnOrderCheck ujnOrderCheck)
    {
        return toAjax(ujnOrderCheckService.insertUjnOrderCheck(ujnOrderCheck));
    }

    /**
     * 修改订单审核
     */
    @PreAuthorize("@ss.hasPermi('system:check:edit')")
    @Log(title = "订单审核", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UjnOrderCheck ujnOrderCheck)
    {
        return toAjax(ujnOrderCheckService.updateUjnOrderCheck(ujnOrderCheck));
    }

    /**
     * 删除订单审核
     */
    @PreAuthorize("@ss.hasPermi('system:check:remove')")
    @Log(title = "订单审核", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orderCheckIds}")
    public AjaxResult remove(@PathVariable Long[] orderCheckIds)
    {
        return toAjax(ujnOrderCheckService.deleteUjnOrderCheckByIds(orderCheckIds));
    }

    /**
     * 管理员审核订单
     */
    @PreAuthorize("@ss.hasPermi('system:check:checkPass')")
    @Log(title = "订单审核", businessType = BusinessType.INSERT)
    @PostMapping("/checkPass/{orderIds}")
    public AjaxResult checkPass(@PathVariable Long[] orderIds){
        return toAjax(ujnOrderCheckService.addOrderCheck(orderIds));
    }
}
