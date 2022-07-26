package org.shark.product.controller.admin;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import ma.glasnost.orika.MapperFacade;
import org.shark.common.core.web.controller.BaseController;
import org.shark.common.core.web.domain.AjaxResult;
import org.shark.common.log.annotation.Log;
import org.shark.common.log.enums.BusinessType;
import org.shark.product.domain.dto.CategoryDto;
import org.shark.product.domain.entity.Category;
import org.shark.product.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yubaba
 * @since 2022-07-06
 */
@RestController
@RequestMapping("/admin/category")
public class CategoryController extends BaseController {

    /**
     * 获取商品树
     */
    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private MapperFacade mapperFacade;

    @GetMapping("/getTree")
    public AjaxResult list(@RequestParam(value = "status",required = false) String status) {
        return AjaxResult.success(iCategoryService.findAll(status));
    }

    /**
     * 获取详细信息
     */
    @GetMapping(value = "/{categoryId}")
    public AjaxResult getInfo(@PathVariable long categoryId) {
        return AjaxResult.success(iCategoryService.getById(categoryId));
    }

    /**
     * 新增参数配置
     */
    @Log(title = "分类管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CategoryDto categoryDto) {
        Category category = mapperFacade.map(categoryDto,Category.class);
        return toAjax(iCategoryService.save(category));
    }

    /**
     * 修改参数配置
     */
    @Log(title = "分类管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CategoryDto categoryDto) {
        Category category = mapperFacade.map(categoryDto,Category.class);
        return toAjax(iCategoryService.updateById(category));
    }

    /**
     * 删除参数配置
     */
    @Log(title = "分类管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{categoryId}")
    public AjaxResult remove(@PathVariable Long categoryId) {
        long n=iCategoryService.count(new QueryWrapper<Category>()
                .lambda()
                .eq(Category::getParentId,categoryId));
        if (n == 0) {
            iCategoryService.removeById(categoryId);
            return success("删除成功");
        }
        return error("请先删除子分类");
    }
    @GetMapping("/getCateByPId")
    public AjaxResult getCateByPId(@RequestParam(value = "parentId") String parentId) {
        LambdaQueryWrapper<Category> queryWrapper=new QueryWrapper<Category>()
                .lambda()
                .eq(Category::getParentId,parentId);
        return AjaxResult.success(iCategoryService.list(queryWrapper));
    }

}
