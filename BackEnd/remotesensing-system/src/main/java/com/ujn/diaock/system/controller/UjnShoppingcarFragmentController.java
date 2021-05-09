package com.ujn.diaock.system.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.token.Token;
import org.springframework.security.core.token.TokenService;
import org.springframework.transaction.annotation.Transactional;
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
import com.ujn.diaock.system.domain.UjnShoppingcarFragment;
import com.ujn.diaock.system.service.IUjnShoppingcarFragmentService;
import com.ujn.diaock.common.utils.poi.ExcelUtil;
import com.ujn.diaock.common.core.page.TableDataInfo;

/**
 * 购物车分片Controller
 *
 * @author diaock
 * @date 2021-05-05
 */
@RestController
@RequestMapping("/system/fragment")
public class UjnShoppingcarFragmentController extends BaseController
{
    @Autowired
    private IUjnShoppingcarFragmentService ujnShoppingcarFragmentService;

    /**
     * 查询购物车分片列表
     */
    @PreAuthorize("@ss.hasPermi('system:fragment:list')")
    @GetMapping("/list")
    public TableDataInfo list(UjnShoppingcarFragment ujnShoppingcarFragment)
    {
        startPage();
        List<UjnShoppingcarFragment> list = ujnShoppingcarFragmentService.selectUjnShoppingcarFragmentList(ujnShoppingcarFragment);
        return getDataTable(list);
    }

    /**
     * 导出购物车分片列表
     */
    @PreAuthorize("@ss.hasPermi('system:fragment:export')")
    @Log(title = "购物车分片", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(UjnShoppingcarFragment ujnShoppingcarFragment)
    {
        List<UjnShoppingcarFragment> list = ujnShoppingcarFragmentService.selectUjnShoppingcarFragmentList(ujnShoppingcarFragment);
        ExcelUtil<UjnShoppingcarFragment> util = new ExcelUtil<UjnShoppingcarFragment>(UjnShoppingcarFragment.class);
        return util.exportExcel(list, "购物车分片数据");
    }

    /**
     * 获取购物车分片详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:fragment:query')")
    @GetMapping(value = "/{shoppingcarFragmentId}")
    public AjaxResult getInfo(@PathVariable("shoppingcarFragmentId") Long shoppingcarFragmentId)
    {
        return AjaxResult.success(ujnShoppingcarFragmentService.selectUjnShoppingcarFragmentById(shoppingcarFragmentId));
    }

    /**
     * 新增购物车分片
     */
    @PreAuthorize("@ss.hasPermi('system:fragment:add')")
    @Log(title = "购物车分片", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UjnShoppingcarFragment ujnShoppingcarFragment)
    {
        return toAjax(ujnShoppingcarFragmentService.insertUjnShoppingcarFragment(ujnShoppingcarFragment));
    }

    /**
     * 修改购物车分片
     */
    @PreAuthorize("@ss.hasPermi('system:fragment:edit')")
    @Log(title = "购物车分片", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UjnShoppingcarFragment ujnShoppingcarFragment)
    {
        return toAjax(ujnShoppingcarFragmentService.updateUjnShoppingcarFragment(ujnShoppingcarFragment));
    }

    /**
     * 删除购物车分片
     */
    @PreAuthorize("@ss.hasPermi('system:fragment:remove')")
    @Log(title = "购物车分片", businessType = BusinessType.DELETE)
	@DeleteMapping("/{shoppingcarFragmentIds}")
    @Transactional
    public AjaxResult remove(@PathVariable Long[] shoppingcarFragmentIds)
    {
        return toAjax(ujnShoppingcarFragmentService.deleteUjnShoppingcarFragmentByIds(shoppingcarFragmentIds));
    }

    /**
     * 用户将案例加入购物车分片
     */
    @PreAuthorize("@ss.hasPermi('system:fragment:addshoppingcarfragment')")
    @Log(title = "购物车分片", businessType = BusinessType.INSERT)
    @PostMapping("/addShoppingcarFragment/{caseIds}")
    @Transactional
    public AjaxResult addShoppingcarFragment(@PathVariable Long[] caseIds){
        return toAjax(ujnShoppingcarFragmentService.addShoppingcarFragment(caseIds));
    }

}
