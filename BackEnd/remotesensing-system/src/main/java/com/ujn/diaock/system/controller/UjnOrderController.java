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
import com.ujn.diaock.system.domain.UjnOrder;
import com.ujn.diaock.system.service.IUjnOrderService;
import com.ujn.diaock.common.utils.poi.ExcelUtil;
import com.ujn.diaock.common.core.page.TableDataInfo;

/**
 * 订单Controller
 *
 * @author diaock
 * @date 2021-05-05
 */
@RestController
@RequestMapping("/system/order")
public class UjnOrderController extends BaseController
{
    @Autowired
    private IUjnOrderService ujnOrderService;

    /**
     * 查询订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:order:list')")
    @GetMapping("/list")
    public TableDataInfo list(UjnOrder ujnOrder)
    {
        startPage();
        List<UjnOrder> list = ujnOrderService.selectUjnOrderList(ujnOrder);
        return getDataTable(list);
    }

    /**
     * 导出订单列表
     */
    @PreAuthorize("@ss.hasPermi('system:order:export')")
    @Log(title = "订单", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UjnOrder ujnOrder)
    {
        List<UjnOrder> list = ujnOrderService.selectUjnOrderList(ujnOrder);
        ExcelUtil<UjnOrder> util = new ExcelUtil<UjnOrder>(UjnOrder.class);
        return util.exportExcel(list, "订单数据");
    }

    /**
     * 获取订单详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:order:query')")
    @GetMapping(value = "/{orderId}")
    public AjaxResult getInfo(@PathVariable("orderId") Long orderId)
    {
        return AjaxResult.success(ujnOrderService.selectUjnOrderById(orderId));
    }

    /**
     * 新增订单
     */
    @PreAuthorize("@ss.hasPermi('system:order:add')")
    @Log(title = "订单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UjnOrder ujnOrder)
    {
        return toAjax(ujnOrderService.insertUjnOrder(ujnOrder));
    }

    /**
     * 修改订单
     */
    @PreAuthorize("@ss.hasPermi('system:order:edit')")
    @Log(title = "订单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UjnOrder ujnOrder)
    {
        return toAjax(ujnOrderService.updateUjnOrder(ujnOrder));
    }

    /**
     * 删除订单
     */
    @PreAuthorize("@ss.hasPermi('system:order:remove')")
    @Log(title = "订单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orderIds}")
    public AjaxResult remove(@PathVariable Long[] orderIds)
    {
        return toAjax(ujnOrderService.deleteUjnOrderByIds(orderIds));
    }

    /**
     * 用户加入订单分片
     */
    @PreAuthorize("@ss.hasPermi('system:order:pay')")
    @Log(title = "订单", businessType = BusinessType.INSERT)
    @PostMapping("/addOrderFragment{fragmentIds}")
    public AjaxResult addOrderFragment(@PathVariable Long[] fragmentIds){
        return toAjax(ujnOrderService.addOrderFragment(fragmentIds));
    }
}
