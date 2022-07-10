package org.shark.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shark.product.domain.entity.Product;
import org.shark.product.mapper.ProductMapper;
import org.shark.product.service.IProductService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * spu信息 服务实现类
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
