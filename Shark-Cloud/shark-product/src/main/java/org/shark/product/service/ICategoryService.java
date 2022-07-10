package org.shark.product.service;


import com.baomidou.mybatisplus.extension.service.IService;
import org.shark.product.domain.entity.Category;
import org.shark.product.domain.vo.CategoryVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yubaba
 * @since 2022-07-06
 */
public interface ICategoryService extends IService<Category> {

    /**
     * 查询商品分类树
     *
     * @param status 状态
     * @return 分类树
     */
    List<CategoryVo> findAll(String status);

}
