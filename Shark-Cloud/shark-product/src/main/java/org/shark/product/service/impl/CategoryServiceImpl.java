package org.shark.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shark.product.domain.entity.Category;
import org.shark.product.domain.vo.CategoryVo;
import org.shark.product.mapper.CategoryMapper;
import org.shark.product.service.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yubaba
 * @since 2022-07-06
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

    /**
     * 查询商品分类树
     *
     * @return 分类树
     */
    @Override
    public List<CategoryVo> findAll(String status) {
        List<CategoryVo> categoryVos= baseMapper.findAll(status);
        return buildCategorTree(categoryVos,0L);
    }

    private List<CategoryVo> buildCategorTree(List<CategoryVo> categoryVos, Long pId) {
        Map<Long,List<CategoryVo>> categoryMap=categoryVos.stream()
                .filter(node -> !node.getParentId().equals(pId))
                .collect(Collectors.groupingBy(CategoryVo::getParentId));
        categoryVos.forEach(node -> node.setChildren(categoryMap.get(node.getCategoryId())==null
                ? Collections.emptyList()
                : categoryMap.get(node.getCategoryId())));
        return categoryVos.stream()
                .filter(node -> node.getParentId().equals(pId))
                .collect(Collectors.toList());
    }
}
