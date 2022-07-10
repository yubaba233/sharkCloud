package org.shark.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shark.product.domain.entity.CategoryBrand;
import org.shark.product.mapper.CategoryBrandMapper;
import org.shark.product.service.ICategoryBrandService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌分类关联信息 服务实现类
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Service
public class CategoryBrandServiceImpl extends ServiceImpl<CategoryBrandMapper, CategoryBrand> implements ICategoryBrandService {

}
