package org.shark.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.shark.product.domain.entity.ProductDetail;
import org.shark.product.mapper.ProductDetailMapper;
import org.shark.product.service.IProductDetailService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品详情信息 服务实现类
 * </p>
 *
 * @author yubaba
 * @since 2022-07-10
 */
@Service
public class ProductDetailServiceImpl extends ServiceImpl<ProductDetailMapper, ProductDetail> implements IProductDetailService {

}
