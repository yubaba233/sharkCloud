package org.shark.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shark.product.domain.entity.AttrCategory;
import org.shark.product.mapper.AttrCategoryMapper;
import org.shark.product.service.IAttrCategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 属性与分类关联信息 服务实现类
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Service
public class AttrCategoryServiceImpl extends ServiceImpl<AttrCategoryMapper, AttrCategory> implements IAttrCategoryService {

}
