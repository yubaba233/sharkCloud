package org.shark.product.controller.app;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.shark.common.core.utils.StringUtils;
import org.shark.common.core.utils.bean.BeanUtils;
import org.shark.common.core.web.controller.BaseController;
import org.shark.common.core.web.domain.AjaxResult;
import org.shark.common.core.web.page.TableDataInfo;
import org.shark.common.log.annotation.Log;
import org.shark.common.log.enums.BusinessType;
import org.shark.product.domain.dto.BrandDto;
import org.shark.product.domain.entity.Brand;
import org.shark.product.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yubaba
 * @since 2022-07-09
 */
@RestController("appBrandController")
@RequestMapping("/app/brand")
public class BrandController extends BaseController {
    /**
     * 获取品牌列表
     */
    @Autowired
    private IBrandService iBrandService;

    @GetMapping("/list")
    public TableDataInfo list(BrandDto brandDto) {
        startPage();
        LambdaQueryWrapper<Brand> lambdaQueryWrapper=new QueryWrapper<Brand>()
                .lambda()
                .like(StringUtils.isNotEmpty(brandDto.getBrandTitle()),
                        Brand::getBrandTitle,
                        brandDto.getBrandTitle());
        List<Brand> brandList=iBrandService.list(lambdaQueryWrapper);
        return getDataTable(brandList);
    }

    /**
     * 获取详细信息
     */
    @GetMapping(value = "/{brandId}")
    public AjaxResult getInfo(@PathVariable Long brandId) {
        return AjaxResult.success(iBrandService.getById(brandId));
    }

    /**
     * 新增品牌
     */
    @Log(title = "品牌管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BrandDto brandDto) {
        Brand brand = new Brand();
        BeanUtils.copyProperties(brandDto, brand);
        return toAjax(iBrandService.save(brand));
    }

    /**
     * 修改参数配置
     */
    @Log(title = "品牌管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BrandDto brandDto) {
        Brand brand = new Brand();
        BeanUtils.copyProperties(brandDto, brand);
        return toAjax(iBrandService.updateById(brand));
    }

    /**
     * 删除参数配置
     */
    @Log(title = "品牌管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{brandId}")
    public AjaxResult remove(@PathVariable Long brandId) {
        return toAjax(iBrandService.removeById(brandId));
    }
}
